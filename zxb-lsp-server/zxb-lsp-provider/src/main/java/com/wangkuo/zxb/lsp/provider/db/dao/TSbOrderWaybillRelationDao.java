package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.provider.db.po.TSbOrderWaybillRelation;
import com.wangkuo.zxb.lsp.provider.db.po.TSbOrderWaybillRelationCriteria;
import java.util.List;

@MyBatisDao
public interface TSbOrderWaybillRelationDao extends GenericDao<TSbOrderWaybillRelation, Long, TSbOrderWaybillRelationCriteria> {
}