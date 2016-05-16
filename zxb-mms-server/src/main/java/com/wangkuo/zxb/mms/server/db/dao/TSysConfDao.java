package com.wangkuo.zxb.mms.server.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.mms.server.db.po.TSysConf;
import com.wangkuo.zxb.mms.server.db.po.TSysConfExample;
import java.util.List;

@MyBatisDao
public interface TSysConfDao extends GenericDao<TSysConf, String, TSysConfExample> {
}