package com.wangkuo.zxb.mms.web.bind.method;

import com.wangkuo.zxb.mms.constant.Constants;
import com.wangkuo.zxb.mms.server.db.po.TUser;
import com.wangkuo.zxb.mms.web.bind.annotation.CurrentUser;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2016-04-25
 */
public class CurrentUserMethodArgumentResolver implements HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.hasParameterAnnotation(CurrentUser.class);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {

        TUser user = (TUser) webRequest.getAttribute(Constants.CURRENT_USER, RequestAttributes.SCOPE_REQUEST);
        if (null == user) {
            return null;
        }

        if (parameter.getParameterType().equals(Long.class)) {
            return user.getId();
        } else {
            return user;
        }
    }
}
