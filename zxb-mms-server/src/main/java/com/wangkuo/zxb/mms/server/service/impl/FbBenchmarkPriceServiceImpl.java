package com.wangkuo.zxb.mms.server.service.impl;

import com.wangkuo.framework.mapper.BeanMapper;
import com.wangkuo.framework.persistence.PageableImpl;
import com.wangkuo.zxb.mms.dto.output.BenchmarkPriceOutput;
import com.wangkuo.zxb.mms.dto.output.BenchmarkPricePagedList;
import com.wangkuo.zxb.mms.dto.params.QueryBenchmarkPriceParam;
import com.wangkuo.zxb.mms.server.db.dao.TFbBenchmarkPriceDao;
import com.wangkuo.zxb.mms.server.db.dao.TFbBenchmarkPriceSectionDao;
import com.wangkuo.zxb.mms.server.db.po.TFbBenchmarkPrice;
import com.wangkuo.zxb.mms.server.db.po.TFbBenchmarkPriceExample;
import com.wangkuo.zxb.mms.server.db.po.TFbBenchmarkPriceSection;
import com.wangkuo.zxb.mms.server.db.po.TFbBenchmarkPriceSectionExample;
import com.wangkuo.zxb.mms.server.service.IFbBenchmarkPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by mark on 16/5/6.
 */
@Service
public class FbBenchmarkPriceServiceImpl implements IFbBenchmarkPriceService {

    @Autowired
    private TFbBenchmarkPriceDao priceDao;
    @Autowired
    private TFbBenchmarkPriceSectionDao sectionDao;

    @Override
    public BenchmarkPricePagedList getBenchmarkPriceList(QueryBenchmarkPriceParam param) {
        BenchmarkPricePagedList pagedList = new BenchmarkPricePagedList();

        TFbBenchmarkPriceExample example = new TFbBenchmarkPriceExample();
        TFbBenchmarkPriceExample.Criteria criteria = example.createCriteria();
        if (param.getAllotId()!=null) criteria.andAllocCenterIdEqualTo(param.getAllotId());
        if (param.getProvinceId()!=null) criteria.andEndProvinceIdEqualTo(param.getProvinceId());
        if (param.getCityId()!=null) criteria.andEndCityIdEqualTo(param.getCityId());
        if (param.getCountryId()!=null) criteria.andEndCountryIdEqualTo(param.getCountryId());
        PageableImpl pageable = new PageableImpl();
        pageable.setPageNumber(param.getPageNumber());
        pageable.setPageSize(param.getPageSize());
        List<TFbBenchmarkPrice> priceList =  priceDao.selectByExample(example, pageable);
        pagedList.setTotal(pageable.getCount());

        List<BenchmarkPriceOutput> outputList = new LinkedList<>();
        int maxHeavyColumns = 0, maxLightColumns = 0, maxHeavyLightColumns = 0;
        for (TFbBenchmarkPrice price : priceList) {
            BenchmarkPriceOutput outputHead = BeanMapper.map(price,BenchmarkPriceOutput.class);
            BenchmarkPriceOutput outputBody = BeanMapper.map(price,BenchmarkPriceOutput.class);

            TFbBenchmarkPriceSectionExample sectionExample1 = new TFbBenchmarkPriceSectionExample();
            sectionExample1.createCriteria().andPriceIdEqualTo(price.getId()).andTypeEqualTo(1);
            List<TFbBenchmarkPriceSection> heavySections = sectionDao.selectByExample(sectionExample1);
            if (heavySections.size()>maxHeavyColumns) maxHeavyColumns = heavySections.size();
            Map<String, String> mapHeavyHead = new HashMap<>();
            Map<String, String> mapHeavyBody = new HashMap<>();
            for (int i = 0; i < heavySections.size(); i++) {
                TFbBenchmarkPriceSection section = heavySections.get(i);
                mapHeavyHead.put("section"+(i+1),section.getStartSec().intValue()+"-"+section.getEndSec().intValue()+"公斤");
                mapHeavyBody.put("section" + (i + 1), section.getUnitPrice().stripTrailingZeros().toPlainString());
            }
            outputHead.setSections1(mapHeavyHead);
            outputBody.setSections1(mapHeavyBody);

            TFbBenchmarkPriceSectionExample sectionExample2 = new TFbBenchmarkPriceSectionExample();
            sectionExample2.createCriteria().andPriceIdEqualTo(price.getId()).andTypeEqualTo(2);
            List<TFbBenchmarkPriceSection> lightSections = sectionDao.selectByExample(sectionExample2);
            if (lightSections.size()>maxLightColumns) maxLightColumns = lightSections.size();
            Map<String, String> mapLightHead = new HashMap<>();
            Map<String, String> mapLightBody = new HashMap<>();
            for (int i = 0; i < lightSections.size(); i++) {
                TFbBenchmarkPriceSection section = lightSections.get(i);
                mapLightHead.put("section" + (i + 1), section.getStartSec().intValue() + "-" + section.getEndSec().intValue() + "立方");
                mapLightBody.put("section" + (i + 1), section.getUnitPrice().stripTrailingZeros().toPlainString());
            }
            outputHead.setSections2(mapLightHead);
            outputBody.setSections2(mapLightBody);

            TFbBenchmarkPriceSectionExample sectionExample3 = new TFbBenchmarkPriceSectionExample();
            sectionExample3.createCriteria().andPriceIdEqualTo(price.getId()).andTypeEqualTo(3);
            List<TFbBenchmarkPriceSection> heavyLightSections = sectionDao.selectByExample(sectionExample3);
            if (heavyLightSections.size()>maxHeavyLightColumns) maxHeavyLightColumns = heavyLightSections.size();
            Map<String, String> mapHeavyLightHead = new HashMap<>();
            Map<String, String> mapHeavyLightBody = new HashMap<>();
            for (int i = 0; i < heavyLightSections.size(); i++) {
                TFbBenchmarkPriceSection section = heavyLightSections.get(i);
                mapHeavyLightHead.put("section" + (i + 1), section.getStartSec().intValue() + "-" + section.getEndSec().intValue() + "公斤");
                mapHeavyLightBody.put("section" + (i + 1), section.getUnitPrice().stripTrailingZeros().toPlainString());
            }
            outputHead.setSections3(mapHeavyLightHead);
            outputBody.setSections3(mapHeavyLightBody);

            outputList.add(outputHead);
            outputList.add(outputBody);
        }
        pagedList.setRows(outputList);
        pagedList.setMaxHeavyColumns(maxHeavyColumns);
        pagedList.setMaxLightColumns(maxLightColumns);
        pagedList.setMaxHeavyLightColumns(maxHeavyLightColumns);

        return pagedList;
    }
}
