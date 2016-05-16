package com.wangkuo.zxb.smart.show.db.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Trade implements Serializable {
    private Long id;

    private Long accountId;

    private String tradeNo;

    private String consignerName;

    private String consignerCompany;

    private String consignerPhone;

    private String consignerMobile;

    private String consignerAddress;

    private String consignerProvince;

    private Long consignerProvinceId;

    private String consignerCity;

    private Long consignerCityId;

    private String consignerCounty;

    private Long consignerCountyId;

    private String consignerTown;

    private Long consignerTownId;

    private String consigneeName;

    private String consigneeCompany;

    private String consigneePhone;

    private String consigneeMobile;

    private String consigneeAddress;

    private String consigneeProvince;

    private Long consigneeProvinceId;

    private String consigneeCity;

    private Long consigneeCityId;

    private String consigneeCounty;

    private Long consigneeCountyId;

    private String consigneeTown;

    private Long consigneeTownId;

    private String goodsName;

    private String goodsPackType;

    private Float goodsLength;

    private Float goodsWidth;

    private Float goodsHeight;

    private String goodsHandlingType;

    private Double goodsTotalWeight;

    private Double goodsTotalVolume;

    private Integer goodsAmount;

    private String goodsMemo;

    private String goodsStackType;

    private Integer payType;

    private Boolean needInvoice;

    private Integer deliveryType;

    private Boolean needNotify;

    private Integer pickType;

    private String pickBeginTime;

    private String pickEndTime;

    private Boolean needReceipt;

    private BigDecimal goodsValue;

    private BigDecimal insuranceFee;

    private BigDecimal transportFee;

    private BigDecimal commissionFee;

    private BigDecimal totalFee;

    private BigDecimal consignerFee;

    private Integer payStatus;

    private Date payTime;

    private String shiperName;

    private String shiperLinkman;

    private String shiperMobile;

    private Long shipperAccountId;

    private Integer arriveDays;

    private Boolean isDelete;

    private Integer status;

    private Integer childStatus;

    private Date createTime;

    private String outTradeNo;

    private Integer comeFrom;

    private String notifyMobile;

    private String closeReason;

    private Integer version;

    private BigDecimal invoiceFee;

    private Integer isInternal;

    private Integer payWay;

    private Long employeeId;

    private String employeeName;

    private Integer transportType;

    private String goodsSpec;

    private BigDecimal realTransportFee;

    private String waybillNo;

    private Long branchId;

    private BigDecimal reduceInsuranceFee;

    private BigDecimal giveInsuranceFee;

    private BigDecimal insuranceFeeRate;

    private BigDecimal realInsuranceFeeRate;

    private Date promiseArriveTime;

    private String queryNo;

    private Long createEmployeeId;

    private String createEmployeeName;

    private Boolean isAcceptance;

    private Boolean isException;

    private Boolean isOvertime;

    private Date enterTime;

    private String otherCloseReason;

    private Integer departure;

    private Date departureTime;

    private Date nextTrackTime;

    private Date lastNoticTime;

    private Integer exceptionStatus;

    private String systemId;

    private Integer isUpdate;

    private Date needArrivalTime;

    private Integer isNormalParts;

    private String tradeMemo;

    private Boolean needDepot;

    private BigDecimal discountFee;

    private Integer transitNum;

    private Integer transitRunTime;

    private Date arriveAllocTime;

    private Long allocId;

    private String allocName;

    private Integer isGen;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    public String getConsignerName() {
        return consignerName;
    }

    public void setConsignerName(String consignerName) {
        this.consignerName = consignerName == null ? null : consignerName.trim();
    }

    public String getConsignerCompany() {
        return consignerCompany;
    }

    public void setConsignerCompany(String consignerCompany) {
        this.consignerCompany = consignerCompany == null ? null : consignerCompany.trim();
    }

    public String getConsignerPhone() {
        return consignerPhone;
    }

    public void setConsignerPhone(String consignerPhone) {
        this.consignerPhone = consignerPhone == null ? null : consignerPhone.trim();
    }

    public String getConsignerMobile() {
        return consignerMobile;
    }

    public void setConsignerMobile(String consignerMobile) {
        this.consignerMobile = consignerMobile == null ? null : consignerMobile.trim();
    }

    public String getConsignerAddress() {
        return consignerAddress;
    }

    public void setConsignerAddress(String consignerAddress) {
        this.consignerAddress = consignerAddress == null ? null : consignerAddress.trim();
    }

    public String getConsignerProvince() {
        return consignerProvince;
    }

    public void setConsignerProvince(String consignerProvince) {
        this.consignerProvince = consignerProvince == null ? null : consignerProvince.trim();
    }

    public Long getConsignerProvinceId() {
        return consignerProvinceId;
    }

    public void setConsignerProvinceId(Long consignerProvinceId) {
        this.consignerProvinceId = consignerProvinceId;
    }

    public String getConsignerCity() {
        return consignerCity;
    }

    public void setConsignerCity(String consignerCity) {
        this.consignerCity = consignerCity == null ? null : consignerCity.trim();
    }

    public Long getConsignerCityId() {
        return consignerCityId;
    }

    public void setConsignerCityId(Long consignerCityId) {
        this.consignerCityId = consignerCityId;
    }

    public String getConsignerCounty() {
        return consignerCounty;
    }

    public void setConsignerCounty(String consignerCounty) {
        this.consignerCounty = consignerCounty == null ? null : consignerCounty.trim();
    }

    public Long getConsignerCountyId() {
        return consignerCountyId;
    }

    public void setConsignerCountyId(Long consignerCountyId) {
        this.consignerCountyId = consignerCountyId;
    }

    public String getConsignerTown() {
        return consignerTown;
    }

    public void setConsignerTown(String consignerTown) {
        this.consignerTown = consignerTown == null ? null : consignerTown.trim();
    }

    public Long getConsignerTownId() {
        return consignerTownId;
    }

    public void setConsignerTownId(Long consignerTownId) {
        this.consignerTownId = consignerTownId;
    }

    public String getConsigneeName() {
        return consigneeName;
    }

    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName == null ? null : consigneeName.trim();
    }

    public String getConsigneeCompany() {
        return consigneeCompany;
    }

    public void setConsigneeCompany(String consigneeCompany) {
        this.consigneeCompany = consigneeCompany == null ? null : consigneeCompany.trim();
    }

    public String getConsigneePhone() {
        return consigneePhone;
    }

    public void setConsigneePhone(String consigneePhone) {
        this.consigneePhone = consigneePhone == null ? null : consigneePhone.trim();
    }

    public String getConsigneeMobile() {
        return consigneeMobile;
    }

    public void setConsigneeMobile(String consigneeMobile) {
        this.consigneeMobile = consigneeMobile == null ? null : consigneeMobile.trim();
    }

    public String getConsigneeAddress() {
        return consigneeAddress;
    }

    public void setConsigneeAddress(String consigneeAddress) {
        this.consigneeAddress = consigneeAddress == null ? null : consigneeAddress.trim();
    }

    public String getConsigneeProvince() {
        return consigneeProvince;
    }

    public void setConsigneeProvince(String consigneeProvince) {
        this.consigneeProvince = consigneeProvince == null ? null : consigneeProvince.trim();
    }

    public Long getConsigneeProvinceId() {
        return consigneeProvinceId;
    }

    public void setConsigneeProvinceId(Long consigneeProvinceId) {
        this.consigneeProvinceId = consigneeProvinceId;
    }

    public String getConsigneeCity() {
        return consigneeCity;
    }

    public void setConsigneeCity(String consigneeCity) {
        this.consigneeCity = consigneeCity == null ? null : consigneeCity.trim();
    }

    public Long getConsigneeCityId() {
        return consigneeCityId;
    }

    public void setConsigneeCityId(Long consigneeCityId) {
        this.consigneeCityId = consigneeCityId;
    }

    public String getConsigneeCounty() {
        return consigneeCounty;
    }

    public void setConsigneeCounty(String consigneeCounty) {
        this.consigneeCounty = consigneeCounty == null ? null : consigneeCounty.trim();
    }

    public Long getConsigneeCountyId() {
        return consigneeCountyId;
    }

    public void setConsigneeCountyId(Long consigneeCountyId) {
        this.consigneeCountyId = consigneeCountyId;
    }

    public String getConsigneeTown() {
        return consigneeTown;
    }

    public void setConsigneeTown(String consigneeTown) {
        this.consigneeTown = consigneeTown == null ? null : consigneeTown.trim();
    }

    public Long getConsigneeTownId() {
        return consigneeTownId;
    }

    public void setConsigneeTownId(Long consigneeTownId) {
        this.consigneeTownId = consigneeTownId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsPackType() {
        return goodsPackType;
    }

    public void setGoodsPackType(String goodsPackType) {
        this.goodsPackType = goodsPackType == null ? null : goodsPackType.trim();
    }

    public Float getGoodsLength() {
        return goodsLength;
    }

    public void setGoodsLength(Float goodsLength) {
        this.goodsLength = goodsLength;
    }

    public Float getGoodsWidth() {
        return goodsWidth;
    }

    public void setGoodsWidth(Float goodsWidth) {
        this.goodsWidth = goodsWidth;
    }

    public Float getGoodsHeight() {
        return goodsHeight;
    }

    public void setGoodsHeight(Float goodsHeight) {
        this.goodsHeight = goodsHeight;
    }

    public String getGoodsHandlingType() {
        return goodsHandlingType;
    }

    public void setGoodsHandlingType(String goodsHandlingType) {
        this.goodsHandlingType = goodsHandlingType == null ? null : goodsHandlingType.trim();
    }

    public Double getGoodsTotalWeight() {
        return goodsTotalWeight;
    }

    public void setGoodsTotalWeight(Double goodsTotalWeight) {
        this.goodsTotalWeight = goodsTotalWeight;
    }

    public Double getGoodsTotalVolume() {
        return goodsTotalVolume;
    }

    public void setGoodsTotalVolume(Double goodsTotalVolume) {
        this.goodsTotalVolume = goodsTotalVolume;
    }

    public Integer getGoodsAmount() {
        return goodsAmount;
    }

    public void setGoodsAmount(Integer goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    public String getGoodsMemo() {
        return goodsMemo;
    }

    public void setGoodsMemo(String goodsMemo) {
        this.goodsMemo = goodsMemo == null ? null : goodsMemo.trim();
    }

    public String getGoodsStackType() {
        return goodsStackType;
    }

    public void setGoodsStackType(String goodsStackType) {
        this.goodsStackType = goodsStackType == null ? null : goodsStackType.trim();
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Boolean getNeedInvoice() {
        return needInvoice;
    }

    public void setNeedInvoice(Boolean needInvoice) {
        this.needInvoice = needInvoice;
    }

    public Integer getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(Integer deliveryType) {
        this.deliveryType = deliveryType;
    }

    public Boolean getNeedNotify() {
        return needNotify;
    }

    public void setNeedNotify(Boolean needNotify) {
        this.needNotify = needNotify;
    }

    public Integer getPickType() {
        return pickType;
    }

    public void setPickType(Integer pickType) {
        this.pickType = pickType;
    }

    public String getPickBeginTime() {
        return pickBeginTime;
    }

    public void setPickBeginTime(String pickBeginTime) {
        this.pickBeginTime = pickBeginTime == null ? null : pickBeginTime.trim();
    }

    public String getPickEndTime() {
        return pickEndTime;
    }

    public void setPickEndTime(String pickEndTime) {
        this.pickEndTime = pickEndTime == null ? null : pickEndTime.trim();
    }

    public Boolean getNeedReceipt() {
        return needReceipt;
    }

    public void setNeedReceipt(Boolean needReceipt) {
        this.needReceipt = needReceipt;
    }

    public BigDecimal getGoodsValue() {
        return goodsValue;
    }

    public void setGoodsValue(BigDecimal goodsValue) {
        this.goodsValue = goodsValue;
    }

    public BigDecimal getInsuranceFee() {
        return insuranceFee;
    }

    public void setInsuranceFee(BigDecimal insuranceFee) {
        this.insuranceFee = insuranceFee;
    }

    public BigDecimal getTransportFee() {
        return transportFee;
    }

    public void setTransportFee(BigDecimal transportFee) {
        this.transportFee = transportFee;
    }

    public BigDecimal getCommissionFee() {
        return commissionFee;
    }

    public void setCommissionFee(BigDecimal commissionFee) {
        this.commissionFee = commissionFee;
    }

    public BigDecimal getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }

    public BigDecimal getConsignerFee() {
        return consignerFee;
    }

    public void setConsignerFee(BigDecimal consignerFee) {
        this.consignerFee = consignerFee;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getShiperName() {
        return shiperName;
    }

    public void setShiperName(String shiperName) {
        this.shiperName = shiperName == null ? null : shiperName.trim();
    }

    public String getShiperLinkman() {
        return shiperLinkman;
    }

    public void setShiperLinkman(String shiperLinkman) {
        this.shiperLinkman = shiperLinkman == null ? null : shiperLinkman.trim();
    }

    public String getShiperMobile() {
        return shiperMobile;
    }

    public void setShiperMobile(String shiperMobile) {
        this.shiperMobile = shiperMobile == null ? null : shiperMobile.trim();
    }

    public Long getShipperAccountId() {
        return shipperAccountId;
    }

    public void setShipperAccountId(Long shipperAccountId) {
        this.shipperAccountId = shipperAccountId;
    }

    public Integer getArriveDays() {
        return arriveDays;
    }

    public void setArriveDays(Integer arriveDays) {
        this.arriveDays = arriveDays;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getChildStatus() {
        return childStatus;
    }

    public void setChildStatus(Integer childStatus) {
        this.childStatus = childStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo == null ? null : outTradeNo.trim();
    }

    public Integer getComeFrom() {
        return comeFrom;
    }

    public void setComeFrom(Integer comeFrom) {
        this.comeFrom = comeFrom;
    }

    public String getNotifyMobile() {
        return notifyMobile;
    }

    public void setNotifyMobile(String notifyMobile) {
        this.notifyMobile = notifyMobile == null ? null : notifyMobile.trim();
    }

    public String getCloseReason() {
        return closeReason;
    }

    public void setCloseReason(String closeReason) {
        this.closeReason = closeReason == null ? null : closeReason.trim();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public BigDecimal getInvoiceFee() {
        return invoiceFee;
    }

    public void setInvoiceFee(BigDecimal invoiceFee) {
        this.invoiceFee = invoiceFee;
    }

    public Integer getIsInternal() {
        return isInternal;
    }

    public void setIsInternal(Integer isInternal) {
        this.isInternal = isInternal;
    }

    public Integer getPayWay() {
        return payWay;
    }

    public void setPayWay(Integer payWay) {
        this.payWay = payWay;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName == null ? null : employeeName.trim();
    }

    public Integer getTransportType() {
        return transportType;
    }

    public void setTransportType(Integer transportType) {
        this.transportType = transportType;
    }

    public String getGoodsSpec() {
        return goodsSpec;
    }

    public void setGoodsSpec(String goodsSpec) {
        this.goodsSpec = goodsSpec == null ? null : goodsSpec.trim();
    }

    public BigDecimal getRealTransportFee() {
        return realTransportFee;
    }

    public void setRealTransportFee(BigDecimal realTransportFee) {
        this.realTransportFee = realTransportFee;
    }

    public String getWaybillNo() {
        return waybillNo;
    }

    public void setWaybillNo(String waybillNo) {
        this.waybillNo = waybillNo == null ? null : waybillNo.trim();
    }

    public Long getBranchId() {
        return branchId;
    }

    public void setBranchId(Long branchId) {
        this.branchId = branchId;
    }

    public BigDecimal getReduceInsuranceFee() {
        return reduceInsuranceFee;
    }

    public void setReduceInsuranceFee(BigDecimal reduceInsuranceFee) {
        this.reduceInsuranceFee = reduceInsuranceFee;
    }

    public BigDecimal getGiveInsuranceFee() {
        return giveInsuranceFee;
    }

    public void setGiveInsuranceFee(BigDecimal giveInsuranceFee) {
        this.giveInsuranceFee = giveInsuranceFee;
    }

    public BigDecimal getInsuranceFeeRate() {
        return insuranceFeeRate;
    }

    public void setInsuranceFeeRate(BigDecimal insuranceFeeRate) {
        this.insuranceFeeRate = insuranceFeeRate;
    }

    public BigDecimal getRealInsuranceFeeRate() {
        return realInsuranceFeeRate;
    }

    public void setRealInsuranceFeeRate(BigDecimal realInsuranceFeeRate) {
        this.realInsuranceFeeRate = realInsuranceFeeRate;
    }

    public Date getPromiseArriveTime() {
        return promiseArriveTime;
    }

    public void setPromiseArriveTime(Date promiseArriveTime) {
        this.promiseArriveTime = promiseArriveTime;
    }

    public String getQueryNo() {
        return queryNo;
    }

    public void setQueryNo(String queryNo) {
        this.queryNo = queryNo == null ? null : queryNo.trim();
    }

    public Long getCreateEmployeeId() {
        return createEmployeeId;
    }

    public void setCreateEmployeeId(Long createEmployeeId) {
        this.createEmployeeId = createEmployeeId;
    }

    public String getCreateEmployeeName() {
        return createEmployeeName;
    }

    public void setCreateEmployeeName(String createEmployeeName) {
        this.createEmployeeName = createEmployeeName == null ? null : createEmployeeName.trim();
    }

    public Boolean getIsAcceptance() {
        return isAcceptance;
    }

    public void setIsAcceptance(Boolean isAcceptance) {
        this.isAcceptance = isAcceptance;
    }

    public Boolean getIsException() {
        return isException;
    }

    public void setIsException(Boolean isException) {
        this.isException = isException;
    }

    public Boolean getIsOvertime() {
        return isOvertime;
    }

    public void setIsOvertime(Boolean isOvertime) {
        this.isOvertime = isOvertime;
    }

    public Date getEnterTime() {
        return enterTime;
    }

    public void setEnterTime(Date enterTime) {
        this.enterTime = enterTime;
    }

    public String getOtherCloseReason() {
        return otherCloseReason;
    }

    public void setOtherCloseReason(String otherCloseReason) {
        this.otherCloseReason = otherCloseReason == null ? null : otherCloseReason.trim();
    }

    public Integer getDeparture() {
        return departure;
    }

    public void setDeparture(Integer departure) {
        this.departure = departure;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getNextTrackTime() {
        return nextTrackTime;
    }

    public void setNextTrackTime(Date nextTrackTime) {
        this.nextTrackTime = nextTrackTime;
    }

    public Date getLastNoticTime() {
        return lastNoticTime;
    }

    public void setLastNoticTime(Date lastNoticTime) {
        this.lastNoticTime = lastNoticTime;
    }

    public Integer getExceptionStatus() {
        return exceptionStatus;
    }

    public void setExceptionStatus(Integer exceptionStatus) {
        this.exceptionStatus = exceptionStatus;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId == null ? null : systemId.trim();
    }

    public Integer getIsUpdate() {
        return isUpdate;
    }

    public void setIsUpdate(Integer isUpdate) {
        this.isUpdate = isUpdate;
    }

    public Date getNeedArrivalTime() {
        return needArrivalTime;
    }

    public void setNeedArrivalTime(Date needArrivalTime) {
        this.needArrivalTime = needArrivalTime;
    }

    public Integer getIsNormalParts() {
        return isNormalParts;
    }

    public void setIsNormalParts(Integer isNormalParts) {
        this.isNormalParts = isNormalParts;
    }

    public String getTradeMemo() {
        return tradeMemo;
    }

    public void setTradeMemo(String tradeMemo) {
        this.tradeMemo = tradeMemo == null ? null : tradeMemo.trim();
    }

    public Boolean getNeedDepot() {
        return needDepot;
    }

    public void setNeedDepot(Boolean needDepot) {
        this.needDepot = needDepot;
    }

    public BigDecimal getDiscountFee() {
        return discountFee;
    }

    public void setDiscountFee(BigDecimal discountFee) {
        this.discountFee = discountFee;
    }

    public Integer getTransitNum() {
        return transitNum;
    }

    public void setTransitNum(Integer transitNum) {
        this.transitNum = transitNum;
    }

    public Integer getTransitRunTime() {
        return transitRunTime;
    }

    public void setTransitRunTime(Integer transitRunTime) {
        this.transitRunTime = transitRunTime;
    }

    public Date getArriveAllocTime() {
        return arriveAllocTime;
    }

    public void setArriveAllocTime(Date arriveAllocTime) {
        this.arriveAllocTime = arriveAllocTime;
    }

    public Long getAllocId() {
        return allocId;
    }

    public void setAllocId(Long allocId) {
        this.allocId = allocId;
    }

    public String getAllocName() {
        return allocName;
    }

    public void setAllocName(String allocName) {
        this.allocName = allocName == null ? null : allocName.trim();
    }

    public Integer getIsGen() {
        return isGen;
    }

    public void setIsGen(Integer isGen) {
        this.isGen = isGen;
    }
}