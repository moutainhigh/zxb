package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.PageableImpl;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.api.dto.input.QueryLspWaybillChangeInput;
import com.wangkuo.zxb.lsp.api.dto.output.LspWaybillChangeOutput;
import com.wangkuo.zxb.lsp.provider.db.po.TLspWaybillChange;
import com.wangkuo.zxb.lsp.provider.db.po.TLspWaybillChangeCriteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MyBatisDao
public interface TLspWaybillChangeDao extends GenericDao<TLspWaybillChange, Long, TLspWaybillChangeCriteria> {

     List<LspWaybillChangeOutput> selectListByCondition(@Param("input") QueryLspWaybillChangeInput input,@Param("page") PageableImpl pageable);
}