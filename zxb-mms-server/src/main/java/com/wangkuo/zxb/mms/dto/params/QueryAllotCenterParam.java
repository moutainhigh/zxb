package com.wangkuo.zxb.mms.dto.params;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author 王俊华
 * @version 1.0
 * @date 2016-05-05
 */
public class QueryAllotCenterParam extends PageParam implements Serializable {

    private Long centerId;

    private Integer year;

    private Integer month;

    private String startDateStr;

    private String endDateStr;

    private Long provinceId;

    private Long cityId;

    private String orderParam;

    private String orderBy1;
    private String orderBy2;
    private String orderBy3;
    private String orderType1;
    private String orderType2;
    private String orderType3;

    public String getOrderParam() {
        return orderParam;
    }

    public void setOrderParam(String orderParam) {
        this.orderParam = orderParam;
    }

    public String getOrderBy1() {
        return orderBy1;
    }

    public void setOrderBy1(String orderBy1) {
        this.orderBy1 = orderBy1;
    }

    public String getOrderBy2() {
        return orderBy2;
    }

    public void setOrderBy2(String orderBy2) {
        this.orderBy2 = orderBy2;
    }

    public String getOrderBy3() {
        return orderBy3;
    }

    public void setOrderBy3(String orderBy3) {
        this.orderBy3 = orderBy3;
    }

    public String getOrderType1() {
        return orderType1;
    }

    public void setOrderType1(String orderType1) {
        this.orderType1 = orderType1;
    }

    public String getOrderType2() {
        return orderType2;
    }

    public void setOrderType2(String orderType2) {
        this.orderType2 = orderType2;
    }

    public String getOrderType3() {
        return orderType3;
    }

    public void setOrderType3(String orderType3) {
        this.orderType3 = orderType3;
    }

    public String getStartDateStr() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(null != year){
            cal.set(Calendar.YEAR,year);
            if(null != month){
                cal.set(Calendar.MONTH,month);
            }else{
                cal.set(Calendar.MONTH,0);
            }
            cal.set(Calendar.DAY_OF_MONTH,1);
            cal.set(Calendar.HOUR_OF_DAY,0);
            cal.set(Calendar.MINUTE,0);
            cal.set(Calendar.SECOND,0);
            this.startDateStr = sdf.format(cal.getTime());
        }
        return startDateStr;
    }

    public void setStartDateStr(String startDateStr) {
        this.startDateStr = startDateStr;
    }

    public String getEndDateStr() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(null != year){
            cal.set(Calendar.YEAR,year);
            if(null != month){
                cal.set(Calendar.MONTH,month);
            }else{
                cal.set(Calendar.MONTH,11);
            }
            cal.set(Calendar.DAY_OF_MONTH,cal.getActualMaximum(Calendar.DAY_OF_MONTH));
            cal.set(Calendar.HOUR_OF_DAY,23);
            cal.set(Calendar.MINUTE,59);
            cal.set(Calendar.SECOND,59);
            this.endDateStr = sdf.format(cal.getTime());
        }
        return endDateStr;
    }

    public void setEndDateStr(String endDateStr) {
        this.endDateStr = endDateStr;
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

    public Long getCenterId() {
        return centerId;
    }

    public void setCenterId(Long centerId) {
        this.centerId = centerId;
    }


    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }
}
