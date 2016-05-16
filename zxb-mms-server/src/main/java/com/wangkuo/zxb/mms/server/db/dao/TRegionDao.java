package com.wangkuo.zxb.mms.server.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.mms.dto.output.RegionOutPut;
import com.wangkuo.zxb.mms.dto.output.UserOutPut;
import com.wangkuo.zxb.mms.server.db.po.TRegion;
import com.wangkuo.zxb.mms.server.db.po.TRegionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MyBatisDao
public interface TRegionDao extends GenericDao<TRegion, Long, TRegionExample> {
    /**
     * 查询表格数据
     *
     * @return
     */
    List<RegionOutPut> findData(@Param(value = "begin") Integer begin, @Param(value = "end") Integer end);

    List<UserOutPut> queryRegionListByUserId(Long userId);


    List<TRegion> selectListByUserAndPermissionAndAllocCentre(@Param("userId") Long userId, @Param("permissionCode") String permissionCode, @Param("allocCentreId") Long allocCentreId);

    /**
     * 根据区域id 查找外客户接受人
     * @param regionId
     * @return
     */
    List<UserOutPut> findUserByAndRegionId(@Param("regionId") Long regionId);
}