package com.wangkuo.zxb.lsp.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2016-04-17
 */
@Controller
@RequestMapping("/")
public class HomeController {
    @RequestMapping
    public String index(){
        return "redirect:/lspUser/index";
    }
}
