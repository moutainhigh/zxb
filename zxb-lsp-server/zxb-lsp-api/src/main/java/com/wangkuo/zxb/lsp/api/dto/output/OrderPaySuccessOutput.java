package com.wangkuo.zxb.lsp.api.dto.output;

import java.io.Serializable;

/**
 * Created by mark on 16/4/14.
 */
public class OrderPaySuccessOutput implements Serializable {
    private Long orderId;
    private Long waybillId;
    private String paySn;
    private String systemSn;

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

    public String getPaySn() {
        return paySn;
    }

    public void setPaySn(String paySn) {
        this.paySn = paySn;
    }

    public String getSystemSn() {
        return systemSn;
    }

    public void setSystemSn(String systemSn) {
        this.systemSn = systemSn;
    }
}
