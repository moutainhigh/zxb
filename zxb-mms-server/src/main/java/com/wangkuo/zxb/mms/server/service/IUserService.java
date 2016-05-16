package com.wangkuo.zxb.mms.server.service;

import com.wangkuo.zxb.mms.dto.PagedList;
import com.wangkuo.zxb.mms.dto.output.UserOutPut;
import com.wangkuo.zxb.mms.dto.output.UserPermissionOutput;
import com.wangkuo.zxb.mms.dto.output.UserRegionOutput;
import com.wangkuo.zxb.mms.dto.params.AddUserParam;
import com.wangkuo.zxb.mms.dto.params.QueryUserParam;
import com.wangkuo.zxb.mms.server.db.po.TUser;
import com.wangkuo.zxb.mms.server.db.po.TUserRegion;

import java.util.HashMap;
import java.util.List;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2016-04-26
 */
public interface IUserService {

    /**
     * 获取用户
     *
     * @param id 用户id
     * @return
     */
    TUser find(Long id);


    /**
     * 获取用户
     *
     * @param account 登录帐号
     * @return
     */
    TUser findByAccount(String account);


    PagedList<TUser> findListByParams(QueryUserParam param);

    /**
     * 添加用户
     *
     * @param param    添加用户参数
     * @param operator 操作人
     * @return
     */
    int addUser(AddUserParam param, TUser operator);

    /**
     * 验证密码
     *
     * @param user
     * @param password
     * @return
     */
    boolean validatePassword(TUser user, String password);

    /**
     * 重置密码
     * @param userId
     * @return
     */
    int resetPassword(Long userId);

    /**
     * 注销用户
     * @param userId
     * @return
     */
    int removeUser(Long userId);
    /**
     * 查询同区域人
     * @return
     */
    List<UserOutPut> findListByregionId(Long userId);

    /**
     * 查看用户权限
     * @param userId
     * @return
     */
    List<UserPermissionOutput> viewUserPermission(Long userId);
    /**
     * 保存用户权限
     * @param userId
     * @param map
     * @return
     */
    int savePermision(Long userId,HashMap<Long,List<TUserRegion>> map);

}
