package com.wangkuo.zxb.lsp.provider.db.po;

import java.io.Serializable;
import java.util.Date;

public class TSbWaybillCustomerTrack implements Serializable {
    private Long id;

    private Long waybillId;

    private String memo;

    private String createName;

    private Date createTime;

    private String waybillSystemId;

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

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName == null ? null : createName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getWaybillSystemId() {
        return waybillSystemId;
    }

    public void setWaybillSystemId(String waybillSystemId) {
        this.waybillSystemId = waybillSystemId == null ? null : waybillSystemId.trim();
    }
}