package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.provider.db.po.TSbGoodCategoryAllot;
import com.wangkuo.zxb.lsp.provider.db.po.TSbGoodCategoryAllotCriteria;
import java.util.List;

@MyBatisDao
public interface TSbGoodCategoryAllotDao extends GenericDao<TSbGoodCategoryAllot, Long, TSbGoodCategoryAllotCriteria> {

    TSbGoodCategoryAllot selectSbGoodCategoryAllot(TSbGoodCategoryAllotCriteria criteria);
}