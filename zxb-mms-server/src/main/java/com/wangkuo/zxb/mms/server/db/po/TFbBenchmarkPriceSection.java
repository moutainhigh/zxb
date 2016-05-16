package com.wangkuo.zxb.mms.server.db.po;

import java.io.Serializable;
import java.math.BigDecimal;

public class TFbBenchmarkPriceSection implements Serializable {
    private Long id;

    private Long priceId;

    private Integer type;

    private Float startSec;

    private Float endSec;

    private BigDecimal unitPrice;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPriceId() {
        return priceId;
    }

    public void setPriceId(Long priceId) {
        this.priceId = priceId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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
}