package com.wangkuo.zxb.lsp.api.dto.output;

import java.io.Serializable;

/**
 * @author 王俊华
 * @version 1.0
 * @date 2016-03-30
 */
public class SbAreaInfoOutput implements Serializable {
    private Long id;

    private Long parentAreaId;

    private String parentAreaName;

    private String areaName;

    private String barrioCode;

    private String areaLevel;

    private String zipCode;

    private String province;

    private String city;

    private String country;

    private Short sort;

    private Double longitude;

    private Double latitude;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentAreaId() {
        return parentAreaId;
    }

    public void setParentAreaId(Long parentAreaId) {
        this.parentAreaId = parentAreaId;
    }

    public String getParentAreaName() {
        return parentAreaName;
    }

    public void setParentAreaName(String parentAreaName) {
        this.parentAreaName = parentAreaName == null ? null : parentAreaName.trim();
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public String getBarrioCode() {
        return barrioCode;
    }

    public void setBarrioCode(String barrioCode) {
        this.barrioCode = barrioCode == null ? null : barrioCode.trim();
    }

    public String getAreaLevel() {
        return areaLevel;
    }

    public void setAreaLevel(String areaLevel) {
        this.areaLevel = areaLevel == null ? null : areaLevel.trim();
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public Short getSort() {
        return sort;
    }

    public void setSort(Short sort) {
        this.sort = sort;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
}
