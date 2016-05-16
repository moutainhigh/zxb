package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.api.dto.input.FbBenchmarkPriceSectionInput;
import com.wangkuo.zxb.lsp.api.dto.output.FbBenchmarkPriceSectionOutput;
import com.wangkuo.zxb.lsp.provider.db.po.TFbBenchmarkPriceSection;
import com.wangkuo.zxb.lsp.provider.db.po.TFbBenchmarkPriceSectionCriteria;
import java.util.List;

@MyBatisDao
public interface TFbBenchmarkPriceSectionDao extends GenericDao<TFbBenchmarkPriceSection, Long, TFbBenchmarkPriceSectionCriteria> {
    /**
     * 查询单个成本价区间
     * @param criteria
     * @return
     */
    TFbBenchmarkPriceSection selectFbBenchmarkPriceSection(TFbBenchmarkPriceSectionCriteria criteria);

    List<FbBenchmarkPriceSectionOutput> selectByAllocCenterIdAndCountryId(FbBenchmarkPriceSectionInput input);
}