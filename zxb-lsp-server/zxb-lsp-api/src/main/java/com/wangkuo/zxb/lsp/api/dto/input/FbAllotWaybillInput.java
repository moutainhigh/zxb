package com.wangkuo.zxb.lsp.api.dto.input;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by chaizf on 2016/4/9.
 */
public class FbAllotWaybillInput implements Serializable {
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

    private Integer overStatus;

    private Date overTime;

    private Long overUserId;

    private String overUserName;

    private BigDecimal informationFee;

    private Integer informationFeeVerifiStatus;

    private Long informationFeeVerifiId;

    private String informationFeeVerifiName;

    private Date informationFeeVerifiTime;

    private Integer informationFeeOverStatus;

    private Date informationFeeOverTime;

    private Long informationFeeOverId;

    private String informationFeeOverName;

    private BigDecimal serviceFee;

    private BigDecimal realRansitFee;

    private BigDecimal sendGoodFee;

    private String partName;

    private BigDecimal preRansitFee;

    private BigDecimal preSendGoodFee;

    private Integer isConfirmPreAllot;

    private Integer departStatus;

    private Integer ransitNum;

    private Integer runTime;

    private Date departTime;

    private Long departUserId;

    private String departUserName;

    private BigDecimal mainLineFee;

    private Integer isAllotEdit;

    private String stall;

    private BigDecimal ransitFeeCost;

    private BigDecimal realRansitFeeCost;

    private BigDecimal informationFeeCost;

    private BigDecimal sendGoodFeeCost;

    private BigDecimal mainLineFeeCost;

    private BigDecimal upstairsFee;

    private BigDecimal unloadFee;

    private BigDecimal upstairsFeeCost;

    private BigDecimal unloadFeeCost;

    private BigDecimal expressFee;

    private BigDecimal signedReceiveFee;

    private BigDecimal enterFeeCost;

