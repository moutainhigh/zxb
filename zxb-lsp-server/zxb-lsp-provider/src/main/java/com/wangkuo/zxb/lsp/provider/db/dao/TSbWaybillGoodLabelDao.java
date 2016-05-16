package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.provider.db.po.TSbWaybillGoodLabel;
import com.wangkuo.zxb.lsp.provider.db.po.TSbWaybillGoodLabelCriteria;
import java.util.List;

@MyBatisDao
public interface TSbWaybillGoodLabelDao extends GenericDao<TSbWaybillGoodLabel, Long, TSbWaybillGoodLabelCriteria> {
}