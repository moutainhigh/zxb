package com.wangkuo.zxb.mms.dto.output;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by mark on 16/5/6.
 */
public class BenchmarkPriceOutput implements Serializable {

    private String allocCenterName;
    private String endProvinceName;
    private String endCityName;
    private String endCountryName;
    private Map<String, String> sections1;//重货
    private Map<String, String> sections2;//抛货
    private Map<String, String> sections3;//重抛货

    public String getAllocCenterName() {
        return allocCenterName;
    }

    public void setAllocCenterName(String allocCenterName) {
        this.allocCenterName = allocCenterName;
    }

    public String getEndProvinceName() {
        return endProvinceName;
    }

    public void setEndProvinceName(String endProvinceName) {
        this.endProvinceName = endProvinceName;
    }

    public String getEndCityName() {
        return endCityName;
    }

    public void setEndCityName(String endCityName) {
        this.endCityName = endCityName;
    }

    public String getEndCountryName() {
        return endCountryName;
    }

    public void setEndCountryName(String endCountryName) {
        this.endCountryName = endCountryName;
    }

    public Map<String, String> getSections1() {
        return sections1;
    }

    public void setSections1(Map<String, String> sections1) {
        this.sections1 = sections1;
    }

    public Map<String, String> getSections2() {
        return sections2;
    }

    public void setSections2(Map<String, String> sections2) {
        this.sections2 = sections2;
    }

    public Map<String, String> getSections3() {
        return sections3;
    }

    public void setSections3(Map<String, String> sections3) {
        this.sections3 = sections3;
    }
}
