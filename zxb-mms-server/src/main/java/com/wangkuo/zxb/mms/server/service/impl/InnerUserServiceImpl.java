package com.wangkuo.zxb.mms.server.service.impl;

import com.wangkuo.framework.mapper.BeanMapper;
import com.wangkuo.framework.persistence.PageableImpl;
import com.wangkuo.zxb.mms.dto.PagedList;
import com.wangkuo.zxb.mms.dto.output.CustomerChainStatisticOutput;
import com.wangkuo.zxb.mms.dto.output.InnerUserOutput;
import com.wangkuo.zxb.mms.dto.params.AddInnerUserParam;
import com.wangkuo.zxb.mms.dto.params.CustomerChainStatisticParam;
import com.wangkuo.zxb.mms.dto.params.QueryInnerUserParam;
import com.wangkuo.zxb.mms.server.db.dao.*;
import com.wangkuo.zxb.mms.server.db.po.*;
import com.wangkuo.zxb.mms.server.service.IInnerUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016/5/6 0006.
 */
@Service
public class InnerUserServiceImpl implements IInnerUserService{

    @Autowired
    private TInnerCustomerDao innerCustomerDao;

    @Autowired
    private TCustomerChainStatisticDao customerChainStatisticDao;

    @Override
    public PagedList<InnerUserOutput> selectListByParam(QueryInnerUserParam param) {
        PageableImpl pageable = BeanMapper.map(param, PageableImpl.class);
        List<InnerUserOutput> outPuts = innerCustomerDao.selectListByParam(param, pageable);
        return new PagedList<>(pageable.getCount(), outPuts);
    }

    @Override
    public int add(AddInnerUserParam param, TUser operator) {
        List<TInnerCustomer> list = innerCustomerDao.selectBySysAccount(param.getSysAccount());
        if(list != null && list.size() > 0){
            return -2;
        }
        List<TInnerCustomer> customerList = innerCustomerDao.selectByCustomerName(param.getCustomerName());
        if(customerList != null && list.size() > 0){
            return -2;
        }
        TInnerCustomer customer = new TInnerCustomer();
        BeanMapper.copy(param,customer);
        customer.setCurrUserId(operator.getId());
        customer.setCurrUser(operator.getRealName());
        customer.setCreatedTime(new Date());
        customer.setCreatedUserId(operator.getId());
        customer.setCreatedUser(operator.getRealName());
        customer.setInviteName(operator.getRealName());
        innerCustomerDao.insertSelective(customer);
        return 1;
    }

    @Override
    public int edit(AddInnerUserParam param, TUser operator) {
        TInnerCustomer customer = new TInnerCustomer();
        BeanMapper.copy(param,customer);
        customer.setUpdatedTime(new Date());
        customer.setUpdatedUser(operator.getRealName());
        customer.setUpdatedUserId(operator.getId());
        customer.setInviteName(operator.getRealName());
        innerCustomerDao.updateByPrimaryKeySelective(customer);
        return 1;
    }

    @Override
    public TInnerCustomer editView(Long id) {
        return innerCustomerDao.selectByPrimaryKey(id);
    }

    @Override
    public int modifyCurrUser(Long[] ids, Long acceptId, String acceptName) {
        TInnerCustomer customer = new TInnerCustomer();
        customer.setUpdatedTime(new Date());
        customer.setUpdatedUser(acceptName);
        customer.setUpdatedUserId(acceptId);
        customer.setCurrUser(acceptName);
        customer.setCurrUserId(acceptId);
        for(Long id : ids){
            customer.setId(id);
            innerCustomerDao.updateByPrimaryKeySelective(customer);
        }
        return 1;
    }

    /**
     * 每个月1号凌晨4点生成客户发单环比统计数据
     */
    @Scheduled(cron="0 0 1 4 * ?")
    public void CustomerChainStatisticQuartzJob(){
        //获取当前时间，得到上个月的年份和月份
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH,-1);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        Date lastMonth = c.getTime();//获取上个月时间
        TInnerCustomerExample example = new TInnerCustomerExample();
        //已存在的内客户信息
        List<TInnerCustomer> innerCustomers = innerCustomerDao.selectByExample(example);
        if(innerCustomers != null && innerCustomers.size() > 0){
            for(TInnerCustomer customer : innerCustomers){
                //根据客户注册名和日期查询统计信息
                CustomerChainStatisticParam param = new CustomerChainStatisticParam();
                param.setDate(lastMonth);
                param.setSysAccount(customer.getSysAccount());
                CustomerChainStatisticOutput output = customerChainStatisticDao.selectByTime(param);
                //查询上上个月的统计信息
                TCustomerChainStatisticExample chainStatisticExample = new TCustomerChainStatisticExample();
                chainStatisticExample.createCriteria().andMmsCustomerIdEqualTo(customer.getId()).andTYearEqualTo(year).andTMonthEqualTo(month-1);
                List<TCustomerChainStatistic> chainStatistics = customerChainStatisticDao.selectByExample(chainStatisticExample);

                TCustomerChainStatistic customerChainStatistic = new TCustomerChainStatistic();
                customerChainStatistic.setType(1);
                customerChainStatistic.settYear(year);
                customerChainStatistic.settMonth(month);
                customerChainStatistic.setMmsCustomerId(customer.getId());
                customerChainStatistic.setCurSendGoodTotalNum(output.getCurSendGoodTotalNum());
                customerChainStatistic.setCurSendGoodFee(output.getCurSendGoodFee());
                customerChainStatistic.setCurCarrierTotalNum(0);
                customerChainStatistic.setCurStowageTotalNum(output.getCurSendGoodTotalNum());
                customerChainStatistic.setCurCarrierTotalNumChainRate(0F);
                if(chainStatistics != null && chainStatistics.size() > 0){
                    //计算环比
                    Float curSendGoodTotalNumChainRate = countChainRate(output.getCurSendGoodTotalNum(),BigDecimal.ZERO,chainStatistics.get(0),1);
                    Float curSendGoodFeeChainRate = countChainRate(0,output.getCurSendGoodFee(),chainStatistics.get(0),2);
                    customerChainStatistic.setCurSendGoodTotalNumChainRate(curSendGoodTotalNumChainRate);
                    customerChainStatistic.setCurSendGoodFeeChainRate(curSendGoodFeeChainRate);
                }else {
                    customerChainStatistic.setCurSendGoodTotalNumChainRate(0F);
                    customerChainStatistic.setCurSendGoodFeeChainRate(0F);
                }
                customerChainStatisticDao.insertSelective(customerChainStatistic);
            }
        }
    }

    private Float countChainRate(Integer curSendGoodTotalNum,BigDecimal curSendGoodFee,TCustomerChainStatistic statistic,int type){
        //环比增长率=（本期数－上期数）/上期数×100%
        if(type == 1){
            return (float)((curSendGoodTotalNum - statistic.getCurSendGoodTotalNum())/statistic.getCurSendGoodTotalNum() * 100);
        }
        if(type == 2){
            return ((curSendGoodFee.subtract(statistic.getCurSendGoodFee())).divide(statistic.getCurSendGoodFee()).multiply(BigDecimal.valueOf(100))).floatValue();
        }
        return 0F;
    }

}
