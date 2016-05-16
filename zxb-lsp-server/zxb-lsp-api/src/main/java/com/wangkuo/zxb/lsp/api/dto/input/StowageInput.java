package com.wangkuo.zxb.lsp.api.dto.input;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by chaizf on 2016/3/31.
 */
public class StowageInput extends PageInput implements Serializable {

    LspUserInput user;//服务商

    private List<WaybillInput> waybillInputList;

    private Long id;

    private String stowageSn;

    private Integer type;

    private Integer status;

    private Long siteId;

    private String siteName;

    private Long lspId;

    private String lspCompanyName;

    private Long allocCenterId;

    private String allocCenterName;

    private Long allocCenterLinkId;

    private String allocCenterLinkName;

    private String allocCenterLinkPhone;

    private String allocCenterAddress;

    private Date stowageTime;

    private String plateNumber;

    private String driverName;

    private String driverPhone;

    private String truckLength;

    private String truckModel;

    private BigDecimal mainLineFee;

    private Integer payType;

    private Long bookerEmployeeId;

    private String bookerEmployeeName;

    private Date createTime;

    private Integer isChange;

    private Integer isReceiveSendSms;

    private Integer mainLineFeeStatus;

    private Long mainLineFeeVerifiId;

    private String mainLineFeeVerifiName;

    private Date mainLineFeeVerifiTime;

    private Long mainLineFeePaymentId;

    private String mainLineFeePaymentName;

    private Date mainLineFeePaymentTime;

    private Integer mainLineOverStatus;

    private Date mainLineOverTime;

    private Long mainLineOverUserId;

    private String mainLineOverUserName;

    private BigDecimal ofgoodsFee;

    private Date ofgoodsTime;

    private Long ofgoodsUserId;

    private String ofgoodsUserName;

    private Integer ofgoodsFeeVerifiStatus;

    private Long ofgoodsFeeVerifiId;

    private String ofgoodsFeeVerifiName;

    private Date ofgoodsFeeVerifiTime;

    private Long ofgoodsFeePaymentId;

    private String ofgoodsFeePaymentName;

    private Date ofgoodsFeePaymentTime;

    private Integer ofgoodsFeeOverStatus;

    private Date ofgoodsFeeOverTime;

    private Long ofgoodsFeeOverId;

    private String ofgoodsFeeOverName;

    private Integer unloadNum;

    private Date arriveTime;

    private Long arriveUserId;

    private String arriveUserName;

    private Long departUserId;

    private String departUserName;

    private Date departTime;

    private String startTimeString;
    private String endTimeString;
    private String shipperCustomerName;
    private String address;
    private String receiveName;
    private String goodName;
    private Integer waybillStatus;
    private Long waybillId;

    public LspUserInput getUser() {
        return user;
    }

    public void setUser(LspUserInput user) {
        this.user = user;
    }

    public List<WaybillInput> getWaybillInputList() {
        return waybillInputList;
    }

