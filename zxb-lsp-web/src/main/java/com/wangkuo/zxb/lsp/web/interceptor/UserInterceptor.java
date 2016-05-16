package com.wangkuo.zxb.lsp.web.interceptor;

import com.wangkuo.zxb.lsp.api.dto.output.LspUserOutput;
import com.wangkuo.zxb.lsp.api.service.ILspUserService;
import com.wangkuo.zxb.lsp.web.common.Common;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.net.URLEncoder;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2016-04-11
 */
public class UserInterceptor extends HandlerInterceptorAdapter {

    /**
     * 登录地址
     */
    private String loginUrl = "/login";

    /**
     * 显示未入驻信息的地址
     */
    private String noVerifyUrl = "/common/noVerify";

    @Autowired
    private ILspUserService lspUserService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        Long userId = (Long)session.getAttribute(Common.USER_ID);
        LspUserOutput user = null;
        if(null != userId){
            user = lspUserService.findOneProviderById(userId);
            request.setAttribute(Common.LSP_USER,user);
        }


        if (null != user) {

            if (!(handler instanceof HandlerMethod)) {
                return true;
            }

            HandlerMethod handlerMethod = (HandlerMethod) handler;




            UserVerifyRequired classAnnotation = handlerMethod.getMethod().getDeclaringClass().getAnnotation(UserVerifyRequired.class);
            UserVerifyRequired methodAnnotation = handlerMethod.getMethodAnnotation(UserVerifyRequired.class);
            UserVerifyRequired enableAnnotation = methodAnnotation == null ? classAnnotation : methodAnnotation;


            if (null == enableAnnotation || !enableAnnotation.value()) {
                return true;
            }

            if (user.isVerify()) {
                return true;
            }

            response.sendRedirect(request.getContextPath() + noVerifyUrl);
            return false;
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
                //HttpSession session = request.getSession();
                LspUserOutput user = (LspUserOutput) request.getAttribute(Common.LSP_USER);
                modelAndView.addObject("CURR_USER", user);
            }
        }

        super.postHandle(request, response, handler, modelAndView);
    }

    public String getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    /**
     * Getter for property 'noVerifyUrl'.
     *
     * @return Value for property 'noVerifyUrl'.
     */
    public String getNoVerifyUrl() {
        return noVerifyUrl;
    }

    /**
     * Setter for property 'noVerifyUrl'.
     *
     * @param noVerifyUrl Value to set for property 'noVerifyUrl'.
     */
    public void setNoVerifyUrl(String noVerifyUrl) {
        this.noVerifyUrl = noVerifyUrl;
    }
}
