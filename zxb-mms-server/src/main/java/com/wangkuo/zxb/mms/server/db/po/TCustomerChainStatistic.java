package com.wangkuo.zxb.mms.server.db.po;

import java.io.Serializable;
import java.math.BigDecimal;

public class TCustomerChainStatistic implements Serializable {
    private Long id;

    private Integer type;

    private Long mmsCustomerId;

    private Integer tYear;

    private Integer tMonth;

    private Integer curSendGoodTotalNum;

    private Float curSendGoodTotalNumChainRate;

    private BigDecimal curSendGoodFee;

    private Float curSendGoodFeeChainRate;

    private Integer curCarrierTotalNum;

    private Float curCarrierTotalNumChainRate;

    private Integer curStowageTotalNum;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getMmsCustomerId() {
        return mmsCustomerId;
    }

    public void setMmsCustomerId(Long mmsCustomerId) {
        this.mmsCustomerId = mmsCustomerId;
    }

    public Integer gettYear() {
        return tYear;
    }

    public void settYear(Integer tYear) {
        this.tYear = tYear;
    }

    public Integer gettMonth() {
        return tMonth;
    }

    public void settMonth(Integer tMonth) {
        this.tMonth = tMonth;
    }

    public Integer getCurSendGoodTotalNum() {
        return curSendGoodTotalNum;
    }

    public void setCurSendGoodTotalNum(Integer curSendGoodTotalNum) {
        this.curSendGoodTotalNum = curSendGoodTotalNum;
    }

    public Float getCurSendGoodTotalNumChainRate() {
        return curSendGoodTotalNumChainRate;
    }

    public void setCurSendGoodTotalNumChainRate(Float curSendGoodTotalNumChainRate) {
        this.curSendGoodTotalNumChainRate = curSendGoodTotalNumChainRate;
    }

    public BigDecimal getCurSendGoodFee() {
        return curSendGoodFee;
    }

    public void setCurSendGoodFee(BigDecimal curSendGoodFee) {
        this.curSendGoodFee = curSendGoodFee;
    }

    public Float getCurSendGoodFeeChainRate() {
        return curSendGoodFeeChainRate;
    }

    public void setCurSendGoodFeeChainRate(Float curSendGoodFeeChainRate) {
        this.curSendGoodFeeChainRate = curSendGoodFeeChainRate;
    }

    public Integer getCurCarrierTotalNum() {
        return curCarrierTotalNum;
    }

    public void setCurCarrierTotalNum(Integer curCarrierTotalNum) {
        this.curCarrierTotalNum = curCarrierTotalNum;
    }

    public Float getCurCarrierTotalNumChainRate() {
        return curCarrierTotalNumChainRate;
    }

    public void setCurCarrierTotalNumChainRate(Float curCarrierTotalNumChainRate) {
        this.curCarrierTotalNumChainRate = curCarrierTotalNumChainRate;
    }

    public Integer getCurStowageTotalNum() {
        return curStowageTotalNum;
    }

    public void setCurStowageTotalNum(Integer curStowageTotalNum) {
        this.curStowageTotalNum = curStowageTotalNum;
    }
}