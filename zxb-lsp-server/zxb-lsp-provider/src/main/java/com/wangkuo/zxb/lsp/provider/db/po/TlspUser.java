package com.wangkuo.zxb.lsp.provider.db.po;

import java.io.Serializable;
import java.util.Date;

public class TlspUser implements Serializable {
    private Long id;

    private String nickName;

    private String password;

    private String companyName;

    private String realUserName;

    private String mobile;

    private String telphone;

    private Long provinceId;

    private String provinceName;

    private Long cityId;

    private String cityName;

    private Long countryId;

    private String countryName;

    private String detailedAddress;

    private Date registerDate;

    private Date lastLoginDate;

    private Long allocCenterId;

    private String allocCenterName;

    private Integer verifyStatus;

    private Long verifyUserId;

    private String verifyUserName;

    private Date verifyDate;

    private Integer blocked;

    private Long registrantUserId;

    private String registrantUserName;

    private Date registrantDate;

    private String verifyInstructions;

    private String bindMobile;

    private String payPassword;

    private String memo;

    private String inviteName;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getRealUserName() {
        return realUserName;
    }

    public void setRealUserName(String realUserName) {
        this.realUserName = realUserName == null ? null : realUserName.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
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
        this.provinceName = provinceName == null ? null : provinceName.trim();
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
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName == null ? null : countryName.trim();
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress == null ? null : detailedAddress.trim();
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
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

    public Integer getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    public Long getVerifyUserId() {
        return verifyUserId;
    }

    public void setVerifyUserId(Long verifyUserId) {
        this.verifyUserId = verifyUserId;
    }

    public String getVerifyUserName() {
        return verifyUserName;
    }

    public void setVerifyUserName(String verifyUserName) {
        this.verifyUserName = verifyUserName == null ? null : verifyUserName.trim();
    }

    public Date getVerifyDate() {
        return verifyDate;
    }

    public void setVerifyDate(Date verifyDate) {
        this.verifyDate = verifyDate;
    }

    public Integer getBlocked() {
        return blocked;
    }

    public void setBlocked(Integer blocked) {
        this.blocked = blocked;
    }

    public Long getRegistrantUserId() {
        return registrantUserId;
    }

    public void setRegistrantUserId(Long registrantUserId) {
        this.registrantUserId = registrantUserId;
    }

    public String getRegistrantUserName() {
        return registrantUserName;
    }

    public void setRegistrantUserName(String registrantUserName) {
        this.registrantUserName = registrantUserName == null ? null : registrantUserName.trim();
    }

    public Date getRegistrantDate() {
        return registrantDate;
    }

    public void setRegistrantDate(Date registrantDate) {
        this.registrantDate = registrantDate;
    }

    public String getVerifyInstructions() {
        return verifyInstructions;
    }

    public void setVerifyInstructions(String verifyInstructions) {
        this.verifyInstructions = verifyInstructions == null ? null : verifyInstructions.trim();
    }

    public String getBindMobile() {
        return bindMobile;
    }

    public void setBindMobile(String bindMobile) {
        this.bindMobile = bindMobile == null ? null : bindMobile.trim();
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword == null ? null : payPassword.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getInviteName() {
        return inviteName;
    }

    public void setInviteName(String inviteName) {
        this.inviteName = inviteName == null ? null : inviteName.trim();
    }
}