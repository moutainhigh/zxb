package com.wangkuo.zxb.lsp.api.dto.input;

import java.io.Serializable;
import java.util.Date;

/**
 * 未配载的运单查询参数
 *
 * @author 林守锦
 * @version 1.0
 * @date 2016-04-12
 */
public class QueryNoStowageBillInput implements Serializable {

    /**
     * 服务商id
     */
    private Long lspId;

    /**
     * 集散中心id
     */
    private Long allocCenterId;

    /**
     * 开单日期开始
     */
    private Date startTime;

    /**
     * 开单日期结束
     */
    private Date endTime;

    /**
     * 发货方名称
     */
    private String shipperCustomerName;

    /**
     * 收货方地址
     */
    private String address;

    /**
     * 状态
     */
    private Integer waybillStatus;

    /**
     * Getter for property 'lspId'.
     *
     * @return Value for property 'lspId'.
     */
    public Long getLspId() {
        return lspId;
    }

    /**
     * Setter for property 'lspId'.
     *
     * @param lspId Value to set for property 'lspId'.
     */
    public void setLspId(Long lspId) {
        this.lspId = lspId;
    }

    /**
     * Getter for property 'allocCenterId'.
     *
     * @return Value for property 'allocCenterId'.
     */
    public Long getAllocCenterId() {
        return allocCenterId;
    }

    /**
     * Setter for property 'allocCenterId'.
     *
     * @param allocCenterId Value to set for property 'allocCenterId'.
     */
    public void setAllocCenterId(Long allocCenterId) {
        this.allocCenterId = allocCenterId;
    }

    /**
     * Getter for property 'startTime'.
     *
     * @return Value for property 'startTime'.
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * Setter for property 'startTime'.
     *
     * @param startTime Value to set for property 'startTime'.
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * Getter for property 'endTime'.
     *
     * @return Value for property 'endTime'.
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * Setter for property 'endTime'.
     *
     * @param endTime Value to set for property 'endTime'.
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * Getter for property 'shipperCustomerName'.
     *
     * @return Value for property 'shipperCustomerName'.
     */
    public String getShipperCustomerName() {
        return shipperCustomerName;
    }

    /**
     * Setter for property 'shipperCustomerName'.
     *
     * @param shipperCustomerName Value to set for property 'shipperCustomerName'.
     */
    public void setShipperCustomerName(String shipperCustomerName) {
        this.shipperCustomerName = shipperCustomerName;
    }

    /**
     * Getter for property 'address'.
     *
     * @return Value for property 'address'.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Setter for property 'address'.
     *
     * @param address Value to set for property 'address'.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getWaybillStatus() {
        return waybillStatus;
    }

    public void setWaybillStatus(Integer waybillStatus) {
        this.waybillStatus = waybillStatus;
    }
}
