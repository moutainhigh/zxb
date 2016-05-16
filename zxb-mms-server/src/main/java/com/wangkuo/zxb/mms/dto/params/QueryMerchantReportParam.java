package com.wangkuo.zxb.mms.dto.params;

/**
 * Created by mark on 16/5/7.
 */
public class QueryMerchantReportParam extends PageParam {
    private String realName;
    private Integer year;
    private Integer month;

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }
}
