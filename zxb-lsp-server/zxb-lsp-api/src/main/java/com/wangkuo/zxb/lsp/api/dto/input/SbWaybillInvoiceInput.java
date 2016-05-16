package com.wangkuo.zxb.lsp.api.dto.input;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/4/11.
 */
public class SbWaybillInvoiceInput implements Serializable {

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
        this.companyName = companyName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getConsigneeName() {
        return consigneeName;
    }

    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
    }

    public String getConsigneeMobile() {
        return consigneeMobile;
    }

    public void setConsigneeMobile(String consigneeMobile) {
        this.consigneeMobile = consigneeMobile;
    }

    public String getConsigneeAddress() {
        return consigneeAddress;
    }

    public void setConsigneeAddress(String consigneeAddress) {
        this.consigneeAddress = consigneeAddress;
    }

    public String getConsigneeProvince() {
        return consigneeProvince;
    }

    public void setConsigneeProvince(String consigneeProvince) {
        this.consigneeProvince = consigneeProvince;
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
        this.consigneeCity = consigneeCity;
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
        this.consigneeCounty = consigneeCounty;
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
        this.consigneeTown = consigneeTown;
    }

    public Long getConsigneeTownId() {
        return consigneeTownId;
    }

    public void setConsigneeTownId(Long consigneeTownId) {
        this.consigneeTownId = consigneeTownId;
    }
}
