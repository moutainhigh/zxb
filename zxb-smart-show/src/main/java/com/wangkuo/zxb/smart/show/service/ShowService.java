package com.wangkuo.zxb.smart.show.service;

import com.wangkuo.zxb.smart.show.db.dao.TradeDao;
import com.wangkuo.zxb.smart.show.dto.output.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author 朋朋
 * @version 1.0
 * @date 2016-04-15
 */
@Service
public class ShowService {

    @Autowired
    private TradeDao tradeDao;

    /**
     * 目的区域排行（交易额 前10行）
     *
     * @return
     */
    public List<AreaFeeOutput> getDestinationArea() {
        return tradeDao.getDestinationArea();
    }
    /**
     * 所有目的区域排行（交易额 前10行）
     *
     * @return
     */
    public List<AreaFeeOutput> getAllDestinationArea() {
        return tradeDao.getAllDestinationArea();
    }

    /**
     * 发货区域排行（交易额）
     *
     * @return
     */
    public List<AreaFeeOutput> getDeliveryArea() {
        List<AreaFeeOutput> areaFeeOutputs = tradeDao.getDeliveryArea();
        for (AreaFeeOutput areaFeeOutput : areaFeeOutputs) {
            areaFeeOutput.setConsignerArea(areaFeeOutput.getConsignerArea().replace("市", ""));
            ;
        }
        return areaFeeOutputs;
    }

    /**
     * 专线排行（交易额）
     *
     * @return
     */
    public List<AreaFeeOutput> getLineSuppliers() {
        return tradeDao.getLineSuppliers();
    }

    /**
     * 获取基础信息
     *
     * @return
     */
    public BaseDataOutput getBaseData() {
        BaseDataOutput baseDataOutput = tradeDao.getBaseDate();
        BaseDataOutput temp = tradeDao.getBaseDateMonth();
        baseDataOutput.setTotalDealMonth(temp.getTotalDealMonth());
        baseDataOutput.setTotalFeeMonth(temp.getTotalFeeMonth());
        return baseDataOutput;
    }

    /**
     * 货物品类分布
     *
     * @return
     */
    public List<GoodCategoryOutput> getGoodCategory() {
        return tradeDao.getGoodCategory();
    }

    /**
     * 获取各大城市的经纬度
     *
     * @return
     */
    public List<CityJwdeOutput> getItudeOutput() {
        List<CityJwdeOutput> list = tradeDao.getCityItude();
        for (CityJwdeOutput cityJwdeOutput : list) {
            if (cityJwdeOutput.getCityName().indexOf("市") != -1) {
                cityJwdeOutput.setCityName(cityJwdeOutput.getCityName().replaceAll("市", ""));

            }
        }
        return list;
    }

    /**
     * 地图信息查询
     *
     * @return
     */
    public Map getDeliveryMap() {
        //最总结果的封装
        List<List<List<BaseData>>> datas = new ArrayList<List<List<BaseData>>>();
        //获取所有发货地区
        List<String> senders = new ArrayList<String>();
//=======================================随机获取最新500条数据的其中随机（0-5）条===========================================================
        Integer random  = new Random().nextInt(10);
        List<DeliveryMapAreaOutput> deliveryMapAreaOutputs = tradeDao.getRandomMap(random);
        for (DeliveryMapAreaOutput deliveryMapAreaOutput : deliveryMapAreaOutputs) {
            //地图区域的封装
            List<List<BaseData>> senderDatas = new ArrayList<List<BaseData>>();
            //当前发货、收货区域的封装
            List<BaseData> receiveDatas = new ArrayList<BaseData>();
            //发货区域
            BaseData baseData = new BaseData();
            baseData.setName(deliveryMapAreaOutput.getConsignerCity().replaceAll("市", ""));
            receiveDatas.add(baseData);
            //收货区域
            baseData = new BaseData();
            baseData.setName(deliveryMapAreaOutput.getConsigneeCity().replaceAll("市", ""));
            baseData.setValue(50);
            receiveDatas.add(baseData);
            senderDatas.add(receiveDatas);
            //最总数据的填充
            datas.add(senderDatas);
            //发货地区的封装
            senders.add(deliveryMapAreaOutput.getConsignerCity());
        }
//=========================================获取当前数据=========================================================
//        //获取所有发货地区
//        List<String> senders = tradeDao.getAllConsignerCity(id);
//        for (String sender : senders) {//遍历发货地区
//            Map map = new HashMap<>();
//            map.put("consignerCity", sender);
//            map.put("id", id);
//            //获取收货人市（该发货地区）
//            List<String> receives = tradeDao.getDeliveryMapArea(map);
//            //地图区域的封装
//            List<List<BaseData>> senderDatas = new ArrayList<List<BaseData>>();
//            //当前发货、收货区域的封装
//            List<BaseData> receiveDatas = new ArrayList<BaseData>();
//            BaseData baseData = new BaseData();
//            if (receives.size() > 0) {
//                for (String receive : receives) {//遍历收货地区
//                    baseData.setName(sender.replaceAll("市", ""));
//                    receiveDatas.add(baseData);
//                    //地图区域封装
//                    baseData = new BaseData();
//                    baseData.setName(receive.replaceAll("市", ""));
//                    baseData.setValue(50);
//                    receiveDatas.add(baseData);
//                    senderDatas.add(receiveDatas);
//                    baseData = new BaseData();
//                    receiveDatas = new ArrayList<BaseData>();
//                }
//            }
//            datas.add(senderDatas);
//        }
        DeliveryMapOutput deliveryMapOutput = new DeliveryMapOutput();
        deliveryMapOutput.setDeliveryMapAreaOutputList(datas);
        Map map = new HashMap();
//        map.put("id", tradeDao.getMaxId());
        map.put("senders", senders);
        map.put("datas", datas);
        return map;
    }


}
