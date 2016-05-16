package com.wangkuo.zxb.mms.dto.params;

/**
 * Created by mark on 16/5/6.
 */
public class QueryBenchmarkPriceParam extends PageParam {
    private Long allotId;
    private Long provinceId;
    private String provinceName;
    private Long cityId;
    private String cityName;
    private Long countryId;
    private String countryName;

    public Long getAllotId() {
        return allotId;
    }

    public void setAllotId(Long allotId) {
        this.allotId = allotId;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
