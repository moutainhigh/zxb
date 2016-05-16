package com.wangkuo.zxb.lsp.api.dto.output;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by chaizf on 2016/4/8.
 */
public class CalculateFeeOutput implements Serializable {
    private BigDecimal mainLineFee;
    private BigDecimal sendGoodFee;
    private BigDecimal premiumFee;
    private BigDecimal openTicketFee;
    private BigDecimal enterDepotFee;
    private BigDecimal upstairsFee;
    private BigDecimal unloadFee;
    private BigDecimal receiptFee;
    private BigDecimal expressFee;
    private Integer ransitNum;
    private BigDecimal addvaluesFee;
    private BigDecimal feeAggravate;
    private Integer status;

    public BigDecimal getMainLineFee() {
        return mainLineFee;
    }

    public void setMainLineFee(BigDecimal mainLineFee) {
        this.mainLineFee = mainLineFee;
    }

    public BigDecimal getSendGoodFee() {
        return sendGoodFee;
    }

    public void setSendGoodFee(BigDecimal sendGoodFee) {
        this.sendGoodFee = sendGoodFee;
    }

    public BigDecimal getPremiumFee() {
        return premiumFee;
    }

    public void setPremiumFee(BigDecimal premiumFee) {
        this.premiumFee = premiumFee;
    }

    public BigDecimal getOpenTicketFee() {
        return openTicketFee;
    }

    public void setOpenTicketFee(BigDecimal openTicketFee) {
        this.openTicketFee = openTicketFee;
    }

    public BigDecimal getEnterDepotFee() {
        return enterDepotFee;
    }

    public void setEnterDepotFee(BigDecimal enterDepotFee) {
        this.enterDepotFee = enterDepotFee;
    }

    public BigDecimal getUpstairsFee() {
        return upstairsFee;
    }

    public void setUpstairsFee(BigDecimal upstairsFee) {
        this.upstairsFee = upstairsFee;
    }

    public BigDecimal getUnloadFee() {
        return unloadFee;
    }

    public void setUnloadFee(BigDecimal unloadFee) {
        this.unloadFee = unloadFee;
    }

    public BigDecimal getReceiptFee() {
        return receiptFee;
    }

    public void setReceiptFee(BigDecimal receiptFee) {
        this.receiptFee = receiptFee;
    }

    public BigDecimal getExpressFee() {
        return expressFee;
    }

    public void setExpressFee(BigDecimal expressFee) {
        this.expressFee = expressFee;
    }

    public Integer getRansitNum() {
        return ransitNum;
    }

    public void setRansitNum(Integer ransitNum) {
        this.ransitNum = ransitNum;
    }

    public BigDecimal getAddvaluesFee() {
        return addvaluesFee;
    }

    public void setAddvaluesFee(BigDecimal addvaluesFee) {
        this.addvaluesFee = addvaluesFee;
    }

    public BigDecimal getFeeAggravate() {
        return feeAggravate;
    }

    public void setFeeAggravate(BigDecimal feeFggravate) {
        this.feeAggravate = feeFggravate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
