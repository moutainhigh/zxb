package com.wangkuo.zxb.lsp.api.dto.output;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by sanshao on 16-4-14.
 */
public class LspWaybillBalanceDetailOutput implements Serializable {

    private BigDecimal fee;

    private String feeType;

    private String payType;

    private Date createDate;

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }
}
