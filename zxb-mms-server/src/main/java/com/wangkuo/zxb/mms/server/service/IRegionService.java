package com.wangkuo.zxb.mms.server.service;

import com.wangkuo.zxb.mms.dto.PagedList;
import com.wangkuo.zxb.mms.dto.output.RegionOutPut;
import com.wangkuo.zxb.mms.dto.output.UserOutPut;
import com.wangkuo.zxb.mms.dto.params.PageParam;
import com.wangkuo.zxb.mms.dto.params.RegionParam;
import com.wangkuo.zxb.mms.server.db.po.TRegion;
import com.wangkuo.zxb.mms.server.db.po.TUser;

import java.util.List;

/**
 * @author 柳朋朋
 * @version 1.0
 * @date 2016-05-05
 */
public interface IRegionService {

    /**
     * 新增区域
     *
     * @param param
     * @param operator
     * @return
     */
    int addRegion(RegionParam param, TUser operator);

    /**
     * 判断区域是否存在
     *
     * @param param
     * @return
     */
    boolean existRegion(RegionParam param);

    /**
     * 注销区域
     *
     * @param param
     * @return
     */
    int transferRegion(RegionParam param, TUser operator);

    /**
     * 根据集散中心id 查询所有区域
     *
     * @param allocCentreId
     * @return
     */
    List<TRegion> findByAllocCentreId(Long allocCentreId);

    /**
     * 根据集散中心id 查询区域(不包含已有区域)
     *
     * @param allocCentreId
     * @return
     */
    List<TRegion> findByAllocCentreId(Long allocCentreId, Long regionId);

    /**
     * 区域表格信息
     *
     * @return
     */
    PagedList<RegionOutPut> findList(PageParam param);

    /**
     * 查询所有区域
     *
     * @return
     */
    List<TRegion> findAll();


    TRegion findById(Long id);

    /**
     * 根据区域id 查找外客户接受人
     *
     * @param regionId
     * @return
     */
    List<UserOutPut> findUserByAndRegionId(Long regionId);


    /**
     * 根据用户id和权限代码获取区域
     *
     * @param userId
     * @param permissionCode
     * @return
     */
    List<TRegion> findByUserAndPermissionAndAllocCentre(Long userId, String permissionCode, Long allocCentreId);
}
