package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.provider.db.po.TLspUserCenterRelation;
import com.wangkuo.zxb.lsp.provider.db.po.TLspUserCenterRelationCriteria;
import java.util.List;

@MyBatisDao
public interface TLspUserCenterRelationDao extends GenericDao<TLspUserCenterRelation, Long, TLspUserCenterRelationCriteria> {
}