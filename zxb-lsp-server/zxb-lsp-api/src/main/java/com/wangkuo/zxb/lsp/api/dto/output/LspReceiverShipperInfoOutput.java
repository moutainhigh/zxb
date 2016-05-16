package com.wangkuo.zxb.lsp.api.dto.output;

import com.wangkuo.zxb.lsp.api.dto.input.PageInput;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2016-03-02
 */
public class LspReceiverShipperInfoOutput  implements Serializable {
    private Long id;

    private Long lspUserId;

    private String linkName;

    private Integer type;

    private String companyName;

    private String mobile;

    private String telphone;

    private Long provinceId;

    private String provinceName;

    private Long cityId;

    private String cityName;

    private Long countryId;

    private String countryName;

    private String detailedAddress;

    private Integer defaultAddress;

    private String memo;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLspUserId() {
        return lspUserId;
    }

    public void setLspUserId(Long lspUserId) {
        this.lspUserId = lspUserId;
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName == null ? null : linkName.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
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

    public Integer getDefaultAddress() {
        return defaultAddress;
    }

    public void setDefaultAddress(Integer defaultAddress) {
        this.defaultAddress = defaultAddress;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    @Override
    public String toString() {
        return "LspReceiverShipperInfoOutput{" +
                "id=" + id +
                ", lspUserId=" + lspUserId +
                ", linkName='" + linkName + '\'' +
                ", type=" + type +
                ", companyName='" + companyName + '\'' +
                ", mobile='" + mobile + '\'' +
                ", telphone='" + telphone + '\'' +
                ", provinceId=" + provinceId +
                ", provinceName='" + provinceName + '\'' +
                ", cityId=" + cityId +
                ", cityName='" + cityName + '\'' +
                ", countryId=" + countryId +
                ", countryName='" + countryName + '\'' +
                ", detailedAddress='" + detailedAddress + '\'' +
                ", defaultAddress=" + defaultAddress +
                ", memo='" + memo + '\'' +
                '}';
    }
}
