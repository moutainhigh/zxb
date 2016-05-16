package com.wangkuo.zxb.lsp.exchange.event;

import org.springframework.context.ApplicationEvent;

/**
 *
 * 网点信息编辑 事件
 *
 * 改单 服务商 这边没测试过，因为这边暂时不需要，by崔正和_20160420
 *
 * Created by Zhangxs on 14/11/24.
 */
public class EditWaybillEvent extends ApplicationEvent {

    private Long waybillId;

    public EditWaybillEvent(Object source, Long waybillId) {
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
