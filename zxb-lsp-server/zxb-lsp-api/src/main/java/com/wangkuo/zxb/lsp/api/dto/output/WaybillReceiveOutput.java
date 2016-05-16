package com.wangkuo.zxb.lsp.api.dto.output;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by sanshao on 16-4-13.
 */
public class WaybillReceiveOutput implements Serializable {
    private Long id;

    private Long waybillId;

    private String waybillSn;

    private Integer receiveDay;

    private Integer receiveTrack;

    private Integer receivePosition;

    private Long createUserId;

    private String createUserName;

    private Date createTime;

    private Long lastFollowiUserId;

    private String lastFollowiUserName;

    private String lastFollowiMemo;

    private Date receiveEndTime;

    private Date receiveToAllotTime;

    private Integer receiveOuttimeDay;

    private Integer isOriginal;

    private Integer isSignReceive;

    private Integer isSendOff;

    private Integer type;

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

    public Integer getReceiveDay() {
        return receiveDay;
    }

    public void setReceiveDay(Integer receiveDay) {
        this.receiveDay = receiveDay;
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

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName == null ? null : createUserName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getLastFollowiUserId() {
        return lastFollowiUserId;
    }

    public void setLastFollowiUserId(Long lastFollowiUserId) {
        this.lastFollowiUserId = lastFollowiUserId;
    }

    public String getLastFollowiUserName() {
        return lastFollowiUserName;
    }

    public void setLastFollowiUserName(String lastFollowiUserName) {
        this.lastFollowiUserName = lastFollowiUserName == null ? null : lastFollowiUserName.trim();
    }

    public String getLastFollowiMemo() {
        return lastFollowiMemo;
    }

    public void setLastFollowiMemo(String lastFollowiMemo) {
        this.lastFollowiMemo = lastFollowiMemo == null ? null : lastFollowiMemo.trim();
    }

    public Date getReceiveEndTime() {
        return receiveEndTime;
    }

    public void setReceiveEndTime(Date receiveEndTime) {
        this.receiveEndTime = receiveEndTime;
    }

    public Date getReceiveToAllotTime() {
        return receiveToAllotTime;
    }

    public void setReceiveToAllotTime(Date receiveToAllotTime) {
        this.receiveToAllotTime = receiveToAllotTime;
    }

    public Integer getReceiveOuttimeDay() {
        return receiveOuttimeDay;
    }

    public void setReceiveOuttimeDay(Integer receiveOuttimeDay) {
        this.receiveOuttimeDay = receiveOuttimeDay;
    }

    public Integer getIsOriginal() {
        return isOriginal;
    }

    public void setIsOriginal(Integer isOriginal) {
        this.isOriginal = isOriginal;
    }

    public Integer getIsSignReceive() {
        return isSignReceive;
    }

    public void setIsSignReceive(Integer isSignReceive) {
        this.isSignReceive = isSignReceive;
    }

    public Integer getIsSendOff() {
        return isSendOff;
    }

    public void setIsSendOff(Integer isSendOff) {
        this.isSendOff = isSendOff;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
