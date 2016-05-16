package com.wangkuo.zxb.lsp.exchange.event;

import org.springframework.context.ApplicationEvent;

import java.util.List;

/**
 * 运单配载发车取消
 *
 * Created by dan on 14-12-9.
 */
public class UpdateStowageEvent extends ApplicationEvent {

    /**
     * 配载取消的运单id
     */
    private List<Long> waybillIds;

    private String operateEmployee;

    public UpdateStowageEvent(Object source,List<Long> waybillIds,String operateEmployee) {
        super(source);
        this.waybillIds = waybillIds;
        this.operateEmployee = operateEmployee;
    }

    public List<Long> getWaybillIds() {
        return waybillIds;
    }

    public void setWaybillIds(List<Long> waybillIds) {
        this.waybillIds = waybillIds;
    }

    public String getOperateEmployee() {
        return operateEmployee;
    }

    public void setOperateEmployee(String operateEmployee) {
        this.operateEmployee = operateEmployee;
    }
}
