package com.wangkuo.zxb.lsp.api.service;

import com.wangkuo.zxb.lsp.api.dto.input.CreatePaymentInput;
import com.wangkuo.zxb.lsp.api.dto.input.PayMentParam;
import com.wangkuo.zxb.lsp.api.dto.output.OrderOutput;
import com.wangkuo.zxb.lsp.api.dto.output.OrderPaySuccessOutput;
import com.wangkuo.zxb.lsp.api.dto.output.PaymentInformationOutput;

/**
 * Created by mark on 16/4/13.
 */
public interface IOrderPayService {

    /**
     * 生成订单信息
     * @param input
     * @return
     */
    PaymentInformationOutput createOrderInformation(CreatePaymentInput input);

    /**
     * 获取订单
     * @param id
     * @return
     */
    OrderOutput findOrder(Long id);

    /**
     * 获取订单号和运单号
     * @param id
     * @return
     */
    OrderPaySuccessOutput findOrderAndWaybillId(Long id);

    /**
     * 支付成功后回调
     * @param id
     * @return
     */
    int paySuccess(Long id,PayMentParam param);
}
