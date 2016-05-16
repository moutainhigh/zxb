package com.wangkuo.zxb.mms.server.service.impl;

import com.wangkuo.framework.mapper.BeanMapper;
import com.wangkuo.framework.persistence.PageableImpl;
import com.wangkuo.zxb.mms.dto.PagedList;
import com.wangkuo.zxb.mms.dto.output.AllotCenterChartOutput;
import com.wangkuo.zxb.mms.dto.output.AllotCenterOutput;
import com.wangkuo.zxb.mms.dto.params.AddUserParam;
import com.wangkuo.zxb.mms.dto.params.QueryAllotCenterParam;
import com.wangkuo.zxb.mms.dto.params.QueryUserParam;
import com.wangkuo.zxb.mms.server.db.dao.TAllocCentreDao;
import com.wangkuo.zxb.mms.server.db.dao.TUserDao;
import com.wangkuo.zxb.mms.server.db.po.TAllocCentre;
import com.wangkuo.zxb.mms.server.db.po.TAllocCentreExample;
import com.wangkuo.zxb.mms.server.db.po.TUser;
import com.wangkuo.zxb.mms.server.db.po.TUserExample;
import com.wangkuo.zxb.mms.server.service.IAllotCenterService;
import com.wangkuo.zxb.mms.server.service.IUserService;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.chainsaw.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author 王俊华
 * @version 1.0
 * @date 2016-05-05
 */
@Service
public class AllotCenterServiceImpl implements IAllotCenterService {

    @Autowired
    private TAllocCentreDao allotDao;


    @Override
    public PagedList<AllotCenterOutput> findListByParams(QueryAllotCenterParam param) {
        String orderBy1 = param.getOrderBy1();
        String orderBy2 = param.getOrderBy2();
        String orderBy3 = param.getOrderBy3();
        String orderType1 = param.getOrderType1();
        String orderType2 = param.getOrderType2();
        String orderType3 = param.getOrderType3();

        StringBuffer sb = new StringBuffer("");
        if(null!=orderBy1 && !"".equals(orderBy1) && null!=orderType1 && !"".equals(orderType1)){
            sb.append(orderBy1+" "+orderType1+",");
        }
        if(null!=orderBy2 && !"".equals(orderBy2) && null!=orderType2 && !"".equals(orderType2)){
            sb.append(orderBy2+" "+orderType2+",");
        }
        if(null!=orderBy3 && !"".equals(orderBy3) && null!=orderType3 && !"".equals(orderType3)){
            sb.append(orderBy3+" "+orderType3+",");
        }

        if("".equals(sb.toString())){
           param.setOrderParam("");
        }else{
            param.setOrderParam(sb.toString().substring(0,sb.toString().length()-1));
        }


        PageableImpl pageable = BeanMapper.map(param, PageableImpl.class);
        List<AllotCenterOutput> list = allotDao.findListByParams(param,pageable);
        MathContext mc = new MathContext(2, RoundingMode.HALF_DOWN);
        for(AllotCenterOutput output:list){
            int year = output.getYear();
            int month = output.getMonth();
            int days = daysCountOfMonth(year,month);
            output.setAvgTotalAmount(output.getTotalAmount().divide(new BigDecimal(days),2, BigDecimal.ROUND_HALF_EVEN));

            output.setAvgTotalOfferVolume(new BigDecimal(output.getTotalOfferVolume().doubleValue()/days).setScale(2,BigDecimal.ROUND_HALF_UP));

            output.setAvgTotalOfferWight(new BigDecimal(output.getTotalOfferWight().doubleValue()/days).setScale(2,BigDecimal.ROUND_HALF_UP));

            output.setAvgTotalWayBillCount(new BigDecimal(output.getTotalWayBillCount().doubleValue()/days).setScale(2,BigDecimal.ROUND_HALF_UP));
        }

        return new PagedList<>(pageable.getCount(), list);
    }

