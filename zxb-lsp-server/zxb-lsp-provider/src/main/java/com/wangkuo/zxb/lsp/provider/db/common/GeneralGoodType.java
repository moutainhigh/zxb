package com.wangkuo.zxb.lsp.provider.db.common;

/**
 * Created by chaizf on 2016/4/6.
 */
public class GeneralGoodType {

    /**
     * 计算普货重抛属性（按实际体积和重量计算）
     * @param volume
     * @param weight
     * @return
     */
    public static Integer SeparateGoodType(Float volume,Float weight){
        //1 重货;2 轻货;3 重抛货
        //计算公式：体积(方)/重量(吨)
        //2方/吨以下（不含2）为重货，2-6方/吨（含2不含6）为重抛货，6方/吨（含6）以上为抛货
        Integer goodtype = 0;
        if (volume != 0 && weight != 0) {
            if (volume / weight < 2) {
                goodtype = 1;//重货
            }
            if (volume / weight >= 2 && volume / weight < 6) {
                goodtype = 3;//重抛货
            }
            if (volume / weight >= 6) {
                goodtype = 2;//抛货
            }
        }/*else{
            if(volume == 0){//体积为0为重货
                goodtype = 1;
            }
            if(weight == 0){//重量为0为抛货
                goodtype = 2;
            }
        }*/
        return goodtype;
    }

    /**
     * 针对增值服务（上楼、装卸）
     * @param volume
     * @param weight
     * @return
     */
    public static Integer valueAddedGoodType(Float volume,Float weight){
        // 3方/吨以下（含3）为重货，3方/吨以上为抛货
        Integer goodtype = 0;
        if(volume/weight <= 3){
            goodtype = 1;//重货
        }
        if(volume/weight > 3){
            goodtype = 3;//抛货
        }
        return goodtype;
    }
}
