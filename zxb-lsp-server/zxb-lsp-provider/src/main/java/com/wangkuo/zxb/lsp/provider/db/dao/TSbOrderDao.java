package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.api.dto.output.OrderPaySuccessOutput;
import com.wangkuo.zxb.lsp.provider.db.po.TSbOrder;
import com.wangkuo.zxb.lsp.provider.db.po.TSbOrderCriteria;
import java.util.List;

@MyBatisDao
public interface TSbOrderDao extends GenericDao<TSbOrder, Long, TSbOrderCriteria> {
    OrderPaySuccessOutput selectOrderAndWaybill(Long id);
}