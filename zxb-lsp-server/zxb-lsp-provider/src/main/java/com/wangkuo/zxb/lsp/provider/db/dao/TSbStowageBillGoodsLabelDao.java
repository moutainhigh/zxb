package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.provider.db.po.TSbStowageBillGoodsLabel;
import com.wangkuo.zxb.lsp.provider.db.po.TSbStowageBillGoodsLabelCriteria;

import java.util.List;

@MyBatisDao
public interface TSbStowageBillGoodsLabelDao extends GenericDao<TSbStowageBillGoodsLabel, Long, TSbStowageBillGoodsLabelCriteria> {


    /**
     * 获取配载单下的运单id
     *
     * @param stowageBillId 配载单id
     * @return
     */
    List<Long> selectListByStowageBillId(Long stowageBillId);


}