package com.wangkuo.zxb.mms.server.db.po;

import java.io.Serializable;

public class TDict implements Serializable {
    private String dictValue;

    private String dictName;

    private static final long serialVersionUID = 1L;

    public String getDictValue() {
        return dictValue;
    }

    public void setDictValue(String dictValue) {
        this.dictValue = dictValue == null ? null : dictValue.trim();
    }

    public String getDictName() {
        return dictName;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName == null ? null : dictName.trim();
    }
}