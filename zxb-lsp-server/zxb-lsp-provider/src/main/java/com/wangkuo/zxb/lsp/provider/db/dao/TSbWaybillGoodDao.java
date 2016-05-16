package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.provider.db.po.TSbWaybillGood;
import com.wangkuo.zxb.lsp.provider.db.po.TSbWaybillGoodCriteria;
import java.util.List;

@MyBatisDao
public interface TSbWaybillGoodDao extends GenericDao<TSbWaybillGood, Long, TSbWaybillGoodCriteria> {
}