    private BigDecimal enterFee;

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
        this.waybillSn = waybillSn;
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
        this.transportName = transportName;
    }

    public String getTransportPhone() {
        return transportPhone;
    }

    public void setTransportPhone(String transportPhone) {
        this.transportPhone = transportPhone;
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

    public String getTransitLinkname() {
        return transitLinkname;
    }

    public void setTransitLinkname(String transitLinkname) {
        this.transitLinkname = transitLinkname;
    }

    public String getRansitSn() {
        return ransitSn;
    }

    public void setRansitSn(String ransitSn) {
        this.ransitSn = ransitSn;
    }

    public String getRansitPlace() {
        return ransitPlace;
    }

    public void setRansitPlace(String ransitPlace) {
        this.ransitPlace = ransitPlace;
    }

    public String getRansitTel() {
        return ransitTel;
    }

    public void setRansitTel(String ransitTel) {
        this.ransitTel = ransitTel;
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
        this.verifiUserName = verifiUserName;
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
        this.verifiMemo = verifiMemo;
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
        this.paymentUserName = paymentUserName;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
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
        this.overUserName = overUserName;
    }

    public BigDecimal getInformationFee() {
        return informationFee;
    }

    public void setInformationFee(BigDecimal informationFee) {
        this.informationFee = informationFee;
    }

    public Integer getInformationFeeVerifiStatus() {
        return informationFeeVerifiStatus;
    }

    public void setInformationFeeVerifiStatus(Integer informationFeeVerifiStatus) {
        this.informationFeeVerifiStatus = informationFeeVerifiStatus;
    }

    public Long getInformationFeeVerifiId() {
        return informationFeeVerifiId;
    }

    public void setInformationFeeVerifiId(Long informationFeeVerifiId) {
        this.informationFeeVerifiId = informationFeeVerifiId;
    }

    public String getInformationFeeVerifiName() {
        return informationFeeVerifiName;
    }

    public void setInformationFeeVerifiName(String informationFeeVerifiName) {
        this.informationFeeVerifiName = informationFeeVerifiName;
    }

    public Date getInformationFeeVerifiTime() {
        return informationFeeVerifiTime;
    }

    public void setInformationFeeVerifiTime(Date informationFeeVerifiTime) {
        this.informationFeeVerifiTime = informationFeeVerifiTime;
    }

    public Integer getInformationFeeOverStatus() {
        return informationFeeOverStatus;
    }

    public void setInformationFeeOverStatus(Integer informationFeeOverStatus) {
        this.informationFeeOverStatus = informationFeeOverStatus;
    }

    public Date getInformationFeeOverTime() {
        return informationFeeOverTime;
    }

    public void setInformationFeeOverTime(Date informationFeeOverTime) {
        this.informationFeeOverTime = informationFeeOverTime;
    }

    public Long getInformationFeeOverId() {
        return informationFeeOverId;
    }

    public void setInformationFeeOverId(Long informationFeeOverId) {
        this.informationFeeOverId = informationFeeOverId;
    }

    public String getInformationFeeOverName() {
        return informationFeeOverName;
    }

    public void setInformationFeeOverName(String informationFeeOverName) {
        this.informationFeeOverName = informationFeeOverName;
    }

    public BigDecimal getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(BigDecimal serviceFee) {
        this.serviceFee = serviceFee;
    }

    public BigDecimal getRealRansitFee() {
        return realRansitFee;
    }

    public void setRealRansitFee(BigDecimal realRansitFee) {
        this.realRansitFee = realRansitFee;
    }

    public BigDecimal getSendGoodFee() {
        return sendGoodFee;
    }

    public void setSendGoodFee(BigDecimal sendGoodFee) {
        this.sendGoodFee = sendGoodFee;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public BigDecimal getPreRansitFee() {
        return preRansitFee;
    }

    public void setPreRansitFee(BigDecimal preRansitFee) {
        this.preRansitFee = preRansitFee;
    }

    public BigDecimal getPreSendGoodFee() {
        return preSendGoodFee;
    }

    public void setPreSendGoodFee(BigDecimal preSendGoodFee) {
        this.preSendGoodFee = preSendGoodFee;
    }

    public Integer getIsConfirmPreAllot() {
        return isConfirmPreAllot;
    }

    public void setIsConfirmPreAllot(Integer isConfirmPreAllot) {
        this.isConfirmPreAllot = isConfirmPreAllot;
    }

    public Integer getDepartStatus() {
        return departStatus;
    }

    public void setDepartStatus(Integer departStatus) {
        this.departStatus = departStatus;
    }

    public Integer getRansitNum() {
        return ransitNum;
    }

    public void setRansitNum(Integer ransitNum) {
        this.ransitNum = ransitNum;
    }

    public Integer getRunTime() {
        return runTime;
    }

    public void setRunTime(Integer runTime) {
        this.runTime = runTime;
    }

    public Date getDepartTime() {
        return departTime;
    }

    public void setDepartTime(Date departTime) {
        this.departTime = departTime;
    }

    public Long getDepartUserId() {
        return departUserId;
    }

    public void setDepartUserId(Long departUserId) {
        this.departUserId = departUserId;
    }

    public String getDepartUserName() {
        return departUserName;
    }

    public void setDepartUserName(String departUserName) {
        this.departUserName = departUserName;
    }

    public BigDecimal getMainLineFee() {
        return mainLineFee;
    }

    public void setMainLineFee(BigDecimal mainLineFee) {
        this.mainLineFee = mainLineFee;
    }

    public Integer getIsAllotEdit() {
        return isAllotEdit;
    }

    public void setIsAllotEdit(Integer isAllotEdit) {
        this.isAllotEdit = isAllotEdit;
    }

    public String getStall() {
        return stall;
    }

    public void setStall(String stall) {
        this.stall = stall;
    }

    public BigDecimal getRansitFeeCost() {
        return ransitFeeCost;
    }

    public void setRansitFeeCost(BigDecimal ransitFeeCost) {
        this.ransitFeeCost = ransitFeeCost;
    }

    public BigDecimal getRealRansitFeeCost() {
        return realRansitFeeCost;
    }

    public void setRealRansitFeeCost(BigDecimal realRansitFeeCost) {
        this.realRansitFeeCost = realRansitFeeCost;
    }

    public BigDecimal getInformationFeeCost() {
        return informationFeeCost;
    }

    public void setInformationFeeCost(BigDecimal informationFeeCost) {
        this.informationFeeCost = informationFeeCost;
    }

    public BigDecimal getSendGoodFeeCost() {
        return sendGoodFeeCost;
    }

    public void setSendGoodFeeCost(BigDecimal sendGoodFeeCost) {
        this.sendGoodFeeCost = sendGoodFeeCost;
    }

    public BigDecimal getMainLineFeeCost() {
        return mainLineFeeCost;
    }

    public void setMainLineFeeCost(BigDecimal mainLineFeeCost) {
        this.mainLineFeeCost = mainLineFeeCost;
    }

    public BigDecimal getUpstairsFee() {
        return upstairsFee;
    }

    public void setUpstairsFee(BigDecimal upstairsFee) {
        this.upstairsFee = upstairsFee;
    }

    public BigDecimal getUnloadFee() {
        return unloadFee;
    }

    public void setUnloadFee(BigDecimal unloadFee) {
        this.unloadFee = unloadFee;
    }

    public BigDecimal getUpstairsFeeCost() {
        return upstairsFeeCost;
    }

    public void setUpstairsFeeCost(BigDecimal upstairsFeeCost) {
        this.upstairsFeeCost = upstairsFeeCost;
    }

    public BigDecimal getUnloadFeeCost() {
        return unloadFeeCost;
    }

    public void setUnloadFeeCost(BigDecimal unloadFeeCost) {
        this.unloadFeeCost = unloadFeeCost;
    }

    public BigDecimal getExpressFee() {
        return expressFee;
    }

    public void setExpressFee(BigDecimal expressFee) {
        this.expressFee = expressFee;
    }

    public BigDecimal getSignedReceiveFee() {
        return signedReceiveFee;
    }

    public void setSignedReceiveFee(BigDecimal signedReceiveFee) {
        this.signedReceiveFee = signedReceiveFee;
    }

    public BigDecimal getEnterFeeCost() {
        return enterFeeCost;
    }

    public void setEnterFeeCost(BigDecimal enterFeeCost) {
        this.enterFeeCost = enterFeeCost;
    }

    public BigDecimal getEnterFee() {
        return enterFee;
    }

    public void setEnterFee(BigDecimal enterFee) {
        this.enterFee = enterFee;
    }
}
