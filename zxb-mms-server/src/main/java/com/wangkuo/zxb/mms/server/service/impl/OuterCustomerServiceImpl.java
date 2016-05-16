package com.wangkuo.zxb.mms.server.service.impl;

import com.wangkuo.framework.persistence.PageableImpl;
import com.wangkuo.zxb.mms.dto.PagedList;
import com.wangkuo.zxb.mms.dto.output.OuterCustomerOutput;
import com.wangkuo.zxb.mms.dto.output.UserOutPut;
import com.wangkuo.zxb.mms.dto.params.QueryOuterCustomerParam;
import com.wangkuo.zxb.mms.server.db.dao.TOuterCustomerDao;
import com.wangkuo.zxb.mms.server.db.dao.TRegionDao;
import com.wangkuo.zxb.mms.server.db.po.TOuterCustomer;
import com.wangkuo.zxb.mms.server.db.po.TOuterCustomerExample;
import com.wangkuo.zxb.mms.server.db.po.TUser;
import com.wangkuo.zxb.mms.server.service.IOuterCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by chaizf on 2016/5/5.
 */
@Service
public class OuterCustomerServiceImpl implements IOuterCustomerService {
    @Autowired
    private TOuterCustomerDao outerCustomerDao;
    @Autowired
    private TRegionDao regionDao;

    @Override
    public PagedList<OuterCustomerOutput> findListByParams(Long userId,QueryOuterCustomerParam param) {
        List regionIds = new ArrayList();
        PageableImpl pageable = new PageableImpl();
        pageable.setPageNumber(param.getPageNumber());
        pageable.setPageSize(param.getPageSize());
        if(null == param.getRegionId()) {
            //操作人所属区域
            List<UserOutPut> user = regionDao.queryRegionListByUserId(userId);
            for (UserOutPut outPut : user) {
                regionIds.add(outPut.getRegionId());
            }
        }
        param.setRegionIds(regionIds);
        //推广人的设置
        String temp = param.getCurrUser();
        temp.replace("，",",");
        String[] currUsers  = temp.split(",");
        List<OuterCustomerOutput> outerCustomers =outerCustomerDao.queryListByParams(param, pageable,Arrays.asList(currUsers));
        //return Collections.emptyList();
        return new PagedList<>(pageable.getCount(), outerCustomers);
    }

    @Override
    public OuterCustomerOutput statisticByParams(Long userId, QueryOuterCustomerParam param) {
        List regionIds = new ArrayList();
        //操作人所属区域
        List<UserOutPut> user = regionDao.queryRegionListByUserId(userId);
        for(UserOutPut outPut : user){
            regionIds.add(outPut.getRegionId());
        }
        param.setRegionIds(regionIds);
        //推广人的设置
        String temp = param.getCurrUser();
        temp.replace("，",",");
        String[] currUsers  = temp.split(",");
        OuterCustomerOutput outerCustomers =outerCustomerDao.statisticByParams(param,Arrays.asList(currUsers));
        return outerCustomers;
    }

    @Override
    public int addOuterCustomer(TOuterCustomer param, TUser user) {
        param.setCurrUser(user.getRealName());
        param.setCurrUserId(user.getId());
        param.setCreatedTime(new Date());
        param.setCreatedUser(user.getRealName());
        param.setCreatedUserId(user.getId());
        if(null==param.getStatus()){
            param.setStatus(0);
        }
        outerCustomerDao.insertSelective(param);
        return 0;
    }

    @Override
    public int modifyCurrUser(Long[] ids, Long acceptId, String acceptName) {
        TOuterCustomer outer = new TOuterCustomer();
        outer.setUpdatedTime(new Date());
        outer.setUpdatedUser(acceptName);
        outer.setUpdatedUserId(acceptId);
        outer.setCurrUser(acceptName);
        outer.setCurrUserId(acceptId);
        for(Long id : ids){
            outer.setId(id);
            outerCustomerDao.updateByPrimaryKeySelective(outer);
        }
        return 0;
    }

    @Override
    public int updateOuterCustomer(TOuterCustomer param, TUser user) {
        param.setUpdatedTime(new Date());
        param.setUpdatedUser(user.getRealName());
        param.setUpdatedUserId(user.getId());
        param.setCurrUser(user.getRealName());
        param.setCurrUserId(user.getId());
        param.setCreatedUserId(user.getId());
        if(null==param.getStatus()){
            param.setStatus(0);
        }
        return outerCustomerDao.updateByPrimaryKeySelective(param);
    }

    @Override
    public List<TOuterCustomer> findByCustomerName(String customerName) {
        TOuterCustomerExample example = new TOuterCustomerExample();
        example.createCriteria().andCustomerNameEqualTo(customerName);
        return outerCustomerDao.selectByExample(example);
    }

    @Override
    public List<TOuterCustomer> findBySysAccount(String sysAccount) {
        TOuterCustomerExample example = new TOuterCustomerExample();
        example.createCriteria().andSysAccountEqualTo(sysAccount);
        return outerCustomerDao.selectByExample(example);
    }


    /**
     * 定时查找该名客户的发货记录，有发货记录时，自动标记“客户状态”为已发货，同时标记“推广状态”为成功客户，这两个状态不允许用户设定
     */
    @Scheduled(cron="0 0/2 * * * ? ")   //每4小时执行一次
    public void modifyStatusTask() {
        TOuterCustomerExample example = new TOuterCustomerExample();
        example.createCriteria().andShipmentsStatusIsNull();//2已发货
        List<TOuterCustomer> outers  = outerCustomerDao.selectByExample(example);
        for(TOuterCustomer outer : outers){
            List<OuterCustomerOutput> list = outerCustomerDao.queryRecordByOuter(outer.getCustomerName());
            if(list.size()>0){
                TOuterCustomer customer = new TOuterCustomer();
                customer.setId(outer.getId());
                customer.setStatus(1);//已注册
                customer.setShipmentsStatus(2);//已发货
                customer.setMerchantStatus(3);//成功客户
                outerCustomerDao.updateByPrimaryKeySelective(customer);
            }
        }
    }
    @Override
    public TOuterCustomer findCustomerById(Long id) {
        return outerCustomerDao.selectByPrimaryKey(id);
    }
}
