package com.wangkuo.zxb.lsp.web.controller;

import com.wangkuo.zxb.lsp.api.dto.input.LspReceiverShipperInfoInput;
import com.wangkuo.zxb.lsp.api.dto.input.LspUserInput;
import com.wangkuo.zxb.lsp.api.dto.input.SbGoodCategoryInput;
import com.wangkuo.zxb.lsp.api.dto.input.WaybillInput;
import com.wangkuo.zxb.lsp.api.dto.output.LspUserOutput;
import com.wangkuo.zxb.lsp.api.dto.output.LspWalletBalanceLogOutput;
import com.wangkuo.zxb.lsp.api.dto.output.PagedList;
import com.wangkuo.zxb.lsp.api.service.*;
import com.wangkuo.zxb.lsp.web.bind.annotation.CurrentUser;
import com.wangkuo.zxb.lsp.web.common.AjaxResponse;
import com.wangkuo.zxb.lsp.web.common.Common;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;


/**
 * @author 林守锦
 * @version 1.0
 * @date 2016-03-27
 */
@Controller
@RequestMapping("/lspUser")
public class LspUserController {

    @Autowired
    private ILspUserService lspUserService;

    @Autowired
    private ISbAreaInfoService sbAreaInfoService;

    @Autowired
    private com.octo.captcha.service.CaptchaService imageCaptchaService;

    @Autowired
    private ISbGoodCategoryService sbGoodCategoryService;

    @Autowired
    private ILspReceiverShipperInfoService lspReceiverShipperInfoService;

    @Autowired
    private IWaybillService waybillService;

    @Autowired
    private ILspWalletBalanceLogService lspWalletBalanceLogService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(@CurrentUser Long userId, ModelMap model) {

        SbGoodCategoryInput input = new SbGoodCategoryInput();
        input.setLspUserId(userId);
        input.setPageSize(3);
        PagedList categorys = sbGoodCategoryService.findCategorys(input);

        LspReceiverShipperInfoInput receiverShipperInfoInput = new LspReceiverShipperInfoInput();
        receiverShipperInfoInput.setLspUserId(userId);
        receiverShipperInfoInput.setType(0);
        receiverShipperInfoInput.setPageSize(3);
        PagedList shippers = lspReceiverShipperInfoService.getPagedList(receiverShipperInfoInput);

        WaybillInput waybillInput = new WaybillInput();
        waybillInput.setLspId(userId);
        waybillInput.setPageSize(7);
        PagedList waybills = waybillService.getPagedList(waybillInput, "operation_time desc");

        LspWalletBalanceLogOutput walletBalanceLog = lspWalletBalanceLogService.findLastOneByLspUserId(userId);

        model.addAttribute("walletBalanceLog", walletBalanceLog);
        model.addAttribute("categorys", categorys.getContent());
        model.addAttribute("shippers", shippers.getContent());
        model.addAttribute("waybills", waybills.getContent());
        return "index";
    }


    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String loadReisterPage(ModelMap model, String captchaId, HttpServletRequest request) {
        if (StringUtils.isEmpty(captchaId)) {
            captchaId = request.getSession().getId();
        }
        List list = sbAreaInfoService.selectAllProvince(0l);

        model.addAttribute("captchaId", captchaId);
        model.addAttribute("provinces", list);
        return "/register";
    }

    @ResponseBody
    @RequestMapping(value="/isCaptchIdRight")
    public boolean isCaptchIdRight(String captchaId, String captcha){
        boolean flag = false;
        try {
            flag = imageCaptchaService.validateResponseForID(captchaId, captcha.toUpperCase());//判断验证码
        }catch (com.octo.captcha.service.CaptchaServiceException e){
            return false;
        }
        if(flag){
            return true;
        }else{
            return false;
        }
    }

    @ResponseBody
    @RequestMapping(value = "/adduser", method = RequestMethod.POST)
    public AjaxResponse register(@Validated LspUserInput lspUserInput, Errors errors, String captchaId, String captcha, ModelMap model, HttpServletRequest request) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        if (errors.hasErrors()) {
            return ajaxResponse.failed("注册失败");
        }
        boolean flag = false;
        try {
            flag = imageCaptchaService.validateResponseForID(captchaId, captcha.toUpperCase());//判断验证码
        }catch (com.octo.captcha.service.CaptchaServiceException e){
            return ajaxResponse.failed("验证码超时");
        }
        //int count = 0;
        if (flag) {
            lspUserInput = lspUserService.addLspUser(lspUserInput);

        } else {//验证码错误
            ajaxResponse = ajaxResponse.failed("验证码错误");
            return ajaxResponse;
        }
        if (lspUserInput == null) {
            ajaxResponse = ajaxResponse.failed("用户已存在");
        } else if (lspUserInput.getId() == null) {
            ajaxResponse = ajaxResponse.failed("注册失败，稍后再试");
        } else {
            ajaxResponse = ajaxResponse.success("注册成功");
            request.getSession().setAttribute(Common.USER_ID,lspUserInput.getId());
        }

