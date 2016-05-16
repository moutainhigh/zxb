package com.wangkuo.zxb.mms.server.service.impl;

import com.wangkuo.framework.mapper.BeanMapper;
import com.wangkuo.framework.persistence.PageableImpl;
import com.wangkuo.zxb.mms.dto.PagedList;
import com.wangkuo.zxb.mms.dto.output.RegionOutPut;
import com.wangkuo.zxb.mms.dto.output.UserOutPut;
import com.wangkuo.zxb.mms.dto.params.PageParam;
import com.wangkuo.zxb.mms.dto.params.RegionParam;
import com.wangkuo.zxb.mms.server.db.dao.*;
import com.wangkuo.zxb.mms.server.db.po.*;
import com.wangkuo.zxb.mms.server.event.AddRegionEvent;
import com.wangkuo.zxb.mms.server.service.IRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author 柳朋朋
 * @version 1.0
 * @date 2016-05-05
 */
@Service
public class RegionServiceImpl implements IRegionService {
    @Autowired
    private TRegionDao regionDao;
    @Autowired
    private TInnerCustomerDao innerCustomerDao;
    @Autowired
    private TOuterCustomerDao outerCustomerDao;
    @Autowired
    private TAllocCentreDao allocCentreDao;
    @Autowired
    private TAreaInfoDao areaInfoDao;

    @Autowired
    private ApplicationContext applicationContext;

    /**
     * 新增区域
     *
     * @param param
     * @param operator
     * @return
     */
    @Override
    public int addRegion(RegionParam param, TUser operator) {
        //获取集散中心的名称
        TAllocCentre allocCentre = allocCentreDao.selectByPrimaryKey(param.getAllocCentreId());
        //获取省市区的名称
        TAreaInfo province = areaInfoDao.selectByPrimaryKey(param.getProvinceId());
        TAreaInfo city = areaInfoDao.selectByPrimaryKey(param.getCityId());
        TAreaInfo country = areaInfoDao.selectByPrimaryKey(param.getCountryId());

        TRegion region = new TRegion();
        BeanMapper.copy(param, region);
        //拼接区域名称
        region.setName(city.getAreaName()+country.getAreaName());
        region.setProvinceName(province.getAreaName());
        region.setCityName(city.getAreaName());
        region.setCountryName(country.getAreaName());
        region.setAllocCentre(allocCentre.getName());
        region.setAllocCentreId(param.getAllocCentreId());
        region.setCreatedBy(operator.getRealName());
        region.setCreatedById(operator.getId());
        region.setCreatedTime(new Date());
        int re = regionDao.insertSelective(region);

        //添加事件
        applicationContext.publishEvent(new AddRegionEvent(this, region.getId()));

        return re;
    }

    /**
     * 判断区域是否存在
     *
     * @param param
     * @return
     */
    @Override
    public boolean existRegion(RegionParam param) {
        TRegionExample example = new TRegionExample();
        example.createCriteria().
                andProvinceIdEqualTo(param.getProvinceId()).
                andCityIdEqualTo(param.getCityId()).
                andCountryIdEqualTo(param.getCountryId());
        List<TRegion> regions = regionDao.selectByExample(example);
        return !CollectionUtils.isEmpty(regions);
    }

