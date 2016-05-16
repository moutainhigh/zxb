package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.provider.db.po.TSbWaybillFeeChangeLog;
import com.wangkuo.zxb.lsp.provider.db.po.TSbWaybillFeeChangeLogCriteria;
import java.util.List;

@MyBatisDao
public interface TSbWaybillFeeChangeLogDao extends GenericDao<TSbWaybillFeeChangeLog, Long, TSbWaybillFeeChangeLogCriteria> {
}