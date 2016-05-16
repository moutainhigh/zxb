package com.wangkuo.zxb.smart.show.db.dao;

import com.wangkuo.framework.persistence.GenericDao;
import com.wangkuo.framework.persistence.annotation.MyBatisDao;
import com.wangkuo.zxb.smart.show.db.po.Trade;
import com.wangkuo.zxb.smart.show.db.po.TradeExample;
import com.wangkuo.zxb.smart.show.dto.output.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 交易信息表
 */
@MyBatisDao
public interface TradeDao extends GenericDao<Trade, Long, TradeExample> {

    //获取目的区域排行（交易额）
    public List<AreaFeeOutput> getDestinationArea();
    //获取所有目的区域排行（交易额）
    public List<AreaFeeOutput> getAllDestinationArea();

    //发货区域排行（交易额）
    public List<AreaFeeOutput> getDeliveryArea();

    //专线排行（交易额）
    public List<AreaFeeOutput> getLineSuppliers();

    //货物品类分布
    public List<GoodCategoryOutput> getGoodCategory();

    //全国运力中心，全国服务网点数，专线供应商数 总交易票数, 总累计交易，总发货体积，总发货重量的获取
    public BaseDataOutput getBaseDate();

    //当月交易票数，当月交易额的获取
    public BaseDataOutput getBaseDateMonth();

    //获取收货人市
    public List<String> getDeliveryMapArea(Map map);

    //获取所有发货地区
    public List<String> getAllConsignerCity(Long id);

    //获取地图区域
    public Long getMaxId();

    public List<CityJwdeOutput> getCityItude();

    public List<DeliveryMapAreaOutput> getRandomMap(@Param(value = "random") Integer random);

}