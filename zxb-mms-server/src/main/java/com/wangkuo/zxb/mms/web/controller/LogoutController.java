package com.wangkuo.zxb.mms.web.controller;

import com.wangkuo.zxb.mms.constant.Constants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2016-05-09
 */
@Controller
@RequestMapping("/logout")
public class LogoutController {

    @RequestMapping()
    public String logout(HttpSession session) {
        session.removeAttribute(Constants.CURRENT_USER_IN_SESSION);
        return "redirect:/login";
    }
}
