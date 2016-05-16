package com.wangkuo.zxb.lsp.exchange.event;

import org.springframework.context.ApplicationEvent;

import java.util.List;

/**
 * 配载修改确认发车
 *
 * Created by dan on 15-1-27.
 */
public class UpdateConfirmStowageEvent extends ApplicationEvent {

    private Long stowageId;

    private List<Long> waybillId;

    private String operateEmployee;

    public UpdateConfirmStowageEvent(Object source,Long stowageId,List<Long> waybillId, String operateEmployee) {
        super(source);
        this.stowageId = stowageId;
        this.waybillId = waybillId;
        this.operateEmployee = operateEmployee;
    }

    public Long getStowageId() {
        return stowageId;
    }

    public void setStowageId(Long stowageId) {
        this.stowageId = stowageId;
    }

    public List<Long> getWaybillId() {
        return waybillId;
    }

    public void setWaybillId(List<Long> waybillId) {
        this.waybillId = waybillId;
    }

    public String getOperateEmployee() {
        return operateEmployee;
    }

    public void setOperateEmployee(String operateEmployee) {
        this.operateEmployee = operateEmployee;
    }
}
