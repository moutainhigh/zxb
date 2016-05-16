package com.wangkuo.zxb.lsp.provider.db.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TZbAllocCentre implements Serializable {
    private Long id;

    private String code;

    private String name;

    private String linkname;

    private String linkmanPhone;

    private String tel;

    private String provinceName;

    private Integer provinceId;

    private String cityName;

    private Integer cityId;

    private String countryName;

    private Integer countryId;

    private String address;

    private Integer isVerifySelPaymentApply;

    private BigDecimal currentBalance;

    private Long bookerEmployeeId;

    private String bookerEmployeeName;

    private Date createTime;

    private String downId;

    private Integer latestArriveTime;

    private String waybillTimeoutPay;

    private String receiveTimeoutPay;

    private Integer networkTruckAllot1;

    private Integer networkTruckAllot2;

    private Integer isRountWitnCounty;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLinkname() {
        return linkname;
    }

    public void setLinkname(String linkname) {
        this.linkname = linkname == null ? null : linkname.trim();
    }

    public String getLinkmanPhone() {
        return linkmanPhone;
    }

    public void setLinkmanPhone(String linkmanPhone) {
        this.linkmanPhone = linkmanPhone == null ? null : linkmanPhone.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName == null ? null : countryName.trim();
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getIsVerifySelPaymentApply() {
        return isVerifySelPaymentApply;
    }

    public void setIsVerifySelPaymentApply(Integer isVerifySelPaymentApply) {
        this.isVerifySelPaymentApply = isVerifySelPaymentApply;
    }

    public BigDecimal getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(BigDecimal currentBalance) {
        this.currentBalance = currentBalance;
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

    public String getDownId() {
        return downId;
    }

    public void setDownId(String downId) {
        this.downId = downId == null ? null : downId.trim();
    }

    public Integer getLatestArriveTime() {
        return latestArriveTime;
    }

    public void setLatestArriveTime(Integer latestArriveTime) {
        this.latestArriveTime = latestArriveTime;
    }

    public String getWaybillTimeoutPay() {
        return waybillTimeoutPay;
    }

    public void setWaybillTimeoutPay(String waybillTimeoutPay) {
        this.waybillTimeoutPay = waybillTimeoutPay == null ? null : waybillTimeoutPay.trim();
    }

    public String getReceiveTimeoutPay() {
        return receiveTimeoutPay;
    }

    public void setReceiveTimeoutPay(String receiveTimeoutPay) {
        this.receiveTimeoutPay = receiveTimeoutPay == null ? null : receiveTimeoutPay.trim();
    }

    public Integer getNetworkTruckAllot1() {
        return networkTruckAllot1;
    }

    public void setNetworkTruckAllot1(Integer networkTruckAllot1) {
        this.networkTruckAllot1 = networkTruckAllot1;
    }

    public Integer getNetworkTruckAllot2() {
        return networkTruckAllot2;
    }

    public void setNetworkTruckAllot2(Integer networkTruckAllot2) {
        this.networkTruckAllot2 = networkTruckAllot2;
    }

    public Integer getIsRountWitnCounty() {
        return isRountWitnCounty;
    }

    public void setIsRountWitnCounty(Integer isRountWitnCounty) {
        this.isRountWitnCounty = isRountWitnCounty;
    }
}