package com.wangkuo.zxb.lsp.api.dto.input;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author 王俊华
 * @version 1.0
 * @date 2016-04-05
 */
public class LspUserInput extends PageInput {
    private Long id;
    @NotEmpty
    private String nickName;
    @NotNull
    private String password;
    @NotEmpty
    private String companyName;
    @NotEmpty
    private String realUserName;
    @NotEmpty
    private String mobile;

    private String telphone;
    @NotNull
    private Long provinceId;
    @NotEmpty
    private String provinceName;
    @NotNull
    private Long cityId;
    @NotEmpty
    private String cityName;
    @NotNull
    private Long countryId;
    @NotEmpty
    private String countryName;
    @NotNull
    private String detailedAddress;

    private String bindMobile;

    private Integer verifyStatus;

    private Date registerDate;
    private Date registerDateStart;
    private Date registerDateEnd;

    private Date lastLoginDate;
    private Date lastLoginDateStart;
    private Date lastLoginDateEnd;

    private Long allocCenterId;

    private String allocCenterName;

    private Long verifyUserId;

    private String verifyUserName;

    private Date verifyDate;
    private Date verifyDateStart;
    private Date verifyDateEnd;

    private Integer blocked;

    private Long registrantUserId;

    private String registrantUserName;

    private Date registrantDate;
    private Date registrantDateStart;
    private Date registrantDateEnd;

    private String verifyInstructions;

    private String inviteName;

    public Integer getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

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

    public String getBindMobile() {
        return bindMobile;
    }

    public void setBindMobile(String bindMobile) {
        this.bindMobile = bindMobile;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Date getRegisterDateStart() {
        return registerDateStart;
    }

    public void setRegisterDateStart(Date registerDateStart) {
        this.registerDateStart = registerDateStart;
    }

    public Date getRegisterDateEnd() {
        return registerDateEnd;
    }

    public void setRegisterDateEnd(Date registerDateEnd) {
        this.registerDateEnd = registerDateEnd;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public Date getLastLoginDateStart() {
        return lastLoginDateStart;
    }

    public void setLastLoginDateStart(Date lastLoginDateStart) {
        this.lastLoginDateStart = lastLoginDateStart;
    }

    public Date getLastLoginDateEnd() {
        return lastLoginDateEnd;
    }

    public void setLastLoginDateEnd(Date lastLoginDateEnd) {
        this.lastLoginDateEnd = lastLoginDateEnd;
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
        this.allocCenterName = allocCenterName;
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
        this.verifyUserName = verifyUserName;
    }

    public Date getVerifyDate() {
        return verifyDate;
    }

    public void setVerifyDate(Date verifyDate) {
        this.verifyDate = verifyDate;
    }

    public Date getVerifyDateStart() {
        return verifyDateStart;
    }

    public void setVerifyDateStart(Date verifyDateStart) {
        this.verifyDateStart = verifyDateStart;
    }

    public Date getVerifyDateEnd() {
        return verifyDateEnd;
    }

    public void setVerifyDateEnd(Date verifyDateEnd) {
        this.verifyDateEnd = verifyDateEnd;
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
        this.registrantUserName = registrantUserName;
    }

    public Date getRegistrantDate() {
        return registrantDate;
    }

    public void setRegistrantDate(Date registrantDate) {
        this.registrantDate = registrantDate;
    }

    public Date getRegistrantDateStart() {
        return registrantDateStart;
    }

    public void setRegistrantDateStart(Date registrantDateStart) {
        this.registrantDateStart = registrantDateStart;
    }

    public Date getRegistrantDateEnd() {
        return registrantDateEnd;
    }

    public void setRegistrantDateEnd(Date registrantDateEnd) {
        this.registrantDateEnd = registrantDateEnd;
    }

    public String getVerifyInstructions() {
        return verifyInstructions;
    }

    public void setVerifyInstructions(String verifyInstructions) {
        this.verifyInstructions = verifyInstructions;
    }

    public String getInviteName() {
        return inviteName;
    }

    public void setInviteName(String inviteName) {
        this.inviteName = inviteName;
    }
}
