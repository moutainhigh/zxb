package com.wangkuo.zxb.mms.web.viewmodel;

import java.io.Serializable;

/**
 * 下拉框选择项
 *
 * @author 林守锦
 * @version 1.0
 * @date 2016-05-05
 */
public class SelectItem implements Serializable {

    private String text;

    private Object value;

    /**
     * Getter for property 'text'.
     *
     * @return Value for property 'text'.
     */
    public String getText() {
        return text;
    }

    /**
     * Setter for property 'text'.
     *
     * @param text Value to set for property 'text'.
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Getter for property 'value'.
     *
     * @return Value for property 'value'.
     */
    public Object getValue() {
        return value;
    }

    /**
     * Setter for property 'value'.
     *
     * @param value Value to set for property 'value'.
     */
    public void setValue(Object value) {
        this.value = value;
    }
}
