package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.provider.db.po.TSbGoodCategoryPriceSection;
import com.wangkuo.zxb.lsp.provider.db.po.TSbGoodCategoryPriceSectionCriteria;
import java.util.List;

@MyBatisDao
public interface TSbGoodCategoryPriceSectionDao extends GenericDao<TSbGoodCategoryPriceSection, Long, TSbGoodCategoryPriceSectionCriteria> {

    TSbGoodCategoryPriceSection selectSbGoodCategoryPriceSection(TSbGoodCategoryPriceSectionCriteria criteria);
}