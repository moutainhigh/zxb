package com.wangkuo.zxb.smart.show.dto.output;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *  目的区域的相关信息
 * Created by john on 2016/4/15.
 */
public class AreaFeeOutput implements Serializable {
    //目的区域
    private String consigneeArea;
    //发货区域
    private String consignerArea;
    //专线
    private String shipers;

    //该目标区域对应的交易额
    private BigDecimal totalFee;

    public String getConsigneeArea() {
        return consigneeArea;
    }

    public void setConsigneeArea(String consigneeArea) {
        this.consigneeArea = consigneeArea;
    }

    public String getConsignerArea() {
        return consignerArea;
    }

    public void setConsignerArea(String consignerArea) {
        this.consignerArea = consignerArea;
    }

    public String getShipers() {
        return shipers;
    }

    public void setShipers(String shipers) {
        this.shipers = shipers;
    }

    public BigDecimal getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }
}
