package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.provider.db.po.TLspWaybillReceiveRelation;
import com.wangkuo.zxb.lsp.provider.db.po.TLspWaybillReceiveRelationCriteria;
import java.util.List;

@MyBatisDao
public interface TLspWaybillReceiveRelationDao extends GenericDao<TLspWaybillReceiveRelation, Long, TLspWaybillReceiveRelationCriteria> {
}