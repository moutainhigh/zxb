package com.wangkuo.zxb.lsp.api.service;

import com.wangkuo.zxb.lsp.api.dto.input.LspReceiverShipperInfoInput;
import com.wangkuo.zxb.lsp.api.dto.output.LspReceiverShipperInfoOutput;
import com.wangkuo.zxb.lsp.api.dto.output.PagedList;

import java.util.List;
import java.util.Map;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2016-03-27
 */
public interface ILspReceiverShipperInfoService {
    /**
     * 收发货人分页查询
     *
     * @param input
     * @return
     */
    PagedList<LspReceiverShipperInfoOutput> getPagedList(LspReceiverShipperInfoInput input);

    /**
     * 新增收发货人
     *
     * @param input
     * @return
     */
    int addreceiverShipper(LspReceiverShipperInfoInput input);

    /**
     * 根据id查找记录
     *
     * @param id
     * @return
     */
    LspReceiverShipperInfoOutput findOneRecord(Long id);

    /**
     * 根据id修改记录
     *
     * @param input
     * @return
     */
    int updateById(LspReceiverShipperInfoInput input);

    /**
     * 根据条件修改
     *
     * @param input
     * @return
     */
    int updateByExample(LspReceiverShipperInfoInput input);

    /**
     * 根据id删除记录
     *
     * @param id
     * @return
     */
    int deleteById(Long id);

    /**
     * 设置默认
     *
     * @param id
     * @return
     */
    int setDefalut(Long id);

    /**
     * 查询服务商的收发货人信息
     * @param lspId
     * @param userName
     * @param type
     * @return
     */
    List<LspReceiverShipperInfoOutput> findReceiverShipperInfoByLspId(Long lspId,String userName,Integer type);
}