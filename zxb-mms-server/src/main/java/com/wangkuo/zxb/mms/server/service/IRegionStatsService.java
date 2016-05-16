package com.wangkuo.zxb.mms.server.service;

import com.wangkuo.zxb.mms.dto.PagedList;
import com.wangkuo.zxb.mms.dto.params.QueryRegionStatsParam;
import com.wangkuo.zxb.mms.server.db.po.TRegionStats;
import com.wangkuo.zxb.mms.server.db.po.TUser;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2016-05-05
 */
public interface IRegionStatsService {

    PagedList<TRegionStats> list(QueryRegionStatsParam param, TUser user);


    /**
     * 创建全部营销区域统计
     *
     * @return
     */
    void createAllRegionStats();

    /**
     * 创建营销区域统计
     *
     * @param regionId
     * @return
     */
    void createRegionStats(Long regionId);
}
