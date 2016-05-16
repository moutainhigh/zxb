package com.wangkuo.zxb.mms.dto.result;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2016-05-05
 */
public class RegionStatsResult implements Serializable {

    private String allocCentre;

    private String region;

    private Long areaId;

    private Long totalCustomerCount;

    private Integer statsYear;

    private Integer statsMonth;

    private Long customerCount;

    private Long waybillCount;

    private Double waybillCountChainIndex;

    private Long stowageCount;

    private Double stowageCountChainIndex;

    private BigDecimal allFee;

    private Double allFeeChainIndex;

    private Double weight;

    private Double weightChainIndex;

    private Double volume;

    private Double volumeChainIndex;

    private Long newCustomerCount;

    private Double newCustomerCountChainIndex;


    /**
     * Getter for property 'allocCentre'.
     *
     * @return Value for property 'allocCentre'.
     */
    public String getAllocCentre() {
        return allocCentre;
    }

    /**
     * Setter for property 'allocCentre'.
     *
     * @param allocCentre Value to set for property 'allocCentre'.
     */
    public void setAllocCentre(String allocCentre) {
        this.allocCentre = allocCentre;
    }

    /**
     * Getter for property 'region'.
     *
     * @return Value for property 'region'.
     */
    public String getRegion() {
        return region;
    }

    /**
     * Setter for property 'region'.
     *
     * @param region Value to set for property 'region'.
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Getter for property 'totalCustomerCount'.
     *
     * @return Value for property 'totalCustomerCount'.
     */
    public Long getTotalCustomerCount() {
        return totalCustomerCount;
    }

    /**
     * Setter for property 'totalCustomerCount'.
     *
     * @param totalCustomerCount Value to set for property 'totalCustomerCount'.
     */
    public void setTotalCustomerCount(Long totalCustomerCount) {
        this.totalCustomerCount = totalCustomerCount;
    }

    /**
     * Getter for property 'statsYear'.
     *
     * @return Value for property 'statsYear'.
     */
    public Integer getStatsYear() {
        return statsYear;
    }

    /**
     * Setter for property 'statsYear'.
     *
     * @param statsYear Value to set for property 'statsYear'.
     */
    public void setStatsYear(Integer statsYear) {
        this.statsYear = statsYear;
    }

    /**
     * Getter for property 'statsMonth'.
     *
     * @return Value for property 'statsMonth'.
     */
    public Integer getStatsMonth() {
        return statsMonth;
    }

    /**
     * Setter for property 'statsMonth'.
     *
     * @param statsMonth Value to set for property 'statsMonth'.
     */
    public void setStatsMonth(Integer statsMonth) {
        this.statsMonth = statsMonth;
    }

    /**
     * Getter for property 'customerCount'.
     *
     * @return Value for property 'customerCount'.
     */
    public Long getCustomerCount() {
        return customerCount;
    }

    /**
     * Setter for property 'customerCount'.
     *
     * @param customerCount Value to set for property 'customerCount'.
     */
    public void setCustomerCount(Long customerCount) {
        this.customerCount = customerCount;
    }

    /**
     * Getter for property 'waybillCount'.
     *
     * @return Value for property 'waybillCount'.
     */
    public Long getWaybillCount() {
        return waybillCount;
    }

    /**
     * Setter for property 'waybillCount'.
     *
     * @param waybillCount Value to set for property 'waybillCount'.
     */
    public void setWaybillCount(Long waybillCount) {
        this.waybillCount = waybillCount;
    }

    /**
     * Getter for property 'waybillCountChainIndex'.
     *
     * @return Value for property 'waybillCountChainIndex'.
     */
    public Double getWaybillCountChainIndex() {
        return waybillCountChainIndex;
    }

    /**
     * Setter for property 'waybillCountChainIndex'.
     *
     * @param waybillCountChainIndex Value to set for property 'waybillCountChainIndex'.
     */
    public void setWaybillCountChainIndex(Double waybillCountChainIndex) {
        this.waybillCountChainIndex = waybillCountChainIndex;
    }

    /**
     * Getter for property 'stowageCount'.
     *
     * @return Value for property 'stowageCount'.
     */
    public Long getStowageCount() {
        return stowageCount;
    }

    /**
     * Setter for property 'stowageCount'.
     *
     * @param stowageCount Value to set for property 'stowageCount'.
     */
    public void setStowageCount(Long stowageCount) {
        this.stowageCount = stowageCount;
    }

    /**
     * Getter for property 'stowageCountChainIndex'.
     *
     * @return Value for property 'stowageCountChainIndex'.
     */
    public Double getStowageCountChainIndex() {
        return stowageCountChainIndex;
    }

