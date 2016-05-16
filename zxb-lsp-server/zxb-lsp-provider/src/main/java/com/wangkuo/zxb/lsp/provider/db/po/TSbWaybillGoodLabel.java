package com.wangkuo.zxb.lsp.provider.db.po;

import java.io.Serializable;

public class TSbWaybillGoodLabel implements Serializable {
    private Long id;

    private Long waybillId;

    private String waybillSn;

    private String labelSn;

    private Integer num;

    private Integer status;

    private String memo;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWaybillId() {
        return waybillId;
    }

    public void setWaybillId(Long waybillId) {
        this.waybillId = waybillId;
    }

    public String getWaybillSn() {
        return waybillSn;
    }

    public void setWaybillSn(String waybillSn) {
        this.waybillSn = waybillSn == null ? null : waybillSn.trim();
    }

    public String getLabelSn() {
        return labelSn;
    }

    public void setLabelSn(String labelSn) {
        this.labelSn = labelSn == null ? null : labelSn.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}