package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.provider.db.po.TSbWaybillFee;
import com.wangkuo.zxb.lsp.provider.db.po.TSbWaybillFeeCriteria;
import java.util.List;

@MyBatisDao
public interface TSbWaybillFeeDao extends GenericDao<TSbWaybillFee, Long, TSbWaybillFeeCriteria> {
}