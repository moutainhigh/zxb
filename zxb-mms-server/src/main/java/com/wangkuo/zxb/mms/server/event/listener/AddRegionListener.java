package com.wangkuo.zxb.mms.server.event.listener;

import com.wangkuo.zxb.mms.server.event.AddRegionEvent;
import com.wangkuo.zxb.mms.server.service.IRegionStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2016-05-09
 */
@Component
public class AddRegionListener implements ApplicationListener<AddRegionEvent> {

    private ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();

    @Autowired
    private IRegionStatsService regionStatsService;

    @Override
    public void onApplicationEvent(final AddRegionEvent event) {
        singleThreadExecutor.execute(new Runnable() {
            @Override
            public void run() {
                regionStatsService.createRegionStats(event.getRegionId());
            }
        });
    }
}
