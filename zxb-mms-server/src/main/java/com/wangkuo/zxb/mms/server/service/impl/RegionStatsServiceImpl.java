package com.wangkuo.zxb.mms.server.service.impl;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.wangkuo.zxb.mms.constant.PermissionCodes;
import com.wangkuo.zxb.mms.dto.PagedList;
import com.wangkuo.zxb.mms.dto.params.QueryRegionStatsParam;
import com.wangkuo.zxb.mms.server.db.dao.TRegionStatsDao;
import com.wangkuo.zxb.mms.server.db.po.TRegion;
import com.wangkuo.zxb.mms.server.db.po.TRegionStats;
import com.wangkuo.zxb.mms.server.db.po.TRegionStatsExample;
import com.wangkuo.zxb.mms.server.db.po.TUser;
import com.wangkuo.zxb.mms.server.service.IRegionService;
import com.wangkuo.zxb.mms.server.service.IRegionStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2016-05-05
 */
@Service
public class RegionStatsServiceImpl implements IRegionStatsService {

    @Autowired
    private IRegionService regionService;

    @Autowired
    private TRegionStatsDao regionStatsDao;

    @Override
    public PagedList<TRegionStats> list(final QueryRegionStatsParam param, TUser user) {

        //用户关联的区域
        List<TRegion> regions = regionService.findByUserAndPermissionAndAllocCentre(user.getId(), PermissionCodes.REGION_STATS, param.getAllocCentreId());
        List<Long> regionIds = Lists.newArrayList(Collections2.transform(regions, new Function<TRegion, Long>() {
            @Override
            public Long apply(TRegion input) {
                return input.getId();
            }
        }));

        TRegionStatsExample example = new TRegionStatsExample();
        TRegionStatsExample.Criteria criteria = example.createCriteria();

        if (null != param.getAllocCentreId()) {
            criteria.andAllocCentreIdEqualTo(param.getAllocCentreId());
        }


        if (null != param.getRegionId() && regionIds.contains(param.getRegionId())) {
            criteria.andRegionIdEqualTo(param.getRegionId());
        } else {
            if (regionIds.isEmpty()) {
                criteria.andRegionIdEqualTo(-1L); //无关联区域时不应该显示数据
            } else {
                criteria.andRegionIdIn(regionIds);
            }
        }

        if (null != param.getYear()) {
            criteria.andStatsYearEqualTo(param.getYear());
        }

        if (null != param.getMonth()) {
            criteria.andStatsMonthEqualTo(param.getMonth());
        }

        if (null != param.getWaybillCountChainIndex()) {
            switch (param.getWaybillCountChainIndex()) {
                case QueryRegionStatsParam.CHAIN_INDEX_DOWN:
                    criteria.andWaybillCountChainIndexLessThan(0D);
                    break;
                case QueryRegionStatsParam.CHAIN_INDEX_UP:
                    criteria.andWaybillCountChainIndexGreaterThan(0D);
                    break;
                case QueryRegionStatsParam.CHAIN_INDEX_HOLD:
                    criteria.andWaybillCountChainIndexEqualTo(0D);
                    break;
            }
        }

        if (null != param.getAllFeeChainIndex()) {
            switch (param.getAllFeeChainIndex()) {
                case QueryRegionStatsParam.CHAIN_INDEX_DOWN:
                    criteria.andAllFeeChainIndexLessThan(0D);
                    break;
                case QueryRegionStatsParam.CHAIN_INDEX_UP:
                    criteria.andAllFeeChainIndexGreaterThan(0D);
                    break;
                case QueryRegionStatsParam.CHAIN_INDEX_HOLD:
                    criteria.andAllFeeChainIndexEqualTo(0D);
                    break;
            }
        }

        if (null != param.getNewCustomerCountChainIndex()) {
            switch (param.getNewCustomerCountChainIndex()) {
                case QueryRegionStatsParam.CHAIN_INDEX_DOWN:
                    criteria.andNewCustomerCountChainIndexLessThan(0D);
                    break;
                case QueryRegionStatsParam.CHAIN_INDEX_UP:
                    criteria.andNewCustomerCountChainIndexGreaterThan(0D);
                    break;
                case QueryRegionStatsParam.CHAIN_INDEX_HOLD:
                    criteria.andNewCustomerCountChainIndexEqualTo(0D);
                    break;
            }
        }

        List<TRegionStats> regionStatsList = regionStatsDao.selectByExample(example);
        return new PagedList<>(regionStatsList.size(), regionStatsList);
    }

    @Override
    public synchronized void createAllRegionStats() {
        //清空原来数据
        regionStatsDao.deleteByExample(null);

        List<TRegion> regionList = regionService.findAll();
        for (TRegion region : regionList) {
            createRegionStatus(region);
        }
    }

