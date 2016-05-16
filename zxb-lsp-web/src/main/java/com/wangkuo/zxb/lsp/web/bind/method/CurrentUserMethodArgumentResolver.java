package com.wangkuo.zxb.lsp.web.bind.method;

import com.wangkuo.zxb.lsp.api.dto.output.LspUserOutput;
import com.wangkuo.zxb.lsp.web.bind.annotation.CurrentUser;
import com.wangkuo.zxb.lsp.web.common.Common;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * 绑定@CurrentUser的方法参数解析器
 *
 * @author 林守锦
 * @version 1.0
 * @date 2015-09-28
 */
public class CurrentUserMethodArgumentResolver implements HandlerMethodArgumentResolver {

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.hasParameterAnnotation(CurrentUser.class);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {

        LspUserOutput lspUserOutput = (LspUserOutput) webRequest.getAttribute(Common.LSP_USER, RequestAttributes.SCOPE_REQUEST);

        if (null == lspUserOutput) {
            return null;
        }

        if (parameter.getParameterType().equals(Long.class)) {
            return lspUserOutput.getId();
        } else {
            return lspUserOutput;
        }
    }
}
