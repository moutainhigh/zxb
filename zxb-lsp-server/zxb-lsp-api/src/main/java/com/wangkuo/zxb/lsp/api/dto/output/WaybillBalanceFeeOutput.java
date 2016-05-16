package com.wangkuo.zxb.lsp.api.dto.output;

import java.math.BigDecimal;

/**
 * Created by chaizf on 2016/4/6.
 */
public class WaybillBalanceFeeOutput {
    private Integer status;//返回状态

    private BigDecimal mainLineFee;
    private BigDecimal sendGoodFee;
    private Integer runTime;
    private Integer ransitNum;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BigDecimal getMainLineFee() {
        return mainLineFee;
    }

    public void setMainLineFee(BigDecimal mainLineFee) {
        this.mainLineFee = mainLineFee;
    }

    public BigDecimal getSendGoodFee() {
        return sendGoodFee;
    }

    public void setSendGoodFee(BigDecimal sendGoodFee) {
        this.sendGoodFee = sendGoodFee;
    }

    public Integer getRunTime() {
        return runTime;
    }

    public void setRunTime(Integer runTime) {
        this.runTime = runTime;
    }

    public Integer getRansitNum() {
        return ransitNum;
    }

    public void setRansitNum(Integer ransitNum) {
        this.ransitNum = ransitNum;
    }
}
