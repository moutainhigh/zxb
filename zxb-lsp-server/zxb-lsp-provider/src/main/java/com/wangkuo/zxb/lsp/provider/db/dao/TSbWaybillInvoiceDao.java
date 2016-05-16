package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.provider.db.po.TSbWaybillInvoice;
import com.wangkuo.zxb.lsp.provider.db.po.TSbWaybillInvoiceCriteria;
import java.util.List;

@MyBatisDao
public interface TSbWaybillInvoiceDao extends GenericDao<TSbWaybillInvoice, Long, TSbWaybillInvoiceCriteria> {
}