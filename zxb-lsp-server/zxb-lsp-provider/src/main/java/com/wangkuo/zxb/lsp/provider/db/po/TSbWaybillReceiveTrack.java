package com.wangkuo.zxb.lsp.provider.db.po;

import java.io.Serializable;
import java.util.Date;

public class TSbWaybillReceiveTrack implements Serializable {
    private Long id;

    private Long waybillReceiveId;

    private Long waybillId;

    private String waybillSn;

    private String memo;

    private Integer receiveTrack;

    private Integer receivePosition;

    private Long applyBodyId;

    private String applyBodyName;

    private Long applyUserId;

    private String applyUserName;

    private Date applyTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWaybillReceiveId() {
        return waybillReceiveId;
    }

    public void setWaybillReceiveId(Long waybillReceiveId) {
        this.waybillReceiveId = waybillReceiveId;
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

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Integer getReceiveTrack() {
        return receiveTrack;
    }

    public void setReceiveTrack(Integer receiveTrack) {
        this.receiveTrack = receiveTrack;
    }

    public Integer getReceivePosition() {
        return receivePosition;
    }

    public void setReceivePosition(Integer receivePosition) {
        this.receivePosition = receivePosition;
    }

    public Long getApplyBodyId() {
        return applyBodyId;
    }

    public void setApplyBodyId(Long applyBodyId) {
        this.applyBodyId = applyBodyId;
    }

    public String getApplyBodyName() {
        return applyBodyName;
    }

    public void setApplyBodyName(String applyBodyName) {
        this.applyBodyName = applyBodyName == null ? null : applyBodyName.trim();
    }

    public Long getApplyUserId() {
        return applyUserId;
    }

    public void setApplyUserId(Long applyUserId) {
        this.applyUserId = applyUserId;
    }

    public String getApplyUserName() {
        return applyUserName;
    }

    public void setApplyUserName(String applyUserName) {
        this.applyUserName = applyUserName == null ? null : applyUserName.trim();
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }
}