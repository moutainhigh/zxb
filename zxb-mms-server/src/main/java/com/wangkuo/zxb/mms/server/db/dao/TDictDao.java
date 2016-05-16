package com.wangkuo.zxb.mms.server.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.mms.server.db.po.TDict;
import com.wangkuo.zxb.mms.server.db.po.TDictExample;
import java.util.List;

@MyBatisDao
public interface TDictDao extends GenericDao<TDict, String, TDictExample> {
}