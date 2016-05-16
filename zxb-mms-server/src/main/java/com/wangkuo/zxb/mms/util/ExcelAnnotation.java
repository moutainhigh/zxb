package com.wangkuo.zxb.mms.util;

import java.lang.annotation.*;

/**
 * Created by cuihe on 15/10/30.
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target(ElementType.FIELD)
public @interface ExcelAnnotation {

    public static final String PROFILE_ZB = "EXCEL_PROFILE_ZB";
    public static final String PROFILE_WD = "EXCEL_PROFILE_WD";


    String name();

    int order() default 999999;

    /**
     * 现在只支持Date类型,默认“yyyy-MM-dd”
     * @return
     */
    String format() default "";

    int[] key() default {};

    String[] value() default {};

    String[] alias() default {};

    String[] profile() default {};
}

