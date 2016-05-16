package com.wangkuo.zxb.mms.server.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.mms.server.db.po.TPermission;
import com.wangkuo.zxb.mms.server.db.po.TPermissionExample;

import java.util.List;

@MyBatisDao
public interface TPermissionDao extends GenericDao<TPermission, Long, TPermissionExample> {


    /**
     * 获取用户的权限列表
     *
     * @param userId 用户id
     * @return
     */
    List<TPermission> selectListByUserId(Long userId);
}