    /**
     * Setter for property 'stowageCountChainIndex'.
     *
     * @param stowageCountChainIndex Value to set for property 'stowageCountChainIndex'.
     */
    public void setStowageCountChainIndex(Double stowageCountChainIndex) {
        this.stowageCountChainIndex = stowageCountChainIndex;
    }

    /**
     * Getter for property 'allFee'.
     *
     * @return Value for property 'allFee'.
     */
    public BigDecimal getAllFee() {
        return allFee;
    }

    /**
     * Setter for property 'allFee'.
     *
     * @param allFee Value to set for property 'allFee'.
     */
    public void setAllFee(BigDecimal allFee) {
        this.allFee = allFee;
    }

    /**
     * Getter for property 'allFeeChainIndex'.
     *
     * @return Value for property 'allFeeChainIndex'.
     */
    public Double getAllFeeChainIndex() {
        return allFeeChainIndex;
    }

    /**
     * Setter for property 'allFeeChainIndex'.
     *
     * @param allFeeChainIndex Value to set for property 'allFeeChainIndex'.
     */
    public void setAllFeeChainIndex(Double allFeeChainIndex) {
        this.allFeeChainIndex = allFeeChainIndex;
    }

    /**
     * Getter for property 'weight'.
     *
     * @return Value for property 'weight'.
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * Setter for property 'weight'.
     *
     * @param weight Value to set for property 'weight'.
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    /**
     * Getter for property 'weightChainIndex'.
     *
     * @return Value for property 'weightChainIndex'.
     */
    public Double getWeightChainIndex() {
        return weightChainIndex;
    }

    /**
     * Setter for property 'weightChainIndex'.
     *
     * @param weightChainIndex Value to set for property 'weightChainIndex'.
     */
    public void setWeightChainIndex(Double weightChainIndex) {
        this.weightChainIndex = weightChainIndex;
    }

    /**
     * Getter for property 'volume'.
     *
     * @return Value for property 'volume'.
     */
    public Double getVolume() {
        return volume;
    }

    /**
     * Setter for property 'volume'.
     *
     * @param volume Value to set for property 'volume'.
     */
    public void setVolume(Double volume) {
        this.volume = volume;
    }

    /**
     * Getter for property 'volumeChainIndex'.
     *
     * @return Value for property 'volumeChainIndex'.
     */
    public Double getVolumeChainIndex() {
        return volumeChainIndex;
    }

    /**
     * Setter for property 'volumeChainIndex'.
     *
     * @param volumeChainIndex Value to set for property 'volumeChainIndex'.
     */
    public void setVolumeChainIndex(Double volumeChainIndex) {
        this.volumeChainIndex = volumeChainIndex;
    }

    /**
     * Getter for property 'newCustomerCount'.
     *
     * @return Value for property 'newCustomerCount'.
     */
    public Long getNewCustomerCount() {
        return newCustomerCount;
    }

    /**
     * Setter for property 'newCustomerCount'.
     *
     * @param newCustomerCount Value to set for property 'newCustomerCount'.
     */
    public void setNewCustomerCount(Long newCustomerCount) {
        this.newCustomerCount = newCustomerCount;
    }

    /**
     * Getter for property 'newCustomerCountChainIndex'.
     *
     * @return Value for property 'newCustomerCountChainIndex'.
     */
    public Double getNewCustomerCountChainIndex() {
        return newCustomerCountChainIndex;
    }

    /**
     * Setter for property 'newCustomerCountChainIndex'.
     *
     * @param newCustomerCountChainIndex Value to set for property 'newCustomerCountChainIndex'.
     */
    public void setNewCustomerCountChainIndex(Double newCustomerCountChainIndex) {
        this.newCustomerCountChainIndex = newCustomerCountChainIndex;
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    @Override
    public String toString() {
        return "RegionStatsResult{" +
                "allocCentre='" + allocCentre + '\'' +
                ", region='" + region + '\'' +
                ", areaId=" + areaId +
                ", totalCustomerCount=" + totalCustomerCount +
                ", statsYear=" + statsYear +
                ", statsMonth=" + statsMonth +
                ", customerCount=" + customerCount +
                ", waybillCount=" + waybillCount +
                ", waybillCountChainIndex=" + waybillCountChainIndex +
                ", stowageCount=" + stowageCount +
                ", stowageCountChainIndex=" + stowageCountChainIndex +
                ", allFee=" + allFee +
                ", allFeeChainIndex=" + allFeeChainIndex +
                ", weight=" + weight +
                ", weightChainIndex=" + weightChainIndex +
                ", volume=" + volume +
                ", volumeChainIndex=" + volumeChainIndex +
                ", newCustomerCount=" + newCustomerCount +
                ", newCustomerCountChainIndex=" + newCustomerCountChainIndex +
                '}';
    }
}
