package com.wangkuo.zxb.smart.show.dto.output;

import java.io.Serializable;

/**
 * Created by john on 2016/4/18.
 */
public class BaseData implements Serializable {
    private String name;

    private int value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
