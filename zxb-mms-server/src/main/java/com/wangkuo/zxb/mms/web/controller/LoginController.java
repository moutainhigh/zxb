package com.wangkuo.zxb.mms.web.controller;

import com.wangkuo.zxb.mms.constant.Constants;
import com.wangkuo.zxb.mms.dto.params.LoginParam;
import com.wangkuo.zxb.mms.server.db.po.TUser;
import com.wangkuo.zxb.mms.server.service.IUserService;
import com.wangkuo.zxb.mms.web.viewmodel.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2016-04-25
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private IUserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String login() {
        return "/login";
    }


    @ResponseBody
    @RequestMapping(method = RequestMethod.POST)
    public JsonResponse doLogin(@Validated LoginParam param, Errors errors, HttpSession session) {
        if (errors.hasErrors()) {
            return new JsonResponse(400);
        }

        TUser user = userService.findByAccount(param.getAccount());
        if (null == user || (null != user.getIsDeleted() && user.getIsDeleted())) {
            return new JsonResponse(-1);
        }

        if (!userService.validatePassword(user, param.getPassword())) {
            return new JsonResponse(-2);
        }

        //TODO:暂时直接用session
        session.setAttribute(Constants.CURRENT_USER_IN_SESSION, user.getId());

        return new JsonResponse(1);
    }

}
