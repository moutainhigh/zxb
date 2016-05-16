package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.provider.db.po.TLspWalletBalanceLog;
import com.wangkuo.zxb.lsp.provider.db.po.TLspWalletBalanceLogCriteria;
import java.util.List;

@MyBatisDao
public interface TLspWalletBalanceLogDao extends GenericDao<TLspWalletBalanceLog, Long, TLspWalletBalanceLogCriteria> {
}