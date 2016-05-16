package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.Pageable;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.api.dto.input.QueryLspReceiveInput;
import com.wangkuo.zxb.lsp.api.dto.output.LspReceiveOutput;
import com.wangkuo.zxb.lsp.provider.db.po.TSbWaybillReceive;
import com.wangkuo.zxb.lsp.provider.db.po.TSbWaybillReceiveCriteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MyBatisDao
public interface TSbWaybillReceiveDao extends GenericDao<TSbWaybillReceive, Long, TSbWaybillReceiveCriteria> {

    /**
     * 查询回单信息
     * @param receiveCriteria
     * @return
     */
    TSbWaybillReceive selectWaybillReceive(TSbWaybillReceiveCriteria receiveCriteria);

    List<LspReceiveOutput> listLspReceive(@Param("input") QueryLspReceiveInput output, @Param("page") Pageable pageable);

}