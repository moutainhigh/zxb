package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.provider.db.po.TSbDailyFee;
import com.wangkuo.zxb.lsp.provider.db.po.TSbDailyFeeCriteria;
import java.util.List;

@MyBatisDao
public interface TSbDailyFeeDao extends GenericDao<TSbDailyFee, Long, TSbDailyFeeCriteria> {
}