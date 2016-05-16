package com.wangkuo.zxb.mms.dto.params;

import java.io.Serializable;

/**
 * 区域营销统计查询参数
 *
 * @author 林守锦
 * @version 1.0
 * @date 2016-05-05
 */
public class QueryRegionStatsParam implements Serializable {

    /**
     * 增长
     */
    public static final int CHAIN_INDEX_UP = 1;

    /**
     * 下降
     */
    public static final int CHAIN_INDEX_DOWN = 2;

    /**
     * 持平
     */
    public static final int CHAIN_INDEX_HOLD = 3;


    private Long allocCentreId;

    private Long regionId;

    private Integer year;

    private Integer month;

    private Integer waybillCountChainIndex;

    private Integer allFeeChainIndex;

    private Integer newCustomerCountChainIndex;


    /**
     * Getter for property 'allocCentreId'.
     *
     * @return Value for property 'allocCentreId'.
     */
    public Long getAllocCentreId() {
        return allocCentreId;
    }

    /**
     * Setter for property 'allocCentreId'.
     *
     * @param allocCentreId Value to set for property 'allocCentreId'.
     */
    public void setAllocCentreId(Long allocCentreId) {
        this.allocCentreId = allocCentreId;
    }

    /**
     * Getter for property 'regionId'.
     *
     * @return Value for property 'regionId'.
     */
    public Long getRegionId() {
        return regionId;
    }

    /**
     * Setter for property 'regionId'.
     *
     * @param regionId Value to set for property 'regionId'.
     */
    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    /**
     * Getter for property 'year'.
     *
     * @return Value for property 'year'.
     */
    public Integer getYear() {
        return year;
    }

    /**
     * Setter for property 'year'.
     *
     * @param year Value to set for property 'year'.
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     * Getter for property 'month'.
     *
     * @return Value for property 'month'.
     */
    public Integer getMonth() {
        return month;
    }

    /**
     * Setter for property 'month'.
     *
     * @param month Value to set for property 'month'.
     */
    public void setMonth(Integer month) {
        this.month = month;
    }

    /**
     * Getter for property 'waybillCountChainIndex'.
     *
     * @return Value for property 'waybillCountChainIndex'.
     */
    public Integer getWaybillCountChainIndex() {
        return waybillCountChainIndex;
    }

    /**
     * Setter for property 'waybillCountChainIndex'.
     *
     * @param waybillCountChainIndex Value to set for property 'waybillCountChainIndex'.
     */
    public void setWaybillCountChainIndex(Integer waybillCountChainIndex) {
        this.waybillCountChainIndex = waybillCountChainIndex;
    }

    /**
     * Getter for property 'allFeeChainIndex'.
     *
     * @return Value for property 'allFeeChainIndex'.
     */
    public Integer getAllFeeChainIndex() {
        return allFeeChainIndex;
    }

    /**
     * Setter for property 'allFeeChainIndex'.
     *
     * @param allFeeChainIndex Value to set for property 'allFeeChainIndex'.
     */
    public void setAllFeeChainIndex(Integer allFeeChainIndex) {
        this.allFeeChainIndex = allFeeChainIndex;
    }

    public Integer getNewCustomerCountChainIndex() {
        return newCustomerCountChainIndex;
    }

    public void setNewCustomerCountChainIndex(Integer newCustomerCountChainIndex) {
        this.newCustomerCountChainIndex = newCustomerCountChainIndex;
    }
}
