package com.wangkuo.zxb.lsp.web.controller;

import com.wangkuo.zxb.lsp.api.dto.input.SbAreaInfoInput;
import com.wangkuo.zxb.lsp.api.dto.input.SbGoodCategoryAllotInput;
import com.wangkuo.zxb.lsp.api.dto.input.SbGoodCategoryInput;
import com.wangkuo.zxb.lsp.api.dto.output.*;
import com.wangkuo.zxb.lsp.api.service.*;
import com.wangkuo.zxb.lsp.web.bind.annotation.CurrentUser;
import com.wangkuo.zxb.lsp.web.common.AjaxResponse;
import com.wangkuo.zxb.lsp.web.interceptor.UserVerifyRequired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * @author 王俊华
 * @version 1.0
 * @date 2016-03-31
 */
@UserVerifyRequired
@Controller
@RequestMapping("/category")
public class SbGoodCategoryController {

    @Autowired
    private ISbGoodCategoryService sbGoodCategoryService;

    @Autowired
    private ILspUserService lspUserService;

    @Autowired
    private ISbGoodCategoryAllotService sbGoodCategoryAllotService;

    @Autowired
    private ISbOtherFileAttachmentService sbOtherFileAttachmentService;

    @Autowired
    private ISbAreaInfoService sbAreaInfoService;

    /**
     * 首页显示的品类列表
     *
     * @param model
     * @param pageInput
     * @param pageNo
     * @param pageSize
     * @param session
     * @return
     */

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String branch(ModelMap model, SbGoodCategoryInput pageInput, @RequestParam(defaultValue = "1") int pageNo,
                         @RequestParam(defaultValue = "10") int pageSize, @CurrentUser Long lspUserId, HttpSession session) {
        //Long lspUserId = (Long) session.getAttribute("userId");
        pageInput.setLspUserId(lspUserId);
        pageInput.setPageSize(pageSize);
        pageInput.setPageNumber(pageNo);

        PagedList<SbGoodCategoryOutput> pagedList = sbGoodCategoryService.findCategorysByCondition(pageInput);
        int count = pagedList.getCount();

        /**找出和本服务商有关联的集散*/
        List<LspUserCenterRelationOutput> relationOutputs =
                lspUserService.loadCenterRelationByProviderId(lspUserId);
        model.addAttribute("relationOutputs", relationOutputs);

        model.addAttribute("pagedList", pagedList);
        model.addAttribute("pageInput", pageInput);
        return "category/index";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String loadAdd(ModelMap model) {
        model.addAttribute("category", new SbGoodCategoryOutput());
        return "category/add";
    }

    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public AjaxResponse add(@Validated SbGoodCategoryInput pageInput, Errors errors, String fileUrl, boolean isApply, @CurrentUser LspUserOutput lspUserOutput) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        Long id = pageInput.getId();
        int addOrUpdate = 0;
        if (id != null ) {//修改
            addOrUpdate = 1;
        }//修改
        int count = 0;
        int categoryCount = 0;
        if (errors.hasErrors()) {
            String Field =errors.getFieldError().getField();
            return AjaxResponse.paramInvalid(Field);
        }
        String categoryName = pageInput.getName();
        categoryCount = sbGoodCategoryService.findCategoryByName(categoryName,lspUserOutput.getId(), addOrUpdate);

        if(categoryCount>0){
            return AjaxResponse.failed("品类名已存在，不能申请重复名字的品类");
        }
        if (null == fileUrl || "".equals(fileUrl)) {
            return AjaxResponse.failed("图片未上传");
        }
        String stackRequire = pageInput.getStackRequire();
        if (stackRequire != null && !"".equals(stackRequire)) {
            pageInput.setStackRequire("|" + stackRequire.replaceAll(",", "|") + "|");
        }
        //LspUserOutput lspUserOutput = (LspUserOutput) session.getAttribute(Common.LSP_USER);

        if (id == null) {//新增
            count = sbGoodCategoryService.addCategory(pageInput, fileUrl, lspUserOutput, isApply);
        } else {//修改
            if (stackRequire == null) {
                pageInput.setStackRequire("");
            }
            count += sbGoodCategoryService.updateOneById(pageInput, fileUrl, lspUserOutput, isApply);
        }
        if (count > 0) {
            ajaxResponse = ajaxResponse.success();
        } else {
            ajaxResponse = ajaxResponse.failed("申请失败");
        }

        return ajaxResponse;
    }

