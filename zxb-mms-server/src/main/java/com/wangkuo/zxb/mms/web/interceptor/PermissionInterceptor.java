package com.wangkuo.zxb.mms.web.interceptor;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.wangkuo.zxb.mms.constant.Constants;
import com.wangkuo.zxb.mms.server.db.po.TPermission;
import com.wangkuo.zxb.mms.server.db.po.TUser;
import com.wangkuo.zxb.mms.server.service.IPermissionService;
import com.wangkuo.zxb.mms.web.secure.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;

/**
 * 权限判断控制器
 *
 * @author 林守锦
 * @version 1.0
 * @date 2016-05-10
 */
public class PermissionInterceptor extends HandlerInterceptorAdapter {

    private String noPermissionTipUrl = "/common/noPermission";

    @Autowired
    private IPermissionService permissionService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if (!(handler instanceof HandlerMethod)) {
            return true;
        }

        TUser user = (TUser) request.getAttribute(Constants.CURRENT_USER);

        if (user.getIsAdmin()) {
            return true;
        }


        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Permission classAnnotation = handlerMethod.getMethod().getDeclaringClass().getAnnotation(Permission.class);
        Permission methodAnnotation = handlerMethod.getMethodAnnotation(Permission.class);
        Permission enableAnnotation = methodAnnotation == null ? classAnnotation : methodAnnotation;

        if (null == enableAnnotation || enableAnnotation.value().length == 0) {
            return true;
        }

        Collection<String> permissions = Collections2.transform(permissionService.findListByUser(user), new Function<TPermission, String>() {
            @Override
            public String apply(TPermission input) {
                return input.getCode();
            }
        });

        if (null == permissions || permissions.isEmpty()) {
            response(request, response);
            return false;
        }

        for (String permission : enableAnnotation.value()) {
            if (permissions.contains(permission)) {
                return true;
            }
        }

        response(request, response);
        return false;
    }

    private void response(HttpServletRequest request, HttpServletResponse response) throws IOException {
        if (isAjax(request)) {
            response.addHeader("permissionStatus", "accessDenied");
            response.sendError(403);
        } else {
            response.sendRedirect(request.getContextPath() + noPermissionTipUrl);
        }
    }


    private boolean isAjax(HttpServletRequest request) {
        return "XMLHttpRequest".equalsIgnoreCase(request.getHeader("X-Requested-With"));
    }


    /**
     * Getter for property 'noPermissionTipUrl'.
     *
     * @return Value for property 'noPermissionTipUrl'.
     */
    public String getNoPermissionTipUrl() {
        return noPermissionTipUrl;
    }

    /**
     * Setter for property 'noPermissionTipUrl'.
     *
     * @param noPermissionTipUrl Value to set for property 'noPermissionTipUrl'.
     */
    public void setNoPermissionTipUrl(String noPermissionTipUrl) {
        this.noPermissionTipUrl = noPermissionTipUrl;
    }
}
