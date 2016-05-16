package com.wangkuo.zxb.mms.server.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2016-05-09
 */
public class AddRegionEvent extends ApplicationEvent {

    private long regionId;

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the component that published the event (never {@code null})
     */
    public AddRegionEvent(Object source, long regionId) {
        super(source);
        this.regionId = regionId;
    }

    public long getRegionId() {
        return regionId;
    }

    public void setRegionId(long regionId) {
        this.regionId = regionId;
    }
}
