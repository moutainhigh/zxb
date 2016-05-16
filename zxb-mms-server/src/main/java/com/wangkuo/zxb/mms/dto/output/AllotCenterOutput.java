package com.wangkuo.zxb.mms.dto.output;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by wangjh on 2016/5/5.
 */
public class AllotCenterOutput implements Serializable {

    private Long centerId;

    private String centerName;

    private Long provinceId;

    private String provinceName;

    private Long cityId;

    private String cityName;

    private Integer totalWayBillCount;

    private BigDecimal avgTotalWayBillCount;

    private Integer totalOfferWight;

    private BigDecimal avgTotalOfferWight;

    private Integer totalOfferVolume;

    private BigDecimal avgTotalOfferVolume;

    private String yearAndMonth;

    /**
     * 异常票数
     */
    private Integer unusualWayBillCount;

    private Integer year;

    private Integer month;

    /**
     * 调度供应商数
     */
    private Integer lineSupplierCount;

    private BigDecimal totalAmount;
    /**
     * 日均金额
     */
    private BigDecimal avgTotalAmount;


    public BigDecimal getAvgTotalWayBillCount() {
        return avgTotalWayBillCount;
    }

    public void setAvgTotalWayBillCount(BigDecimal avgTotalWayBillCount) {
        if(null!=avgTotalWayBillCount){
            this.avgTotalWayBillCount = avgTotalWayBillCount.setScale(2,   BigDecimal.ROUND_HALF_UP);
            return;
        }
        this.avgTotalWayBillCount = avgTotalWayBillCount;
    }

    public BigDecimal getAvgTotalOfferWight() {
        return avgTotalOfferWight;
    }

    public void setAvgTotalOfferWight(BigDecimal avgTotalOfferWight) {
        if(null!=avgTotalOfferWight){
            this.avgTotalOfferWight = avgTotalOfferWight.setScale(2,   BigDecimal.ROUND_HALF_UP);
            return;
        }
        this.avgTotalOfferWight = avgTotalOfferWight;
    }

    public BigDecimal getAvgTotalOfferVolume() {
        return avgTotalOfferVolume;
    }

    public void setAvgTotalOfferVolume(BigDecimal avgTotalOfferVolume) {
        if(null!=avgTotalOfferVolume){
            this.avgTotalOfferVolume = avgTotalOfferVolume.setScale(2,   BigDecimal.ROUND_HALF_UP);
            return;
        }
        this.avgTotalOfferVolume = avgTotalOfferVolume;
    }

    public Integer getLineSupplierCount() {
        return lineSupplierCount;
    }

    public void setLineSupplierCount(Integer lineSupplierCount) {
        this.lineSupplierCount = lineSupplierCount;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getAvgTotalAmount() {
        return avgTotalAmount;
    }

    public void setAvgTotalAmount(BigDecimal avgTotalAmount) {
        if(null!=avgTotalAmount){
            this.avgTotalAmount = avgTotalAmount.setScale(2,   BigDecimal.ROUND_HALF_UP);
            return;
        }
        this.avgTotalAmount = avgTotalAmount;
    }

    public Integer getYear() {
        if (null != yearAndMonth && !"".equals(yearAndMonth)) {
            return new Integer(yearAndMonth.split("-")[0]);
        }
        return year;
    }

    public Integer getMonth() {
        if (null != yearAndMonth && !"".equals(yearAndMonth)) {
            return new Integer(yearAndMonth.split("-")[1]);
        }
        return month;
    }

    public Integer getUnusualWayBillCount() {
        return unusualWayBillCount;
    }

    public void setUnusualWayBillCount(Integer unusualWayBillCount) {
        this.unusualWayBillCount = unusualWayBillCount;
    }

    public String getYearAndMonth() {
        return yearAndMonth;
    }

    public void setYearAndMonth(String yearAndMonth) {
        this.yearAndMonth = yearAndMonth;
    }

    public Long getCenterId() {
        return centerId;
    }

    public void setCenterId(Long centerId) {
        this.centerId = centerId;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getTotalWayBillCount() {
        return totalWayBillCount;
    }

    public void setTotalWayBillCount(Integer totalWayBillCount) {
        this.totalWayBillCount = totalWayBillCount;
    }

    public Integer getTotalOfferWight() {
        return totalOfferWight;
    }

    public void setTotalOfferWight(Integer totalOfferWight) {
        this.totalOfferWight = totalOfferWight;
    }

    public Integer getTotalOfferVolume() {
        return totalOfferVolume;
    }

    public void setTotalOfferVolume(Integer totalOfferVolume) {
        this.totalOfferVolume = totalOfferVolume;
    }
}
