package com.wangkuo.zxb.lsp.provider.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.lsp.provider.db.po.TSbOtherFileAttachment;
import com.wangkuo.zxb.lsp.provider.db.po.TSbOtherFileAttachmentCriteria;
import java.util.List;

@MyBatisDao
public interface TSbOtherFileAttachmentDao extends GenericDao<TSbOtherFileAttachment, Long, TSbOtherFileAttachmentCriteria> {
}