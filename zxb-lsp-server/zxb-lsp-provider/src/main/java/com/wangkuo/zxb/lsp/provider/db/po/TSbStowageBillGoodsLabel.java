package com.wangkuo.zxb.lsp.provider.db.po;

import java.io.Serializable;

public class TSbStowageBillGoodsLabel implements Serializable {
    private Long id;

    private Long stowageBillId;

    private Long waybillId;

    private Long waybillGoodsLabelId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStowageBillId() {
        return stowageBillId;
    }

    public void setStowageBillId(Long stowageBillId) {
        this.stowageBillId = stowageBillId;
    }

    public Long getWaybillId() {
        return waybillId;
    }

    public void setWaybillId(Long waybillId) {
        this.waybillId = waybillId;
    }

    public Long getWaybillGoodsLabelId() {
        return waybillGoodsLabelId;
    }

    public void setWaybillGoodsLabelId(Long waybillGoodsLabelId) {
        this.waybillGoodsLabelId = waybillGoodsLabelId;
    }
}