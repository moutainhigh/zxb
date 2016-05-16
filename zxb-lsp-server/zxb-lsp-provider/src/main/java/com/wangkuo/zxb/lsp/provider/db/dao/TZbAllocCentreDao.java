package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.provider.db.po.TZbAllocCentre;
import com.wangkuo.zxb.lsp.provider.db.po.TZbAllocCentreCriteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MyBatisDao
public interface TZbAllocCentreDao extends GenericDao<TZbAllocCentre, Long, TZbAllocCentreCriteria> {

    List<TZbAllocCentre> queryAllocCentreByLspId(Long lspId);
}