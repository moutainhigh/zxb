package com.wangkuo.zxb.lsp.web.bind.annotation;


import java.lang.annotation.*;

/**
 * 绑定当前登录的会员
 *
 * @author 林守锦
 * @version 1.0
 * @date 2015-09-28
 */
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CurrentUser {

    /**
     * 当前用户在request中的名称
     *
     * @return
     */
    String value() default "";
}