    /**
     * 注销区域
     * 原有区域的相关管理人  移到  选择的区域
     *
     * @param param
     * @return
     */
    @Override
    public int transferRegion(RegionParam param, TUser operator) {
        TAllocCentre allocCentre = allocCentreDao.selectByPrimaryKey(param.getTransferAllocCentreId());
        //新增转入区域
        TRegion region = new TRegion();
        TRegion temp = regionDao.selectByPrimaryKey(param.getOriginalRegionId());
        BeanMapper.copy(temp,region);
        //region字段的更新
        region.setAllocCentre(allocCentre.getName());
        region.setAllocCentreId(allocCentre.getId());
        region.setUpdatedTime(null);
        region.setUpdatedById(null);
        region.setUpdatedBy(null);
        region.setCreatedTime(new Date());
        region.setCreatedById(operator.getId());
        region.setCreatedBy(operator.getRealName());
        regionDao.insertSelective(region);
        //删除原有的营销区域
        int count = regionDao.deleteByPrimaryKey(param.getOriginalRegionId());
        //更新管理人  所属的集散 和 区域
        //内客户
        TInnerCustomerExample innerExample = new TInnerCustomerExample();
        innerExample.createCriteria().andAllocCentreIdEqualTo(param.getOriginalAllocCentreId()).andRegionIdEqualTo(param.getOriginalRegionId());
        List<TInnerCustomer> innerCustomers = innerCustomerDao.selectByExample(innerExample);
        for (TInnerCustomer innerCustomer : innerCustomers) {
            innerCustomer.setId(innerCustomer.getId());
            innerCustomer.setAllocCentre(region.getAllocCentre());
            innerCustomer.setAllocCentreId(region.getAllocCentreId());
            innerCustomer.setRegion(region.getName());
            innerCustomer.setRegionId(region.getId());
            //操作信息
            innerCustomer.setUpdatedTime(new Date());
            innerCustomer.setUpdatedUserId(operator.getId());
            innerCustomer.setUpdatedUser(operator.getRealName());
            innerCustomerDao.updateByPrimaryKey(innerCustomer);
        }

        //外客户
        TOuterCustomerExample outerExample = new TOuterCustomerExample();
        outerExample.createCriteria().andAllocCentreIdEqualTo(param.getOriginalAllocCentreId()).andRegionIdEqualTo(param.getOriginalRegionId());
        List<TOuterCustomer> outerCustomers = outerCustomerDao.selectByExample(outerExample);
        for (TOuterCustomer outerCustomer : outerCustomers) {
            outerCustomer.setAllocCentre(region.getAllocCentre());
            outerCustomer.setAllocCentreId(region.getAllocCentreId());
            outerCustomer.setRegion(region.getName());
            outerCustomer.setRegionId(region.getId());
            //操作信息
            outerCustomer.setUpdatedTime(new Date());
            outerCustomer.setUpdatedUserId(operator.getId());
            outerCustomer.setUpdatedUser(operator.getRealName());
            outerCustomerDao.updateByPrimaryKey(outerCustomer);
        }
        return count;
    }

    /**
     * 根据集散中心id 查询所有的营销区域
     *
     * @param allocCentreId
     * @return
     */
    @Override
    public List<TRegion> findByAllocCentreId(Long allocCentreId) {
        TRegionExample example = new TRegionExample();
        example.createCriteria().andAllocCentreIdEqualTo(allocCentreId);
        List<TRegion> regions = regionDao.selectByExample(example);
        return regions;
    }

    /**
     * 根据集散中心id 查询营销区域(不包含已有区域)
     *
     * @param allocCentreId
     * @param regionId
     * @return
     */
    @Override
    public List<TRegion> findByAllocCentreId(Long allocCentreId, Long regionId) {
        TRegionExample example = new TRegionExample();
        example.createCriteria().andAllocCentreIdEqualTo(allocCentreId).andIdNotIn(Arrays.asList(regionId));
        List<TRegion> regions = regionDao.selectByExample(example);
        return regions;
    }

    /**
     * 查询列表信息
     *
     * @return
     */
    @Override
    public PagedList<RegionOutPut> findList(PageParam param) {
        //查询数据
        Integer begin = (param.getPageNumber() - 1) * param.getPageSize();
        List<RegionOutPut> outPuts = regionDao.findData(begin, param.getPageSize());
        PageableImpl pageable = new PageableImpl();
        pageable.setPageNumber(param.getPageNumber());
        pageable.setPageSize(param.getPageSize());
        return new PagedList<>(regionDao.findData(null, null).size(), outPuts);
    }

    @Override
    public List<TRegion> findAll() {
        TRegionExample example = new TRegionExample();
        return regionDao.selectByExample(example);
    }

    @Override
    public TRegion findById(Long id) {
        return regionDao.selectByPrimaryKey(id);
    }

    /**
     * 根据区域id 查找外客户接受人
     *
     * @param regionId
     * @return
     */
    @Override
    public List<UserOutPut> findUserByAndRegionId(Long regionId) {
        return regionDao.findUserByAndRegionId(regionId);
    }

    @Override
    public List<TRegion> findByUserAndPermissionAndAllocCentre(Long userId, String permissionCode, Long allocCentreId) {
        return regionDao.selectListByUserAndPermissionAndAllocCentre(userId, permissionCode, allocCentreId);
    }
}
