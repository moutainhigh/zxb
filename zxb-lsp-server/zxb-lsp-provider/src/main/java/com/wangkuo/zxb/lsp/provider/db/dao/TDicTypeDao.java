package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.provider.db.po.TDicType;
import com.wangkuo.zxb.lsp.provider.db.po.TDicTypeCriteria;

@MyBatisDao
public interface TDicTypeDao extends GenericDao<TDicType, Long, TDicTypeCriteria> {
}