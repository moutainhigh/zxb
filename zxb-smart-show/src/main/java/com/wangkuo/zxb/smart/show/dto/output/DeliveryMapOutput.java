package com.wangkuo.zxb.smart.show.dto.output;

import java.io.Serializable;
import java.util.List;

/**
 * Created by john on 2016/4/18.
 */
public class DeliveryMapOutput implements Serializable {
    //最大id
    private Long id;
    //地图区域

    //private List<DeliveryMapAreaOutput> deliveryMapAreaOutputList;
    private List<List<List<BaseData>>> deliveryMapAreaOutputList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<List<List<BaseData>>> getDeliveryMapAreaOutputList() {
        return deliveryMapAreaOutputList;
    }

    public void setDeliveryMapAreaOutputList(List<List<List<BaseData>>> deliveryMapAreaOutputList) {
        this.deliveryMapAreaOutputList = deliveryMapAreaOutputList;
    }
}
