package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.Pageable;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.api.dto.input.SbGoodCategoryInput;
import com.wangkuo.zxb.lsp.api.dto.output.SbGoodCategoryOutput;
import com.wangkuo.zxb.lsp.provider.db.po.TSbGoodCategory;
import com.wangkuo.zxb.lsp.provider.db.po.TSbGoodCategoryCriteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MyBatisDao
public interface TSbGoodCategoryDao extends GenericDao<TSbGoodCategory, Long, TSbGoodCategoryCriteria> {
    /**
     * 品类申请查询
     *
     * @param input
     * @return
     */
    List<SbGoodCategoryOutput> findCategorysByCondition(@Param("input") SbGoodCategoryInput input, @Param("page") Pageable page);
    // int findCategorysByConditionCount(SbGoodCategoryInput input);

    List<SbGoodCategoryOutput> findDetailByAllotId(Long allotId);

    /**
     * 品类查询
     *
     * @param input
     * @param page
     * @return
     */
    List<SbGoodCategoryOutput> findCategoryBasicPrice(@Param("input") SbGoodCategoryInput input, @Param("page") Pageable page);

    List<SbGoodCategoryOutput> findCategoryPrice(@Param("input") SbGoodCategoryInput input, @Param("page") Pageable page);

    List<SbGoodCategoryOutput> findCategoryByLspId(@Param("input") SbGoodCategoryInput input);
}