package com.wangkuo.zxb.lsp.web.controller;

import com.wangkuo.zxb.lsp.api.dto.input.LspReceiverShipperInfoInput;
import com.wangkuo.zxb.lsp.api.dto.input.SbAreaInfoInput;
import com.wangkuo.zxb.lsp.api.dto.output.LspReceiverShipperInfoOutput;
import com.wangkuo.zxb.lsp.api.dto.output.PagedList;
import com.wangkuo.zxb.lsp.api.service.ILspReceiverShipperInfoService;
import com.wangkuo.zxb.lsp.api.service.ISbAreaInfoService;
import com.wangkuo.zxb.lsp.web.bind.annotation.CurrentUser;
import com.wangkuo.zxb.lsp.web.common.Common;
import com.wangkuo.zxb.lsp.web.bind.annotation.CurrentUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 验证码
 *
 * @author 王俊华
 * @version 1.0
 * @date 2016-03-31
 */
@Controller
@RequestMapping("/receicerShipper")
public class LspReceiverShipperInfoController {

    @Autowired
    private ILspReceiverShipperInfoService lspReceiverShipperInfoService;

    @Autowired
    private ISbAreaInfoService sbAreaInfoService;

    /**
     * 首页显示发货人信息
     *
     * @param pageInput
     * @param pageNo
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String handleRequest(ModelMap model, LspReceiverShipperInfoInput pageInput, @RequestParam(defaultValue = "1") int pageNo,
                                @RequestParam(defaultValue = "10") int pageSize, @CurrentUser Long lspUserId) {

        pageInput.setLspUserId(lspUserId);
        pageInput.setPageSize(pageSize);
        pageInput.setPageNumber(pageNo);
        if(pageInput.getType() == null){
            pageInput.setType(0);
        }
        PagedList<LspReceiverShipperInfoOutput> pagedList = lspReceiverShipperInfoService.getPagedList(pageInput);

        model.addAttribute("pagedList", pagedList);
        model.addAttribute("pageInput", pageInput);
        return "lsp_receiver_shipper/index";

    }


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String loadAdd(ModelMap model, LspReceiverShipperInfoInput pageInput) {

        List list = sbAreaInfoService.selectAllProvince(0l);

        model.addAttribute("pageInput", pageInput);
        model.addAttribute("provinces", list);
        return "lsp_receiver_shipper/add";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String loadUpdate(ModelMap model, @PathVariable Long id) {

        LspReceiverShipperInfoOutput output = lspReceiverShipperInfoService.findOneRecord(id);

        List provinces = sbAreaInfoService.selectAllProvince(0l);
        List citys = sbAreaInfoService.selectAllProvince(output.getProvinceId());
        List countrys = sbAreaInfoService.selectAllProvince(output.getCityId());

        model.addAttribute("pageInput", output);
        model.addAttribute("provinces", provinces);
        model.addAttribute("citys", citys);
        model.addAttribute("countrys", countrys);
        return "lsp_receiver_shipper/add";
    }

    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public boolean doAdd(ModelMap model, @Validated LspReceiverShipperInfoInput pageInput, Errors errors, @CurrentUser Long lspUserId) {
        if (errors.hasErrors()) {
            return false;
        }
        int count = 0;
        if (pageInput.getId() == null) {//新增
            pageInput.setLspUserId(lspUserId);
            count += lspReceiverShipperInfoService.addreceiverShipper(pageInput);
        } else {//修改
            count += lspReceiverShipperInfoService.updateById(pageInput);
        }
        return count > 0;
    }

    @ResponseBody
    @RequestMapping(value = "del/{id}", method = RequestMethod.POST)
    public boolean doDel(@PathVariable("id") Long id) {
        int count = lspReceiverShipperInfoService.deleteById(id);
        return count > 0;
    }

    @ResponseBody
    @RequestMapping(value = "setDefault/{id}", method = RequestMethod.POST)
    public boolean setDefault(@PathVariable("id") Long id) {
        int count = lspReceiverShipperInfoService.setDefalut(id);
        return count > 0;
    }

    @ResponseBody
    @RequestMapping(value = "/queryreceivershipperinfobylspid", method = RequestMethod.GET)
    public List<LspReceiverShipperInfoOutput> findReceiverShipperInfoByLspId(@CurrentUser Long userId,String userName,Integer type){
        return lspReceiverShipperInfoService.findReceiverShipperInfoByLspId(userId,userName,type);
    }
}

