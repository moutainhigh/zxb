package com.wangkuo.zxb.mms.dto.output;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by mark on 16/5/7.
 */
public class MerchantReportOutput implements Serializable {
    private String realName;
    private int year;
    private int month;
    private int orderSum;
    private BigDecimal feeSum;

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getOrderSum() {
        return orderSum;
    }

    public void setOrderSum(int orderSum) {
        this.orderSum = orderSum;
    }

    public BigDecimal getFeeSum() {
        return feeSum;
    }

    public void setFeeSum(BigDecimal feeSum) {
        this.feeSum = feeSum;
    }
}
