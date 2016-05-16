package com.wangkuo.zxb.mms.server.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.mms.server.db.po.TAttachmentConf;
import com.wangkuo.zxb.mms.server.db.po.TAttachmentConfExample;
import java.util.List;

@MyBatisDao
public interface TAttachmentConfDao extends GenericDao<TAttachmentConf, Long, TAttachmentConfExample> {
}