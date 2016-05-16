package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.provider.db.po.TBranch;
import com.wangkuo.zxb.lsp.provider.db.po.TBranchExample;

@MyBatisDao
public interface TBranchDao extends GenericDao<TBranch, Long, TBranchExample> {
}