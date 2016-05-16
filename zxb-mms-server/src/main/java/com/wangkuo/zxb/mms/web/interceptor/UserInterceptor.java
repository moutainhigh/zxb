package com.wangkuo.zxb.mms.web.interceptor;

import com.wangkuo.zxb.mms.constant.Constants;
import com.wangkuo.zxb.mms.server.db.po.TUser;
import com.wangkuo.zxb.mms.server.service.IUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.net.URLEncoder;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2016-04-25
 */
public class UserInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    private IUserService userService;

    /**
     * 登录地址
     */
    private String loginUrl = "/login";


    public String getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        Long userId = (Long) session.getAttribute(Constants.CURRENT_USER_IN_SESSION);


        if (null != userId) {
            TUser user = userService.find(userId);

            if (null != user) {
                request.setAttribute(Constants.CURRENT_USER, user);
                return true;
            }
        }


        if ("XMLHttpRequest".equalsIgnoreCase(request.getHeader("X-Requested-With"))) {
            response.addHeader("loginStatus", "accessDenied");
            response.sendError(403);
            return false;
        }


        if ("GET".equalsIgnoreCase(request.getMethod())) {
            String queryString = null != request.getQueryString() ? request.getRequestURI() + "?" + request.getQueryString() : request.getRequestURI();
            response.sendRedirect(request.getContextPath() + loginUrl + "?returnUrl=" + URLEncoder.encode(queryString, "UTF-8"));
        } else {
            response.sendRedirect(request.getContextPath() + loginUrl);
        }

        return false;
    }


    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

        if (modelAndView != null) {
            String str = modelAndView.getViewName();
            if (!StringUtils.startsWith(str, "redirect:")) {
                TUser user = (TUser) request.getAttribute(Constants.CURRENT_USER);
                modelAndView.addObject(Constants.CURRENT_USER_IN_VIEW, user);
            }
        }

        super.postHandle(request, response, handler, modelAndView);
    }
}
