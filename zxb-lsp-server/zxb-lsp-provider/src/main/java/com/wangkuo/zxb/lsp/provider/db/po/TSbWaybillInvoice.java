package com.wangkuo.zxb.lsp.provider.db.po;

import java.io.Serializable;

public class TSbWaybillInvoice implements Serializable {
    private Long id;

    private Long waybillId;

    private String companyName;

    private String code;

    private String address;

    private String phone;

    private String bankName;

    private String bankAccount;

    private String content;

    private String consigneeName;

    private String consigneeMobile;

    private String consigneeAddress;

    private String consigneeProvince;

    private Long consigneeProvinceId;

    private String consigneeCity;

    private Long consigneeCityId;

    private String consigneeCounty;

    private Long consigneeCountyId;

    private String consigneeTown;

    private Long consigneeTownId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWaybillId() {
        return waybillId;
    }

    public void setWaybillId(Long waybillId) {
        this.waybillId = waybillId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getConsigneeName() {
        return consigneeName;
    }

    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName == null ? null : consigneeName.trim();
    }

    public String getConsigneeMobile() {
        return consigneeMobile;
    }

    public void setConsigneeMobile(String consigneeMobile) {
        this.consigneeMobile = consigneeMobile == null ? null : consigneeMobile.trim();
    }

    public String getConsigneeAddress() {
        return consigneeAddress;
    }

    public void setConsigneeAddress(String consigneeAddress) {
        this.consigneeAddress = consigneeAddress == null ? null : consigneeAddress.trim();
    }

    public String getConsigneeProvince() {
        return consigneeProvince;
    }

    public void setConsigneeProvince(String consigneeProvince) {
        this.consigneeProvince = consigneeProvince == null ? null : consigneeProvince.trim();
    }

    public Long getConsigneeProvinceId() {
        return consigneeProvinceId;
    }

    public void setConsigneeProvinceId(Long consigneeProvinceId) {
        this.consigneeProvinceId = consigneeProvinceId;
    }

    public String getConsigneeCity() {
        return consigneeCity;
    }

    public void setConsigneeCity(String consigneeCity) {
        this.consigneeCity = consigneeCity == null ? null : consigneeCity.trim();
    }

    public Long getConsigneeCityId() {
        return consigneeCityId;
    }

    public void setConsigneeCityId(Long consigneeCityId) {
        this.consigneeCityId = consigneeCityId;
    }

    public String getConsigneeCounty() {
        return consigneeCounty;
    }

    public void setConsigneeCounty(String consigneeCounty) {
        this.consigneeCounty = consigneeCounty == null ? null : consigneeCounty.trim();
    }

    public Long getConsigneeCountyId() {
        return consigneeCountyId;
    }

    public void setConsigneeCountyId(Long consigneeCountyId) {
        this.consigneeCountyId = consigneeCountyId;
    }

    public String getConsigneeTown() {
        return consigneeTown;
    }

    public void setConsigneeTown(String consigneeTown) {
        this.consigneeTown = consigneeTown == null ? null : consigneeTown.trim();
    }

    public Long getConsigneeTownId() {
        return consigneeTownId;
    }

    public void setConsigneeTownId(Long consigneeTownId) {
        this.consigneeTownId = consigneeTownId;
    }
}