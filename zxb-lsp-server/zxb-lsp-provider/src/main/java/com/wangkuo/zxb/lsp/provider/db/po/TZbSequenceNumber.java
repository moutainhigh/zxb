package com.wangkuo.zxb.lsp.provider.db.po;

import java.io.Serializable;
import java.util.Date;

public class TZbSequenceNumber implements Serializable {
    private Long id;

    private Integer bodyType;

    private Long bodyId;

    private String code;

    private String prefix;

    private String infix;

    private String suffix;

    private String dateType;

    private Integer maxIndex;

    private Integer indexLength;

    private Byte flowStyle;

    private Date lastTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getBodyType() {
        return bodyType;
    }

    public void setBodyType(Integer bodyType) {
        this.bodyType = bodyType;
    }

    public Long getBodyId() {
        return bodyId;
    }

    public void setBodyId(Long bodyId) {
        this.bodyId = bodyId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix == null ? null : prefix.trim();
    }

    public String getInfix() {
        return infix;
    }

    public void setInfix(String infix) {
        this.infix = infix == null ? null : infix.trim();
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix == null ? null : suffix.trim();
    }

    public String getDateType() {
        return dateType;
    }

    public void setDateType(String dateType) {
        this.dateType = dateType == null ? null : dateType.trim();
    }

    public Integer getMaxIndex() {
        return maxIndex;
    }

    public void setMaxIndex(Integer maxIndex) {
        this.maxIndex = maxIndex;
    }

    public Integer getIndexLength() {
        return indexLength;
    }

    public void setIndexLength(Integer indexLength) {
        this.indexLength = indexLength;
    }

    public Byte getFlowStyle() {
        return flowStyle;
    }

    public void setFlowStyle(Byte flowStyle) {
        this.flowStyle = flowStyle;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }
}