    @Override
    public List<AllotCenterChartOutput> findChartData(QueryAllotCenterParam param) {
        String baseDate = "";
        if(null != param.getMonth()){
            if(param.getMonth()+1<10){
                baseDate = param.getYear() + "-0" + (param.getMonth()+1);
            }else{
                baseDate = param.getYear() + "-" + (param.getMonth()+1);
            }
        }
        Integer year = param.getYear();
        Integer month = param.getMonth();
        if(year!=null && month!=null){
            ++month;
            if(month<10){
                param.setStartDateStr(year+"-0"+month+"-01 00:00:00");
            }else{
                param.setStartDateStr(year+"-"+month+"-01 00:00:00");
            }

        }

        param.setYear(null);
        param.setOrderParam("yearAndMonth asc");
        List<AllotCenterOutput> list = allotDao.findListByParams(param);
        List<AllotCenterChartOutput> chartList = new ArrayList<AllotCenterChartOutput>();
        AllotCenterOutput baseOutput = null;
        //先找出基础数据
        for(AllotCenterOutput output:list){
            if(output.getYearAndMonth().equals(baseDate)){
                baseOutput = output;
            }
        }

        if(null != baseOutput){//基础数据存在
            for(AllotCenterOutput output:list){
                AllotCenterChartOutput chartOutput = new AllotCenterChartOutput();

                //计算总体积较基准数据上升比例
                Integer baseVolume = baseOutput.getTotalOfferVolume();
                Integer volume = output.getTotalOfferVolume();
                chartOutput.setTotalOfferVolumePercent(calculateFloat(volume,baseVolume));

                //计算重量较基准数据上升比例
                Integer baseWeight = baseOutput.getTotalOfferWight();
                Integer weight = output.getTotalOfferWight();
                chartOutput.setTotalOfferWightPercent(calculateFloat(weight,baseWeight));

                //计算总数量较基准数据上升比例
                Integer baseCount = baseOutput.getTotalWayBillCount();
                Integer count = output.getTotalWayBillCount();
                chartOutput.setTotalWayBillCountPercent(calculateFloat(count,baseCount));


                //计算供应商数较基准数据上升比例
                Integer baseLineCount = baseOutput.getLineSupplierCount();
                Integer lineCount = output.getLineSupplierCount();
                chartOutput.setLineSupplierCountPercent(calculateFloat(lineCount,baseLineCount));

                //计算异常票数较基准数据上升比例
                Integer baseUnsualCount =  baseOutput.getUnusualWayBillCount();
                Integer unsualCount =  output.getUnusualWayBillCount();
                chartOutput.setUnusualWayBillCountPercent(calculateFloat(unsualCount,baseUnsualCount));

                //计算总金额较基准数据上升比例
                BigDecimal baseTotalAmount = baseOutput.getTotalAmount();
                BigDecimal totalAmount = output.getTotalAmount();
                if(null == baseTotalAmount){
                    baseTotalAmount = BigDecimal.ZERO;
                }
                if(null == totalAmount){
                    totalAmount = BigDecimal.ZERO;
                }
                chartOutput.setTotalAmountPercent(calculateFloat(totalAmount.intValue(),baseTotalAmount.intValue()));

                chartOutput.setYearAndMonth(output.getYearAndMonth());
                chartList.add(chartOutput);
            }
        }
        return chartList;
    }

    @Override
    public List<TAllocCentre> findAllCenters() {
        TAllocCentreExample example = new TAllocCentreExample();
        return allotDao.selectByExample(example);
    }


    /**
     * 计算两个值相对上升比例
     * @param value 用于比较的数据
     * @param base 基准数据
     * @return
     */
    public BigDecimal calculateFloat(Integer value,Integer base){
        if(null == base || value == null || base == 0  ){
            return BigDecimal.ZERO;
        }else {
            Double volumePercent = new Double((value - base)) / base;
            BigDecimal p = new BigDecimal(volumePercent);
            return p.setScale(2,BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal(100));
        }
    }

    /**
     * 根据年月计算该月的天数
     * @param year
     * @param month
     * @return
     */
    public int daysCountOfMonth(int year,int month){
        Calendar time= Calendar.getInstance();
        time.clear();
        time.set(Calendar.YEAR,year);
        //year年
        time.set(Calendar.MONTH,month-1);
        //Calendar对象默认一月为0,month月
        int day=time.getActualMaximum(Calendar.DAY_OF_MONTH);//本月份的天数
        return  day;
    }
    /*public static void main(String[] args){
        Integer a = 3;
        Integer b = 4;
        String c = "2" + null;
        System.out.print(c);
    }*/
}
