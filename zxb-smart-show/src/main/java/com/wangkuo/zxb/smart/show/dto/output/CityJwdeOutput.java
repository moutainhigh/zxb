package com.wangkuo.zxb.smart.show.dto.output;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by john on 2016/4/20.
 */
public class CityJwdeOutput implements Serializable {
    //城市名称
    private String cityName;
    //经度
    private BigDecimal longitude;
    //维度
    private BigDecimal latitude;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }
}
