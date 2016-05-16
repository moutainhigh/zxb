package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.provider.db.po.TSequenceNumberGenerateResult;
import com.wangkuo.zxb.lsp.provider.db.po.TZbSequenceNumber;
import com.wangkuo.zxb.lsp.provider.db.po.TZbSequenceNumberCriteria;

import java.util.Map;

@MyBatisDao
public interface TZbSequenceNumberDao extends GenericDao<TZbSequenceNumber, Long, TZbSequenceNumberCriteria> {
    TSequenceNumberGenerateResult createSequenceNumber(Map map);
}