        return ajaxResponse;
    }

    /**
     * 跳转注册成功中转页面
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/registerSuccess", method = RequestMethod.GET)
    public String registerSuccess(ModelMap model) {
        return "/register_success";
    }


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loadLogin(ModelMap model,String returnUrl) {
        /*if(null != returnUrl && returnUrl.indexOf("loginOut")!=-1){
            returnUrl = null;
        }*/
        model.addAttribute("returnUrl",returnUrl);
        return "/login";
    }

    @RequestMapping(value = "/loginOut", method = RequestMethod.GET)
    public String loginOut(HttpSession session) {
        //session.removeAttribute(Common.LSP_USER);
        //session.removeAttribute(Common.USER_ID);
        session.invalidate();
        return "/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public boolean login(String nickName, String password, ModelMap model, HttpSession session) {
        LspUserInput lspUserInput = new LspUserInput();
        if (null != nickName && null != password) {
            lspUserInput.setNickName(nickName);
            lspUserInput.setPassword(password);
            LspUserOutput line = lspUserService.findUserByNameOrPwd(lspUserInput);
            boolean result = line != null;

            if (result) {
                session.setAttribute(Common.USER_ID, line.getId());
                //session.setAttribute(Common.LSP_USER, line);
                lspUserService.recordLastLoginDate(line.getId());
            }
            return result;
        } else {
            return false;
        }
    }


    @RequestMapping(value = "/isuserexist", method = RequestMethod.POST)
    @ResponseBody
    public boolean isuserexist(LspUserInput lspUserInput, ModelMap model, HttpSession session) {
        LspUserOutput line = lspUserService.findUserByNameOrPwd(lspUserInput);
        return line == null;
    }

    @ResponseBody
    @RequestMapping(value = "/updatepwd", method = RequestMethod.POST)
    public AjaxResponse doUpdatepwd(String password, String oldpassword, String type,@CurrentUser LspUserOutput lspUser, HttpSession session) {
        AjaxResponse<String> ajaxResponse = new AjaxResponse<String>();
        if(null==password || null==oldpassword){
            return AjaxResponse.failed("密码不能为空");
        }
        LspUserInput lspUserInput =new LspUserInput();
        lspUserInput.setPassword(oldpassword);
        lspUserInput.setNickName(lspUser.getNickName());

        LspUserOutput line = lspUserService.findUserByNameOrPwd(lspUserInput);
        if (line == null) {
            ajaxResponse = ajaxResponse.failed("密码错误");
            return ajaxResponse;
        } else {
            lspUserInput.setPassword(DigestUtils.md5Hex(password));
            lspUserInput.setId(lspUser.getId());
            int count = lspUserService.updateProviderById(lspUserInput);
            if (count > 0) {
                lspUser.setPassword(lspUserInput.getPassword());
//                session.setAttribute(Common.LSP_USER,lspUser);
                ajaxResponse = ajaxResponse.success("修改成功");
            } else {
                ajaxResponse = ajaxResponse.failed("修改失败");
            }
        }
        ajaxResponse.setData(type);
        return ajaxResponse;
    }

    @RequestMapping(value = "/updatepwd", method = RequestMethod.GET)
    public String updatepwd(String type,Model model) {
        model.addAttribute("type", type);
        return "/updatepwd/update_pwd";
    }

    @RequestMapping(value = "/findpwd", method = RequestMethod.GET)
    public String findpwd() {
        return "/updatepwd/find_pwd";
    }

    @RequestMapping(value = "/resetpwd", method = RequestMethod.GET)
    public String findresetpwdpwd(boolean validated) {
        return "/updatepwd/reset_pwd";
    }


    @ResponseBody
    @RequestMapping(value = "/resetpwd", method = RequestMethod.POST)
    public boolean resetpwd(String password, @CurrentUser Long userId) {
        LspUserInput lspUserInput = new LspUserInput();
        lspUserInput.setId(userId);
        lspUserInput.setPassword(DigestUtils.md5Hex(password));
        int count = lspUserService.updateProviderById(lspUserInput);
        return count > 0;
    }

    @RequestMapping(value = {"/settledread"}, method = RequestMethod.GET)
    public String settledRead(){
        return "/settled/settled_readMaterials";
    }

    /**
     * 申请入驻
//     * @param id
     * @param user
     * @param model
     * @return
     */
    @RequestMapping(value = {"/settled"}, method = RequestMethod.GET)
    public String settled (@CurrentUser LspUserOutput user, Model model, HttpSession session){
        LspUserInput input = new LspUserInput();
        input.setId(user.getId());
        input.setVerifyStatus(1);
        input.setRegistrantUserId(user.getId());
        input.setRegistrantUserName(user.getRealUserName());
        input.setRegistrantDate(new Date());
        lspUserService.updateProviderById(input);
        return "/settled/settled";
    }


    /**
     * 服务商入驻条件
     * @return
     */
    @RequestMapping(value = {"/about/settled/requirement"}, method = RequestMethod.GET)
    public String settledRequirement(){
        return "/settled/about_settled_requirement";
    }

    /**
     * 服务商入驻协议
     * @return
     */
    @RequestMapping(value = {"/about/settled/droit"}, method = RequestMethod.GET)
    public String settledDroit(){
        return "/settled/about_settled_droit";
    }


    /**
     * 服务商实操指引
     * @return
     */
    @RequestMapping(value = {"/about/settled/procedure"}, method = RequestMethod.GET)
    public String settledProcedure(){
        return "/settled/about_settled_procedure";
    }

    /**
     * 异常处理约定
     * @return
     */
    @RequestMapping(value = {"/about/settled/damageprotocol"}, method = RequestMethod.GET)
    public String settledDamageProtocol(){
        return "/settled/about_settled_damageprotocol";
    }

    /**
     * 申请入驻操作流程
     * @return
     */
    @RequestMapping(value = {"/about/settled/applyprocess"}, method = RequestMethod.GET)
    public String settledApplyProcess(){
        return "/settled/about_settled_applyprocess";
    }





}
