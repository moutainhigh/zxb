package com.wangkuo.zxb.lsp.provider.db.po;

import java.io.Serializable;

public class TLspWaybillReceiveRelation implements Serializable {
    private Long id;

    private Long lspWaybillCourierId;

    private Long waybillReceiveId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLspWaybillCourierId() {
        return lspWaybillCourierId;
    }

    public void setLspWaybillCourierId(Long lspWaybillCourierId) {
        this.lspWaybillCourierId = lspWaybillCourierId;
    }

    public Long getWaybillReceiveId() {
        return waybillReceiveId;
    }

    public void setWaybillReceiveId(Long waybillReceiveId) {
        this.waybillReceiveId = waybillReceiveId;
    }
}