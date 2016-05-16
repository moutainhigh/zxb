package com.wangkuo.zxb.mms.dto.output;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by Administrator on 2016/5/10 0010.
 */
public class CustomerChainStatisticOutput implements Serializable {
    private Long mmsCustomerId;

    private Integer curSendGoodTotalNum;

    private BigDecimal curSendGoodFee;

    private Integer curStowageTotalNum;

    public Long getMmsCustomerId() {
        return mmsCustomerId;
    }

    public void setMmsCustomerId(Long mmsCustomerId) {
        this.mmsCustomerId = mmsCustomerId;
    }

    public Integer getCurSendGoodTotalNum() {
        return curSendGoodTotalNum;
    }

    public void setCurSendGoodTotalNum(Integer curSendGoodTotalNum) {
        this.curSendGoodTotalNum = curSendGoodTotalNum;
    }

    public BigDecimal getCurSendGoodFee() {
        return curSendGoodFee;
    }

    public void setCurSendGoodFee(BigDecimal curSendGoodFee) {
        this.curSendGoodFee = curSendGoodFee;
    }

    public Integer getCurStowageTotalNum() {
        return curStowageTotalNum;
    }

    public void setCurStowageTotalNum(Integer curStowageTotalNum) {
        this.curStowageTotalNum = curStowageTotalNum;
    }
}
