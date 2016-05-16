package com.wangkuo.zxb.mms.server.db.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TRegionStats implements Serializable {
    private Long id;

    private String allocCentre;

    private Long allocCentreId;

    private String region;

    private Long regionId;

    private Integer statsYear;

    private Integer statsMonth;

    private Long totalCustomerCount;

    private Long customerCount;

    private Long waybillCount;

    private Double waybillCountChainIndex;

    private BigDecimal allFee;

    private Double allFeeChainIndex;

    private Long stowageCount;

    private Double stowageCountChainIndex;

    private Double weight;

    private Double weightChainIndex;

    private Double volume;

    private Double volumeChainIndex;

    private Long newCustomerCount;

    private Double newCustomerCountChainIndex;

    private Date createdTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAllocCentre() {
        return allocCentre;
    }

    public void setAllocCentre(String allocCentre) {
        this.allocCentre = allocCentre == null ? null : allocCentre.trim();
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
        this.region = region == null ? null : region.trim();
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public Integer getStatsYear() {
        return statsYear;
    }

    public void setStatsYear(Integer statsYear) {
        this.statsYear = statsYear;
    }

    public Integer getStatsMonth() {
        return statsMonth;
    }

    public void setStatsMonth(Integer statsMonth) {
        this.statsMonth = statsMonth;
    }

    public Long getTotalCustomerCount() {
        return totalCustomerCount;
    }

    public void setTotalCustomerCount(Long totalCustomerCount) {
        this.totalCustomerCount = totalCustomerCount;
    }

    public Long getCustomerCount() {
        return customerCount;
    }

    public void setCustomerCount(Long customerCount) {
        this.customerCount = customerCount;
    }

    public Long getWaybillCount() {
        return waybillCount;
    }

    public void setWaybillCount(Long waybillCount) {
        this.waybillCount = waybillCount;
    }

    public Double getWaybillCountChainIndex() {
        return waybillCountChainIndex;
    }

    public void setWaybillCountChainIndex(Double waybillCountChainIndex) {
        this.waybillCountChainIndex = waybillCountChainIndex;
    }

    public BigDecimal getAllFee() {
        return allFee;
    }

    public void setAllFee(BigDecimal allFee) {
        this.allFee = allFee;
    }

    public Double getAllFeeChainIndex() {
        return allFeeChainIndex;
    }

    public void setAllFeeChainIndex(Double allFeeChainIndex) {
        this.allFeeChainIndex = allFeeChainIndex;
    }

    public Long getStowageCount() {
        return stowageCount;
    }

    public void setStowageCount(Long stowageCount) {
        this.stowageCount = stowageCount;
    }

    public Double getStowageCountChainIndex() {
        return stowageCountChainIndex;
    }

    public void setStowageCountChainIndex(Double stowageCountChainIndex) {
        this.stowageCountChainIndex = stowageCountChainIndex;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getWeightChainIndex() {
        return weightChainIndex;
    }

    public void setWeightChainIndex(Double weightChainIndex) {
        this.weightChainIndex = weightChainIndex;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Double getVolumeChainIndex() {
        return volumeChainIndex;
    }

    public void setVolumeChainIndex(Double volumeChainIndex) {
        this.volumeChainIndex = volumeChainIndex;
    }

    public Long getNewCustomerCount() {
        return newCustomerCount;
    }

    public void setNewCustomerCount(Long newCustomerCount) {
        this.newCustomerCount = newCustomerCount;
    }

    public Double getNewCustomerCountChainIndex() {
        return newCustomerCountChainIndex;
    }

    public void setNewCustomerCountChainIndex(Double newCustomerCountChainIndex) {
        this.newCustomerCountChainIndex = newCustomerCountChainIndex;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}