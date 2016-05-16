package com.wangkuo.zxb.mms.server.service;

import com.wangkuo.zxb.mms.server.db.po.TPermission;
import com.wangkuo.zxb.mms.server.db.po.TUser;

import java.util.List;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2016-04-25
 */
public interface IPermissionService {


    List<TPermission> findListByUser(TUser user);


    List<TPermission> findAll();
}
