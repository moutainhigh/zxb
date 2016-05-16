package com.wangkuo.zxb.mms.server.service.impl;

import com.wangkuo.framework.persistence.PageableImpl;
import com.wangkuo.zxb.mms.dto.PagedList;
import com.wangkuo.zxb.mms.dto.output.UserOutPut;
import com.wangkuo.zxb.mms.dto.output.UserPermissionOutput;
import com.wangkuo.zxb.mms.dto.output.UserRegionOutput;
import com.wangkuo.zxb.mms.dto.params.AddUserParam;
import com.wangkuo.zxb.mms.dto.params.QueryUserParam;
import com.wangkuo.zxb.mms.server.db.dao.*;
import com.wangkuo.zxb.mms.server.db.po.*;
import com.wangkuo.zxb.mms.server.service.IUserService;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.*;
import java.util.Date;
import java.util.List;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2016-04-26
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private TUserDao userDao;
    @Autowired
    private TUserPermissionDao userPermissionDao;
    @Autowired
    private TUserRegionDao userRegionDao;
    @Autowired
    private TRegionDao regionDao;
    @Autowired
    private TSysConfDao sysConfDao;

    private static String PASSWORD="123456";

    @Override
    public TUser find(Long id) {
        return userDao.selectByPrimaryKey(id);
    }

    @Override
    public TUser findByAccount(String account) {

        TUserExample example = new TUserExample();
        example.createCriteria().andAccountEqualTo(account);
        List<TUser> users = userDao.selectByExample(example);
        if (null == users || users.isEmpty()) {
            return null;
        } else {
            return users.get(0);
        }
    }

    @Override
    public PagedList<TUser> findListByParams(QueryUserParam param) {
        TUserExample example = new TUserExample();

        if (StringUtils.isNotEmpty(param.getRealName())) {
            String[] realNames = StringUtils.split(param.getRealName(), ";");
            for (String realName : realNames) {
                example.or().andRealNameLike("%" + realName + "%");
            }
        }

        if (null != param.getIsAdmin()) {
            if (example.getOredCriteria().isEmpty()) {
                example.createCriteria();
            }

            for (TUserExample.Criteria criteria : example.getOredCriteria()) {
                criteria.andIsAdminEqualTo(param.getIsAdmin());
            }
        }

        example.setOrderByClause(" id desc");

        PageableImpl pageable = new PageableImpl();
        pageable.setPageNumber(param.getPageNumber());
        pageable.setPageSize(param.getPageSize());

        List<TUser> users = userDao.selectByExample(example, pageable);

        return new PagedList<>(pageable.getCount(), users);
    }

    @Override
    public int addUser(AddUserParam param, TUser operator) {

        TUserExample example = new TUserExample();
        example.createCriteria().andAccountEqualTo(param.getAccount());
        if (userDao.countByExample(example) > 0) {
            return -1;
        }

        TUser user = new TUser();
        user.setAccount(param.getAccount());
        user.setRealName(param.getRealName());
        user.setIsDeleted(Boolean.FALSE);
        user.setMobile(param.getMobile());
        user.setIsAdmin(param.getIsAdmin());

        List<TSysConf> sysConfs = sysConfDao.selectByExample(new TSysConfExample());
        String initPassword = PASSWORD;
        for (TSysConf sysConf : sysConfs) {
            if ("password".equals(sysConf.getCode())) {//用户初始密码
                initPassword = sysConf.getValue();
            }
        }
        user.setPassword(encodePassword(initPassword));//密码从系统参数中读取
        user.setCreatedTime(new Date());
        user.setCreatedUser(operator.getRealName());
        user.setCreatedUserId(operator.getId());
        userDao.insertSelective(user);
        return 1;
    }

    @Override
    public boolean validatePassword(TUser user, String password) {
        Assert.notNull(user);
        return StringUtils.isNotEmpty(password) && StringUtils.equals(user.getPassword(), encodePassword(password));
    }

    @Override
    public int resetPassword(Long userId) {
        Assert.notNull(userId);
        TUser user= userDao.selectByPrimaryKey(userId);
        if(user==null) return 0;
        TUser updateUser=new TUser();
        updateUser.setId(user.getId());
        List<TSysConf> sysConfs = sysConfDao.selectByExample(new TSysConfExample());
        String initPassword = PASSWORD;
        for (TSysConf sysConf : sysConfs) {
            if ("password".equals(sysConf.getCode())) {//用户初始密码
                initPassword = sysConf.getValue();
            }
        }
        updateUser.setPassword(encodePassword(initPassword));
        userDao.updateByPrimaryKeySelective(updateUser);
        return 1;
    }

    @Override
    public int removeUser(Long userId) {
        Assert.notNull(userId);
        TUser user= userDao.selectByPrimaryKey(userId);
        if(user==null) return 0;
        TUser updateUser=new TUser();
        updateUser.setId(user.getId());
        updateUser.setIsDeleted(true);
        userDao.updateByPrimaryKeySelective(updateUser);
        return 1;
    }


    private String encodePassword(String password) {
        return DigestUtils.md5Hex(password);
    }

    @Override
    public List<UserOutPut> findListByregionId(Long regionId) {
        List<UserOutPut> list = userDao.queryUserByregionId(regionId);
        return list;
    }

    @Override
    public List<UserPermissionOutput> viewUserPermission(Long userId) {
        List<UserPermissionOutput> lstOut=new LinkedList<>();

        TUserPermissionExample userPermissionExample=new TUserPermissionExample();
        userPermissionExample.createCriteria().andUserIdEqualTo(userId);
        List<TUserPermission> lstUserPermission=userPermissionDao.selectByExample(userPermissionExample);
        if(lstUserPermission!=null)
        {
            for(TUserPermission up:lstUserPermission)
            {
                UserPermissionOutput output=new UserPermissionOutput();
                output.setPermissionId(up.getPermissionId());

                List<UserRegionOutput> lstUserRegionOutput=new LinkedList<>();

                TUserRegionExample userRegionExample=new TUserRegionExample();
                userRegionExample.createCriteria().andUserIdEqualTo(up.getUserId())
                        .andPermissionIdEqualTo(up.getPermissionId());
                List<TUserRegion> lstUserRegion=userRegionDao.selectByExample(userRegionExample);
                if(lstUserRegion!=null)
                {
                    for(TUserRegion re:lstUserRegion)
                    {
                        TRegion region=regionDao.selectByPrimaryKey(re.getRegionId());
                        UserRegionOutput userRegionOutput=new UserRegionOutput();
                        userRegionOutput.setPermissionId(up.getPermissionId());
                        userRegionOutput.setUserId(up.getUserId());
                        userRegionOutput.setRegionId(re.getRegionId());
                        userRegionOutput.setAllocCentre(region == null ? "" : region.getAllocCentre());
                        userRegionOutput.setAllocCentreId(region == null ? 0 : region.getAllocCentreId());
                        userRegionOutput.setRegionname(region == null ? "" : region.getName());
                        lstUserRegionOutput.add(userRegionOutput);
                    }
                }
                output.setListUserRegion(lstUserRegionOutput);
                lstOut.add(output);
            }
        }
        return lstOut;
    }

    @Override
    public int savePermision(Long userId, HashMap<Long , List<TUserRegion>> map) {
        //首先删除当前用户的权限
        TUserPermissionExample userPermissionExample=new TUserPermissionExample();
        userPermissionExample.createCriteria().andUserIdEqualTo(userId);
        userPermissionDao.deleteByExample(userPermissionExample);

        TUserRegionExample userRegionExample=new TUserRegionExample();
        userRegionExample.createCriteria().andUserIdEqualTo(userId);
        userRegionDao.deleteByExample(userRegionExample);

        //新增记录

        for (Map.Entry<Long, List<TUserRegion>> entry : map.entrySet()) {

            TUserPermission userPermission=new TUserPermission();
            userPermission.setUserId(userId);
            userPermission.setPermissionId(entry.getKey());
            userPermissionDao.insertSelective(userPermission);
            if(entry.getValue()!=null) {
                for (TUserRegion region : entry.getValue())
                {
                    userRegionDao.insertSelective(region);
                }
            }
        }
        return 1;
    }
}
