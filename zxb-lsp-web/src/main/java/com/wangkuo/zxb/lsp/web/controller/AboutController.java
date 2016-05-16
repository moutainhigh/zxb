package com.wangkuo.zxb.lsp.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by cuihe on 16/5/9.
 */
@Controller
@RequestMapping("/about")
public class AboutController {

    /**
     * 注册服务条款
     * @return
     */
    @RequestMapping(value = "/service", method = RequestMethod.GET)
    public String service() {

        return "/about/service";
    }

}
