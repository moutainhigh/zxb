package com.wangkuo.zxb.lsp.exchange.event;

import org.springframework.context.ApplicationEvent;

/**
 *
 * 运单新增 事件
 *
 * Created by Zhangxs on 14/11/24.
 */
public class AddWaybillEvent extends ApplicationEvent {

    private Long waybillId;

    public AddWaybillEvent(Object source, Long waybillId) {
        super(source);
        this.waybillId = waybillId;
    }

    public Long getWaybillId() {
        return waybillId;
    }

    public void setWaybillId(Long waybillId) {
        this.waybillId = waybillId;
    }
}
