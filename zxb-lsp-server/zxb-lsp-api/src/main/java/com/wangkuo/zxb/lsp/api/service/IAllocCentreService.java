package com.wangkuo.zxb.lsp.api.service;

import com.wangkuo.zxb.lsp.api.dto.output.AllocCentreOutput;

import java.util.List;

/**
 * 集散中心服务
 *
 * @author 林守锦
 * @version 1.0
 * @date 2016-04-09
 */
public interface IAllocCentreService {


    /**
     * 获取全部集散中心
     *
     * @return
     */
    List<AllocCentreOutput> findAll();

    /**
     * 查询服务商所属集散
     *
     * @param lspId
     * @return
     */
    List<AllocCentreOutput> findAllocCentreByLspId(Long lspId);


    /**
     * 查询服务商的集散列表
     *
     * @param lspId 服务商id
     * @return 已经入驻返回关联集散, 未入驻返回全部集散
     */
    List<AllocCentreOutput> findAllocCentreByLspIdWithDefault(Long lspId);
}
