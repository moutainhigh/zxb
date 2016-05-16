package com.wangkuo.zxb.smart.show.dto.output;

import java.io.Serializable;

/**
 * Created by john on 2016/4/18.
 */
public class GoodCategoryOutput implements Serializable {
    //货物名称
    private String categoryRate;
    //货物所占比例
    private String categoryName;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryRate() {

        return categoryRate;
    }

    public void setCategoryRate(String categoryRate) {
        this.categoryRate = categoryRate;
    }
}
