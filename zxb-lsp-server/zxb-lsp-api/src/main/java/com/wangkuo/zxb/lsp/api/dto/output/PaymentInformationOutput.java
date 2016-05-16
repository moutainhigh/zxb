package com.wangkuo.zxb.lsp.api.dto.output;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by mark on 16/4/14.
 */
public class PaymentInformationOutput implements Serializable {
    public static final int SUCCESS = 0;

    public static final int WAYBILL_PAYED = -1;
    public static final String WAYBILL_PAYED_ERR = "运单已完成付款";

    public static final int DATA_ERROR = -2;
    public static final String DATA_ERROR_ERR = "数据错误";

    public static final int WAYBILL_CLOSED = -2;
    public static final String WAYBILL_CLOSED_ERR = "运单已关闭";

    private Long orderId;
    private Long benchmarkId;
    private String systemSn;
    private String goodName;
    private String receiveName;
    private Date operationTime;
    private BigDecimal mainLineFee;
    private BigDecimal premiumFee;
    private BigDecimal invoiceFee;
    private BigDecimal vasFee;
    private BigDecimal allFee;

    private Integer status;
    private String errorMsg;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getBenchmarkId() {
        return benchmarkId;
    }

    public void setBenchmarkId(Long benchmarkId) {
        this.benchmarkId = benchmarkId;
    }

    public String getSystemSn() {
        return systemSn;
    }

    public void setSystemSn(String systemSn) {
        this.systemSn = systemSn;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getReceiveName() {
        return receiveName;
    }

    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName;
    }

    public Date getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }

    public BigDecimal getMainLineFee() {
        return mainLineFee;
    }

    public void setMainLineFee(BigDecimal mainLineFee) {
        this.mainLineFee = mainLineFee;
    }

    public BigDecimal getPremiumFee() {
        return premiumFee;
    }

    public void setPremiumFee(BigDecimal premiumFee) {
        this.premiumFee = premiumFee;
    }

    public BigDecimal getInvoiceFee() {
        return invoiceFee;
    }

    public void setInvoiceFee(BigDecimal invoiceFee) {
        this.invoiceFee = invoiceFee;
    }

    public BigDecimal getVasFee() {
        return vasFee;
    }

    public void setVasFee(BigDecimal vasFee) {
        this.vasFee = vasFee;
    }

    public BigDecimal getAllFee() {
        return allFee;
    }

    public void setAllFee(BigDecimal allFee) {
        this.allFee = allFee;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
