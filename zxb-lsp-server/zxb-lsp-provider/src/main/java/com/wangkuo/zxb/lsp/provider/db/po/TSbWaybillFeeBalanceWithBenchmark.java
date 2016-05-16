package com.wangkuo.zxb.lsp.provider.db.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TSbWaybillFeeBalanceWithBenchmark implements Serializable {
    private Long id;

    private Long waybillId;

    private Integer type;

    private BigDecimal zbReceiveAllFee;

    private BigDecimal zbReceiveBenchmarkFee;

    private BigDecimal zbReceiveServiceFee;

    private BigDecimal premiumFee;

    private Integer status;

    private Long freeSingleId;

    private String freeSingleName;

    private Date freeTime;

    private Date payTime;

    private Long bookerEmployeeId;

    private String bookerEmployeeName;

    private Date bookerTime;

    private String freeReason;

    private String cancelReason;

    private Long waybillChangeBigId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWaybillId() {
        return waybillId;
    }

    public void setWaybillId(Long waybillId) {
        this.waybillId = waybillId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public BigDecimal getZbReceiveAllFee() {
        return zbReceiveAllFee;
    }

    public void setZbReceiveAllFee(BigDecimal zbReceiveAllFee) {
        this.zbReceiveAllFee = zbReceiveAllFee;
    }

    public BigDecimal getZbReceiveBenchmarkFee() {
        return zbReceiveBenchmarkFee;
    }

    public void setZbReceiveBenchmarkFee(BigDecimal zbReceiveBenchmarkFee) {
        this.zbReceiveBenchmarkFee = zbReceiveBenchmarkFee;
    }

    public BigDecimal getZbReceiveServiceFee() {
        return zbReceiveServiceFee;
    }

    public void setZbReceiveServiceFee(BigDecimal zbReceiveServiceFee) {
        this.zbReceiveServiceFee = zbReceiveServiceFee;
    }

    public BigDecimal getPremiumFee() {
        return premiumFee;
    }

    public void setPremiumFee(BigDecimal premiumFee) {
        this.premiumFee = premiumFee;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getFreeSingleId() {
        return freeSingleId;
    }

    public void setFreeSingleId(Long freeSingleId) {
        this.freeSingleId = freeSingleId;
    }

    public String getFreeSingleName() {
        return freeSingleName;
    }

    public void setFreeSingleName(String freeSingleName) {
        this.freeSingleName = freeSingleName == null ? null : freeSingleName.trim();
    }

    public Date getFreeTime() {
        return freeTime;
    }

    public void setFreeTime(Date freeTime) {
        this.freeTime = freeTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
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
        this.bookerEmployeeName = bookerEmployeeName == null ? null : bookerEmployeeName.trim();
    }

    public Date getBookerTime() {
        return bookerTime;
    }

    public void setBookerTime(Date bookerTime) {
        this.bookerTime = bookerTime;
    }

    public String getFreeReason() {
        return freeReason;
    }

    public void setFreeReason(String freeReason) {
        this.freeReason = freeReason == null ? null : freeReason.trim();
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason == null ? null : cancelReason.trim();
    }

    public Long getWaybillChangeBigId() {
        return waybillChangeBigId;
    }

    public void setWaybillChangeBigId(Long waybillChangeBigId) {
        this.waybillChangeBigId = waybillChangeBigId;
    }
}