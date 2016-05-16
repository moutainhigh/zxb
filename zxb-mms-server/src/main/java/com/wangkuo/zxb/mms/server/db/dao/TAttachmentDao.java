package com.wangkuo.zxb.mms.server.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.mms.server.db.po.TAttachment;
import com.wangkuo.zxb.mms.server.db.po.TAttachmentExample;
import java.util.List;

@MyBatisDao
public interface TAttachmentDao extends GenericDao<TAttachment, Long, TAttachmentExample> {
}