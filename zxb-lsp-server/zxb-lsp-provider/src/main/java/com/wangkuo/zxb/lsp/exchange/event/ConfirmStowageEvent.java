package com.wangkuo.zxb.lsp.exchange.event;

import org.springframework.context.ApplicationEvent;

/**
 * 配载确认发车
 *
 * Created by dan on 14-12-8.
 */
public class ConfirmStowageEvent extends ApplicationEvent {

    private Long stowageId;

    private String operateEmployee;

    public ConfirmStowageEvent(Object source, Long stowageId, String operateEmployee) {
        super(source);
        this.stowageId = stowageId;
        this.operateEmployee = operateEmployee;
    }

    public Long getStowageId() {
        return stowageId;
    }

    public void setStowageId(Long stowageId) {
        this.stowageId = stowageId;
    }

    public String getOperateEmployee() {
        return operateEmployee;
    }

    public void setOperateEmployee(String operateEmployee) {
        this.operateEmployee = operateEmployee;
    }
}
