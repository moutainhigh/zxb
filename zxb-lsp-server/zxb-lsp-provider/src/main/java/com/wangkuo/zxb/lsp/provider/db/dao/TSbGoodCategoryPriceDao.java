package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.provider.db.po.TSbGoodCategoryPrice;
import com.wangkuo.zxb.lsp.provider.db.po.TSbGoodCategoryPriceCriteria;
import java.util.List;

@MyBatisDao
public interface TSbGoodCategoryPriceDao extends GenericDao<TSbGoodCategoryPrice, Long, TSbGoodCategoryPriceCriteria> {
    TSbGoodCategoryPrice selectSbGoodCategoryPrice(TSbGoodCategoryPriceCriteria criteria);
}