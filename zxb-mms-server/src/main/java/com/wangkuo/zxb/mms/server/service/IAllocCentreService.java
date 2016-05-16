package com.wangkuo.zxb.mms.server.service;

import com.wangkuo.zxb.mms.server.db.po.TAllocCentre;

import java.util.List;

/**
 * @author 柳朋朋
 * @version 1.0
 * @date 2016-05-06
 */
public interface IAllocCentreService {
    //查询所有的集散中心
    List<TAllocCentre> findAll();


    List<TAllocCentre> findListByUserAndPermissionCode(Long userId, String permissionCode);
}
