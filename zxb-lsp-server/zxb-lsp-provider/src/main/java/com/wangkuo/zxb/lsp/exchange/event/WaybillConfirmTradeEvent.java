package com.wangkuo.zxb.lsp.exchange.event;

import org.springframework.context.ApplicationEvent;

/**
 *
 * 网点运单确认交易 事件
 *
 * Created by Zhangxs on 14/11/24.
 */
public class WaybillConfirmTradeEvent extends ApplicationEvent {

    private Long waybillId;
    private String operateEmployee;

    public WaybillConfirmTradeEvent(Object source, Long waybillId, String operateEmployee) {
        super(source);
        this.waybillId = waybillId;
        this.operateEmployee=operateEmployee;
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
