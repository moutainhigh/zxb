package com.wangkuo.zxb.lsp.api.service;

import com.wangkuo.zxb.lsp.api.dto.input.CalculateFeeInput;
import com.wangkuo.zxb.lsp.api.dto.input.ChangeWaybillInput;
import com.wangkuo.zxb.lsp.api.dto.input.QueryWaybillConditionInput;
import com.wangkuo.zxb.lsp.api.dto.input.StowageInput;
import com.wangkuo.zxb.lsp.api.dto.input.WaybillInput;
import com.wangkuo.zxb.lsp.api.dto.input.*;
import com.wangkuo.zxb.lsp.api.dto.output.*;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by chaizf on 2016/3/30.
 */
public interface IWaybillService {

    /**
     * 新增运单
     *
     * @param waybillInput
     * @return
     */
    WaybillInput addWaybill(WaybillInput waybillInput, SbWaybillGoodInput goodInput,SbWaybillFeeInput feeInput, FbAllotWaybillInput allot,SbWaybillInvoiceInput invoice);

    /**
     * 按id,查询运单信息
     *
     * @param id
     * @return
     */
    WaybillOutput getOneWaybill(Long id);

    /**
     * 运单分页查询
     *
     * @param input
     * @param orderByClause
     * @return
     */
    PagedList<WaybillOutput> getPagedList(WaybillInput input, String orderByClause);

    /**
     * 查询未配载运单
     *
     * @param input
     * @return
     */
    List<WaybillOutput> selectNoStowageBillList(QueryNoStowageBillInput input);

    /**
     * 查询已配载信息
     *
     * @param stowageId 配置单id
     * @return
     */
    List<WaybillOutput> selectStowageBillList(Long stowageId);

    /**
     * 运单列表信息查询
     *
     * @param input
     * @return
     */
    PagedList<WaybillAndFeeOutput> queryWaybillPagedList(QueryWaybillConditionInput input);

    /**
     * 计算结算价
     * @param input
     */
    CalculateFeeOutput waybillBalanceFee(CalculateFeeInput input);

    BigDecimal calculateEnterDepotFee(CalculateFeeInput input);

    BigDecimal calculateUpstairsFee(CalculateFeeInput input);

    BigDecimal calculateUnloadFee(CalculateFeeInput input);

    /**
     * 改单
     * @param input
     * @return
     */
    int changeWaybill(ChangeWaybillInput input);


    /**
     * 根据运单id查询运单轨迹
     * @param waybillId
     * @return
     */
    List<WaybillTrackOutput> selectListByWaybillId(Long waybillId);

    /**
     * 根据运单id查询运单货物信息
     * @param waybillId
     * @return
     */
    WaybillGoodOutput selectGoodByWaybillId(Long waybillId);

    /**
     * 根据运单id查询运单费用信息
     * @param waybillId
     * @return
     */
    WaybillFeeOutput selectFeeByWaybillId(Long waybillId);

    /**
     * 根据运单id查询配载信息
     * @param waybillId
     * @return
     */
    StowageOutput selectStowageByWaybillId(Long waybillId);


    /**
     * 关闭运单
     * @param id 运单ID
     * @param userId  运单所属用户的ID
     * @return  1: 成功, 0: 运单不存在, -1: 状态错误
     */
    int close(Long id, Long userId);

    /**
     * 根据运单id查询仓库信息
     * @param waybillId
     * @return
     */
    WaybillDepotOutput selectDepotByWaybillId(Long waybillId);

    /**
     * 根据运单id查询分理信息
     * @param waybillId
     * @return
     */
    FbAllotWaybillOutput selectAllotWaybillByWaybillId(Long waybillId);

    /**
     * 根据运单id查询回单信息
     * @param waybillId
     * @return
     */
    WaybillReceiveOutput selectWaybillReceiveByWaybillId(Long waybillId);

    /**
     * 根据运单id查询补收付信息
     * @param waybillId
     * @return
     */
    List<LspWaybillBalanceDetailOutput> selectBalanceDetailByWaybillId(Long waybillId);

    /**
     * 根据运单id查询客户轨迹信息
     * @param waybillId
     * @return
     */
    List<WaybillCustomerTrackOutput> selectWaybillCustomerTrackOutputByWaybillId(Long waybillId);

    /**
     * 服务商运单报价
     * @param input
     * @return
     */
    int waybillQuote(WaybillQuoteInput input);
}