    public void setWaybillInputList(List<WaybillInput> waybillInputList) {
        this.waybillInputList = waybillInputList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStowageSn() {
        return stowageSn;
    }

    public void setStowageSn(String stowageSn) {
        this.stowageSn = stowageSn;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public Long getAllocCenterLinkId() {
        return allocCenterLinkId;
    }

    public void setAllocCenterLinkId(Long allocCenterLinkId) {
        this.allocCenterLinkId = allocCenterLinkId;
    }

    public String getAllocCenterLinkName() {
        return allocCenterLinkName;
    }

    public void setAllocCenterLinkName(String allocCenterLinkName) {
        this.allocCenterLinkName = allocCenterLinkName;
    }

    public String getAllocCenterLinkPhone() {
        return allocCenterLinkPhone;
    }

    public void setAllocCenterLinkPhone(String allocCenterLinkPhone) {
        this.allocCenterLinkPhone = allocCenterLinkPhone;
    }

    public String getAllocCenterAddress() {
        return allocCenterAddress;
    }

    public void setAllocCenterAddress(String allocCenterAddress) {
        this.allocCenterAddress = allocCenterAddress;
    }

    public Date getStowageTime() {
        return stowageTime;
    }

    public void setStowageTime(Date stowageTime) {
        this.stowageTime = stowageTime;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverPhone() {
        return driverPhone;
    }

    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone;
    }

    public String getTruckLength() {
        return truckLength;
    }

    public void setTruckLength(String truckLength) {
        this.truckLength = truckLength;
    }

    public String getTruckModel() {
        return truckModel;
    }

    public void setTruckModel(String truckModel) {
        this.truckModel = truckModel;
    }

    public BigDecimal getMainLineFee() {
        return mainLineFee;
    }

    public void setMainLineFee(BigDecimal mainLineFee) {
        this.mainLineFee = mainLineFee;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
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

    public Integer getIsChange() {
        return isChange;
    }

    public void setIsChange(Integer isChange) {
        this.isChange = isChange;
    }

    public Integer getIsReceiveSendSms() {
        return isReceiveSendSms;
    }

    public void setIsReceiveSendSms(Integer isReceiveSendSms) {
        this.isReceiveSendSms = isReceiveSendSms;
    }

    public Integer getMainLineFeeStatus() {
        return mainLineFeeStatus;
    }

    public void setMainLineFeeStatus(Integer mainLineFeeStatus) {
        this.mainLineFeeStatus = mainLineFeeStatus;
    }

    public Long getMainLineFeeVerifiId() {
        return mainLineFeeVerifiId;
    }

    public void setMainLineFeeVerifiId(Long mainLineFeeVerifiId) {
        this.mainLineFeeVerifiId = mainLineFeeVerifiId;
    }

    public String getMainLineFeeVerifiName() {
        return mainLineFeeVerifiName;
    }

    public void setMainLineFeeVerifiName(String mainLineFeeVerifiName) {
        this.mainLineFeeVerifiName = mainLineFeeVerifiName;
    }

    public Date getMainLineFeeVerifiTime() {
        return mainLineFeeVerifiTime;
    }

    public void setMainLineFeeVerifiTime(Date mainLineFeeVerifiTime) {
        this.mainLineFeeVerifiTime = mainLineFeeVerifiTime;
    }

    public Long getMainLineFeePaymentId() {
        return mainLineFeePaymentId;
    }

    public void setMainLineFeePaymentId(Long mainLineFeePaymentId) {
        this.mainLineFeePaymentId = mainLineFeePaymentId;
    }

    public String getMainLineFeePaymentName() {
        return mainLineFeePaymentName;
    }

    public void setMainLineFeePaymentName(String mainLineFeePaymentName) {
        this.mainLineFeePaymentName = mainLineFeePaymentName;
    }

    public Date getMainLineFeePaymentTime() {
        return mainLineFeePaymentTime;
    }

    public void setMainLineFeePaymentTime(Date mainLineFeePaymentTime) {
        this.mainLineFeePaymentTime = mainLineFeePaymentTime;
    }

    public Integer getMainLineOverStatus() {
        return mainLineOverStatus;
    }

    public void setMainLineOverStatus(Integer mainLineOverStatus) {
        this.mainLineOverStatus = mainLineOverStatus;
    }

    public Date getMainLineOverTime() {
        return mainLineOverTime;
    }

    public void setMainLineOverTime(Date mainLineOverTime) {
        this.mainLineOverTime = mainLineOverTime;
    }

    public Long getMainLineOverUserId() {
        return mainLineOverUserId;
    }

    public void setMainLineOverUserId(Long mainLineOverUserId) {
        this.mainLineOverUserId = mainLineOverUserId;
    }

    public String getMainLineOverUserName() {
        return mainLineOverUserName;
    }

    public void setMainLineOverUserName(String mainLineOverUserName) {
        this.mainLineOverUserName = mainLineOverUserName;
    }

    public BigDecimal getOfgoodsFee() {
        return ofgoodsFee;
    }

    public void setOfgoodsFee(BigDecimal ofgoodsFee) {
        this.ofgoodsFee = ofgoodsFee;
    }

    public Date getOfgoodsTime() {
        return ofgoodsTime;
    }

    public void setOfgoodsTime(Date ofgoodsTime) {
        this.ofgoodsTime = ofgoodsTime;
    }

    public Long getOfgoodsUserId() {
        return ofgoodsUserId;
    }

    public void setOfgoodsUserId(Long ofgoodsUserId) {
        this.ofgoodsUserId = ofgoodsUserId;
    }

    public String getOfgoodsUserName() {
        return ofgoodsUserName;
    }

    public void setOfgoodsUserName(String ofgoodsUserName) {
        this.ofgoodsUserName = ofgoodsUserName;
    }

    public Integer getOfgoodsFeeVerifiStatus() {
        return ofgoodsFeeVerifiStatus;
    }

    public void setOfgoodsFeeVerifiStatus(Integer ofgoodsFeeVerifiStatus) {
        this.ofgoodsFeeVerifiStatus = ofgoodsFeeVerifiStatus;
    }

    public Long getOfgoodsFeeVerifiId() {
        return ofgoodsFeeVerifiId;
    }

    public void setOfgoodsFeeVerifiId(Long ofgoodsFeeVerifiId) {
        this.ofgoodsFeeVerifiId = ofgoodsFeeVerifiId;
    }

    public String getOfgoodsFeeVerifiName() {
        return ofgoodsFeeVerifiName;
    }

    public void setOfgoodsFeeVerifiName(String ofgoodsFeeVerifiName) {
        this.ofgoodsFeeVerifiName = ofgoodsFeeVerifiName;
    }

    public Date getOfgoodsFeeVerifiTime() {
        return ofgoodsFeeVerifiTime;
    }

    public void setOfgoodsFeeVerifiTime(Date ofgoodsFeeVerifiTime) {
        this.ofgoodsFeeVerifiTime = ofgoodsFeeVerifiTime;
    }

    public Long getOfgoodsFeePaymentId() {
        return ofgoodsFeePaymentId;
    }

    public void setOfgoodsFeePaymentId(Long ofgoodsFeePaymentId) {
        this.ofgoodsFeePaymentId = ofgoodsFeePaymentId;
    }

    public String getOfgoodsFeePaymentName() {
        return ofgoodsFeePaymentName;
    }

    public void setOfgoodsFeePaymentName(String ofgoodsFeePaymentName) {
        this.ofgoodsFeePaymentName = ofgoodsFeePaymentName;
    }

    public Date getOfgoodsFeePaymentTime() {
        return ofgoodsFeePaymentTime;
    }

    public void setOfgoodsFeePaymentTime(Date ofgoodsFeePaymentTime) {
        this.ofgoodsFeePaymentTime = ofgoodsFeePaymentTime;
    }

    public Integer getOfgoodsFeeOverStatus() {
        return ofgoodsFeeOverStatus;
    }

    public void setOfgoodsFeeOverStatus(Integer ofgoodsFeeOverStatus) {
        this.ofgoodsFeeOverStatus = ofgoodsFeeOverStatus;
    }

    public Date getOfgoodsFeeOverTime() {
        return ofgoodsFeeOverTime;
    }

    public void setOfgoodsFeeOverTime(Date ofgoodsFeeOverTime) {
        this.ofgoodsFeeOverTime = ofgoodsFeeOverTime;
    }

    public Long getOfgoodsFeeOverId() {
        return ofgoodsFeeOverId;
    }

    public void setOfgoodsFeeOverId(Long ofgoodsFeeOverId) {
        this.ofgoodsFeeOverId = ofgoodsFeeOverId;
    }

    public String getOfgoodsFeeOverName() {
        return ofgoodsFeeOverName;
    }

    public void setOfgoodsFeeOverName(String ofgoodsFeeOverName) {
        this.ofgoodsFeeOverName = ofgoodsFeeOverName;
    }

    public Integer getUnloadNum() {
        return unloadNum;
    }

    public void setUnloadNum(Integer unloadNum) {
        this.unloadNum = unloadNum;
    }

    public Date getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }

    public Long getArriveUserId() {
        return arriveUserId;
    }

    public void setArriveUserId(Long arriveUserId) {
        this.arriveUserId = arriveUserId;
    }

    public String getArriveUserName() {
        return arriveUserName;
    }

    public void setArriveUserName(String arriveUserName) {
        this.arriveUserName = arriveUserName;
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

    public Date getDepartTime() {
        return departTime;
    }

    public void setDepartTime(Date departTime) {
        this.departTime = departTime;
    }

    public String getStartTimeString() {
        return startTimeString;
    }

    public void setStartTimeString(String startTimeString) {
        this.startTimeString = startTimeString;
    }

    public String getEndTimeString() {
        return endTimeString;
    }

    public void setEndTimeString(String endTimeString) {
        this.endTimeString = endTimeString;
    }

    public String getShipperCustomerName() {
        return shipperCustomerName;
    }

    public void setShipperCustomerName(String shipperCustomerName) {
        this.shipperCustomerName = shipperCustomerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getReceiveName() {
        return receiveName;
    }

    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public Integer getWaybillStatus() {
        return waybillStatus;
    }

    public void setWaybillStatus(Integer waybillStatus) {
        this.waybillStatus = waybillStatus;
    }

    public Long getWaybillId() {
        return waybillId;
    }

    public void setWaybillId(Long waybillId) {
        this.waybillId = waybillId;
    }
}
