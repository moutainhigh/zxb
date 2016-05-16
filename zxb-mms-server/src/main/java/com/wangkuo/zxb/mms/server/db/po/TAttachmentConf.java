package com.wangkuo.zxb.mms.server.db.po;

import java.io.Serializable;

public class TAttachmentConf implements Serializable {
    private Long id;

    private String code;

    private Long maxFileSize;

    private String validFileExt;

    private Integer maxFileNum;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Long getMaxFileSize() {
        return maxFileSize;
    }

    public void setMaxFileSize(Long maxFileSize) {
        this.maxFileSize = maxFileSize;
    }

    public String getValidFileExt() {
        return validFileExt;
    }

    public void setValidFileExt(String validFileExt) {
        this.validFileExt = validFileExt == null ? null : validFileExt.trim();
    }

    public Integer getMaxFileNum() {
        return maxFileNum;
    }

    public void setMaxFileNum(Integer maxFileNum) {
        this.maxFileNum = maxFileNum;
    }
}