package com.wangkuo.zxb.mms.server.job;

import com.wangkuo.zxb.mms.server.service.IRegionStatsService;
import org.springframework.stereotype.Component;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2016-05-09
 */
@Component
public class CreateRegionStatsJob {

    private IRegionStatsService regionStatsService;

    public void run() {
        regionStatsService.createAllRegionStats();
    }
}
