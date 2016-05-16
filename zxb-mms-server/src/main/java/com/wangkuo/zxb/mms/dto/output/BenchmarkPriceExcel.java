package com.wangkuo.zxb.mms.dto.output;

import com.wangkuo.zxb.mms.util.ExcelAnnotation;

/**
 * Created by mark on 16/5/9.
 */
public class BenchmarkPriceExcel {

    @ExcelAnnotation(name = "集散中心",order = 1)
    private String allocCenterName;
    @ExcelAnnotation(name = "目的省",order = 2)
    private String endProvinceName;
    @ExcelAnnotation(name = "目的市",order = 3)
    private String endCityName;
    @ExcelAnnotation(name = "目的区",order = 4)
    private String endCountryName;

    @ExcelAnnotation(name = "重货区间",order = 5)
    private String sectionHeavy1;
    @ExcelAnnotation(name = "重货区间",order = 6)
    private String sectionHeavy2;
    @ExcelAnnotation(name = "重货区间",order = 7)
    private String sectionHeavy3;
    @ExcelAnnotation(name = "重货区间",order = 8)
    private String sectionHeavy4;
    @ExcelAnnotation(name = "重货区间",order = 9)
    private String sectionHeavy5;
    @ExcelAnnotation(name = "重货区间",order = 10)
    private String sectionHeavy6;
    @ExcelAnnotation(name = "重货区间",order = 11)
    private String sectionHeavy7;
    @ExcelAnnotation(name = "重货区间",order = 12)
    private String sectionHeavy8;
    @ExcelAnnotation(name = "重货区间",order = 13)
    private String sectionHeavy9;

    @ExcelAnnotation(name = "抛货区间",order = 14)
    private String sectionLight1;
    @ExcelAnnotation(name = "抛货区间",order = 15)
    private String sectionLight2;
    @ExcelAnnotation(name = "抛货区间",order = 16)
    private String sectionLight3;
    @ExcelAnnotation(name = "抛货区间",order = 17)
    private String sectionLight4;
    @ExcelAnnotation(name = "抛货区间",order = 18)
    private String sectionLight5;
    @ExcelAnnotation(name = "抛货区间",order = 19)
    private String sectionLight6;
    @ExcelAnnotation(name = "抛货区间",order = 20)
    private String sectionLight7;
    @ExcelAnnotation(name = "抛货区间",order = 21)
    private String sectionLight8;
    @ExcelAnnotation(name = "抛货区间",order = 22)
    private String sectionLight9;

    @ExcelAnnotation(name = "重抛货区间",order = 23)
    private String sectionHeavyLight1;
    @ExcelAnnotation(name = "重抛货区间",order = 24)
    private String sectionHeavyLight2;
    @ExcelAnnotation(name = "重抛货区间",order = 25)
    private String sectionHeavyLight3;
    @ExcelAnnotation(name = "重抛货区间",order = 26)
    private String sectionHeavyLight4;
    @ExcelAnnotation(name = "重抛货区间",order = 27)
    private String sectionHeavyLight5;
    @ExcelAnnotation(name = "重抛货区间",order = 28)
    private String sectionHeavyLight6;
    @ExcelAnnotation(name = "重抛货区间",order = 29)
    private String sectionHeavyLight7;
    @ExcelAnnotation(name = "重抛货区间",order = 30)
    private String sectionHeavyLight8;
    @ExcelAnnotation(name = "重抛货区间",order = 31)
    private String sectionHeavyLight9;

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

    public String getSectionHeavy1() {
        return sectionHeavy1;
    }

    public void setSectionHeavy1(String sectionHeavy1) {
        this.sectionHeavy1 = sectionHeavy1;
    }

    public String getSectionHeavy2() {
        return sectionHeavy2;
    }

    public void setSectionHeavy2(String sectionHeavy2) {
        this.sectionHeavy2 = sectionHeavy2;
    }

    public String getSectionHeavy3() {
        return sectionHeavy3;
    }

    public void setSectionHeavy3(String sectionHeavy3) {
        this.sectionHeavy3 = sectionHeavy3;
    }

    public String getSectionHeavy4() {
        return sectionHeavy4;
    }

    public void setSectionHeavy4(String sectionHeavy4) {
        this.sectionHeavy4 = sectionHeavy4;
    }

    public String getSectionHeavy5() {
        return sectionHeavy5;
    }

    public void setSectionHeavy5(String sectionHeavy5) {
        this.sectionHeavy5 = sectionHeavy5;
    }

