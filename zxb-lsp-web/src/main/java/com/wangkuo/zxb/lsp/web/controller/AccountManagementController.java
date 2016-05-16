package com.wangkuo.zxb.lsp.web.controller;

import com.wangkuo.zxb.lsp.api.dto.input.LspUserInput;
import com.wangkuo.zxb.lsp.api.dto.output.LspUserOutput;
import com.wangkuo.zxb.lsp.api.service.ILspUserService;
import com.wangkuo.zxb.lsp.web.bind.annotation.CurrentUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 账户管理模块
 *
 * @author 柳朋朋
 * @version 1.0
 * @date 2016-04-13
 */
@Controller
@RequestMapping("/account")
public class AccountManagementController {

    @Autowired
    private ILspUserService lspUserService;

    //==============================账户管理-我的资料管理=============================

    /**
     * 我的资料管理  --->  基本信息
     */
    @RequestMapping(value = "/personBase", method = RequestMethod.GET)
    public String personBase() {

        return "/accountmanagement/base_info";
    }

    /**
     * 我的资料管理   --->  基本信息保存
     */
    @ResponseBody
    @RequestMapping(value = "/saveBaseInfo", method = RequestMethod.POST)
    public boolean saveBaseInfo(LspUserInput lspUserInput, @CurrentUser LspUserOutput lspUser) {
        //更新用户信息
        lspUserInput.setId(lspUser.getId());
        int count = lspUserService.updateProviderById(lspUserInput);
        return count > 0;
    }

    /**
     * 我的资料管理   --->  安全设置
     */
    @RequestMapping(value = "/securitySettings", method = RequestMethod.GET)
    public String securitySettings() {
        return "/accountmanagement/security_settings";
    }


}
