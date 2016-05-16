package com.wangkuo.zxb.lsp.provider.db.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TFbBenchmarkPrice implements Serializable {
    private Long id;

    private Long allocCenterId;

    private String allocCenterName;

    private Long endProvinceId;

    private String endProvinceName;

    private Long endCityId;

    private String endCityName;

    private Long endCountryId;

    private String endCountryName;

    private Long bookerEmployeeId;

    private String bookerEmployeeName;

    private Date createTime;

    private BigDecimal sendGoodFee;

    private Integer runTime;

    private Integer ransitNum;

    private Integer isCityPrice;

    private BigDecimal sendGoodFeeSection1;

    private BigDecimal sendGoodFeeSection2;

    private BigDecimal sendGoodFeeSection3;

    private BigDecimal sendGoodFeeSection4;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAllocCenterId() {
        return allocCenterId;
    }

    public void setAllocCenterId(Long allocCenterId) {
        this.allocCenterId = allocCenterId;
    }

    public String getAllocCenterName() {
        return allocCenterName;
    }

    public void setAllocCenterName(String allocCenterName) {
        this.allocCenterName = allocCenterName == null ? null : allocCenterName.trim();
    }

    public Long getEndProvinceId() {
        return endProvinceId;
    }

    public void setEndProvinceId(Long endProvinceId) {
        this.endProvinceId = endProvinceId;
    }

    public String getEndProvinceName() {
        return endProvinceName;
    }

    public void setEndProvinceName(String endProvinceName) {
        this.endProvinceName = endProvinceName == null ? null : endProvinceName.trim();
    }

    public Long getEndCityId() {
        return endCityId;
    }

    public void setEndCityId(Long endCityId) {
        this.endCityId = endCityId;
    }

    public String getEndCityName() {
        return endCityName;
    }

    public void setEndCityName(String endCityName) {
        this.endCityName = endCityName == null ? null : endCityName.trim();
    }

    public Long getEndCountryId() {
        return endCountryId;
    }

    public void setEndCountryId(Long endCountryId) {
        this.endCountryId = endCountryId;
    }

    public String getEndCountryName() {
        return endCountryName;
    }

    public void setEndCountryName(String endCountryName) {
        this.endCountryName = endCountryName == null ? null : endCountryName.trim();
    }

    public Long getBookerEmployeeId() {
        return bookerEmployeeId;
    }

    public void setBookerEmployeeId(Long bookerEmployeeId) {
        this.bookerEmployeeId = bookerEmployeeId;
    }

    public String getBookerEmployeeName() {
        return bookerEmployeeName;
    }

    public void setBookerEmployeeName(String bookerEmployeeName) {
        this.bookerEmployeeName = bookerEmployeeName == null ? null : bookerEmployeeName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public Integer getIsCityPrice() {
        return isCityPrice;
    }

    public void setIsCityPrice(Integer isCityPrice) {
        this.isCityPrice = isCityPrice;
    }

    public BigDecimal getSendGoodFeeSection1() {
        return sendGoodFeeSection1;
    }

    public void setSendGoodFeeSection1(BigDecimal sendGoodFeeSection1) {
        this.sendGoodFeeSection1 = sendGoodFeeSection1;
    }

    public BigDecimal getSendGoodFeeSection2() {
        return sendGoodFeeSection2;
    }

    public void setSendGoodFeeSection2(BigDecimal sendGoodFeeSection2) {
        this.sendGoodFeeSection2 = sendGoodFeeSection2;
    }

    public BigDecimal getSendGoodFeeSection3() {
        return sendGoodFeeSection3;
    }

    public void setSendGoodFeeSection3(BigDecimal sendGoodFeeSection3) {
        this.sendGoodFeeSection3 = sendGoodFeeSection3;
    }

    public BigDecimal getSendGoodFeeSection4() {
        return sendGoodFeeSection4;
    }

    public void setSendGoodFeeSection4(BigDecimal sendGoodFeeSection4) {
        this.sendGoodFeeSection4 = sendGoodFeeSection4;
    }
}