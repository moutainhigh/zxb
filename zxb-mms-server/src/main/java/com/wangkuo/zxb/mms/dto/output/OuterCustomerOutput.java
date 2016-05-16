package com.wangkuo.zxb.mms.dto.output;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Administrator on 2016/5/7.
 */
public class OuterCustomerOutput implements Serializable {

    private Long id;

    private String customerName;

    private String allocCentre;

    private Long allocCentreId;

    private String region;

    private Long regionId;

    private Integer merchantStatus;

    private Integer status;

    private Integer shipmentsStatus;

    private String currUser;

    private Long currUserId;

    private Date operationTime;

    private Integer waybillCount;

    private BigDecimal allFee;

    private Integer damagerCount;

    private Integer waybillSum;

    private BigDecimal amountSum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAllocCentre() {
        return allocCentre;
    }

    public void setAllocCentre(String allocCentre) {
        this.allocCentre = allocCentre;
    }

    public Long getAllocCentreId() {
        return allocCentreId;
    }

    public void setAllocCentreId(Long allocCentreId) {
        this.allocCentreId = allocCentreId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public Integer getMerchantStatus() {
        return merchantStatus;
    }

    public void setMerchantStatus(Integer merchantStatus) {
        this.merchantStatus = merchantStatus;
    }

    public Integer getStatus() {
        return status;
    }

    public Integer getShipmentsStatus() {
        return shipmentsStatus;
    }

    public void setShipmentsStatus(Integer shipmentsStatus) {
        this.shipmentsStatus = shipmentsStatus;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCurrUser() {
        return currUser;
    }

    public void setCurrUser(String currUser) {
        this.currUser = currUser;
    }

    public Long getCurrUserId() {
        return currUserId;
    }

    public void setCurrUserId(Long currUserId) {
        this.currUserId = currUserId;
    }

    public Date getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }

    public Integer getWaybillCount() {
        return waybillCount;
    }

    public void setWaybillCount(Integer waybillCount) {
        this.waybillCount = waybillCount;
    }

    public BigDecimal getAllFee() {
        return allFee;
    }

    public void setAllFee(BigDecimal allFee) {
        this.allFee = allFee;
    }

    public Integer getDamagerCount() {
        return damagerCount;
    }

    public void setDamagerCount(Integer damagerCount) {
        this.damagerCount = damagerCount;
    }

    public Integer getWaybillSum() {
        return waybillSum;
    }

    public void setWaybillSum(Integer waybillSum) {
        this.waybillSum = waybillSum;
    }

    public BigDecimal getAmountSum() {
        return amountSum;
    }

    public void setAmountSum(BigDecimal amountSum) {
        this.amountSum = amountSum;
    }
}