    public String getSectionHeavy6() {
        return sectionHeavy6;
    }

    public void setSectionHeavy6(String sectionHeavy6) {
        this.sectionHeavy6 = sectionHeavy6;
    }

    public String getSectionHeavy7() {
        return sectionHeavy7;
    }

    public void setSectionHeavy7(String sectionHeavy7) {
        this.sectionHeavy7 = sectionHeavy7;
    }

    public String getSectionHeavy8() {
        return sectionHeavy8;
    }

    public void setSectionHeavy8(String sectionHeavy8) {
        this.sectionHeavy8 = sectionHeavy8;
    }

    public String getSectionHeavy9() {
        return sectionHeavy9;
    }

    public void setSectionHeavy9(String sectionHeavy9) {
        this.sectionHeavy9 = sectionHeavy9;
    }

    public String getSectionLight1() {
        return sectionLight1;
    }

    public void setSectionLight1(String sectionLight1) {
        this.sectionLight1 = sectionLight1;
    }

    public String getSectionLight2() {
        return sectionLight2;
    }

    public void setSectionLight2(String sectionLight2) {
        this.sectionLight2 = sectionLight2;
    }

    public String getSectionLight3() {
        return sectionLight3;
    }

    public void setSectionLight3(String sectionLight3) {
        this.sectionLight3 = sectionLight3;
    }

    public String getSectionLight4() {
        return sectionLight4;
    }

    public void setSectionLight4(String sectionLight4) {
        this.sectionLight4 = sectionLight4;
    }

    public String getSectionLight5() {
        return sectionLight5;
    }

    public void setSectionLight5(String sectionLight5) {
        this.sectionLight5 = sectionLight5;
    }

    public String getSectionLight6() {
        return sectionLight6;
    }

    public void setSectionLight6(String sectionLight6) {
        this.sectionLight6 = sectionLight6;
    }

    public String getSectionLight7() {
        return sectionLight7;
    }

    public void setSectionLight7(String sectionLight7) {
        this.sectionLight7 = sectionLight7;
    }

    public String getSectionLight8() {
        return sectionLight8;
    }

    public void setSectionLight8(String sectionLight8) {
        this.sectionLight8 = sectionLight8;
    }

    public String getSectionLight9() {
        return sectionLight9;
    }

    public void setSectionLight9(String sectionLight9) {
        this.sectionLight9 = sectionLight9;
    }

    public String getSectionHeavyLight1() {
        return sectionHeavyLight1;
    }

    public void setSectionHeavyLight1(String sectionHeavyLight1) {
        this.sectionHeavyLight1 = sectionHeavyLight1;
    }

    public String getSectionHeavyLight2() {
        return sectionHeavyLight2;
    }

    public void setSectionHeavyLight2(String sectionHeavyLight2) {
        this.sectionHeavyLight2 = sectionHeavyLight2;
    }

    public String getSectionHeavyLight3() {
        return sectionHeavyLight3;
    }

    public void setSectionHeavyLight3(String sectionHeavyLight3) {
        this.sectionHeavyLight3 = sectionHeavyLight3;
    }

    public String getSectionHeavyLight4() {
        return sectionHeavyLight4;
    }

    public void setSectionHeavyLight4(String sectionHeavyLight4) {
        this.sectionHeavyLight4 = sectionHeavyLight4;
    }

    public String getSectionHeavyLight5() {
        return sectionHeavyLight5;
    }

    public void setSectionHeavyLight5(String sectionHeavyLight5) {
        this.sectionHeavyLight5 = sectionHeavyLight5;
    }

    public String getSectionHeavyLight6() {
        return sectionHeavyLight6;
    }

    public void setSectionHeavyLight6(String sectionHeavyLight6) {
        this.sectionHeavyLight6 = sectionHeavyLight6;
    }

    public String getSectionHeavyLight7() {
        return sectionHeavyLight7;
    }

    public void setSectionHeavyLight7(String sectionHeavyLight7) {
        this.sectionHeavyLight7 = sectionHeavyLight7;
    }

    public String getSectionHeavyLight8() {
        return sectionHeavyLight8;
    }

    public void setSectionHeavyLight8(String sectionHeavyLight8) {
        this.sectionHeavyLight8 = sectionHeavyLight8;
    }

    public String getSectionHeavyLight9() {
        return sectionHeavyLight9;
    }

    public void setSectionHeavyLight9(String sectionHeavyLight9) {
        this.sectionHeavyLight9 = sectionHeavyLight9;
    }
}
