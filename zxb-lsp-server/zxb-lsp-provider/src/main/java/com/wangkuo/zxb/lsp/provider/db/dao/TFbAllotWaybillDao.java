package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.provider.db.po.TFbAllotWaybill;
import com.wangkuo.zxb.lsp.provider.db.po.TFbAllotWaybillCriteria;

@MyBatisDao
public interface TFbAllotWaybillDao extends GenericDao<TFbAllotWaybill, Long, TFbAllotWaybillCriteria> {

    /**
     * 运单管理分理信息
     * @param criteria
     * @return
     */
    TFbAllotWaybill selectAllotWaybill(TFbAllotWaybillCriteria criteria);
}