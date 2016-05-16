package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.provider.db.po.TSbAreaInfo;
import com.wangkuo.zxb.lsp.provider.db.po.TSbAreaInfoCriteria;

@MyBatisDao
public interface TSbAreaInfoDao extends GenericDao<TSbAreaInfo, Long, TSbAreaInfoCriteria> {

    /**
     * 查询单个地址信息
     * @param criteria
     * @return
     */
    TSbAreaInfo selectSbAreaInfo(TSbAreaInfoCriteria criteria);
}