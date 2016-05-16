package com.wangkuo.zxb.mms.web.secure;

import java.lang.annotation.*;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2016-05-10
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Permission {
    String[] value() default {};
}
