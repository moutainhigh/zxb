package com.wangkuo.zxb.smart.show.dto.output;

import java.io.Serializable;


/**
 * Created by john on 2016/4/18.
 */
public class DeliveryMapAreaOutput implements Serializable {
    //发货市
    private String consignerCity;
    //收货市
    private String consigneeCity;

    public String getConsignerCity() {
        return consignerCity;
    }

    public void setConsignerCity(String consignerCity) {
        this.consignerCity = consignerCity;
    }

    public String getConsigneeCity() {
        return consigneeCity;
    }

    public void setConsigneeCity(String consigneeCity) {
        this.consigneeCity = consigneeCity;
    }
}
