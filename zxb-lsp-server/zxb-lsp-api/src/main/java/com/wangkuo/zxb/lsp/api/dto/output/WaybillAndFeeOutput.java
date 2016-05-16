package com.wangkuo.zxb.lsp.api.dto.output;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 *
 * 运单查询结果返回结果集.
 *
 * 结果内容见属性定义
 *
 * @author levitch
 * @date 16/4/5
 * @versioin 1.0
 **/
public class WaybillAndFeeOutput implements Serializable {

    private Long id;

    private String systemSn;

    private String sn;

    private Date operationTime;

    private Integer status;

    private Date createTime;

    private Integer payStatus;

    //发货人

    private String shipperCustomerName;

    private String shipperLinkName;

    private String shipperLinkPhone;

    private Long shipperProvinceId;

    private String shipperProvinceName;

    private Long shipperCityId;

    private String shipperCityName;

    private Long shipperCountryId;

    private String shipperCountryName;

    private Long shipperTownId;

    private String shipperTownName;

    private String shipperAddress;


    //收货人
    private String receiveName;

    private String receiveLinkName;

    private String receiveLinkPhone;

    private Long receiveProvinceId;

    private String receiveProvinceName;

    private Long receiveCityId;

    private String receiveCityName;

    private Long receiveCountryId;

    private String receiveCountryName;

    private String receiveAddress;


    //货物信息
    private String goodName;

    private Integer num;

    private Float offerWeight;

    private Float offerVolume;

    private String pack;


    /**
     * 其他运费费用列表
     */
    private List<WaybillExtraFeeOutput> feeList;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSystemSn() {
        return systemSn;
    }

    public void setSystemSn(String systemSn) {
        this.systemSn = systemSn;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public Date getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getShipperCustomerName() {
        return shipperCustomerName;
    }

    public void setShipperCustomerName(String shipperCustomerName) {
        this.shipperCustomerName = shipperCustomerName;
    }

    public String getShipperLinkName() {
        return shipperLinkName;
    }

    public void setShipperLinkName(String shipperLinkName) {
        this.shipperLinkName = shipperLinkName;
    }

    public String getShipperLinkPhone() {
        return shipperLinkPhone;
    }

    public void setShipperLinkPhone(String shipperLinkPhone) {
        this.shipperLinkPhone = shipperLinkPhone;
    }

    public Long getShipperProvinceId() {
        return shipperProvinceId;
    }

    public void setShipperProvinceId(Long shipperProvinceId) {
        this.shipperProvinceId = shipperProvinceId;
    }

    public String getShipperProvinceName() {
        return shipperProvinceName;
    }

    public void setShipperProvinceName(String shipperProvinceName) {
        this.shipperProvinceName = shipperProvinceName;
    }

    public Long getShipperCityId() {
        return shipperCityId;
    }

    public void setShipperCityId(Long shipperCityId) {
        this.shipperCityId = shipperCityId;
    }

    public String getShipperCityName() {
        return shipperCityName;
    }

    public void setShipperCityName(String shipperCityName) {
        this.shipperCityName = shipperCityName;
    }

    public Long getShipperCountryId() {
        return shipperCountryId;
    }

    public void setShipperCountryId(Long shipperCountryId) {
        this.shipperCountryId = shipperCountryId;
    }

    public String getShipperCountryName() {
        return shipperCountryName;
    }

    public void setShipperCountryName(String shipperCountryName) {
        this.shipperCountryName = shipperCountryName;
    }

    public Long getShipperTownId() {
        return shipperTownId;
    }

    public void setShipperTownId(Long shipperTownId) {
        this.shipperTownId = shipperTownId;
    }

    public String getShipperTownName() {
        return shipperTownName;
    }

    public void setShipperTownName(String shipperTownName) {
        this.shipperTownName = shipperTownName;
    }

    public String getShipperAddress() {
        return shipperAddress;
    }

    public void setShipperAddress(String shipperAddress) {
        this.shipperAddress = shipperAddress;
    }

    public String getReceiveName() {
        return receiveName;
    }

    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName;
    }

    public String getReceiveLinkName() {
        return receiveLinkName;
    }

    public void setReceiveLinkName(String receiveLinkName) {
        this.receiveLinkName = receiveLinkName;
    }

    public String getReceiveLinkPhone() {
        return receiveLinkPhone;
    }

    public void setReceiveLinkPhone(String receiveLinkPhone) {
        this.receiveLinkPhone = receiveLinkPhone;
    }

    public Long getReceiveProvinceId() {
        return receiveProvinceId;
    }

    public void setReceiveProvinceId(Long receiveProvinceId) {
        this.receiveProvinceId = receiveProvinceId;
    }

    public String getReceiveProvinceName() {
        return receiveProvinceName;
    }

    public void setReceiveProvinceName(String receiveProvinceName) {
        this.receiveProvinceName = receiveProvinceName;
    }

    public Long getReceiveCityId() {
        return receiveCityId;
    }

    public void setReceiveCityId(Long receiveCityId) {
        this.receiveCityId = receiveCityId;
    }

    public String getReceiveCityName() {
        return receiveCityName;
    }

    public void setReceiveCityName(String receiveCityName) {
        this.receiveCityName = receiveCityName;
    }

    public Long getReceiveCountryId() {
        return receiveCountryId;
    }

    public void setReceiveCountryId(Long receiveCountryId) {
        this.receiveCountryId = receiveCountryId;
    }

    public String getReceiveCountryName() {
        return receiveCountryName;
    }

    public void setReceiveCountryName(String receiveCountryName) {
        this.receiveCountryName = receiveCountryName;
    }

    public String getReceiveAddress() {
        return receiveAddress;
    }

    public void setReceiveAddress(String receiveAddress) {
        this.receiveAddress = receiveAddress;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Float getOfferWeight() {
        return offerWeight;
    }

    public void setOfferWeight(Float offerWeight) {
        this.offerWeight = offerWeight;
    }

    public Float getOfferVolume() {
        return offerVolume;
    }

    public void setOfferVolume(Float offerVolume) {
        this.offerVolume = offerVolume;
    }

    public List<WaybillExtraFeeOutput> getFeeList() {
        return feeList;
    }

    public void setFeeList(List<WaybillExtraFeeOutput> feeList) {
        this.feeList = feeList;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }
}
