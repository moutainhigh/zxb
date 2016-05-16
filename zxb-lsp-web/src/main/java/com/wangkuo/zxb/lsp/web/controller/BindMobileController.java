package com.wangkuo.zxb.lsp.web.controller;

import com.wangkuo.zxb.lsp.api.dto.input.LspUserInput;
import com.wangkuo.zxb.lsp.api.service.ILspUserService;
import com.wangkuo.zxb.lsp.web.bind.annotation.CurrentUser;
import com.wangkuo.zxb.lsp.web.common.AjaxResponse;
import com.wangkuo.zxb.lsp.web.common.Common;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * 验证码
 *
 * @author 王俊华
 * @version 1.0
 * @date 2016-03-31
 */
@Controller
@RequestMapping("/bindmobile")
public class BindMobileController {
    @Autowired
    private ILspUserService lspUserService;


    @RequestMapping(value = "/bind", method = RequestMethod.GET)
    public String loadPage() throws Exception {
        return "bindmobile/bind";
    }

    @RequestMapping(value = "/updatebind", method = RequestMethod.GET)
    public String updatebind(ModelMap model) throws Exception {
        return "bindmobile/update_bind";
    }

    /**
     * @param code          用户填写的手机验证码
     * @param bindMobile    绑定手机号
     * @param getCodeMobile 点击获取验证码按钮时填写的手机号码
     * @param sysCode       实际获得的手机验证码
     * @param session
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/bind", method = RequestMethod.POST)
    public AjaxResponse bindMobile(String code, String bindMobile, String getCodeMobile,
                                   String sysCode, HttpSession session, @CurrentUser Long userId) throws Exception {
        //Long userId = (Long) session.getAttribute(Common.USER_ID);
        AjaxResponse ajaxResponse = new AjaxResponse();
        LspUserInput sessionUser = (LspUserInput) session.getAttribute(Common.LSP_USER);
        Map map = new HashMap();
        if (!bindMobile.equals(getCodeMobile)) {
            ajaxResponse = ajaxResponse.failed("绑定的手机号和获取验证码手机不一致");
            return ajaxResponse;
        }

        if (!"".equals(code) && !"".equals(sysCode) && code.equals(sysCode)) {
            //验证码验证成功！
            LspUserInput input = new LspUserInput();
            input.setId(userId);
            input.setBindMobile(bindMobile);
            int count = lspUserService.updateBindMobileById(input);
            if (count == 0) {
                ajaxResponse = ajaxResponse.failed("绑定失败");
            } else {
                sessionUser.setBindMobile(bindMobile);
                session.setAttribute("user", sessionUser);//修改session中的user中的bindMobile
                ajaxResponse = ajaxResponse.success("绑定成功");
            }
        } else {
            ajaxResponse = ajaxResponse.failed("验证码错误");
        }

        return ajaxResponse;
    }

    /**
     * 判断该手机号码是否已经绑定
     *
     * @param bindMobile
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/isbind", method = RequestMethod.POST)
    public boolean isbindMobile(String bindMobile) throws Exception {
        return lspUserService.isBindMobileExist(bindMobile);
    }

    /**
     * 修改绑定手机时，判断用户输入的手机号是否正确
     *
     * @param input
     * @param userId
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/judgebind", method = RequestMethod.POST)
    public boolean judgebind(LspUserInput input, @CurrentUser Long userId) throws Exception {
        input.setId(userId);
        return lspUserService.judgeBindMobile(input);
    }
}

