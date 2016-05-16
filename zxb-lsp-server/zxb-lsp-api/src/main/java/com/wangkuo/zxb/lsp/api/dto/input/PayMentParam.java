package com.wangkuo.zxb.lsp.api.dto.input;

import java.io.Serializable;

/**
 * Created by cuihe on 16/4/14.
 * 支付回调
 */
public class PayMentParam implements Serializable {

    private Integer paymentType;
    private String paymentNo;
    private String paymentMemo;

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentNo() {
        return paymentNo;
    }

    public void setPaymentNo(String paymentNo) {
        this.paymentNo = paymentNo;
    }

    public String getPaymentMemo() {
        return paymentMemo;
    }

    public void setPaymentMemo(String paymentMemo) {
        this.paymentMemo = paymentMemo;
    }
}
