package com.wangkuo.zxb.lsp.exchange.event;

import org.springframework.context.ApplicationEvent;

/**
 *
 * 网点运单关闭 事件
 *
 * Created by Zhangxs on 14/11/24.
 */
public class CloseWaybillEvent extends ApplicationEvent {

    private Long waybillId;
    private String closeUserName;

    public CloseWaybillEvent(Object source, Long waybillId,String closeUserName) {
        super(source);
        this.waybillId = waybillId;
        this.closeUserName=closeUserName;
    }

    public Long getWaybillId() {
        return waybillId;
    }

    public void setWaybillId(Long waybillId) {
        this.waybillId = waybillId;
    }

    public String getCloseUserName() {
        return closeUserName;
    }

    public void setCloseUserName(String closeUserName) {
        this.closeUserName = closeUserName;
    }
}
