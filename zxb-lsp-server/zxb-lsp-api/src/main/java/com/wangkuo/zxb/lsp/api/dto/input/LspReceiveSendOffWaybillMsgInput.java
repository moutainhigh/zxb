package com.wangkuo.zxb.lsp.api.dto.input;

import java.io.Serializable;

/**
 * Created by sanshao on 16-4-6.
 */
public class LspReceiveSendOffWaybillMsgInput implements Serializable{

    private Long receiveId;

    private Long waybillId;

    private String waybillSn;

    public Long getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(Long receiveId) {
        this.receiveId = receiveId;
    }

    public Long getWaybillId() {
        return waybillId;
    }

    public void setWaybillId(Long waybillId) {
        this.waybillId = waybillId;
    }

    public String getWaybillSn() {
        return waybillSn;
    }

    public void setWaybillSn(String waybillSn) {
        this.waybillSn = waybillSn;
    }
}
