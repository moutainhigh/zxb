package com.wangkuo.zxb.lsp.api.dto.input;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by sanshao on 16-4-6.
 */
public class LspReceiveSendOffBaseMsgInput implements Serializable{

    private String couriernumber;

    private String couriername;

    private BigDecimal courierfee;

    private Long allotCenterId;

    private String allotCenterName;

    private Long createUserId;

    private String createUserName;

    private Date createTime;

    public String getCouriernumber() {
        return couriernumber;
    }

    public void setCouriernumber(String couriernumber) {
        this.couriernumber = couriernumber;
    }

    public String getCouriername() {
        return couriername;
    }

    public void setCouriername(String couriername) {
        this.couriername = couriername;
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
        this.allotCenterName = allotCenterName;
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
        this.createUserName = createUserName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
