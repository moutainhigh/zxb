package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.provider.db.po.TFbBenchmarkPrice;
import com.wangkuo.zxb.lsp.provider.db.po.TFbBenchmarkPriceCriteria;
import java.util.List;

@MyBatisDao
public interface TFbBenchmarkPriceDao extends GenericDao<TFbBenchmarkPrice, Long, TFbBenchmarkPriceCriteria> {

    /**
     * 查询单个基准价
     * @param Criteria
     * @return
     */
    TFbBenchmarkPrice selectFbBenchmarkPrice(TFbBenchmarkPriceCriteria Criteria);
}