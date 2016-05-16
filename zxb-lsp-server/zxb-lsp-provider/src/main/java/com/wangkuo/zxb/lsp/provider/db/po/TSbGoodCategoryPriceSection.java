package com.wangkuo.zxb.lsp.provider.db.po;

import java.io.Serializable;
import java.math.BigDecimal;

public class TSbGoodCategoryPriceSection implements Serializable {
    private Long id;

    private Long goodCategoryPriceId;

    private Float startSec;

    private Float endSec;

    private BigDecimal unitPrice;

    private Integer isChanged;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGoodCategoryPriceId() {
        return goodCategoryPriceId;
    }

    public void setGoodCategoryPriceId(Long goodCategoryPriceId) {
        this.goodCategoryPriceId = goodCategoryPriceId;
    }

    public Float getStartSec() {
        return startSec;
    }

    public void setStartSec(Float startSec) {
        this.startSec = startSec;
    }

    public Float getEndSec() {
        return endSec;
    }

    public void setEndSec(Float endSec) {
        this.endSec = endSec;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getIsChanged() {
        return isChanged;
    }

    public void setIsChanged(Integer isChanged) {
        this.isChanged = isChanged;
    }
}