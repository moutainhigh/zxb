package com.wangkuo.zxb.mms.server.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.mms.server.db.po.TUserPermission;
import com.wangkuo.zxb.mms.server.db.po.TUserPermissionExample;
import java.util.List;

@MyBatisDao
public interface TUserPermissionDao extends GenericDao<TUserPermission, Long, TUserPermissionExample> {
}