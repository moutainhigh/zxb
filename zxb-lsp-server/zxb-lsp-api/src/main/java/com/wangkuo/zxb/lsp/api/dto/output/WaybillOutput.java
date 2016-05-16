package com.wangkuo.zxb.lsp.api.dto.output;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by chaizf on 2016/3/30.
 */
public class WaybillOutput implements Serializable {
    private Long id;

    private String systemSn;

    private String sn;

    private Date operationTime;

    private Integer status;

    private Integer source;

    private Long siteId;

    private String siteName;

    private Long lspId;

    private String lspCompanyName;

    private Long allocCenterId;

    private String allocCenterName;

    private Long shipperCustomerId;

    private String shipperCustomerCode;

    private String shipperCustomerName;

    private Long shipperProvinceId;

    private String shipperProvinceName;

    private Long shipperCityId;

    private String shipperCityName;

    private Long shipperCountryId;

    private String shipperCountryName;

    private Long shipperTownId;

    private String shipperTownName;

    private String shipperAddress;

    private String shipperLinkName;

    private String shipperLinkPhone;

    private String receiveName;

    private Long receiveProvinceId;

    private String receiveProvinceName;

    private Long receiveCityId;

    private String receiveCityName;

    private Long receiveCountryId;

    private String receiveCountryName;

    private String receiveAddress;

    private String receiveLinkName;

    private String receiveLinkPhone;

    private Integer isDamage;

    private Integer isChange;

    private Integer isDelete;

    private Long deleteReasonId;

    private String deleteReason;

    private String deleteReasonMemo;

    private Integer connectType;

    private String otherConnectType;

    private Integer balanceType;

    private Integer isNeedReceipt;

    private Integer isOpenTicket;

    private String ticketName;

    private Integer loadUnloadType;

    private String stackRequire;

    private Integer deliveryType;

    private Date transConfirTime;

    private Date arrangeDeliveryTime;

    private Date goodStationTime;

    private Float timeRequire;

    private Date expectArrivalTime;

    private Date expectStowageTime;

    private String memo;

    private Integer backStatus;

    private String backMemo;

    private Long backSubmitUserId;

    private String backSubmitUserName;

    private Date backSubmitTime;

    private Long backReceiveUserId;

    private String backReceiveUserName;

    private Date backReceiveTime;

    private Long bookerEmployeeId;

    private String bookerEmployeeName;

    private Date createTime;

    private Long businessId;

    private String businessName;

    private Integer isReceiveSendSms;

    private String downId;

    private Integer isLocal;

    private Integer balanceStatus;

    private Integer payStatus;

    private Integer payLocked;

    private Integer receiptTime;

    private Integer isNeedEnterDepot;

    private Date signTime;

    private Long signUserId;

    private String signUserName;

    private Integer balanceTypeWithZb;

    private String freeReason;

    private Integer isServiceInter;

    private Date paySuccessTime;

    private Date arrivalStationTime;

    private Long arrivalStationUserId;

    private String arrivalStationUserName;

    private Integer waybillOuttimeDay;

    private String paySuccessUserName;

    private Integer isAllowWaybillOuttime;

    private String currentProcessName;

    private Date requiredArrivalDate;

    private Integer isStandard;

    private Integer isUpstairsIncre;

    private Integer isUnloadIncre;

    private BigDecimal serviceFeeReturnRatio;

    private String shipperLinkMobile;

    private String receiveLinkMobile;

    private Integer isElevator;

    private Integer floorNum;

    private Integer isExpress;

    private Integer isHaveAttachment;

    private Long categoryId;

    private String categoryName;

    private String goodName;

    private String pack;

    private Integer num;

    private Float offerWeight;

    private Float offerVolume;

    private Integer depotType;//仓库类型

    private BigDecimal upstairsFeeCost;

    private BigDecimal unloadFeeCost;

    private BigDecimal expressFee;

    private BigDecimal signedReceiveFee;

    private BigDecimal enterFeeCost;

    private BigDecimal ransitFee;

    private BigDecimal insuredFee;//货物价值

    private BigDecimal premiumFee;//保费

    private BigDecimal xfyfFeeWithZb;

    private BigDecimal dfyfFeeWithZb;

    private String labelIds;

    private Integer GoodLabelNum;

    private Integer SelectGoodLabelNum;

    private Integer IsAlreadyPay;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSystemSn() {
        return systemSn;
    }

