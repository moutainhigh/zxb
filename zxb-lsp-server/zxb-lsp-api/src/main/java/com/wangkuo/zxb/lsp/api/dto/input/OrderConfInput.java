package com.wangkuo.zxb.lsp.api.dto.input;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by Administrator on 2016/4/12.
 */
public class OrderConfInput implements Serializable {

    private Long allocCenterId;
    private String allocCenterName;

    private Integer connectType;

    private String otherConnectType;

    private Integer isOpenTicket;
    private Integer isNeedEnterDepot;
    private Integer depotType;
    private Integer isUpstairsIncre;

    private Integer isUnloadIncre;
    private Integer isReceiveSendSms;
    private Integer isNeedReceipt;
    private Integer isExpress;
    private Integer balanceTypeWithZb;

    private String companyName;
    private String consigneeName;
    private String consigneeProvince;
    private String consigneeCity;
    private String consigneeCounty;
    private Integer consigneeProvinceId;

    private Integer consigneeCityId;
    private Integer consigneeCountyId;
    private String consigneeAddress;
    private String consigneeMobile;
    private BigDecimal enterFee;
    private BigDecimal upstairsFee;
    private Integer isElevator;
    private Integer floorNum;
    private BigDecimal unloadFee;
    private BigDecimal signedReceiveFee;
    private BigDecimal expressFee;
    private BigDecimal insuredFee;
    private BigDecimal premiumFee;
    private Integer feeStatus;//用于后台过滤费用操作,1执行费用入库
    public String getConsigneeProvince() {
        return consigneeProvince;
    }

    public void setConsigneeProvince(String consigneeProvince) {
        this.consigneeProvince = consigneeProvince;
    }

    public String getConsigneeCity() {
        return consigneeCity;
    }

    public void setConsigneeCity(String consigneeCity) {
        this.consigneeCity = consigneeCity;
    }

    public String getConsigneeCounty() {
        return consigneeCounty;
    }

    public void setConsigneeCounty(String consigneeCounty) {
        this.consigneeCounty = consigneeCounty;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getConsigneeName() {
        return consigneeName;
    }

    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
    }

    public Integer getConsigneeProvinceId() {
        return consigneeProvinceId;
    }

    public void setConsigneeProvinceId(Integer consigneeProvinceId) {
        this.consigneeProvinceId = consigneeProvinceId;
    }

    public Integer getConsigneeCityId() {
        return consigneeCityId;
    }

    public void setConsigneeCityId(Integer consigneeCityId) {
        this.consigneeCityId = consigneeCityId;
    }

    public Integer getConsigneeCountyId() {
        return consigneeCountyId;
    }

    public void setConsigneeCountyId(Integer consigneeCountyId) {
        this.consigneeCountyId = consigneeCountyId;
    }

    public String getConsigneeAddress() {
        return consigneeAddress;
    }

    public void setConsigneeAddress(String consigneeAddress) {
        this.consigneeAddress = consigneeAddress;
    }

    public String getConsigneeMobile() {
        return consigneeMobile;
    }

    public void setConsigneeMobile(String consigneeMobile) {
        this.consigneeMobile = consigneeMobile;
    }

    public BigDecimal getEnterFee() {
        return enterFee;
    }

    public void setEnterFee(BigDecimal enterFee) {
        this.enterFee = enterFee;
    }

    public BigDecimal getUpstairsFee() {
        return upstairsFee;
    }

    public void setUpstairsFee(BigDecimal upstairsFee) {
        this.upstairsFee = upstairsFee;
    }

    public Integer getIsElevator() {
        return isElevator;
    }

    public void setIsElevator(Integer isElevator) {
        this.isElevator = isElevator;
    }

    public Integer getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(Integer floorNum) {
        this.floorNum = floorNum;
    }

    public BigDecimal getUnloadFee() {
        return unloadFee;
    }

    public void setUnloadFee(BigDecimal unloadFee) {
        this.unloadFee = unloadFee;
    }

    public BigDecimal getSignedReceiveFee() {
        return signedReceiveFee;
    }

    public void setSignedReceiveFee(BigDecimal signedReceiveFee) {
        this.signedReceiveFee = signedReceiveFee;
    }

    public BigDecimal getExpressFee() {
        return expressFee;
    }

    public void setExpressFee(BigDecimal expressFee) {
        this.expressFee = expressFee;
    }

    public BigDecimal getInsuredFee() {
        return insuredFee;
    }

    public void setInsuredFee(BigDecimal insuredFee) {
        this.insuredFee = insuredFee;
    }

    public BigDecimal getPremiumFee() {
        return premiumFee;
    }

    public void setPremiumFee(BigDecimal premiumFee) {
        this.premiumFee = premiumFee;
    }

    public Long getAllocCenterId() {
        return allocCenterId;
    }

    public void setAllocCenterId(Long allocCenterId) {
        this.allocCenterId = allocCenterId;
    }

    public String getAllocCenterName() {
        return allocCenterName;
    }

    public void setAllocCenterName(String allocCenterName) {
        this.allocCenterName = allocCenterName;
    }

    public Integer getConnectType() {
        return connectType;
    }

    public void setConnectType(Integer connectType) {
        this.connectType = connectType;
    }

    public String getOtherConnectType() {
        return otherConnectType;
    }

    public void setOtherConnectType(String otherConnectType) {
        this.otherConnectType = otherConnectType;
    }

    public Integer getIsOpenTicket() {
        return isOpenTicket;
    }

    public void setIsOpenTicket(Integer isOpenTicket) {
        this.isOpenTicket = isOpenTicket;
    }

    public Integer getIsNeedEnterDepot() {
        return isNeedEnterDepot;
    }

    public void setIsNeedEnterDepot(Integer isNeedEnterDepot) {
        this.isNeedEnterDepot = isNeedEnterDepot;
    }

    public Integer getIsUpstairsIncre() {
        return isUpstairsIncre;
    }

    public void setIsUpstairsIncre(Integer isUpstairsIncre) {
        this.isUpstairsIncre = isUpstairsIncre;
    }

    public Integer getIsUnloadIncre() {
        return isUnloadIncre;
    }

    public void setIsUnloadIncre(Integer isUnloadIncre) {
        this.isUnloadIncre = isUnloadIncre;
    }

    public Integer getIsReceiveSendSms() {
        return isReceiveSendSms;
    }

    public void setIsReceiveSendSms(Integer isReceiveSendSms) {
        this.isReceiveSendSms = isReceiveSendSms;
    }

    public Integer getIsNeedReceipt() {
        return isNeedReceipt;
    }

    public void setIsNeedReceipt(Integer isNeedReceipt) {
        this.isNeedReceipt = isNeedReceipt;
    }

    public Integer getIsExpress() {
        return isExpress;
    }

    public void setIsExpress(Integer isExpress) {
        this.isExpress = isExpress;
    }

    public Integer getBalanceTypeWithZb() {
        return balanceTypeWithZb;
    }

    public void setBalanceTypeWithZb(Integer balanceTypeWithZb) {
        this.balanceTypeWithZb = balanceTypeWithZb;
    }

    public Integer getFeeStatus() {
        return feeStatus;
    }

    public void setFeeStatus(Integer feeStatus) {
        this.feeStatus = feeStatus;
    }

    public Integer getDepotType() {
        return depotType;
    }

    public void setDepotType(Integer depotType) {
        this.depotType = depotType;
    }
}