    private void createRegionStatus(TRegion region) {
        Assert.notNull(region);
        List<TRegionStats> regionStatsList = regionStatsDao.selectStatsByArea(region.getCountryId());
        prepareData(region, regionStatsList);
        calculateChainIndex(regionStatsList);

        //保存数据
        for (TRegionStats tRegionStats : regionStatsList) {
            tRegionStats.setAllocCentre(region.getAllocCentre());
            tRegionStats.setAllocCentreId(region.getAllocCentreId());
            tRegionStats.setRegion(region.getName());
            tRegionStats.setRegionId(region.getId());
            tRegionStats.setCreatedTime(new Date());
            regionStatsDao.insertSelective(tRegionStats);
        }
    }

    private void prepareData(TRegion region, List<TRegionStats> regionStatsList) {
        for (TRegionStats tRegionStats : regionStatsList) {
            long customerCount = regionStatsDao.countTotalCustomer(region.getCountryId(), tRegionStats.getStatsYear(), tRegionStats.getStatsMonth());
            tRegionStats.setTotalCustomerCount(customerCount);
        }
    }

    @Override
    public void createRegionStats(Long regionId) {
        TRegion region = regionService.findById(regionId);
        createRegionStatus(region);
    }


    /**
     * 计算环比数据
     *
     * @param statsResultList
     */
    private void calculateChainIndex(List<TRegionStats> statsResultList) {
        if (null == statsResultList || statsResultList.isEmpty()) {
            return;
        }


        //计算环比数据
        for (final TRegionStats result : statsResultList) {
            TRegionStats lastResult = getLastMonthStatsResult(statsResultList, result);

            if (null == lastResult) {
                continue;
            }

            //环比增长率＝（本期数－上期数）/上期数*100％

            if (null != lastResult.getWaybillCount() && lastResult.getWaybillCount() > 0) {
                result.setWaybillCountChainIndex(new BigDecimal((double) (result.getWaybillCount() - lastResult.getWaybillCount()) / lastResult.getWaybillCount() * 100).setScale(2, BigDecimal.ROUND_DOWN).doubleValue());
            }

            if (null != lastResult.getAllFee() && lastResult.getAllFee().compareTo(BigDecimal.ZERO) > 0) {
                result.setAllFeeChainIndex((result.getAllFee().subtract(lastResult.getAllFee()).divide(lastResult.getAllFee(), 2, BigDecimal.ROUND_DOWN).multiply(BigDecimal.valueOf(100))).setScale(2, BigDecimal.ROUND_DOWN).doubleValue());
            }

            if (null != lastResult.getWeight() && lastResult.getWeight() > 0) {
                result.setWeightChainIndex(new BigDecimal((result.getWeight() - lastResult.getWeight()) / lastResult.getWeight() * 100).setScale(2, BigDecimal.ROUND_DOWN).doubleValue());
            }

            if (null != lastResult.getVolume() && lastResult.getVolume() > 0) {
                result.setVolumeChainIndex(new BigDecimal((result.getVolume() - lastResult.getVolume()) / lastResult.getVolume() * 100).setScale(2, BigDecimal.ROUND_DOWN).doubleValue());
            }

            if (null != lastResult.getNewCustomerCount() && lastResult.getNewCustomerCount() > 0) {
                result.setNewCustomerCountChainIndex(new BigDecimal((double) (result.getNewCustomerCount() - lastResult.getNewCustomerCount()) / lastResult.getNewCustomerCount() * 100).setScale(2, BigDecimal.ROUND_DOWN).doubleValue());
            }

            if (null != lastResult.getStowageCount() && lastResult.getStowageCount() > 0) {
                result.setStowageCountChainIndex(new BigDecimal((double) (result.getStowageCount() - lastResult.getStowageCount()) / lastResult.getStowageCount() * 100).setScale(2, BigDecimal.ROUND_DOWN).doubleValue());
            }
        }
    }

    /**
     * 取上个月数据
     *
     * @param statsResultList
     * @param current
     * @return
     */
    private TRegionStats getLastMonthStatsResult(List<TRegionStats> statsResultList, final TRegionStats current) {
        //上个月的统计数据
        Collection<TRegionStats> lastMonthStatsResult = Collections2.filter(statsResultList, new Predicate<TRegionStats>() {
            @Override
            public boolean apply(TRegionStats input) {
                int lastMonth = current.getStatsMonth() - 1;
                int lastYear = current.getStatsYear();
                if (lastMonth <= 0) {
                    lastMonth = 12;
                    lastYear = lastYear - 1;
                }

                return input.getStatsYear().equals(lastYear)
                        && input.getStatsMonth().equals(lastMonth);
            }
        });

        if (lastMonthStatsResult.isEmpty()) {
            return null;
        }

        return Lists.newArrayList(lastMonthStatsResult).get(0);
    }
}
