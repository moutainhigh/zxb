package com.wangkuo.zxb.lsp.api.dto.input;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by sanshao on 16-4-6.
 */
public class QueryWaybillFeeBalanceWithBenchmarkInput extends PageInput implements Serializable{

    private Integer queryType;//1:收款，2:付款
    private String sn;
    private String lspCompanyName;
    private Long allocCenterId;
    private Integer[] receiveTrackMore;
    private Integer balanceTypeWithZb;
    private Integer payType;
    private Integer waybillStatus;
    private Integer verifyStatus;
    private Date beginTime;
    private Date endTime;


    public Integer getQueryType() {
        return queryType;
    }

    public void setQueryType(Integer queryType) {
        this.queryType = queryType;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getLspCompanyName() {
        return lspCompanyName;
    }

    public void setLspCompanyName(String lspCompanyName) {
        this.lspCompanyName = lspCompanyName;
    }

    public Long getAllocCenterId() {
        return allocCenterId;
    }

    public void setAllocCenterId(Long allocCenterId) {
        this.allocCenterId = allocCenterId;
    }

    public Integer[] getReceiveTrackMore() {
        return receiveTrackMore;
    }

    public void setReceiveTrackMore(Integer[] receiveTrackMore) {
        this.receiveTrackMore = receiveTrackMore;
    }

    public Integer getBalanceTypeWithZb() {
        return balanceTypeWithZb;
    }

    public void setBalanceTypeWithZb(Integer balanceTypeWithZb) {
        this.balanceTypeWithZb = balanceTypeWithZb;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getWaybillStatus() {
        return waybillStatus;
    }

    public void setWaybillStatus(Integer waybillStatus) {
        this.waybillStatus = waybillStatus;
    }

    public Integer getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
