package com.wangkuo.zxb.lsp.provider.db.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TBranch implements Serializable {
    private Long id;

    private String name;

    private String memo;

    private Long cityId;

    private Date createTime;

    private Long createEmployeeId;

    private String createEmployeeName;

    private Long updateEmployeeId;

    private String updateEmployeeName;

    private Date updateTime;

    private Long provinceId;

    private String province;

    private String city;

    private Long countyId;

    private String county;

    private String routeMemo;

    private BigDecimal insuranceFeeRate;

    private BigDecimal insuranceFee;

    private String blame;

    private String blameMobile;

    private String phone;

    private String systemId;

    private String address;

    private String branchCode;

    private Double longitude;

    private Double dimensions;

    private String companyName;

    private Boolean isDefault;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreateEmployeeId() {
        return createEmployeeId;
    }

    public void setCreateEmployeeId(Long createEmployeeId) {
        this.createEmployeeId = createEmployeeId;
    }

    public String getCreateEmployeeName() {
        return createEmployeeName;
    }

    public void setCreateEmployeeName(String createEmployeeName) {
        this.createEmployeeName = createEmployeeName == null ? null : createEmployeeName.trim();
    }

    public Long getUpdateEmployeeId() {
        return updateEmployeeId;
    }

    public void setUpdateEmployeeId(Long updateEmployeeId) {
        this.updateEmployeeId = updateEmployeeId;
    }

    public String getUpdateEmployeeName() {
        return updateEmployeeName;
    }

    public void setUpdateEmployeeName(String updateEmployeeName) {
        this.updateEmployeeName = updateEmployeeName == null ? null : updateEmployeeName.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Long getCountyId() {
        return countyId;
    }

    public void setCountyId(Long countyId) {
        this.countyId = countyId;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    public String getRouteMemo() {
        return routeMemo;
    }

    public void setRouteMemo(String routeMemo) {
        this.routeMemo = routeMemo == null ? null : routeMemo.trim();
    }

    public BigDecimal getInsuranceFeeRate() {
        return insuranceFeeRate;
    }

    public void setInsuranceFeeRate(BigDecimal insuranceFeeRate) {
        this.insuranceFeeRate = insuranceFeeRate;
    }

    public BigDecimal getInsuranceFee() {
        return insuranceFee;
    }

    public void setInsuranceFee(BigDecimal insuranceFee) {
        this.insuranceFee = insuranceFee;
    }

    public String getBlame() {
        return blame;
    }

    public void setBlame(String blame) {
        this.blame = blame == null ? null : blame.trim();
    }

    public String getBlameMobile() {
        return blameMobile;
    }

    public void setBlameMobile(String blameMobile) {
        this.blameMobile = blameMobile == null ? null : blameMobile.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId == null ? null : systemId.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode == null ? null : branchCode.trim();
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getDimensions() {
        return dimensions;
    }

    public void setDimensions(Double dimensions) {
        this.dimensions = dimensions;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }
}