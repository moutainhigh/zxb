package com.wangkuo.zxb.lsp.provider.db.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TSbDailyFee implements Serializable {
    private Long id;

    private String applyBodyType;

    private String typeContext;

    private BigDecimal fee;

    private String memo;

    private Long applyBodyId;

    private String applyBodyName;

    private Long applyUserId;

    private String applyUserName;

    private Date applyTime;

    private Integer verifiStatus;

    private Long verifiUserId;

    private String verifiUserName;

    private Date verifiTime;

    private String verifiMemo;

    private Long paymentUesrId;

    private String paymentUesrName;

    private Date paymentUesrTime;

    private Integer overStatus;

    private Date overTime;

    private Long overUserId;

    private String overUserName;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApplyBodyType() {
        return applyBodyType;
    }

    public void setApplyBodyType(String applyBodyType) {
        this.applyBodyType = applyBodyType == null ? null : applyBodyType.trim();
    }

    public String getTypeContext() {
        return typeContext;
    }

    public void setTypeContext(String typeContext) {
        this.typeContext = typeContext == null ? null : typeContext.trim();
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
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

    public Integer getVerifiStatus() {
        return verifiStatus;
    }

    public void setVerifiStatus(Integer verifiStatus) {
        this.verifiStatus = verifiStatus;
    }

    public Long getVerifiUserId() {
        return verifiUserId;
    }

    public void setVerifiUserId(Long verifiUserId) {
        this.verifiUserId = verifiUserId;
    }

    public String getVerifiUserName() {
        return verifiUserName;
    }

    public void setVerifiUserName(String verifiUserName) {
        this.verifiUserName = verifiUserName == null ? null : verifiUserName.trim();
    }

    public Date getVerifiTime() {
        return verifiTime;
    }

    public void setVerifiTime(Date verifiTime) {
        this.verifiTime = verifiTime;
    }

    public String getVerifiMemo() {
        return verifiMemo;
    }

    public void setVerifiMemo(String verifiMemo) {
        this.verifiMemo = verifiMemo == null ? null : verifiMemo.trim();
    }

    public Long getPaymentUesrId() {
        return paymentUesrId;
    }

    public void setPaymentUesrId(Long paymentUesrId) {
        this.paymentUesrId = paymentUesrId;
    }

    public String getPaymentUesrName() {
        return paymentUesrName;
    }

    public void setPaymentUesrName(String paymentUesrName) {
        this.paymentUesrName = paymentUesrName == null ? null : paymentUesrName.trim();
    }

    public Date getPaymentUesrTime() {
        return paymentUesrTime;
    }

    public void setPaymentUesrTime(Date paymentUesrTime) {
        this.paymentUesrTime = paymentUesrTime;
    }

    public Integer getOverStatus() {
        return overStatus;
    }

    public void setOverStatus(Integer overStatus) {
        this.overStatus = overStatus;
    }

    public Date getOverTime() {
        return overTime;
    }

    public void setOverTime(Date overTime) {
        this.overTime = overTime;
    }

    public Long getOverUserId() {
        return overUserId;
    }

    public void setOverUserId(Long overUserId) {
        this.overUserId = overUserId;
    }

    public String getOverUserName() {
        return overUserName;
    }

    public void setOverUserName(String overUserName) {
        this.overUserName = overUserName == null ? null : overUserName.trim();
    }
}