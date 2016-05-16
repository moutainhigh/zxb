package com.wangkuo.zxb.lsp.exchange.event;

import org.springframework.context.ApplicationEvent;

/**
 *
 * 网点确认到站 事件
 *
 * Created by Zhangxs on 14/11/24.
 */
public class WaybillGoodArriveEvent extends ApplicationEvent {

    private Long waybillId;
    private String operateEmployee;

    public WaybillGoodArriveEvent(Object source, Long waybillId, String operateEmployee) {
        super(source);
        this.waybillId = waybillId;
        this.operateEmployee = operateEmployee;
    }

    public String getOperateEmployee() {
        return operateEmployee;
    }

    public void setOperateEmployee(String operateEmployee) {
        this.operateEmployee = operateEmployee;
    }

    public Long getWaybillId() {
        return waybillId;
    }

    public void setWaybillId(Long waybillId) {
        this.waybillId = waybillId;
    }
}
