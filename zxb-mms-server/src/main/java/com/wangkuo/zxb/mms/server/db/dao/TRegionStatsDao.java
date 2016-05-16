package com.wangkuo.zxb.mms.server.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.mms.server.db.po.TRegionStats;
import com.wangkuo.zxb.mms.server.db.po.TRegionStatsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MyBatisDao
public interface TRegionStatsDao extends GenericDao<TRegionStats, Long, TRegionStatsExample> {

    List<TRegionStats> selectStatsByArea(@Param("areaId") Long areaId);

    long countTotalCustomer(@Param("areaId") Long areaId, @Param("year") int year, @Param("month") int month);
}