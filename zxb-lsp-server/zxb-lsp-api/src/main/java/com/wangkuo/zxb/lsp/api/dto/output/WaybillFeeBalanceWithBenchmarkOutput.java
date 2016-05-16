package com.wangkuo.zxb.lsp.api.dto.output;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by sanshao on 16-4-6.
 */
public class WaybillFeeBalanceWithBenchmarkOutput implements Serializable {

    private Long id;
    private Date bookerTime;
    private Date operationTime;
    private Long waybillId;
    private String systemSn;
    private String sn;
    private String goodName;
    private String shipperCustomerName;
    private Integer balanceTypeWithZb;
    private BigDecimal zbReceiveAllFee;
    private Integer type;
    private Integer source;
    private Integer waybillStatus;
    private Integer receiveTrack;
    private String lspCompanyName;
    private String allocCenterName;
    private Long allocCenterId;
    private Integer verifyStatus;
    private String freeSingleName;
    private Date freeTime;
    private BigDecimal xfyfFeeWithZb;
    private BigDecimal dfyfFeeWithZb;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getBookerTime() {
        return bookerTime;
    }

    public void setBookerTime(Date bookerTime) {
        this.bookerTime = bookerTime;
    }

    public Date getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }

    public Long getWaybillId() {
        return waybillId;
    }

    public void setWaybillId(Long waybillId) {
        this.waybillId = waybillId;
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

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getShipperCustomerName() {
        return shipperCustomerName;
    }

    public void setShipperCustomerName(String shipperCustomerName) {
        this.shipperCustomerName = shipperCustomerName;
    }

    public Integer getBalanceTypeWithZb() {
        return balanceTypeWithZb;
    }

    public void setBalanceTypeWithZb(Integer balanceTypeWithZb) {
        this.balanceTypeWithZb = balanceTypeWithZb;
    }

    public BigDecimal getZbReceiveAllFee() {
        return zbReceiveAllFee;
    }

    public void setZbReceiveAllFee(BigDecimal zbReceiveAllFee) {
        this.zbReceiveAllFee = zbReceiveAllFee;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getWaybillStatus() {
        return waybillStatus;
    }

    public void setWaybillStatus(Integer waybillStatus) {
        this.waybillStatus = waybillStatus;
    }

    public Integer getReceiveTrack() {
        return receiveTrack;
    }

    public void setReceiveTrack(Integer receiveTrack) {
        this.receiveTrack = receiveTrack;
    }

    public String getLspCompanyName() {
        return lspCompanyName;
    }

    public void setLspCompanyName(String lspCompanyName) {
        this.lspCompanyName = lspCompanyName;
    }

    public String getAllocCenterName() {
        return allocCenterName;
    }

    public void setAllocCenterName(String allocCenterName) {
        this.allocCenterName = allocCenterName;
    }

    public Long getAllocCenterId() {
        return allocCenterId;
    }

    public void setAllocCenterId(Long allocCenterId) {
        this.allocCenterId = allocCenterId;
    }

    public Integer getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    public String getFreeSingleName() {
        return freeSingleName;
    }

    public void setFreeSingleName(String freeSingleName) {
        this.freeSingleName = freeSingleName;
    }

    public Date getFreeTime() {
        return freeTime;
    }

    public void setFreeTime(Date freeTime) {
        this.freeTime = freeTime;
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
}
