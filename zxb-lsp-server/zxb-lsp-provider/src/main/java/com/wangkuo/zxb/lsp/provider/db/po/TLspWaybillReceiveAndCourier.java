package com.wangkuo.zxb.lsp.provider.db.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TLspWaybillReceiveAndCourier implements Serializable {
    private Long id;

    private String couriernumber;

    private String couriername;

    private BigDecimal courierfee;

    private Long allotCenterId;

    private String allotCenterName;

    private Long createUserId;

    private String createUserName;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCouriernumber() {
        return couriernumber;
    }

    public void setCouriernumber(String couriernumber) {
        this.couriernumber = couriernumber == null ? null : couriernumber.trim();
    }

    public String getCouriername() {
        return couriername;
    }

    public void setCouriername(String couriername) {
        this.couriername = couriername == null ? null : couriername.trim();
    }

    public BigDecimal getCourierfee() {
        return courierfee;
    }

    public void setCourierfee(BigDecimal courierfee) {
        this.courierfee = courierfee;
    }

    public Long getAllotCenterId() {
        return allotCenterId;
    }

    public void setAllotCenterId(Long allotCenterId) {
        this.allotCenterId = allotCenterId;
    }

    public String getAllotCenterName() {
        return allotCenterName;
    }

    public void setAllotCenterName(String allotCenterName) {
        this.allotCenterName = allotCenterName == null ? null : allotCenterName.trim();
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
}