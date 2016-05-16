package com.wangkuo.zxb.lsp.api.dto.input;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by sanshao on 16-4-8.
 */
public class LspBalanceDetailInput implements Serializable {

    private Long id;

    private Long benchmarkId;

    private BigDecimal freightFee;

    private BigDecimal sendGoodFee;

    private BigDecimal premiumFee;

    private BigDecimal invoiceFee;

    private BigDecimal enterFee;

    private BigDecimal upstairsFee;

    private BigDecimal signedReceiveFee;

    private BigDecimal unloadFee;

    private BigDecimal expressFee;

    private BigDecimal changeWaybillFee;

    private BigDecimal damagerFee;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBenchmarkId() {
        return benchmarkId;
    }

    public void setBenchmarkId(Long benchmarkId) {
        this.benchmarkId = benchmarkId;
    }

    public BigDecimal getFreightFee() {
        return freightFee;
    }

    public void setFreightFee(BigDecimal freightFee) {
        this.freightFee = freightFee;
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

    public BigDecimal getInvoiceFee() {
        return invoiceFee;
    }

    public void setInvoiceFee(BigDecimal invoiceFee) {
        this.invoiceFee = invoiceFee;
    }

    public BigDecimal getEnterFee() {
        return enterFee;
    }

    public void setEnterFee(BigDecimal enterFee) {
        this.enterFee = enterFee;
    }

    public BigDecimal getUpstairsFee() {
        return upstairsFee;
    }

    public void setUpstairsFee(BigDecimal upstairsFee) {
        this.upstairsFee = upstairsFee;
    }

    public BigDecimal getSignedReceiveFee() {
        return signedReceiveFee;
    }

    public void setSignedReceiveFee(BigDecimal signedReceiveFee) {
        this.signedReceiveFee = signedReceiveFee;
    }

    public BigDecimal getUnloadFee() {
        return unloadFee;
    }

    public void setUnloadFee(BigDecimal unloadFee) {
        this.unloadFee = unloadFee;
    }

    public BigDecimal getExpressFee() {
        return expressFee;
    }

    public void setExpressFee(BigDecimal expressFee) {
        this.expressFee = expressFee;
    }

    public BigDecimal getChangeWaybillFee() {
        return changeWaybillFee;
    }

    public void setChangeWaybillFee(BigDecimal changeWaybillFee) {
        this.changeWaybillFee = changeWaybillFee;
    }

    public BigDecimal getDamagerFee() {
        return damagerFee;
    }

    public void setDamagerFee(BigDecimal damagerFee) {
        this.damagerFee = damagerFee;
    }
}
