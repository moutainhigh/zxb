package com.wangkuo.zxb.mms.server.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.mms.server.db.po.TDictData;
import com.wangkuo.zxb.mms.server.db.po.TDictDataExample;
import java.util.List;

@MyBatisDao
public interface TDictDataDao extends GenericDao<TDictData, Long, TDictDataExample> {
}