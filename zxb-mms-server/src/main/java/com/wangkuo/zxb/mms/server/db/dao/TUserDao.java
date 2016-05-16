package com.wangkuo.zxb.mms.server.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.mms.dto.output.UserOutPut;
import com.wangkuo.zxb.mms.server.db.po.TUser;
import com.wangkuo.zxb.mms.server.db.po.TUserExample;

import java.util.List;

@MyBatisDao
public interface TUserDao extends GenericDao<TUser, Long, TUserExample> {

    List<UserOutPut> queryUserByregionId(Long userId);
}