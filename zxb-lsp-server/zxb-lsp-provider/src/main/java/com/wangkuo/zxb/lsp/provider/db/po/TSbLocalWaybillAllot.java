package com.wangkuo.zxb.lsp.provider.db.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TSbLocalWaybillAllot implements Serializable {
    private Long id;

    private Long waybillId;

    private String waybillSn;

    private Integer isAllot;

    private Integer transportBodyType;

    private Long transportBodyId;

    private String transportName;

    private String transportPhone;

    private Integer hoursLimit;

    private Date predictSendTime;

    private BigDecimal ransitFee;

    private BigDecimal realRansitFee;

    private BigDecimal informationFee;

    private String transitLinkname;

    private String ransitSn;

    private String ransitPlace;

    private String ransitTel;

    private Integer verifiStatus;

    private Long verifiUserId;

    private String verifiUserName;

    private Date verifiTime;

    private String verifiMemo;

    private Long paymentUserId;

    private String paymentUserName;

    private Date paymentTime;

    private BigDecimal sendGoodFee;

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

    public Integer getIsAllot() {
        return isAllot;
    }

    public void setIsAllot(Integer isAllot) {
        this.isAllot = isAllot;
    }

    public Integer getTransportBodyType() {
        return transportBodyType;
    }

    public void setTransportBodyType(Integer transportBodyType) {
        this.transportBodyType = transportBodyType;
    }

    public Long getTransportBodyId() {
        return transportBodyId;
    }

    public void setTransportBodyId(Long transportBodyId) {
        this.transportBodyId = transportBodyId;
    }

    public String getTransportName() {
        return transportName;
    }

    public void setTransportName(String transportName) {
        this.transportName = transportName == null ? null : transportName.trim();
    }

    public String getTransportPhone() {
        return transportPhone;
    }

    public void setTransportPhone(String transportPhone) {
        this.transportPhone = transportPhone == null ? null : transportPhone.trim();
    }

    public Integer getHoursLimit() {
        return hoursLimit;
    }

    public void setHoursLimit(Integer hoursLimit) {
        this.hoursLimit = hoursLimit;
    }

    public Date getPredictSendTime() {
        return predictSendTime;
    }

    public void setPredictSendTime(Date predictSendTime) {
        this.predictSendTime = predictSendTime;
    }

    public BigDecimal getRansitFee() {
        return ransitFee;
    }

    public void setRansitFee(BigDecimal ransitFee) {
        this.ransitFee = ransitFee;
    }

    public BigDecimal getRealRansitFee() {
        return realRansitFee;
    }

    public void setRealRansitFee(BigDecimal realRansitFee) {
        this.realRansitFee = realRansitFee;
    }

    public BigDecimal getInformationFee() {
        return informationFee;
    }

    public void setInformationFee(BigDecimal informationFee) {
        this.informationFee = informationFee;
    }

    public String getTransitLinkname() {
        return transitLinkname;
    }

    public void setTransitLinkname(String transitLinkname) {
        this.transitLinkname = transitLinkname == null ? null : transitLinkname.trim();
    }

    public String getRansitSn() {
        return ransitSn;
    }

    public void setRansitSn(String ransitSn) {
        this.ransitSn = ransitSn == null ? null : ransitSn.trim();
    }

    public String getRansitPlace() {
        return ransitPlace;
    }

    public void setRansitPlace(String ransitPlace) {
        this.ransitPlace = ransitPlace == null ? null : ransitPlace.trim();
    }

    public String getRansitTel() {
        return ransitTel;
    }

    public void setRansitTel(String ransitTel) {
        this.ransitTel = ransitTel == null ? null : ransitTel.trim();
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

    public Long getPaymentUserId() {
        return paymentUserId;
    }

    public void setPaymentUserId(Long paymentUserId) {
        this.paymentUserId = paymentUserId;
    }

    public String getPaymentUserName() {
        return paymentUserName;
    }

    public void setPaymentUserName(String paymentUserName) {
        this.paymentUserName = paymentUserName == null ? null : paymentUserName.trim();
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public BigDecimal getSendGoodFee() {
        return sendGoodFee;
    }

    public void setSendGoodFee(BigDecimal sendGoodFee) {
        this.sendGoodFee = sendGoodFee;
    }
}