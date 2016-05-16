package com.wangkuo.zxb.mms.dto.output;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by wangjh on 2016/5/5.
 */
public class AllotCenterChartOutput implements Serializable {

    private Long centerId;

    private String centerName;

    private Long provinceId;

    private String provinceName;

    private Long cityId;

    private String cityName;

    private BigDecimal totalWayBillCountPercent;

    private BigDecimal totalOfferWightPercent;

    private BigDecimal totalOfferVolumePercent;

    private String yearAndMonth;

    /**
     * 调度供应商数
     */
    private BigDecimal lineSupplierCountPercent;

    /**
     * 异常票数
     */
    private BigDecimal unusualWayBillCountPercent;

    private BigDecimal totalAmountPercent;

    public BigDecimal getTotalAmountPercent() {
        return totalAmountPercent;
    }

    public void setTotalAmountPercent(BigDecimal totalAmountPercent) {
        this.totalAmountPercent = totalAmountPercent;
    }

    public BigDecimal getLineSupplierCountPercent() {
        return lineSupplierCountPercent;
    }

    public void setLineSupplierCountPercent(BigDecimal lineSupplierCountPercent) {
        this.lineSupplierCountPercent = lineSupplierCountPercent;
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

    public BigDecimal getTotalWayBillCountPercent() {
        return totalWayBillCountPercent;
    }

    public void setTotalWayBillCountPercent(BigDecimal totalWayBillCountPercent) {
        this.totalWayBillCountPercent = totalWayBillCountPercent;
    }

    public BigDecimal getTotalOfferWightPercent() {
        return totalOfferWightPercent;
    }

    public void setTotalOfferWightPercent(BigDecimal totalOfferWightPercent) {
        this.totalOfferWightPercent = totalOfferWightPercent;
    }

    public BigDecimal getTotalOfferVolumePercent() {
        return totalOfferVolumePercent;
    }

    public void setTotalOfferVolumePercent(BigDecimal totalOfferVolumePercent) {
        this.totalOfferVolumePercent = totalOfferVolumePercent;
    }

    public String getYearAndMonth() {
        return yearAndMonth;
    }

    public void setYearAndMonth(String yearAndMonth) {
        this.yearAndMonth = yearAndMonth;
    }

    public BigDecimal getUnusualWayBillCountPercent() {
        return unusualWayBillCountPercent;
    }

    public void setUnusualWayBillCountPercent(BigDecimal unusualWayBillCountPercent) {
        this.unusualWayBillCountPercent = unusualWayBillCountPercent;
    }
}