    public void setSystemSn(String systemSn) {
        this.systemSn = systemSn;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public Date getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Long getSiteId() {
        return siteId;
    }

    public void setSiteId(Long siteId) {
        this.siteId = siteId;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public Long getLspId() {
        return lspId;
    }

    public void setLspId(Long lspId) {
        this.lspId = lspId;
    }

    public String getLspCompanyName() {
        return lspCompanyName;
    }

    public void setLspCompanyName(String lspCompanyName) {
        this.lspCompanyName = lspCompanyName;
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

    public Long getShipperCustomerId() {
        return shipperCustomerId;
    }

    public void setShipperCustomerId(Long shipperCustomerId) {
        this.shipperCustomerId = shipperCustomerId;
    }

    public String getShipperCustomerCode() {
        return shipperCustomerCode;
    }

    public void setShipperCustomerCode(String shipperCustomerCode) {
        this.shipperCustomerCode = shipperCustomerCode;
    }

    public String getShipperCustomerName() {
        return shipperCustomerName;
    }

    public void setShipperCustomerName(String shipperCustomerName) {
        this.shipperCustomerName = shipperCustomerName;
    }

    public Long getShipperProvinceId() {
        return shipperProvinceId;
    }

    public void setShipperProvinceId(Long shipperProvinceId) {
        this.shipperProvinceId = shipperProvinceId;
    }

    public String getShipperProvinceName() {
        return shipperProvinceName;
    }

    public void setShipperProvinceName(String shipperProvinceName) {
        this.shipperProvinceName = shipperProvinceName;
    }

    public Long getShipperCityId() {
        return shipperCityId;
    }

    public void setShipperCityId(Long shipperCityId) {
        this.shipperCityId = shipperCityId;
    }

    public String getShipperCityName() {
        return shipperCityName;
    }

    public void setShipperCityName(String shipperCityName) {
        this.shipperCityName = shipperCityName;
    }

    public Long getShipperCountryId() {
        return shipperCountryId;
    }

    public void setShipperCountryId(Long shipperCountryId) {
        this.shipperCountryId = shipperCountryId;
    }

    public String getShipperCountryName() {
        return shipperCountryName;
    }

    public void setShipperCountryName(String shipperCountryName) {
        this.shipperCountryName = shipperCountryName;
    }

    public Long getShipperTownId() {
        return shipperTownId;
    }

    public void setShipperTownId(Long shipperTownId) {
        this.shipperTownId = shipperTownId;
    }

    public String getShipperTownName() {
        return shipperTownName;
    }

    public void setShipperTownName(String shipperTownName) {
        this.shipperTownName = shipperTownName;
    }

    public String getShipperAddress() {
        return shipperAddress;
    }

    public void setShipperAddress(String shipperAddress) {
        this.shipperAddress = shipperAddress;
    }

    public String getShipperLinkName() {
        return shipperLinkName;
    }

    public void setShipperLinkName(String shipperLinkName) {
        this.shipperLinkName = shipperLinkName;
    }

    public String getShipperLinkPhone() {
        return shipperLinkPhone;
    }

    public void setShipperLinkPhone(String shipperLinkPhone) {
        this.shipperLinkPhone = shipperLinkPhone;
    }

    public String getReceiveName() {
        return receiveName;
    }

    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName;
    }

    public Long getReceiveProvinceId() {
        return receiveProvinceId;
    }

    public void setReceiveProvinceId(Long receiveProvinceId) {
        this.receiveProvinceId = receiveProvinceId;
    }

    public String getReceiveProvinceName() {
        return receiveProvinceName;
    }

    public void setReceiveProvinceName(String receiveProvinceName) {
        this.receiveProvinceName = receiveProvinceName;
    }

    public Long getReceiveCityId() {
        return receiveCityId;
    }

    public void setReceiveCityId(Long receiveCityId) {
        this.receiveCityId = receiveCityId;
    }

    public String getReceiveCityName() {
        return receiveCityName;
    }

    public void setReceiveCityName(String receiveCityName) {
        this.receiveCityName = receiveCityName;
    }

    public Long getReceiveCountryId() {
        return receiveCountryId;
    }

    public void setReceiveCountryId(Long receiveCountryId) {
        this.receiveCountryId = receiveCountryId;
    }

    public String getReceiveCountryName() {
        return receiveCountryName;
    }

    public void setReceiveCountryName(String receiveCountryName) {
        this.receiveCountryName = receiveCountryName;
    }

    public String getReceiveAddress() {
        return receiveAddress;
    }

    public void setReceiveAddress(String receiveAddress) {
        this.receiveAddress = receiveAddress;
    }

    public String getReceiveLinkName() {
        return receiveLinkName;
    }

    public void setReceiveLinkName(String receiveLinkName) {
        this.receiveLinkName = receiveLinkName;
    }

    public String getReceiveLinkPhone() {
        return receiveLinkPhone;
    }

    public void setReceiveLinkPhone(String receiveLinkPhone) {
        this.receiveLinkPhone = receiveLinkPhone;
    }

    public Integer getIsDamage() {
        return isDamage;
    }

    public void setIsDamage(Integer isDamage) {
        this.isDamage = isDamage;
    }

    public Integer getIsChange() {
        return isChange;
    }

    public void setIsChange(Integer isChange) {
        this.isChange = isChange;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Long getDeleteReasonId() {
        return deleteReasonId;
    }

    public void setDeleteReasonId(Long deleteReasonId) {
        this.deleteReasonId = deleteReasonId;
    }

    public String getDeleteReason() {
        return deleteReason;
    }

    public void setDeleteReason(String deleteReason) {
        this.deleteReason = deleteReason;
    }

    public String getDeleteReasonMemo() {
        return deleteReasonMemo;
    }

    public void setDeleteReasonMemo(String deleteReasonMemo) {
        this.deleteReasonMemo = deleteReasonMemo;
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

    public Integer getBalanceType() {
        return balanceType;
    }

    public void setBalanceType(Integer balanceType) {
        this.balanceType = balanceType;
    }

    public Integer getIsNeedReceipt() {
        return isNeedReceipt;
    }

    public void setIsNeedReceipt(Integer isNeedReceipt) {
        this.isNeedReceipt = isNeedReceipt;
    }

    public Integer getIsOpenTicket() {
        return isOpenTicket;
    }

    public void setIsOpenTicket(Integer isOpenTicket) {
        this.isOpenTicket = isOpenTicket;
    }

    public String getTicketName() {
        return ticketName;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName;
    }

    public Integer getLoadUnloadType() {
        return loadUnloadType;
    }

    public void setLoadUnloadType(Integer loadUnloadType) {
        this.loadUnloadType = loadUnloadType;
    }

    public String getStackRequire() {
        return stackRequire;
    }

    public void setStackRequire(String stackRequire) {
        this.stackRequire = stackRequire;
    }

    public Integer getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(Integer deliveryType) {
        this.deliveryType = deliveryType;
    }

    public Date getTransConfirTime() {
        return transConfirTime;
    }

    public void setTransConfirTime(Date transConfirTime) {
        this.transConfirTime = transConfirTime;
    }

    public Date getArrangeDeliveryTime() {
        return arrangeDeliveryTime;
    }

    public void setArrangeDeliveryTime(Date arrangeDeliveryTime) {
        this.arrangeDeliveryTime = arrangeDeliveryTime;
    }

    public Date getGoodStationTime() {
        return goodStationTime;
    }

    public void setGoodStationTime(Date goodStationTime) {
        this.goodStationTime = goodStationTime;
    }

    public Float getTimeRequire() {
        return timeRequire;
    }

    public void setTimeRequire(Float timeRequire) {
        this.timeRequire = timeRequire;
    }

    public Date getExpectArrivalTime() {
        return expectArrivalTime;
    }

    public void setExpectArrivalTime(Date expectArrivalTime) {
        this.expectArrivalTime = expectArrivalTime;
    }

    public Date getExpectStowageTime() {
        return expectStowageTime;
    }

    public void setExpectStowageTime(Date expectStowageTime) {
        this.expectStowageTime = expectStowageTime;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Integer getBackStatus() {
        return backStatus;
    }

    public void setBackStatus(Integer backStatus) {
        this.backStatus = backStatus;
    }

    public String getBackMemo() {
        return backMemo;
    }

    public void setBackMemo(String backMemo) {
        this.backMemo = backMemo;
    }

    public Long getBackSubmitUserId() {
        return backSubmitUserId;
    }

    public void setBackSubmitUserId(Long backSubmitUserId) {
        this.backSubmitUserId = backSubmitUserId;
    }

    public String getBackSubmitUserName() {
        return backSubmitUserName;
    }

    public void setBackSubmitUserName(String backSubmitUserName) {
        this.backSubmitUserName = backSubmitUserName;
    }

    public Date getBackSubmitTime() {
        return backSubmitTime;
    }

    public void setBackSubmitTime(Date backSubmitTime) {
        this.backSubmitTime = backSubmitTime;
    }

    public Long getBackReceiveUserId() {
        return backReceiveUserId;
    }

    public void setBackReceiveUserId(Long backReceiveUserId) {
        this.backReceiveUserId = backReceiveUserId;
    }

    public String getBackReceiveUserName() {
        return backReceiveUserName;
    }

    public void setBackReceiveUserName(String backReceiveUserName) {
        this.backReceiveUserName = backReceiveUserName;
    }

    public Date getBackReceiveTime() {
        return backReceiveTime;
    }

    public void setBackReceiveTime(Date backReceiveTime) {
        this.backReceiveTime = backReceiveTime;
    }

    public Long getBookerEmployeeId() {
        return bookerEmployeeId;
    }

    public void setBookerEmployeeId(Long bookerEmployeeId) {
        this.bookerEmployeeId = bookerEmployeeId;
    }

    public String getBookerEmployeeName() {
        return bookerEmployeeName;
    }

    public void setBookerEmployeeName(String bookerEmployeeName) {
        this.bookerEmployeeName = bookerEmployeeName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public Integer getIsReceiveSendSms() {
        return isReceiveSendSms;
    }

    public void setIsReceiveSendSms(Integer isReceiveSendSms) {
        this.isReceiveSendSms = isReceiveSendSms;
    }

    public String getDownId() {
        return downId;
    }

    public void setDownId(String downId) {
        this.downId = downId;
    }

    public Integer getIsLocal() {
        return isLocal;
    }

    public void setIsLocal(Integer isLocal) {
        this.isLocal = isLocal;
    }

    public Integer getBalanceStatus() {
        return balanceStatus;
    }

    public void setBalanceStatus(Integer balanceStatus) {
        this.balanceStatus = balanceStatus;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Integer getPayLocked() {
        return payLocked;
    }

    public void setPayLocked(Integer payLocked) {
        this.payLocked = payLocked;
    }

    public Integer getReceiptTime() {
        return receiptTime;
    }

    public void setReceiptTime(Integer receiptTime) {
        this.receiptTime = receiptTime;
    }

    public Integer getIsNeedEnterDepot() {
        return isNeedEnterDepot;
    }

    public void setIsNeedEnterDepot(Integer isNeedEnterDepot) {
        this.isNeedEnterDepot = isNeedEnterDepot;
    }

    public Date getSignTime() {
        return signTime;
    }

    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    public Long getSignUserId() {
        return signUserId;
    }

    public void setSignUserId(Long signUserId) {
        this.signUserId = signUserId;
    }

    public String getSignUserName() {
        return signUserName;
    }

    public void setSignUserName(String signUserName) {
        this.signUserName = signUserName;
    }

    public Integer getBalanceTypeWithZb() {
        return balanceTypeWithZb;
    }

    public void setBalanceTypeWithZb(Integer balanceTypeWithZb) {
        this.balanceTypeWithZb = balanceTypeWithZb;
    }

    public String getFreeReason() {
        return freeReason;
    }

    public void setFreeReason(String freeReason) {
        this.freeReason = freeReason;
    }

    public Integer getIsServiceInter() {
        return isServiceInter;
    }

    public void setIsServiceInter(Integer isServiceInter) {
        this.isServiceInter = isServiceInter;
    }

    public Date getPaySuccessTime() {
        return paySuccessTime;
    }

    public void setPaySuccessTime(Date paySuccessTime) {
        this.paySuccessTime = paySuccessTime;
    }

    public Date getArrivalStationTime() {
        return arrivalStationTime;
    }

    public void setArrivalStationTime(Date arrivalStationTime) {
        this.arrivalStationTime = arrivalStationTime;
    }

    public Long getArrivalStationUserId() {
        return arrivalStationUserId;
    }

    public void setArrivalStationUserId(Long arrivalStationUserId) {
        this.arrivalStationUserId = arrivalStationUserId;
    }

    public String getArrivalStationUserName() {
        return arrivalStationUserName;
    }

    public void setArrivalStationUserName(String arrivalStationUserName) {
        this.arrivalStationUserName = arrivalStationUserName;
    }

    public Integer getWaybillOuttimeDay() {
        return waybillOuttimeDay;
    }

    public void setWaybillOuttimeDay(Integer waybillOuttimeDay) {
        this.waybillOuttimeDay = waybillOuttimeDay;
    }

    public String getPaySuccessUserName() {
        return paySuccessUserName;
    }

    public void setPaySuccessUserName(String paySuccessUserName) {
        this.paySuccessUserName = paySuccessUserName;
    }

    public Integer getIsAllowWaybillOuttime() {
        return isAllowWaybillOuttime;
    }

    public void setIsAllowWaybillOuttime(Integer isAllowWaybillOuttime) {
        this.isAllowWaybillOuttime = isAllowWaybillOuttime;
    }

    public String getCurrentProcessName() {
        return currentProcessName;
    }

    public void setCurrentProcessName(String currentProcessName) {
        this.currentProcessName = currentProcessName;
    }

    public Date getRequiredArrivalDate() {
        return requiredArrivalDate;
    }

    public void setRequiredArrivalDate(Date requiredArrivalDate) {
        this.requiredArrivalDate = requiredArrivalDate;
    }

    public Integer getIsStandard() {
        return isStandard;
    }

    public void setIsStandard(Integer isStandard) {
        this.isStandard = isStandard;
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

    public BigDecimal getServiceFeeReturnRatio() {
        return serviceFeeReturnRatio;
    }

    public void setServiceFeeReturnRatio(BigDecimal serviceFeeReturnRatio) {
        this.serviceFeeReturnRatio = serviceFeeReturnRatio;
    }

    public String getShipperLinkMobile() {
        return shipperLinkMobile;
    }

    public void setShipperLinkMobile(String shipperLinkMobile) {
        this.shipperLinkMobile = shipperLinkMobile;
    }

    public String getReceiveLinkMobile() {
        return receiveLinkMobile;
    }

    public void setReceiveLinkMobile(String receiveLinkMobile) {
        this.receiveLinkMobile = receiveLinkMobile;
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

    public Integer getIsExpress() {
        return isExpress;
    }

    public void setIsExpress(Integer isExpress) {
        this.isExpress = isExpress;
    }

    public Integer getIsHaveAttachment() {
        return isHaveAttachment;
    }

    public void setIsHaveAttachment(Integer isHaveAttachment) {
        this.isHaveAttachment = isHaveAttachment;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Float getOfferWeight() {
        return offerWeight;
    }

    public void setOfferWeight(Float offerWeight) {
        this.offerWeight = offerWeight;
    }

    public Float getOfferVolume() {
        return offerVolume;
    }

    public void setOfferVolume(Float offerVolume) {
        this.offerVolume = offerVolume;
    }

    public Integer getDepotType() {
        return depotType;
    }

    public void setDepotType(Integer depotType) {
        this.depotType = depotType;
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

    public BigDecimal getRansitFee() {
        return ransitFee;
    }

    public void setRansitFee(BigDecimal ransitFee) {
        this.ransitFee = ransitFee;
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

    public BigDecimal getXfyfFeeWithZb() {
        return xfyfFeeWithZb;
    }

    public void setXfyfFeeWithZb(BigDecimal xfyfFeeWithZb) {
        this.xfyfFeeWithZb = xfyfFeeWithZb;
    }

    public BigDecimal getDfyfFeeWithZb() {
        return dfyfFeeWithZb;
    }

    public void setDfyfFeeWithZb(BigDecimal dfyfFeeWithZb) {
        this.dfyfFeeWithZb = dfyfFeeWithZb;
    }

    public String getLabelIds() {
        return labelIds;
    }

    public void setLabelIds(String labelIds) {
        this.labelIds = labelIds;
    }

    public Integer getGoodLabelNum() {
        return GoodLabelNum;
    }

    public void setGoodLabelNum(Integer goodLabelNum) {
        GoodLabelNum = goodLabelNum;
    }

    public Integer getSelectGoodLabelNum() {
        return SelectGoodLabelNum;
    }

    public void setSelectGoodLabelNum(Integer selectGoodLabelNum) {
        SelectGoodLabelNum = selectGoodLabelNum;
    }

    public Integer getIsAlreadyPay() {
        return IsAlreadyPay;
    }

    public void setIsAlreadyPay(Integer isAlreadyPay) {
        IsAlreadyPay = isAlreadyPay;
    }
}