    @ResponseBody
    @RequestMapping(value = "apply/{id}", method = RequestMethod.POST)
    public boolean apply(@PathVariable("id") Long id, @CurrentUser LspUserOutput lspUserOutput) {
        //LspUserOutput lspUserOutput = (LspUserOutput) session.getAttribute(Common.LSP_USER);
        SbGoodCategoryAllotInput input = new SbGoodCategoryAllotInput();
        input.setId(id);
        input.setStatus(1);
        input.setApplyTime(new Date());
        input.setApplyEmployeeId(lspUserOutput.getId());
        input.setApplyEmployeeName(lspUserOutput.getNickName());
        int count = sbGoodCategoryAllotService.updateOneById(input);
        return count > 0;
    }

    @RequestMapping(value = "edit/{id}", method = RequestMethod.GET)
    public String loadEdit(@PathVariable("id") Long id, ModelMap model) {
        SbGoodCategoryOutput output = sbGoodCategoryService.findOneById(id);
        List<SbOtherFileAttachmentOutput> attachmentOutputs = sbOtherFileAttachmentService.findBybusiId(id);
        model.addAttribute("category", output);
        StringBuffer sb = new StringBuffer();
        for (SbOtherFileAttachmentOutput attOutput : attachmentOutputs) {
            sb.append(attOutput.getFileUrl()).append(",");
        }
        String fileUrl = sb.toString();
        fileUrl = fileUrl.substring(0, fileUrl.length() - 1);

        model.addAttribute("fileUrl", fileUrl);
        model.addAttribute("attachmentOutputs",attachmentOutputs);
        return "category/add";
    }

    @RequestMapping(value = "detail/{id}", method = RequestMethod.GET)
    public String loadDetail(@PathVariable("id") Long id, ModelMap model) {
        List<SbGoodCategoryOutput> outputs = sbGoodCategoryService.findDetailByAllotId(id);

        StringBuffer sb = new StringBuffer();
        for (SbGoodCategoryOutput output : outputs) {
            sb.append(output.getFileUrl()).append(",");
        }
        String fileUrl = sb.toString();
        fileUrl = fileUrl.substring(0, fileUrl.length() - 1);
        SbGoodCategoryOutput sbGoodCategoryOutput = outputs.get(0);
        sbGoodCategoryOutput.setFileUrl(fileUrl);

        model.addAttribute("category", sbGoodCategoryOutput);

        return "category/detail";
    }


    @RequestMapping(value = "findCategoryPricesIndex",method = RequestMethod.GET)
    public  String findCategorys(ModelMap model,@CurrentUser Long userId){
        List list = sbAreaInfoService.selectAllProvince(0l);



        /**找出和本服务商有关联的集散*/
        List<LspUserCenterRelationOutput> relationOutputs =
                lspUserService.loadCenterRelationByProviderId(userId);
        model.addAttribute("pageInput",new SbGoodCategoryInput() );
        model.addAttribute("provinces", list);
        model.addAttribute("relationOutputs", relationOutputs);
        return "category/prices";
    }

    @RequestMapping(value = "findCategoryPrices", method = RequestMethod.GET)
    public String findCategorys(SbGoodCategoryInput pageInput, @CurrentUser Long userId, ModelMap model, @RequestParam(defaultValue = "1") int pageNo,
                                @RequestParam(defaultValue = "10") int pageSize) {
        //Long userId = (Long) session.getAttribute(Common.USER_ID);
        pageInput.setLspUserId(userId);
        pageInput.setPageSize(pageSize);
        pageInput.setPageNumber(pageNo);

        PagedList<SbGoodCategoryOutput> pageList = sbGoodCategoryService.findCategoryBasicPrice(pageInput);

        model.addAttribute("pagedList", pageList);

        List list = sbAreaInfoService.selectAllProvince(0l);

        if (pageInput.getEndProvinceId() != null) {

            List citys = sbAreaInfoService.selectAllProvince(pageInput.getEndProvinceId());
            model.addAttribute("citys", citys);
        }
        if (pageInput.getEndCityId() != null) {
            List countrys = sbAreaInfoService.selectAllProvince(pageInput.getEndCityId());
            model.addAttribute("countrys", countrys);
        }

        /**找出和本服务商有关联的集散*/
        List<LspUserCenterRelationOutput> relationOutputs =
                lspUserService.loadCenterRelationByProviderId(userId);
        model.addAttribute("relationOutputs", relationOutputs);
        model.addAttribute("pageInput", pageInput);
        model.addAttribute("provinces", list);
        return "category/prices";
    }
}
