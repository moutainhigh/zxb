package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.PageableImpl;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.api.dto.input.QueryNoStowageBillInput;
import com.wangkuo.zxb.lsp.api.dto.input.QueryWaybillConditionInput;
import com.wangkuo.zxb.lsp.api.dto.output.WaybillAndFeeOutput;
import com.wangkuo.zxb.lsp.api.dto.output.WaybillOutput;
import com.wangkuo.zxb.lsp.provider.db.po.TSbWaybill;
import com.wangkuo.zxb.lsp.provider.db.po.TSbWaybillCriteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MyBatisDao
public interface TSbWaybillDao extends GenericDao<TSbWaybill, Long, TSbWaybillCriteria> {
    /**
     * 查询未配载运单
     *
     * @param input
     * @return
     */
    List<WaybillOutput> selectNoStowageBillList(QueryNoStowageBillInput input);


    /**
     * 获取运单
     *
     * @param ids
     * @return
     */
    List<WaybillOutput> selectStowageBillList(List<Long> ids);


    /**
     * 运单查询
     *
     * @param input
     * @param pageable
     * @return
     */
    List<WaybillAndFeeOutput> queryWaybillPagedList(@Param("condition") QueryWaybillConditionInput input, @Param("page") PageableImpl pageable);
}