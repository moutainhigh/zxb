package com.wangkuo.zxb.lsp.api.service;


import com.wangkuo.zxb.lsp.api.dto.input.LspUserAttachmentInput;
import com.wangkuo.zxb.lsp.api.dto.input.LspUserCarInput;
import com.wangkuo.zxb.lsp.api.dto.input.LspUserCenterRelationInput;
import com.wangkuo.zxb.lsp.api.dto.input.LspUserInput;
import com.wangkuo.zxb.lsp.api.dto.output.*;

import java.util.List;

/**
 * @author wjh
 * @version 1.0
 * @date 2016-03-29
 */
public interface ILspUserService {
    /**
     * 新增用户
     * @param userInput
     * @return
     */
    LspUserInput addLspUser(LspUserInput userInput);

    /**
     * 修改用户
     * @param input
     * @return
     */
    int updateProviderById(LspUserInput input);

    /**
     * 记录上次登录时间
     *
     * @param id
     */
    void recordLastLoginDate(Long id);

    /**
     * 根据账号或者密码查找用户
     * @param userInput
     * @return
     */
    LspUserOutput findUserByNameOrPwd(LspUserInput userInput);

    /**
     * 修改（或绑定）手机
     * @param userInput
     * @return
     */
    int updateBindMobileById(LspUserInput userInput);

    /**
     * 判断输入的原绑定手机号码是否正确
     * @param userInput
     * @return
     */
    boolean judgeBindMobile(LspUserInput userInput);

    /**
     * 判断手机号码是否已经绑定
     * @param bindMobile
     * @return
     */
    boolean isBindMobileExist(String bindMobile);

    /**
     * 分页查询服务商列表
     * @param input
     * @return
     */
    PagedList<LspUserOutput> listProvider(LspUserInput input);

    /**
     * 冻结服务商
     * @param id 服务商ID
     * @return
     */
    boolean block(Long id);

    /**
     * 解冻服务商
     * @param id
     * @return
     */
    boolean unblock(Long id);

    /**
     * 获取一个服务商的信息
     * @param id
     * @return
     */
    LspUserOutput findOneProviderById(Long id);

    /**
     * 查询服务商的车辆
     * @param id
     * @return
     */
    List<LspUserCarOutput> findProviderCarsById(Long id);

    /**
     * 删除车辆
     * @param id
     * @return
     */
    int deleteProviderCarById(Long id);

    /**
     * 创建服务商车辆
     * @param input
     * @return
     */
    int createProviderCar(LspUserCarInput input);

    /**
     * 加载集散关系
     * @param id
     * @return
     */
    List<LspUserCenterRelationOutput> loadCenterRelationByProviderId(Long id);

    /**
     * 更新集散关系
     * @param relationInputs
     * @param providerId
     * @return
     */
    int insertRelations(List<LspUserCenterRelationInput> relationInputs, Long providerId);

    /**
     * 查找附件
     * @param providerId 服务商ID
     * @return
     */
    List<LspUserAttachmentOutput> imageList(Long providerId);

    /**
     * 上传附件
     * @param input
     * @return
     */
    int addLspUserImage(LspUserAttachmentInput input);

    /**
     * 删除附件
     * @param imageId
     * @return
     */
    int deleteProviderImage(Long imageId);

    /**
     * 查找文件
     * @param providerId 服务商ID
     * @return
     */
    List<LspUserAttachmentOutput> providerFileList(Long providerId);

    /**
     * 删除附件
     * @param ids
     * @return
     */
    int deleteProviderFiles(Long[] ids);
}