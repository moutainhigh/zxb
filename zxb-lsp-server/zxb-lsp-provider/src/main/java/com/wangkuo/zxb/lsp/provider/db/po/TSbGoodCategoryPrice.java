package com.wangkuo.zxb.lsp.provider.db.po;

import java.io.Serializable;
import java.math.BigDecimal;

public class TSbGoodCategoryPrice implements Serializable {
    private Long id;

    private Long goodCategoryAllotId;

    private Long endProvinceId;

    private String endProvinceName;

    private Long endCityId;

    private String endCityName;

    private Long endCountryId;

    private String endCountryName;

    private Float floatRateCity;

    private Float floatRateCountry;

    private BigDecimal floatFixedCity;

    private BigDecimal floatFixedCountry;

    private Integer floatType;

    private Integer pieceType;

    private BigDecimal pieceSiteToSiteFeeCity;

    private BigDecimal pieceSiteToSiteSendGoodFeeCity;

    private BigDecimal pieceSiteToDoorFeeCity;

    private BigDecimal pieceSiteToSiteFeeCountry;

    private BigDecimal pieceSiteToSiteSendGoodFeeCountry;

    private BigDecimal pieceSiteToDoorFeeCountry;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGoodCategoryAllotId() {
        return goodCategoryAllotId;
    }

    public void setGoodCategoryAllotId(Long goodCategoryAllotId) {
        this.goodCategoryAllotId = goodCategoryAllotId;
    }

    public Long getEndProvinceId() {
        return endProvinceId;
    }

    public void setEndProvinceId(Long endProvinceId) {
        this.endProvinceId = endProvinceId;
    }

    public String getEndProvinceName() {
        return endProvinceName;
    }

    public void setEndProvinceName(String endProvinceName) {
        this.endProvinceName = endProvinceName == null ? null : endProvinceName.trim();
    }

    public Long getEndCityId() {
        return endCityId;
    }

    public void setEndCityId(Long endCityId) {
        this.endCityId = endCityId;
    }

    public String getEndCityName() {
        return endCityName;
    }

    public void setEndCityName(String endCityName) {
        this.endCityName = endCityName == null ? null : endCityName.trim();
    }

    public Long getEndCountryId() {
        return endCountryId;
    }

    public void setEndCountryId(Long endCountryId) {
        this.endCountryId = endCountryId;
    }

    public String getEndCountryName() {
        return endCountryName;
    }

    public void setEndCountryName(String endCountryName) {
        this.endCountryName = endCountryName == null ? null : endCountryName.trim();
    }

    public Float getFloatRateCity() {
        return floatRateCity;
    }

    public void setFloatRateCity(Float floatRateCity) {
        this.floatRateCity = floatRateCity;
    }

    public Float getFloatRateCountry() {
        return floatRateCountry;
    }

    public void setFloatRateCountry(Float floatRateCountry) {
        this.floatRateCountry = floatRateCountry;
    }

    public BigDecimal getFloatFixedCity() {
        return floatFixedCity;
    }

    public void setFloatFixedCity(BigDecimal floatFixedCity) {
        this.floatFixedCity = floatFixedCity;
    }

    public BigDecimal getFloatFixedCountry() {
        return floatFixedCountry;
    }

    public void setFloatFixedCountry(BigDecimal floatFixedCountry) {
        this.floatFixedCountry = floatFixedCountry;
    }

    public Integer getFloatType() {
        return floatType;
    }

    public void setFloatType(Integer floatType) {
        this.floatType = floatType;
    }

    public Integer getPieceType() {
        return pieceType;
    }

    public void setPieceType(Integer pieceType) {
        this.pieceType = pieceType;
    }

    public BigDecimal getPieceSiteToSiteFeeCity() {
        return pieceSiteToSiteFeeCity;
    }

    public void setPieceSiteToSiteFeeCity(BigDecimal pieceSiteToSiteFeeCity) {
        this.pieceSiteToSiteFeeCity = pieceSiteToSiteFeeCity;
    }

    public BigDecimal getPieceSiteToSiteSendGoodFeeCity() {
        return pieceSiteToSiteSendGoodFeeCity;
    }

    public void setPieceSiteToSiteSendGoodFeeCity(BigDecimal pieceSiteToSiteSendGoodFeeCity) {
        this.pieceSiteToSiteSendGoodFeeCity = pieceSiteToSiteSendGoodFeeCity;
    }

    public BigDecimal getPieceSiteToDoorFeeCity() {
        return pieceSiteToDoorFeeCity;
    }

    public void setPieceSiteToDoorFeeCity(BigDecimal pieceSiteToDoorFeeCity) {
        this.pieceSiteToDoorFeeCity = pieceSiteToDoorFeeCity;
    }

    public BigDecimal getPieceSiteToSiteFeeCountry() {
        return pieceSiteToSiteFeeCountry;
    }

    public void setPieceSiteToSiteFeeCountry(BigDecimal pieceSiteToSiteFeeCountry) {
        this.pieceSiteToSiteFeeCountry = pieceSiteToSiteFeeCountry;
    }

    public BigDecimal getPieceSiteToSiteSendGoodFeeCountry() {
        return pieceSiteToSiteSendGoodFeeCountry;
    }

    public void setPieceSiteToSiteSendGoodFeeCountry(BigDecimal pieceSiteToSiteSendGoodFeeCountry) {
        this.pieceSiteToSiteSendGoodFeeCountry = pieceSiteToSiteSendGoodFeeCountry;
    }

    public BigDecimal getPieceSiteToDoorFeeCountry() {
        return pieceSiteToDoorFeeCountry;
    }

    public void setPieceSiteToDoorFeeCountry(BigDecimal pieceSiteToDoorFeeCountry) {
        this.pieceSiteToDoorFeeCountry = pieceSiteToDoorFeeCountry;
    }
}