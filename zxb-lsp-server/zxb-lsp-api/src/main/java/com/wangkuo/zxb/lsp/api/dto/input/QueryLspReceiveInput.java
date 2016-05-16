package com.wangkuo.zxb.lsp.api.dto.input;


/**
 * Created by sanshao on 16-4-5.
 */
public class QueryLspReceiveInput extends PageInput{

    private Long lspProvinceId;
    private String lspProvinceName;
    private Long lspCityId;
    private String lspCityName;
    private Long lspCountryId;
    private String lspCountryName;
    private String lspCompanyName;
    private String waybillSn;
    private String goodsName;
    private String receiveName;
    private Long provinceId;
    private String provinceName;
    private Long cityId;
    private String cityName;
    private String transportName;
    private Long allocCenterId;

    public Long getLspProvinceId() {
        return lspProvinceId;
    }

    public void setLspProvinceId(Long lspProvinceId) {
        this.lspProvinceId = lspProvinceId;
    }

    public String getLspProvinceName() {
        return lspProvinceName;
    }

    public void setLspProvinceName(String lspProvinceName) {
        this.lspProvinceName = lspProvinceName;
    }

    public Long getLspCityId() {
        return lspCityId;
    }

    public void setLspCityId(Long lspCityId) {
        this.lspCityId = lspCityId;
    }

    public String getLspCityName() {
        return lspCityName;
    }

    public void setLspCityName(String lspCityName) {
        this.lspCityName = lspCityName;
    }

    public Long getLspCountryId() {
        return lspCountryId;
    }

    public void setLspCountryId(Long lspCountryId) {
        this.lspCountryId = lspCountryId;
    }

    public String getLspCountryName() {
        return lspCountryName;
    }

    public void setLspCountryName(String lspCountryName) {
        this.lspCountryName = lspCountryName;
    }

    public String getLspCompanyName() {
        return lspCompanyName;
    }

    public void setLspCompanyName(String lspCompanyName) {
        this.lspCompanyName = lspCompanyName;
    }

    public String getWaybillSn() {
        return waybillSn;
    }

    public void setWaybillSn(String waybillSn) {
        this.waybillSn = waybillSn;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getReceiveName() {
        return receiveName;
    }

    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName;
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
        this.provinceName = provinceName;
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
        this.cityName = cityName;
    }

    public String getTransportName() {
        return transportName;
    }

    public void setTransportName(String transportName) {
        this.transportName = transportName;
    }

    public Long getAllocCenterId() {
        return allocCenterId;
    }

    public void setAllocCenterId(Long allocCenterId) {
        this.allocCenterId = allocCenterId;
    }
}
