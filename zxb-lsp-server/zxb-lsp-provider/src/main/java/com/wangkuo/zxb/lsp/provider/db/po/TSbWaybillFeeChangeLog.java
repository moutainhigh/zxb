package com.wangkuo.zxb.lsp.provider.db.po;

import java.io.Serializable;
import java.math.BigDecimal;

public class TSbWaybillFeeChangeLog implements Serializable {
    private Long id;

    private Long waybillId;

    private Integer isChangeAllFreightFee;

    private BigDecimal beforeAllFreightFee;

    private BigDecimal afterAllFreightFee;

    private Integer isChangeRansitFee;

    private BigDecimal beforeRansitFee;

    private BigDecimal afterRansitFee;

    private Integer isChangeInformationFee;

    private BigDecimal beforeInformationFee;

    private BigDecimal afterInformationFee;

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

    public Integer getIsChangeAllFreightFee() {
        return isChangeAllFreightFee;
    }

    public void setIsChangeAllFreightFee(Integer isChangeAllFreightFee) {
        this.isChangeAllFreightFee = isChangeAllFreightFee;
    }

    public BigDecimal getBeforeAllFreightFee() {
        return beforeAllFreightFee;
    }

    public void setBeforeAllFreightFee(BigDecimal beforeAllFreightFee) {
        this.beforeAllFreightFee = beforeAllFreightFee;
    }

    public BigDecimal getAfterAllFreightFee() {
        return afterAllFreightFee;
    }

    public void setAfterAllFreightFee(BigDecimal afterAllFreightFee) {
        this.afterAllFreightFee = afterAllFreightFee;
    }

    public Integer getIsChangeRansitFee() {
        return isChangeRansitFee;
    }

    public void setIsChangeRansitFee(Integer isChangeRansitFee) {
        this.isChangeRansitFee = isChangeRansitFee;
    }

    public BigDecimal getBeforeRansitFee() {
        return beforeRansitFee;
    }

    public void setBeforeRansitFee(BigDecimal beforeRansitFee) {
        this.beforeRansitFee = beforeRansitFee;
    }

    public BigDecimal getAfterRansitFee() {
        return afterRansitFee;
    }

    public void setAfterRansitFee(BigDecimal afterRansitFee) {
        this.afterRansitFee = afterRansitFee;
    }

    public Integer getIsChangeInformationFee() {
        return isChangeInformationFee;
    }

    public void setIsChangeInformationFee(Integer isChangeInformationFee) {
        this.isChangeInformationFee = isChangeInformationFee;
    }

    public BigDecimal getBeforeInformationFee() {
        return beforeInformationFee;
    }

    public void setBeforeInformationFee(BigDecimal beforeInformationFee) {
        this.beforeInformationFee = beforeInformationFee;
    }

    public BigDecimal getAfterInformationFee() {
        return afterInformationFee;
    }

    public void setAfterInformationFee(BigDecimal afterInformationFee) {
        this.afterInformationFee = afterInformationFee;
    }
}