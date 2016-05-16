package com.wangkuo.zxb.mms.server.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.mms.server.db.po.TAreaInfo;
import com.wangkuo.zxb.mms.server.db.po.TAreaInfoExample;
import java.util.List;

@MyBatisDao
public interface TAreaInfoDao extends GenericDao<TAreaInfo, Long, TAreaInfoExample> {
}