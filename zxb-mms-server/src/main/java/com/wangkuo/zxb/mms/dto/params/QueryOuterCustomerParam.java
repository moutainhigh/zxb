package com.wangkuo.zxb.mms.dto.params;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by chaizf on 2016/5/5.
 */
public class QueryOuterCustomerParam extends PageParam implements Serializable {

    private List<Long> regionIds;

    private Date operationTime;

    private Integer merchantStatus;

    private Integer status;

    private String allocCentre;

    private Long allocCentreId;

    private String region;

    private Long regionId;

    private String logisticsDemand;

    private String customerName;

    private String currUser;

    private Long currUserId;

    private Date serviceLife;

    private Integer serviceLifeRadio;

    public Integer getMerchantStatus() {
        return merchantStatus;
    }

    public void setMerchantStatus(Integer merchantStatus) {
        this.merchantStatus = merchantStatus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public String getLogisticsDemand() {
        return logisticsDemand;
    }

    public void setLogisticsDemand(String logisticsDemand) {
        this.logisticsDemand = logisticsDemand;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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

    public Date getServiceLife() {
        return serviceLife;
    }

    public void setServiceLife(Date serviceLife) {
        this.serviceLife = serviceLife;
    }

    public Integer getServiceLifeRadio() {
        return serviceLifeRadio;
    }

    public void setServiceLifeRadio(Integer serviceLifeRadio) {
        this.serviceLifeRadio = serviceLifeRadio;
    }

    public Date getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }

    public List<Long> getRegionIds() {
        return regionIds;
    }

    public void setRegionIds(List<Long> regionIds) {
        this.regionIds = regionIds;
    }
}
