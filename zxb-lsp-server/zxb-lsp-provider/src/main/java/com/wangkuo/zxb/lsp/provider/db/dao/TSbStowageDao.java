package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.Pageable;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.api.dto.input.QueryStowageListInput;
import com.wangkuo.zxb.lsp.provider.db.po.TSbStowage;
import com.wangkuo.zxb.lsp.provider.db.po.TSbStowageCriteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MyBatisDao
public interface TSbStowageDao extends GenericDao<TSbStowage, Long, TSbStowageCriteria> {

    List<TSbStowage> selectListByCondition(@Param("input") QueryStowageListInput input, @Param("page") Pageable pageable);

    TSbStowage selectStowageByWaybillId(Long waybillId);
}