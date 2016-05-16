package com.wangkuo.zxb.mms.server.service.impl;

import com.wangkuo.zxb.mms.server.db.dao.TPermissionDao;
import com.wangkuo.zxb.mms.server.db.po.TPermission;
import com.wangkuo.zxb.mms.server.db.po.TPermissionExample;
import com.wangkuo.zxb.mms.server.db.po.TUser;
import com.wangkuo.zxb.mms.server.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2016-04-25
 */
@Service
public class PermissionServiceImpl implements IPermissionService {

    @Autowired
    private TPermissionDao permissionDao;

    @Override
    public List<TPermission> findListByUser(TUser user) {

        Assert.notNull(user);

        if (user.getIsAdmin()) {
            return findAll();
        }


        return permissionDao.selectListByUserId(user.getId());
    }

    @Override
    public List<TPermission> findAll() {
        TPermissionExample example = new TPermissionExample();
        return permissionDao.selectByExample(example);
    }
}
