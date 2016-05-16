package com.wangkuo.zxb.lsp.api.service;

import java.lang.annotation.*;

/**
 * Created by mark on 16/4/9.
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target(ElementType.FIELD)
public @interface ChangeProperty {
    String name();
    String from() default "";
    boolean isLeadToVerify() default false;
    boolean needPersistent() default false;

    String[] key() default {};
    String[] value() default {};
}
