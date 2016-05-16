package com.wangkuo.zxb.lsp.web.interceptor;

import java.lang.annotation.*;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2016-04-13
 */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface UserVerifyRequired {

    boolean value() default true;
}
