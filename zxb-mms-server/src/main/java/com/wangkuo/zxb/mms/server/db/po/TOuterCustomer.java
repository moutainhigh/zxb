package com.wangkuo.zxb.mms.server.db.po;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

public class TOuterCustomer implements Serializable {
    private Long id;
    @NotBlank
    private String customerName;

    private String allocCentre;

    private Long allocCentreId;

    private String region;

    private Long regionId;
    @NotNull
    private Integer merchantStatus;

    private Integer status;

    private Integer shipmentsStatus;

    private String industry;

    private String sysAccount;
    @NotBlank
    private String logisticsDemand;

    private String memo;
    @NotBlank
    private String province;

    private Long provinceId;
    @NotBlank
    private String city;

    private Long cityId;
    @NotBlank
    private String county;

    private Long countyId;

    private String address;
    @NotBlank
    private String linkman;

    private String mobile;

    private String telephone;

    private String jobTitle;

    private Date serviceLife;

    private String currUser;

    private Long currUserId;

    private String goodsCategory;

    private String goodsAttr;

    private String goodsAttrMemo;

    private String goodsPackage;

    private String goodsPackageMemo;

    private String transportMode;

    private String transportModeMemo;

    private String paymentMode;

    private String paymentModeMemo;

    private String vehicleDemand;

    private String vehicleDemandMemo;

    private String deliverySchedule;

    private String deliveryScheduleMemo;

    private String attention;

    private String attentionMemo;

    private Date createdTime;

    private String createdUser;

    private Long createdUserId;

    private Date updatedTime;

    private String updatedUser;

    private Long updatedUserId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getAllocCentre() {
        return allocCentre;
    }

    public void setAllocCentre(String allocCentre) {
        this.allocCentre = allocCentre == null ? null : allocCentre.trim();
    }

    public Long getAllocCentreId() {
        return allocCentreId;
    }

    public void setAllocCentreId(Long allocCentreId) {
        this.allocCentreId = allocCentreId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public Integer getMerchantStatus() {
        return merchantStatus;
    }

    public void setMerchantStatus(Integer merchantStatus) {
        this.merchantStatus = merchantStatus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getShipmentsStatus() {
        return shipmentsStatus;
    }

    public void setShipmentsStatus(Integer shipmentsStatus) {
        this.shipmentsStatus = shipmentsStatus;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    public String getSysAccount() {
        return sysAccount;
    }

    public void setSysAccount(String sysAccount) {
        this.sysAccount = sysAccount == null ? null : sysAccount.trim();
    }

    public String getLogisticsDemand() {
        return logisticsDemand;
    }

    public void setLogisticsDemand(String logisticsDemand) {
        this.logisticsDemand = logisticsDemand == null ? null : logisticsDemand.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    public Long getCountyId() {
        return countyId;
    }

    public void setCountyId(Long countyId) {
        this.countyId = countyId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle == null ? null : jobTitle.trim();
    }

    public Date getServiceLife() {
        return serviceLife;
    }

    public void setServiceLife(Date serviceLife) {
        this.serviceLife = serviceLife;
    }

    public String getCurrUser() {
        return currUser;
    }

    public void setCurrUser(String currUser) {
        this.currUser = currUser == null ? null : currUser.trim();
    }

    public Long getCurrUserId() {
        return currUserId;
    }

    public void setCurrUserId(Long currUserId) {
        this.currUserId = currUserId;
    }

    public String getGoodsCategory() {
        return goodsCategory;
    }

    public void setGoodsCategory(String goodsCategory) {
        this.goodsCategory = goodsCategory == null ? null : goodsCategory.trim();
    }

    public String getGoodsAttr() {
        return goodsAttr;
    }

    public void setGoodsAttr(String goodsAttr) {
        this.goodsAttr = goodsAttr == null ? null : goodsAttr.trim();
    }

    public String getGoodsAttrMemo() {
        return goodsAttrMemo;
    }

    public void setGoodsAttrMemo(String goodsAttrMemo) {
        this.goodsAttrMemo = goodsAttrMemo == null ? null : goodsAttrMemo.trim();
    }

    public String getGoodsPackage() {
        return goodsPackage;
    }

    public void setGoodsPackage(String goodsPackage) {
        this.goodsPackage = goodsPackage == null ? null : goodsPackage.trim();
    }

    public String getGoodsPackageMemo() {
        return goodsPackageMemo;
    }

    public void setGoodsPackageMemo(String goodsPackageMemo) {
        this.goodsPackageMemo = goodsPackageMemo == null ? null : goodsPackageMemo.trim();
    }

    public String getTransportMode() {
        return transportMode;
    }

    public void setTransportMode(String transportMode) {
        this.transportMode = transportMode == null ? null : transportMode.trim();
    }

    public String getTransportModeMemo() {
        return transportModeMemo;
    }

    public void setTransportModeMemo(String transportModeMemo) {
        this.transportModeMemo = transportModeMemo == null ? null : transportModeMemo.trim();
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode == null ? null : paymentMode.trim();
    }

    public String getPaymentModeMemo() {
        return paymentModeMemo;
    }

    public void setPaymentModeMemo(String paymentModeMemo) {
        this.paymentModeMemo = paymentModeMemo == null ? null : paymentModeMemo.trim();
    }

    public String getVehicleDemand() {
        return vehicleDemand;
    }

    public void setVehicleDemand(String vehicleDemand) {
        this.vehicleDemand = vehicleDemand == null ? null : vehicleDemand.trim();
    }

    public String getVehicleDemandMemo() {
        return vehicleDemandMemo;
    }

    public void setVehicleDemandMemo(String vehicleDemandMemo) {
        this.vehicleDemandMemo = vehicleDemandMemo == null ? null : vehicleDemandMemo.trim();
    }

    public String getDeliverySchedule() {
        return deliverySchedule;
    }

    public void setDeliverySchedule(String deliverySchedule) {
        this.deliverySchedule = deliverySchedule == null ? null : deliverySchedule.trim();
    }

    public String getDeliveryScheduleMemo() {
        return deliveryScheduleMemo;
    }

    public void setDeliveryScheduleMemo(String deliveryScheduleMemo) {
        this.deliveryScheduleMemo = deliveryScheduleMemo == null ? null : deliveryScheduleMemo.trim();
    }

    public String getAttention() {
        return attention;
    }

    public void setAttention(String attention) {
        this.attention = attention == null ? null : attention.trim();
    }

    public String getAttentionMemo() {
        return attentionMemo;
    }

    public void setAttentionMemo(String attentionMemo) {
        this.attentionMemo = attentionMemo == null ? null : attentionMemo.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser == null ? null : createdUser.trim();
    }

    public Long getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(Long createdUserId) {
        this.createdUserId = createdUserId;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getUpdatedUser() {
        return updatedUser;
    }

    public void setUpdatedUser(String updatedUser) {
        this.updatedUser = updatedUser == null ? null : updatedUser.trim();
    }

    public Long getUpdatedUserId() {
        return updatedUserId;
    }

    public void setUpdatedUserId(Long updatedUserId) {
        this.updatedUserId = updatedUserId;
    }
}