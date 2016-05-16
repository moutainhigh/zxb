package com.wangkuo.zxb.lsp.api.dto.output;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * 其他产生的运单费用,如,异常费用,补付费用
 *
 * @author levitch
 * @date 16/4/8
 * @versioin 1.0
 **/
public class WaybillExtraFeeOutput implements Serializable{

    private Long id;

    /**
     * 1 表示开单费用
     * 2 表示改单费用
     * 3 表示异常费用
     */
    private Integer type;

    /**
     * 本次业务发生的总费用(如,改单后的变化费用,下单时的总费用,异常产生的总费用)
     */
    private BigDecimal zbReceiveAllFee;

    /**
     * 0 未核销
     * 1已核销/已支付
     * 2已免单
     * 3已作废
     */
    private Integer status;

    /**
     * 状态发生时间
     */
    private Date freeTime;

    /**
     * 费用登记时间
     */
    private Date bookerTime;

    /**
     * 支付时间
     */
    private Date payTime;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public BigDecimal getZbReceiveAllFee() {
        return zbReceiveAllFee;
    }

    public void setZbReceiveAllFee(BigDecimal zbReceiveAllFee) {
        this.zbReceiveAllFee = zbReceiveAllFee;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getFreeTime() {
        return freeTime;
    }

    public void setFreeTime(Date freeTime) {
        this.freeTime = freeTime;
    }

    public Date getBookerTime() {
        return bookerTime;
    }

    public void setBookerTime(Date bookerTime) {
        this.bookerTime = bookerTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
