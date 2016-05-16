package com.wangkuo.zxb.mms.server.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.mms.server.db.po.TUserRegion;
import com.wangkuo.zxb.mms.server.db.po.TUserRegionExample;
import java.util.List;

@MyBatisDao
public interface TUserRegionDao extends GenericDao<TUserRegion, Long, TUserRegionExample> {
}