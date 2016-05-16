package com.wangkuo.zxb.mms.dto.output;

import java.util.List;

/**
 * Created by mark on 16/3/25.
 */
public class SuggestOutput<T> {
    private List<T> value;

    public List<T> getValue() {
        return value;
    }

    public void setValue(List<T> value) {
        this.value = value;
    }
}
