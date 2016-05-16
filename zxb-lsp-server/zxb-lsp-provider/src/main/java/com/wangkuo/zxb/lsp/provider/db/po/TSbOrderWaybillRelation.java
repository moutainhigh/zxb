package com.wangkuo.zxb.lsp.provider.db.po;

import java.io.Serializable;

public class TSbOrderWaybillRelation implements Serializable {
    private Long id;

    private Long orderId;

    private Long waybillId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getWaybillId() {
        return waybillId;
    }

    public void setWaybillId(Long waybillId) {
        this.waybillId = waybillId;
    }
}