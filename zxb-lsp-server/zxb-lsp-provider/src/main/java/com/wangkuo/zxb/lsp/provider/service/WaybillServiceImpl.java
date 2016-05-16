package com.wangkuo.zxb.lsp.provider.service;

import com.wangkuo.framework.mapper.BeanMapper;
import com.wangkuo.framework.persistence.PageableImpl;
import com.wangkuo.framework.utils.DateUtils;
import com.wangkuo.zxb.lsp.api.dto.input.*;
import com.wangkuo.zxb.lsp.api.dto.output.*;
import com.wangkuo.zxb.lsp.api.service.ChangeProperty;
import com.wangkuo.zxb.lsp.api.service.IWaybillService;
import com.wangkuo.zxb.lsp.api.service.IZbSequenceNumberService;
import com.wangkuo.zxb.lsp.exchange.ExchangeUtils;
import com.wangkuo.zxb.lsp.exchange.event.*;
import com.wangkuo.zxb.lsp.provider.db.common.CalculateDistance;
import com.wangkuo.zxb.lsp.provider.db.common.GeneralGoodType;
import com.wangkuo.zxb.lsp.provider.db.common.ProviderCommon;
import com.wangkuo.zxb.lsp.provider.db.common.SequenceNumberCode;
import com.wangkuo.zxb.lsp.provider.db.dao.*;
import com.wangkuo.zxb.lsp.provider.db.po.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.*;

/**
 * Created by chaizf on 2016/3/30.
 */

@Service
public class WaybillServiceImpl implements IWaybillService {
    @Autowired
    IZbSequenceNumberService zbSequenceNumberService;
    @Autowired
    private TSbWaybillDao waybillDao;
    @Autowired
    private TSbWaybillGoodDao waybillGoodDao;
    @Autowired
    TZbSequenceNumberDao sequenceNumberDao;
    @Autowired
    TSbWaybillFeeDao feeDao;
    @Autowired
    TFbAllotWaybillDao allotWaybillDao;
    @Autowired
    TSbWaybillTrackDao trackDao;
    @Autowired
    TSbWaybillCustomerTrackDao customerTrackDao;
    @Autowired
    TSbWaybillGoodLabelDao goodLabelDao;
    @Autowired
    TSbWaybillFeeChangeLogDao feeChangeLogDao;
    @Autowired
    TSbLocalWaybillAllotDao localWaybillAllotDao;
    @Autowired
    TSbWaybillInvoiceDao invoiceDao;
    @Autowired
    TSbWaybillDepotDao depotDao;
    @Autowired
    TSbWaybillReceiveDao receiveDao;
    @Autowired
    TSbWaybillReceiveTrackDao receiveTrackDao;
    @Autowired
    TSbStowageDao stowageDao;
    @Autowired
    TSbStowageBillGoodsLabelDao stowageBillGoodsLabelDao;
    @Autowired
    TFbBenchmarkPriceDao benchmarkPriceDao;
    @Autowired
    TFbBenchmarkPriceSectionDao priceSectionDao;
    @Autowired
    TSbGoodCategoryAllotDao categoryAllotDao;
    @Autowired
    TSbGoodCategoryDao categoryDao;
    @Autowired
    TSbGoodCategoryPriceDao categoryPriceDao;
    @Autowired
    TSbGoodCategoryPriceSectionDao categoryPriceSectionDao;
    @Autowired
    TSbWaybillFeeBalanceWithBenchmarkDao feeBalanceWithBenchmarkDao;
    @Autowired
    TSbAreaInfoDao areaInfoDao;
    @Autowired
    CalculateDistance calculateDistance;
    @Autowired
    TLspReceiverShipperInfoDao lspReceiverShipperInfoDao;
    @Autowired
    TZbLspBalanceDetailDao lspBalanceDetailDao;
    @Autowired
    private TLspWaybillChangeDao changeDao;
    @Autowired
    private TLspWaybillChangeDetailDao changeDetailDao;
    @Autowired
    private TSbWaybillFeeBalanceWithBenchmarkDao balanceWithBenchmarkDao;
    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    Setting setting;
    @Autowired
    private TSbWaybillCustomerTrackDao waybillCustomerTrackDao;

    @Override
    public WaybillInput addWaybill(WaybillInput waybillInput, SbWaybillGoodInput goodInput, SbWaybillFeeInput feeInput,
                          FbAllotWaybillInput allotInput,SbWaybillInvoiceInput invoiceInput) {
        //运单
        TSbWaybill waybill = new TSbWaybill();
        //生成运单号
        String systemSn = zbSequenceNumberService.createSequenceNumber(SequenceNumberCode.BODY_TYPE, SequenceNumberCode.BODY_ID, SequenceNumberCode.WAYBILL_CODE);
        BeanMapper.copy(waybillInput, waybill);
        waybill.setSystemSn(systemSn);
        //waybill.setSn();
        waybill.setBookerEmployeeId(waybillInput.getUser().getId());//服务商id
        waybill.setBookerEmployeeName(waybillInput.getUser().getRealUserName());//服务商姓名
        //waybill.setSiteId(SequenceNumberCode.BODY_ID);
        //waybill.setSiteName(ProviderCommon.LSP);
        waybill.setSource(ProviderCommon.WAYBILL_SOURCE_LSP);
        //waybill.setOtherConnectType("等通知放货");
        if(waybill.getOtherConnectType()==null||waybill.getOtherConnectType().equals(""))
        {
            waybill.setOtherConnectType("无");
        }
        waybill.setDeliveryType(1);//服务商没提货方式，默认设置为1:自提到站
        String stackRequire = "";
        if(null != waybill.getStackRequire()) {
            String[] array = waybill.getStackRequire().split(",");
            for (int i = 0; i < array.length; i++) {
                stackRequire = stackRequire + "|" + array[i];
            }
            if (stackRequire != "") {
                stackRequire = stackRequire + "|";
            }
        }
        if(waybill.getIsNeedReceipt()==null)
        {
            waybill.setIsNeedReceipt(0);//没有回单，置为0
        }
        waybill.setStackRequire(stackRequire);
        waybill.setIsChange(0);//0未变更
        waybill.setIsDamage(0);//0没有异常
        waybill.setIsDelete(0);//0未关闭
        waybill.setCreateTime(new Date());
        waybill.setDownId(UUID.randomUUID().toString());
        waybill.setIsLocal(0);//非本地
        if (null == waybill.getShipperCustomerName() || waybill.getShipperCustomerName().equals("")) {
            waybill.setShipperCustomerName(waybill.getShipperLinkName());
        }
        if (null == waybill.getReceiveName() || waybill.getReceiveName().equals("")) {
            waybill.setReceiveName(waybill.getReceiveLinkName());
        }
        waybill.setOperationTime(new Date());//开单日期
        if (null != waybillInput.getFeeStatus() && waybillInput.getFeeStatus() == 1) {//有报价
            if (waybillInput.getBalanceTypeWithZb() == 1) {//1到付
                //不存在现付费用
                //现付费用 =签回单费+开票费+保费;
                //BigDecimal xfyfFeeWithZb = null == feeInput.getXfyfFeeWithZb()?BigDecimal.ZERO:feeInput.getXfyfFeeWithZb();
                BigDecimal dfyfFeeWithZb = null == feeInput.getDfyfFeeWithZb() ? BigDecimal.ZERO : feeInput.getDfyfFeeWithZb();
                BigDecimal allFee = null == feeInput.getAllFee() ? BigDecimal.ZERO : feeInput.getAllFee();
                BigDecimal dVal = allFee.subtract(dfyfFeeWithZb);
                //if (xfyfFeeWithZb.compareTo(BigDecimal.ZERO) == 0) {
                //大于0，表示服务商需要付费用
                if (dVal.compareTo(BigDecimal.ZERO) == 1) {
                    waybill.setStatus(5);//已确认交易
                    feeInput.setXfyfFeeWithZb(dVal);
                } else {
                    waybill.setStatus(15);//待配载
                }
            } else {//现付
                waybill.setStatus(5);//已确认交易
            }
        } else {//无报价
            waybill.setStatus(0);//未确认交易
        }

        waybill.setLspId(waybillInput.getUser().getId());//服务商id
        waybill.setLspCompanyName(waybillInput.getUser().getCompanyName());//服务商公司
        waybillDao.insertSelective(waybill);
        waybillInput.setId(waybill.getId());
        waybillInput.setSystemSn(systemSn);//运单号
        //货物
        TSbWaybillGood good = new TSbWaybillGood();
        BeanMapper.copy(goodInput, good);
        good.setWaybillId(waybill.getId());
        if (good.getGoodCategoryId() != 0) {//0普货
            good.setIsCategory(1);//1品类
        }
        good.setRunVolume(goodInput.getOfferVolume());
        good.setRunWeight(goodInput.getOfferWeight());
        waybillGoodDao.insertSelective(good);
        //运单费用
        TSbWaybillFee fee = new TSbWaybillFee();
        BeanMapper.copy(feeInput, fee);
        fee.setWaybillId(waybill.getId());
        //fee.setBusinessFeeStatus(0);//0未提交(不再使用)
        //fee.setFreightFeeStatus(0);//0未审核(不再使用)
        /*if (waybillInput.getBalanceTypeWithZb() == 1) {//1到付
            fee.setXfyfFeeWithZb(waybillInput.getXfyfFeeWithZb());
            fee.setDfyfFeeWithZb(waybillInput.getDfyfFeeWithZb());
        }*/
        feeDao.insertSelective(fee);
        //创建分理记录
        TFbAllotWaybill allot = new TFbAllotWaybill();
        BeanMapper.copy(allotInput, allot);
        allot.setWaybillId(waybill.getId());
        allot.setIsAllot(0);//0未分理

        //运费、送货费计算不出时,提交订单时，费用项为空，不执行入库
        if (null != waybillInput.getFeeStatus() && waybillInput.getFeeStatus() == 1) {
            BigDecimal ransitFee = BigDecimal.ZERO; //中转费
            //干线费=运费+进仓费
            BigDecimal enterFee = null == allot.getEnterFee() ? BigDecimal.ZERO : allot.getEnterFee();
            BigDecimal freightFee = null == fee.getFreightFee() ? BigDecimal.ZERO : fee.getFreightFee();
            BigDecimal sendGoodFee = null == allot.getSendGoodFee() ? BigDecimal.ZERO : allot.getSendGoodFee();
            allot.setMainLineFee(freightFee.add(enterFee));
            //中转费=运费+送货费+上楼费+卸货费+进仓费
            BigDecimal upstairsFee = null == allot.getUpstairsFee() ? BigDecimal.ZERO : allot.getUpstairsFee();
            BigDecimal unloadFee = null == allot.getUnloadFee() ? BigDecimal.ZERO : allot.getUnloadFee();
            ransitFee = freightFee.add(sendGoodFee).add(upstairsFee).add(unloadFee).add(enterFee);
            allot.setRansitFee(ransitFee);
            //实际中转费
            BigDecimal realRansitFee = BigDecimal.ZERO;
            //信息费
            BigDecimal informationFee = BigDecimal.ZERO;
            //BalanceTypeWithZb:0现付，1到付
            if (waybillInput.getBalanceTypeWithZb() != null) {
                if (waybillInput.getBalanceTypeWithZb() == 0) {//现付
                    realRansitFee = ransitFee;
                }
                if (waybillInput.getBalanceTypeWithZb() == 1) {//到付
                    int flag = feeInput.getDfyfFeeWithZb().compareTo(ransitFee);
                    if (flag == 1) {//大于
                        BigDecimal feeValue = feeInput.getDfyfFeeWithZb().subtract(ransitFee);
                        informationFee = feeValue;
                    } else if (flag == -1) {//小于
                        BigDecimal feeValue = ransitFee.subtract(feeInput.getDfyfFeeWithZb());
                        realRansitFee = feeValue;
                    }
                }
            }
            allot.setRealRansitFee(realRansitFee);
            allot.setInformationFee(informationFee);
        }
        //操作费（服务商无）
        allot.setServiceFee(BigDecimal.ZERO);
        allotWaybillDao.insertSelective(allot);

        //运单状态扭转轨迹
        TSbWaybillTrack track = new TSbWaybillTrack();
        track.setStatus("创建运单");
        track.setWaybillSn(waybill.getSn());
        track.setWaybillId(waybill.getId());
        track.setCreateUserId(waybillInput.getUser().getId());//服务商id
        track.setCreateUserName(waybillInput.getUser().getRealUserName());//服务商姓名
        track.setCreateTime(waybill.getOperationTime());
        track.setUserBodyType(SequenceNumberCode.BODY_TYPE);
        track.setUserBodyId(waybillInput.getUser().getId());
        trackDao.insertSelective(track);

        //运单跟踪信息（只指给客户看的跟踪记录-确认交易）
        TSbWaybillCustomerTrack customerTrack = new TSbWaybillCustomerTrack();
        customerTrack.setWaybillId(waybill.getId());
        customerTrack.setWaybillSystemId(waybill.getDownId());
        customerTrack.setCreateName(waybillInput.getUser().getRealUserName());//服务商姓名
        customerTrack.setCreateTime(new Date());
        customerTrack.setMemo(ProviderCommon.WAYBILL_CONFIRMATION);
        customerTrackDao.insertSelective(customerTrack);

        //货物标签
        TSbWaybillGoodLabel label = new TSbWaybillGoodLabel();
        label.setWaybillId(waybill.getId());
        label.setLabelSn(waybill.getSn());
        label.setNum(goodInput.getNum());
        label.setStatus(waybill.getStatus());
        goodLabelDao.insertSelective(label);
        //计算时效

        //费用变动记录(不再使用)
        /*TSbWaybillFeeChangeLog feeChangeLog= new TSbWaybillFeeChangeLog();
        feeChangeLog.setWaybillId(waybill.getId());
        feeChangeLog.setIsChangeAllFreightFee(0);
        feeChangeLog.setIsChangeInformationFee(0);
        feeChangeLog.setIsChangeRansitFee(0);
        feeChangeLogDao.insertSelective(feeChangeLog);*/
        //本地运输分理记录
        TSbLocalWaybillAllot local = new TSbLocalWaybillAllot();
        local.setWaybillId(waybill.getId());
        local.setIsAllot(0);//0未分理
        local.setVerifiStatus(10);//审核状态10未核销
        localWaybillAllotDao.insertSelective(local);
        //开票信息
        //if (null != waybillInput.getIsOpenTicket() && waybillInput.getIsOpenTicket() == 1) {
        TSbWaybillInvoice invoice = new TSbWaybillInvoice();
        BeanMapper.copy(invoiceInput, invoice);
        invoice.setWaybillId(waybill.getId());
        invoiceDao.insertSelective(invoice);
        //}
        //进仓信息
        if (null != waybillInput.getIsNeedEnterDepot() && waybillInput.getIsNeedEnterDepot() == 1) {
            TSbWaybillDepot depot = new TSbWaybillDepot();
            depot.setWaybillId(waybill.getId());
            depot.setType(waybillInput.getDepotType());
            depotDao.insertSelective(depot);
        }
        //回单信息
        TSbWaybillReceive receive = new TSbWaybillReceive();
        receive.setWaybillId(waybill.getId());
        receive.setWaybillSn(waybill.getSn());
        receive.setCreateTime(new Date());
        receive.setCreateUserId(waybillInput.getUser().getId());//服务商id
        receive.setCreateUserName(waybillInput.getUser().getRealUserName());//服务商姓名
        receive.setLastFollowiUserId(waybillInput.getUser().getId());//服务商id
        receive.setLastFollowiUserName(waybillInput.getUser().getRealUserName());//服务商姓名
        receive.setLastFollowiMemo("服务商下单");
        receive.setIsOriginal(1);//1表示 默认原厂回单
        receive.setType(1);//1：服务商回单
        /*if (null != waybillInput.getIsNeedReceipt() && waybillInput.getIsNeedReceipt() == 1) {
            receive.setReceiveDay(ProviderCommon.RECEIVE_AGING);
            receive.setReceiveTrack(ProviderCommon.LSP_TO_ALLOC);
            receive.setReceivePosition(ProviderCommon.ALLOC);
            //回单跟踪记录
            TSbWaybillReceiveTrack receiveTrack = new TSbWaybillReceiveTrack();
            receiveTrack.setWaybillReceiveId(receive.getId());
            receiveTrack.setWaybillId(waybill.getId());
            receiveTrack.setWaybillSn(waybill.getSn());
            receiveTrack.setReceiveTrack(ProviderCommon.LSP_TO_ALLOC);
            receiveTrack.setReceivePosition(ProviderCommon.ALLOC);
            receiveTrack.setMemo("服务商下单");
            receiveTrack.setApplyBodyId(SequenceNumberCode.BODY_ID);
            receiveTrack.setApplyBodyName(ProviderCommon.LSP);
            receiveTrack.setApplyUserId(waybillInput.getUser().getId());//服务商id
            receiveTrack.setApplyUserName(waybillInput.getUser().getRealUserName());//服务商姓名
            receiveTrack.setApplyTime(new Date());
            receiveTrackDao.insertSelective(receiveTrack);
        }*/
        receiveDao.insertSelective(receive);
        //生成总部对账信息
        TSbWaybillFeeBalanceWithBenchmark benchmark = new TSbWaybillFeeBalanceWithBenchmark();
        if (null != waybillInput.getFeeStatus() && waybillInput.getFeeStatus() == 1) {
            TlspUser tlspUser = new TlspUser();
            BeanMapper.copy(waybillInput.getUser(), tlspUser);
            Map map = addWaybillFeeBalanceWithBenchmark(waybill, fee, allot, tlspUser.getId(), tlspUser.getRealUserName());
            //feeStataus==0两种情况：(1)：到付金额=现付金额；2：给服务商返差价
            waybillInput.setFeeStatus((Integer) map.get("feeStataus"));
            waybillInput.setBenchmarkId((Long) map.get("benchmarkId"));
        }

        //收发货方管理（按收发货人，存在更新，不存在增加）
        //0:发货人
        this.addOrModifyConsumerInfo(waybillInput, waybillInput.getShipperLinkName(), 0, waybillInput.getUser().getId());
        //1:收货人
        this.addOrModifyConsumerInfo(waybillInput, waybillInput.getReceiveLinkName(), 1, waybillInput.getUser().getId());

        ExchangeUtils.afterCommit(applicationContext, new AddWaybillEvent(this, waybill.getId()));
        ExchangeUtils.afterCommit(applicationContext, new WaybillQuoteEvent(this, waybill.getId(), waybill.getBookerEmployeeName()));
        ExchangeUtils.afterCommit(applicationContext, new WaybillConfirmTradeEvent(this, waybill.getId(), waybill.getBookerEmployeeName()));
        ExchangeUtils.afterCommit(applicationContext, new WaybillGoodArriveEvent(this, waybill.getId(), waybill.getBookerEmployeeName()));
        return waybillInput;
    }

    private Map addWaybillFeeBalanceWithBenchmark(TSbWaybill waybill, TSbWaybillFee fee, TFbAllotWaybill allot, Long userId, String userName) {
        Long benchmarkId = 0L;
        Integer feeStataus = 1;//该值和上面的if中一样
        TSbWaybillFeeBalanceWithBenchmark benchmark = new TSbWaybillFeeBalanceWithBenchmark();
        benchmark.setWaybillId(waybill.getId());//运单号
        benchmark.setType(1);//1:开单费用
        benchmark.setZbReceiveServiceFee(BigDecimal.ZERO);//应收操作费
        benchmark.setPremiumFee(fee.getPremiumFee());//保费
        benchmark.setBookerEmployeeId(userId);//用户id
        benchmark.setBookerEmployeeName(userName);//用户姓名
        benchmark.setBookerTime(new Date());
        benchmark.setStatus(0);//0 未核销
        if (fee.getDfyfFeeWithZb() == null) fee.setDfyfFeeWithZb(BigDecimal.ZERO);
        //if(fee.getXfyfFeeWithZb() == null) fee.setXfyfFeeWithZb(BigDecimal.ZERO);
        if (waybill.getBalanceTypeWithZb() == 1) {//1到付
            BigDecimal dfyfFeeWithZb = null == fee.getDfyfFeeWithZb() ? BigDecimal.ZERO : fee.getDfyfFeeWithZb();
            BigDecimal allFee = null == fee.getAllFee() ? BigDecimal.ZERO : fee.getAllFee();
            BigDecimal dVal = allFee.subtract(dfyfFeeWithZb);
            //大于0，表示服务商需要付费用，到支付页面
            if (dVal.compareTo(BigDecimal.ZERO) == 1) {
                // 应付费用 = 费用总计-到付费用
                benchmark.setZbReceiveAllFee(dVal);
                benchmarkId = this.addWaybillFeeBalanceWithBenchmarkValue(benchmark, dVal);
            }
            //小于0，表示需要给服务商返还差价
            if (dVal.compareTo(BigDecimal.ZERO) == -1) {
                //返还差价=费用总计-到付费用
                //数据库设计正数为总部应收,所以此处返还差价入库应为负数
                benchmark.setZbReceiveAllFee(dVal);//应收费用合计
                benchmarkId = this.addWaybillFeeBalanceWithBenchmarkValue(benchmark, dVal);
                // 0两种情况：(1)：到付金额=费用总计；2：给服务商返差价
                feeStataus = 0;
            }
            //到付金额=费用总计
            if (dVal.compareTo(BigDecimal.ZERO) == 0) {
                benchmark.setStatus(2);//免单
                benchmark.setZbReceiveAllFee(BigDecimal.ZERO);
                benchmarkId = this.addWaybillFeeBalanceWithBenchmarkValue(benchmark, BigDecimal.ZERO);
                //waybillInput.setFeeStatus(0);
                // 0两种情况：(1)：到付金额=费用总计；2：给服务商返差价
                feeStataus = 0;
            }
            //-----最早需求-----------------
            //存在现付费用
            //现付费用 =签回单费+开票费+保费;
            /*BigDecimal premiumFee = (null == fee.getPremiumFee())?BigDecimal.ZERO:fee.getPremiumFee();
            BigDecimal signedReceiveFee = (null == allot.getSignedReceiveFee())?BigDecimal.ZERO:allot.getSignedReceiveFee();
            BigDecimal invoiceFee = (null == fee.getInvoiceFee())?BigDecimal.ZERO:fee.getInvoiceFee();
            BigDecimal xfFee = premiumFee.add(signedReceiveFee).add(invoiceFee);
            if(xfFee.compareTo(BigDecimal.ZERO)==1) {
                benchmark.setStatus(0);//0 未核销
                BigDecimal subtractVal = fee.getAllFee().subtract(xfFee);
                //收货方到付费用>费用总计-现付费用
                if (fee.getDfyfFeeWithZb().compareTo(subtractVal) == 1) {
                    //需现付
                    benchmark.setZbReceiveAllFee(fee.getXfyfFeeWithZb());
                    benchmarkId = this.addWaybillFeeBalanceWithBenchmarkValue(benchmark, fee.getXfyfFeeWithZb());
                    //返还差价=到付费用-(费用总计-现付费用)
                    //数据库设计正数为总部应收,所以此处返还差价入库应为负数
                    BigDecimal returnFee = (fee.getAllFee()).subtract(fee.getXfyfFeeWithZb()).subtract(fee.getDfyfFeeWithZb());
                    benchmark.setZbReceiveAllFee(returnFee);//应收费用合计
                    this.addWaybillFeeBalanceWithBenchmarkValue(benchmark, returnFee);
                }else{
                    //存在：
                    //1.收货方到付费用<费用总计-现付费用(少的部分费用，在页面计算，全按现付费用收取)
                    //2.收货方到付费用=费用总计-现付费用
                    benchmark.setZbReceiveAllFee(fee.getXfyfFeeWithZb());//应收费用合计
                    benchmarkId = this.addWaybillFeeBalanceWithBenchmarkValue(benchmark, fee.getXfyfFeeWithZb());
                }
                //收货方到付费用<费用总计-现付费用
                    /*if (fee.getDfyfFeeWithZb().compareTo(subtractVal) == -1) {
                        this.addWaybillFeeBalanceWithBenchmark(benchmark,fee.getXfyfFeeWithZb());
                    }*/
            //收货方到付费用=费用总计-现付费用
                    /*if (fee.getDfyfFeeWithZb().compareTo(subtractVal) == 0) {
                        this.addWaybillFeeBalanceWithBenchmark(benchmark,fee.getXfyfFeeWithZb());
                    }*/
            /*} else{//不存在现付费用

                //收货方到付费用>费用总计（不需要支付）
                if (fee.getDfyfFeeWithZb().compareTo(fee.getAllFee()) == 1) {
                    benchmark.setStatus(0);//0 未核销
                    BigDecimal returnFee = (fee.getAllFee()).subtract(fee.getDfyfFeeWithZb());
                    benchmark.setZbReceiveAllFee(returnFee);
                    benchmarkId = this.addWaybillFeeBalanceWithBenchmarkValue(benchmark, returnFee);
                    //waybillInput.setFeeStatus(0);
                    // 0两种情况：1：到付金额=现付金额；(2)：给服务商返差价
                    feeStataus = 0;
                }
                //收货方到付费用<费用总计
                if (fee.getDfyfFeeWithZb().compareTo(fee.getAllFee()) == -1) {
                    benchmark.setStatus(0);//0 未核销
                    benchmark.setZbReceiveAllFee(fee.getXfyfFeeWithZb());
                    benchmarkId = this.addWaybillFeeBalanceWithBenchmarkValue(benchmark, fee.getXfyfFeeWithZb());
                }
                //收货方到付费用=费用总计（不需要支付）
                if (fee.getDfyfFeeWithZb().compareTo(fee.getAllFee()) == 0) {
                    benchmark.setStatus(2);//免单
                    benchmark.setZbReceiveAllFee(fee.getXfyfFeeWithZb());
                    benchmarkId = this.addWaybillFeeBalanceWithBenchmarkValue(benchmark, BigDecimal.ZERO);
                    //waybillInput.setFeeStatus(0);
                    // 0两种情况：(1)：到付金额=现付金额；2：给服务商返差价
                    feeStataus = 0;
                }
            }*/

        } else {//0现付
            benchmark.setZbReceiveAllFee(fee.getAllFee());//应收费用合计
            benchmarkId = this.addWaybillFeeBalanceWithBenchmarkValue(benchmark, fee.getAllFee());
        }
        if (benchmarkId > 0) {
            //服务商运单费用详细
            TZbLspBalanceDetail lspBalanceDetail = new TZbLspBalanceDetail();
            lspBalanceDetail.setBenchmarkId(benchmarkId);
            lspBalanceDetail.setFreightFee(fee.getFreightFee());//运费
            lspBalanceDetail.setSendGoodFee(allot.getSendGoodFee());//送货费
            lspBalanceDetail.setEnterFee(allot.getEnterFee());//进仓费
            lspBalanceDetail.setExpressFee(allot.getExpressFee());//加急费
            lspBalanceDetail.setInvoiceFee(fee.getInvoiceFee());//开票费
            lspBalanceDetail.setPremiumFee(fee.getPremiumFee());//保费
            lspBalanceDetail.setSignedReceiveFee(allot.getSignedReceiveFee());//签单费
            lspBalanceDetail.setUpstairsFee(allot.getUpstairsFee());//上楼费
            lspBalanceDetail.setUnloadFee(allot.getUnloadFee());//卸货费
            lspBalanceDetailDao.insertSelective(lspBalanceDetail);
        }
        Map map = new HashMap();
        map.put("benchmarkId", benchmarkId);
        map.put("feeStataus", feeStataus);
        return map;
    }

    /**
     * 生成总部对账信息
     *
     * @param benchmark
     * @param balanceFee
     * @return
     */
    private Long addWaybillFeeBalanceWithBenchmarkValue(TSbWaybillFeeBalanceWithBenchmark benchmark, BigDecimal balanceFee) {
        benchmark.setZbReceiveBenchmarkFee(balanceFee);
        feeBalanceWithBenchmarkDao.insertSelective(benchmark);
        return benchmark.getId();
    }

    @Override
    public WaybillOutput getOneWaybill(Long id) {
        TSbWaybill waybill = waybillDao.selectByPrimaryKey(id);
        return BeanMapper.map(waybill, WaybillOutput.class);
    }

    /**
     * 运单分页查询
     *
     * @param input
     * @return
     */
    @Override
    public PagedList<WaybillOutput> getPagedList(WaybillInput input, String orderByClause) {
        TSbWaybillCriteria criteria = new TSbWaybillCriteria();
        criteria.createCriteria().andLspIdEqualTo(input.getLspId());
        PageableImpl pageable = BeanMapper.map(input, PageableImpl.class);
        criteria.setOrderByClause(orderByClause);
        List<TSbWaybill> waybills = waybillDao.selectByExample(criteria, pageable);
        List<WaybillOutput> waybillOutputs = BeanMapper.mapList(waybills, WaybillOutput.class);
        return new PagedList<WaybillOutput>(input, pageable.getCount(), waybillOutputs);
    }

    /**
     * 获取未配载运单
     *
     * @param input 条件
     * @return 运单列表
     * @author 林守锦
     */
    @Override
    public List<WaybillOutput> selectNoStowageBillList(QueryNoStowageBillInput input) {
        //input.setWaybillStatus(15);
        List<WaybillOutput> waybillOutputs = waybillDao.selectNoStowageBillList(input);
        //TODO:此处N+1,如影响性能需要优化
        for (WaybillOutput waybill : waybillOutputs) {

            if (!waybill.getStatus().equals(15)) {
                waybill.setIsAlreadyPay(0);
                continue;
            }

            //判断现付金额是否已经支付
            int count = feeBalanceWithBenchmarkDao.countLspUnPay(waybill.getId());
            waybill.setIsAlreadyPay(count > 0 ? 0 : 1);
        }

        return waybillOutputs;
    }

    /**
     * 获取配载单下的运单
     *
     * @param stowageId 配置单id
     * @return 运单列表
     * @author 林守锦
     */
    @Override
    public List<WaybillOutput> selectStowageBillList(Long stowageId) {
        List<Long> waybillIds = stowageBillGoodsLabelDao.selectListByStowageBillId(stowageId);
        if (null == waybillIds || waybillIds.isEmpty()) {
            return Collections.emptyList();
        }

        List<WaybillOutput> waybillOutputs = waybillDao.selectStowageBillList(waybillIds);
        for (WaybillOutput waybill : waybillOutputs) {
            //判断现付金额是否已经支付
            int count = feeBalanceWithBenchmarkDao.countLspUnPay(waybill.getId());
            waybill.setIsAlreadyPay(count > 0 ? 0 : 1);
        }

        return waybillOutputs;
    }


    @Override
    public PagedList<WaybillAndFeeOutput> queryWaybillPagedList(QueryWaybillConditionInput input) {

        //查询运单主列表
        PageableImpl pageable = new PageableImpl();
        pageable.setPageSize(input.getPageSize());
        pageable.setPageNumber(input.getPageNumber());

        if (null != input.getOperationTimeBegin()) {
            input.setOperationTimeBegin(DateUtils.getDayBeginTime(input.getOperationTimeBegin()));
        }

        if (null != input.getOperationTimeEnd()) {
            input.setOperationTimeEnd(DateUtils.getDayLastTime(input.getOperationTimeEnd()));
        }

        List<WaybillAndFeeOutput> waybillAndFeeOutputList = waybillDao.queryWaybillPagedList(input, pageable);

        if (waybillAndFeeOutputList != null && waybillAndFeeOutputList.size() != 0) {

            //收集运单ID
            int count = waybillAndFeeOutputList.size();
            List<Long> idList = new LinkedList<>();
            for (int i = 0; i < count; i++) {
                idList.add(waybillAndFeeOutputList.get(i).getId());
            }

            //获取运单对应的 '表:运单费用总部网点对账_结算' 列表
            TSbWaybillFeeBalanceWithBenchmarkCriteria criteria = new TSbWaybillFeeBalanceWithBenchmarkCriteria();
            criteria.createCriteria().andWaybillIdIn(idList);
            List<TSbWaybillFeeBalanceWithBenchmark> sbWaybillFeeBalanceWithBenchmarkList = feeBalanceWithBenchmarkDao.selectByExample(criteria);

            //将费用记录合并到主记录中
            //方法1
            for (WaybillAndFeeOutput fee : waybillAndFeeOutputList) {

                fee.setPayStatus(0);

                List<WaybillExtraFeeOutput> feeList = new LinkedList<>();
                for (TSbWaybillFeeBalanceWithBenchmark balance : sbWaybillFeeBalanceWithBenchmarkList) {

                    if (fee.getId().compareTo(balance.getWaybillId()) == 0) {

                        //开单费用记录的类型,并且已支付.
                        if (balance.getType() == 1 && balance.getStatus() != null && balance.getStatus() == 1) {
                            fee.setPayStatus(1);
                        }

                        //去掉为零的费用
                        if (null != balance.getZbReceiveAllFee() && new BigDecimal(0).compareTo(balance.getZbReceiveAllFee()) != 0) {
                            WaybillExtraFeeOutput extraFee = BeanMapper.map(balance, WaybillExtraFeeOutput.class);
                            feeList.add(extraFee);
                        }
                    }


                }

                fee.setFeeList(feeList);
            }

            //将费用记录合并到主记录中
            //方法2
//            for (TSbWaybillFeeBalanceWithBenchmark balance : sbWaybillFeeBalanceWithBenchmarkList) {
//
//
//
//                for (WaybillAndFeeOutput fee : waybillAndFeeOutputList) {
//
//                    if (fee.getId().compareTo(balance.getWaybillId()) == 0) {
//                        if (fee.getFeeList() == null) fee.setFeeList(new LinkedList<WaybillExtraFeeOutput>());
//                        fee.getFeeList().add(BeanMapper.map(balance, WaybillExtraFeeOutput.class));
//
//
//
//                        continue;
//                    }
//
//
//
//                }
//            }
        }

        return new PagedList<>(input, pageable.getCount(), waybillAndFeeOutputList);
    }

    /**
     * 计算结算价(各种费用)
     *
     * @param input
     */
    @Override
    public CalculateFeeOutput waybillBalanceFee(CalculateFeeInput input) {
        WaybillBalanceFeeOutput back = this.calculateMainLineFee(input);
        CalculateFeeOutput feeOutput = new CalculateFeeOutput();
        if (back != null && back.getStatus() != null && back.getStatus() == 1) {
            //运费(干线费)
            BigDecimal mainLineFee = back.getMainLineFee();
            //0到站自提，送货费为0
            BigDecimal sendGoodFee = this.calculateSendGoodFee(input);//送货费
                if (new BigDecimal(-1).compareTo(sendGoodFee) == 0) {//距离太远
                    feeOutput.setStatus(-1);
                    return feeOutput;
                }
                if (new BigDecimal(-3).compareTo(sendGoodFee) == 0) {//品类价不存在，无法获取送货费
                    feeOutput.setStatus(-3);
                    return feeOutput;
                }
                //保费
                BigDecimal premiumFee = BigDecimal.ZERO;
                if (null != input.gethInsuredFee()) {
                    premiumFee = input.gethInsuredFee().multiply(new BigDecimal(setting.getPremiumRate())).setScale(0, BigDecimal.ROUND_HALF_UP);
                }
                //进仓费，到付不允许进仓
                BigDecimal enterDepotFee = this.calculateEnterDepotFee(input);
                //签回单费
                BigDecimal receiptFee = BigDecimal.ZERO;
                if (null != input.gethIsNeedReceipt() && input.gethIsNeedReceipt() == 1) {
                    receiptFee = new BigDecimal(setting.getSignedReceiveFee());
                }
                //加急费(暂时不用)
                BigDecimal expressFee = BigDecimal.ZERO;
            /* if(input.gethIsExpress()== 1) {
                expressFee = new BigDecimal();
            }*/
                //上楼费(不区分普货和品类)
                BigDecimal upstairsFee = this.calculateUpstairsFee(input);
                //卸货费(不区分普货和品类)
                BigDecimal unloadFee = this.calculateUnloadFee(input);
                //开票费=(运费+送货费+保费+增值费合计)*0.11
                //增值费合计 = 进仓费+上楼费+卸货费+签回单费+加急费
                BigDecimal openTicketFee = BigDecimal.ZERO;
                if (null != input.gethIsOpenTicket() && input.gethIsOpenTicket() == 1) {
                    openTicketFee = (mainLineFee.add(sendGoodFee).add(premiumFee).add(enterDepotFee).add(upstairsFee)
                            .add(unloadFee).add(receiptFee).add(expressFee)).multiply(new BigDecimal(setting.getOpenTicketRate()));
                    openTicketFee = openTicketFee.setScale(0, BigDecimal.ROUND_HALF_UP);
                }
                feeOutput.setMainLineFee(mainLineFee);//运费
                feeOutput.setSendGoodFee(sendGoodFee);
                feeOutput.setPremiumFee(premiumFee);
                feeOutput.setOpenTicketFee(openTicketFee);
                feeOutput.setEnterDepotFee(enterDepotFee);
                feeOutput.setUpstairsFee(upstairsFee);
                feeOutput.setUnloadFee(unloadFee);
                feeOutput.setReceiptFee(receiptFee);
                feeOutput.setExpressFee(expressFee);
                feeOutput.setRansitNum(back.getRansitNum());
                BigDecimal addValues = enterDepotFee.add(upstairsFee).add(unloadFee).add(receiptFee).add(expressFee);
                //增值费
                feeOutput.setAddvaluesFee(addValues);
                //费用总额
                feeOutput.setFeeAggravate(mainLineFee.add(sendGoodFee).add(premiumFee).add(openTicketFee).add(addValues));
            }
            feeOutput.setStatus(back.getStatus());
            return feeOutput;
        }

    /**
     * 计算干线费（运费）
     *
     * @param input
     * @return
     */
    public WaybillBalanceFeeOutput calculateMainLineFee(CalculateFeeInput input) {
        WaybillBalanceFeeOutput back = new WaybillBalanceFeeOutput();
        if (input.gethCategoryId() == null || input.gethCategoryId() == 0) {//按普货计算,0普货
            //货物属性
            Integer goodtype = GeneralGoodType.SeparateGoodType(input.gethVolume(), input.gethWeight() / 1000);//立方米、公斤
            //判断计算单位制
            Float section = this.estimateUnitQuality(goodtype, input.gethWeight(), input.gethVolume());
            Float rate = 0F;
            //包装为托盘上浮10%
            if (input.gethPack().equals("托")) {
                rate = rate + setting.getPalletRate();
            }
            //非标件上浮一定比例
            if (input.gethIsStandard() != 1) {
                rate = rate + setting.getNoStandaraRate();//非标件上浮比例
            }
            back = this.calculateMainLineFeeByBenchmark(input, goodtype, section, rate, 2);
        } else {//按品类计算
            TSbGoodCategoryAllotCriteria categoryAllotCriteria = new TSbGoodCategoryAllotCriteria();
            categoryAllotCriteria.createCriteria().andCategoryIdEqualTo(input.gethCategoryId()).andAllocCenterIdEqualTo(input.gethAllocCenterId()).andStatusEqualTo(2);  //2为审核通过
            TSbGoodCategoryAllot goodCategoryAllot = categoryAllotDao.selectSbGoodCategoryAllot(categoryAllotCriteria);
            if (goodCategoryAllot == null) {
                back.setStatus(-3);//集散没有品类
            } else {
                back = this.calculateMainLineFeeByCategory(input, goodCategoryAllot);
            }
        }
        return back;
    }

    /**
     * 普货按基准价计算干线费（运费）
     *
     * @param input
     * @param goodType
     * @param section
     * @param rate
     * @return
     */
    private WaybillBalanceFeeOutput calculateMainLineFeeByBenchmark(CalculateFeeInput input, Integer goodType, Float section, Float rate, Integer categoryPriceFloatType) {
        WaybillBalanceFeeOutput back = new WaybillBalanceFeeOutput();
        TFbBenchmarkPrice benchmarkPrice = null;
        if (input.gethReceiveCountryId() != null) {//收货区\县存在
            TFbBenchmarkPriceCriteria benchmarkPriceCriteria = new TFbBenchmarkPriceCriteria();
            benchmarkPriceCriteria.createCriteria().andAllocCenterIdEqualTo(input.gethAllocCenterId()).andEndCountryIdEqualTo(input.gethReceiveCountryId());
            benchmarkPrice = benchmarkPriceDao.selectFbBenchmarkPrice(benchmarkPriceCriteria);
        } else {
            TFbBenchmarkPriceCriteria benchmarkPriceCriteria = new TFbBenchmarkPriceCriteria();
            benchmarkPriceCriteria.createCriteria().andAllocCenterIdEqualTo(input.gethAllocCenterId()).
                    andEndCityIdEqualTo(input.gethReceiveCityId()).andIsCityPriceEqualTo(1);//1默认市价格
            benchmarkPrice = benchmarkPriceDao.selectFbBenchmarkPrice(benchmarkPriceCriteria);
        }
        if (null == benchmarkPrice) {
            back.setStatus(-3);//没有基准价
            return back;
        }
        TFbBenchmarkPriceSectionCriteria sectionCriteria = new TFbBenchmarkPriceSectionCriteria();          //startSec <= ? AND endSec > ?"
        sectionCriteria.createCriteria().andPriceIdEqualTo(benchmarkPrice.getId()).andTypeEqualTo(goodType).andStartSecLessThanOrEqualTo(section).andEndSecGreaterThan(section);
        TFbBenchmarkPriceSection priceSection = priceSectionDao.selectFbBenchmarkPriceSection(sectionCriteria);
        //没有基准价区间
        if (null == priceSection) {
            back.setStatus(-3);//没有基准价区间
            return back;
        }
        BigDecimal price = BigDecimal.ZERO;
        if (categoryPriceFloatType == 2) {//比例上浮
            if (null == rate) {
                rate = 1.0F;
            } else {
                rate = 1.0F + rate;
            }
            //运费，即干线费
            price = priceSection.getUnitPrice().multiply(new BigDecimal(rate)).setScale(2, BigDecimal.ROUND_HALF_UP);
        } else {//固定值上浮
            if (null == rate) {
                rate = 0F;
            }
            //运费，即干线费
            price = priceSection.getUnitPrice().add(new BigDecimal(rate)).setScale(2, BigDecimal.ROUND_HALF_UP);
        }


        BigDecimal fee = price.multiply(new BigDecimal(section));
        fee = fee.setScale(0, BigDecimal.ROUND_HALF_UP);
        back.setStatus(1);
        back.setMainLineFee(fee);
        back.setRansitNum(benchmarkPrice.getRansitNum());//中转次数
        return back;
    }

    /**
     * 按品类计算干线费（运费）
     *
     * @param input
     * @param allot
     * @return
     */
    private WaybillBalanceFeeOutput calculateMainLineFeeByCategory(CalculateFeeInput input, TSbGoodCategoryAllot allot) {
        WaybillBalanceFeeOutput back = new WaybillBalanceFeeOutput();
        final TSbGoodCategory goodCategory = categoryDao.selectByPrimaryKey(input.gethCategoryId());
        TSbGoodCategoryPriceSection priceSection = null;
        if (null == goodCategory) {
            back.setStatus(-3);//品类不存在
            return back;
        }
        Integer categoryChargeType = goodCategory.getChargeType();
        //判断计算单位制
        Float section = this.estimateUnitQuality(goodCategory.getGoodType(), input.gethWeight(), input.gethVolume());
        BigDecimal sitePrice = BigDecimal.ZERO;
        BigDecimal fee = null;

        // TSbGoodCategoryPrice goodCategoryPrice = null;
        //if (input.gethReceiveCountryId() != null) {
        // 收货区县存在,按品类价
        TSbGoodCategoryPriceCriteria categoryPriceCriteria = new TSbGoodCategoryPriceCriteria();
        categoryPriceCriteria.createCriteria().andGoodCategoryAllotIdEqualTo(allot.getId()).andEndCountryIdEqualTo(input.gethReceiveCountryId());
        TSbGoodCategoryPrice goodCategoryPrice = categoryPriceDao.selectSbGoodCategoryPrice(categoryPriceCriteria);
        // }


        if (null != categoryChargeType && categoryChargeType == 1) {//重量体积计费
            if (null == goodCategoryPrice) {//品类价没有,取基准价
                return calculateMainLineFeeByBenchmark(input, goodCategory.getGoodType(), section, 0F, 2);
            }
            TSbGoodCategoryPriceSectionCriteria categoryPriceSectionCriteria = new TSbGoodCategoryPriceSectionCriteria();//startSec < ? AND endSec >= ?
            categoryPriceSectionCriteria.createCriteria().andGoodCategoryPriceIdEqualTo(goodCategoryPrice.getId()).andStartSecLessThan(section).andEndSecGreaterThanOrEqualTo(section);
            priceSection = categoryPriceSectionDao.selectSbGoodCategoryPriceSection(categoryPriceSectionCriteria);

            if (null == priceSection) {//品类价区间没有,取基准价,再按品类上浮比例
                if (goodCategoryPrice.getFloatType() != null && goodCategoryPrice.getFloatType() == 1) {//固定值上浮
                    BigDecimal floatFixedCountry = goodCategoryPrice.getFloatFixedCountry();
                    if (null == floatFixedCountry) {
                        floatFixedCountry = new BigDecimal(0);
                    }
                    return calculateMainLineFeeByBenchmark(input, goodCategory.getGoodType(), section, floatFixedCountry.floatValue(), 1);
                } else if (goodCategoryPrice.getFloatType() != null && goodCategoryPrice.getFloatType() == 2) {//比例上浮
                    return calculateMainLineFeeByBenchmark(input, goodCategory.getGoodType(), section, goodCategoryPrice.getFloatRateCountry(), 2);
                }else{
                    return calculateMainLineFeeByBenchmark(input, goodCategory.getGoodType(), section, 0f, 2);
                }

            }
            fee = priceSection.getUnitPrice().multiply(new BigDecimal(section));
        } else if (null != categoryChargeType && categoryChargeType == 2) {//按件计费
            if (null == goodCategoryPrice) {//品类价没有,取基准价
                back.setStatus(-3);//无法报价
                return back;
            }
            Integer categoryPieceType = goodCategoryPrice.getPieceType();//件数计费方式（站到站，站到门）
            if (categoryPieceType == 1) {//站到站(包含送货费)
                BigDecimal siteToSiteFee = goodCategoryPrice.getPieceSiteToSiteFeeCountry();//站到站费用
                //BigDecimal siteSendGoodFee = goodCategoryPrice.getPieceSiteToSiteSendGoodFeeCountry();//站到站送货费
                if (null == siteToSiteFee) {
                    back.setStatus(-3);//无法报价
                    return back;
                }
                /*if(null == siteSendGoodFee){
                    siteSendGoodFee = BigDecimal.ZERO;
                }*/

                fee = siteToSiteFee.multiply(new BigDecimal(input.gethNum()));
                //fee.add(siteSendGoodFee);

            } else if (categoryPieceType == 2) {//站到门
                sitePrice = goodCategoryPrice.getPieceSiteToDoorFeeCountry();
                if(null == sitePrice){
                    back.setStatus(-3);//无法报价
                    return back;
                }
                fee = sitePrice.multiply(new BigDecimal(input.gethNum()));
            }else{
                back.setStatus(-3);//不能报价
                return back;
            }



        }




        fee = fee.setScale(0, BigDecimal.ROUND_HALF_UP);
        back.setStatus(1);
        back.setMainLineFee(fee);
        //back.setSendGoodFee(BigDecimal.ZERO);
        return back;
    }

    /**
     * 判断计算单位，按重量还是体积）
     * 不足500公斤按500公斤算,不足一方按一方算
     *
     * @param goodtype
     * @param weight
     * @param volume
     * @return
     */
    private Float estimateUnitQuality(Integer goodtype, Float weight, Float volume) {
        Float section = 0F;
        switch (goodtype) {
            case 1://重货
                //不足500公斤按500公斤算
                section = weight < setting.getComputeWeightUnit() ? setting.getComputeWeightUnit() : weight;
                break;
            case 2://抛货
                //不足一方按一方算
                section = volume < setting.getComputeVolumeUnit() ? setting.getComputeVolumeUnit() : volume;
                break;
            case 3://重抛货
                //不足500公斤按500公斤算
                section = weight < setting.getComputeWeightUnit() ? setting.getComputeWeightUnit() : weight;
                break;
        }
        return section;
    }

    /**
     * 计算送货费(0到站自提，送货费为0)
     *
     * @param input
     * @return
     */
    private BigDecimal calculateSendGoodFee(CalculateFeeInput input) {
        BigDecimal sendGoodFee = BigDecimal.ZERO;//送货费
        if (input.gethConnectType() != null && input.gethConnectType() == 1) {//1送货上门
            //普货送货费计算
            if (input.gethCategoryId() == null || input.gethCategoryId() == 0) {
                sendGoodFee = calculateSendGoodFeeByGeneral(input);
            }else{//品类送货费计算
                //按件数计费，品类送货费计算(站到站送货费有值; 站到门送货费0)
                //按重量体积计费，按普货距离计算
                sendGoodFee = calculateSendGoodFeeByCategory(input);
            }
        }
        return sendGoodFee;
    }

    /**
     * 按普货计算送货费
     * @param input
     * @return
     */
    private BigDecimal calculateSendGoodFeeByGeneral(CalculateFeeInput input) {
        BigDecimal sendGoodFee = BigDecimal.ZERO;//送货费
        //获取市中心点经纬度信息
        TSbAreaInfoCriteria areaInfoCriteria = new TSbAreaInfoCriteria();
        areaInfoCriteria.createCriteria().andIdEqualTo(input.gethReceiveCountryId());
        TSbAreaInfo areaInfo = areaInfoDao.selectSbAreaInfo(areaInfoCriteria);
        String startGps = areaInfo.getLatitude() + "," + areaInfo.getLongitude();
        //获取收货点经纬度信息
        String endGps = calculateDistance.getGps(input.gethReceiveProvinceName() + input.gethReceiveCityName() + input.gethReceiveCountryName() + input.gethReceiveAddress());
        //计算距离
        String distance = calculateDistance.getDistance(startGps, endGps);
        //无法获取到公里数区间的，统一按照20-30公里区间计算送货费
        if (null == distance || distance.equals("")) {
            distance = "25";
        }
        if (Double.parseDouble(distance) >= setting.getSendMaxDistance()) {
            //送货距离超出50公里，则送货费用另议
            sendGoodFee = new BigDecimal(-1);
        } else {
            //计算送货费
            TFbBenchmarkPriceCriteria benchmarkPriceCriteria = new TFbBenchmarkPriceCriteria();
            benchmarkPriceCriteria.createCriteria().andAllocCenterIdEqualTo(input.gethAllocCenterId()).andEndProvinceIdEqualTo(input.gethReceiveProvinceId())
                    .andEndCityIdEqualTo(input.gethReceiveCityId()).andEndCountryIdEqualTo(input.gethReceiveCountryId());
            TFbBenchmarkPrice benchmarkPrice = benchmarkPriceDao.selectFbBenchmarkPrice(benchmarkPriceCriteria);
            //单票货物在5吨或15方以上且送货距离在20公里以内，平台将免收送货费；
            //如超出20公里，则按送货距离扣除20公里后的剩余公里数匹配公里区间计算送货费用
            if ((input.gethWeight() / 1000) > setting.getFreeSendWeight() || input.gethVolume() > setting.getFreeSendVolume()) {
                if (Float.parseFloat(distance) >= setting.getFreeSendDistance()) {
                    sendGoodFee = this.calculateSendGoodFeeSection(Double.parseDouble(distance) - setting.getFreeSendDistance(), benchmarkPrice);
                }
            } else {
                sendGoodFee = this.calculateSendGoodFeeSection(Double.parseDouble(distance), benchmarkPrice);
            }
            sendGoodFee = sendGoodFee.setScale(0, BigDecimal.ROUND_HALF_UP);
        }
        return sendGoodFee;
    }
    /**
     * 按品类计算送货费
     * @param input
     * @return
     */
    private BigDecimal calculateSendGoodFeeByCategory(CalculateFeeInput input) {
        BigDecimal sendGoodFee = BigDecimal.ZERO;//送货费
        if (input.gethCategoryId() == null || input.gethCategoryId() != 0) {//0普货
            TSbGoodCategoryAllotCriteria categoryAllotCriteria = new TSbGoodCategoryAllotCriteria();
            categoryAllotCriteria.createCriteria().andCategoryIdEqualTo(input.gethCategoryId()).andAllocCenterIdEqualTo(input.gethAllocCenterId()).andStatusEqualTo(2);  //2为审核通过
            TSbGoodCategoryAllot allot = categoryAllotDao.selectSbGoodCategoryAllot(categoryAllotCriteria);
            TSbGoodCategory goodCategory = categoryDao.selectByPrimaryKey(input.gethCategoryId());
            //按件数计费，品类送货费计算(站到站送货费有值; 站到门送货费0)
            if (goodCategory.getChargeType() == 2) {//收货区县存在,2按件数计费,品类价中站到站有送货费
                TSbGoodCategoryPriceCriteria categoryPriceCriteria = new TSbGoodCategoryPriceCriteria();
                categoryPriceCriteria.createCriteria().andGoodCategoryAllotIdEqualTo(allot.getId()).andEndCountryIdEqualTo(input.gethReceiveCountryId());
                TSbGoodCategoryPrice goodCategoryPrice = categoryPriceDao.selectSbGoodCategoryPrice(categoryPriceCriteria);
                if (null == goodCategoryPrice) {
                    return new BigDecimal(-3);//品类价不存在，无法获取按件计费的送货费
                }
                if (goodCategoryPrice.getPieceType() == 1) {//1 站到站
                    sendGoodFee = (null==goodCategoryPrice.getPieceSiteToSiteSendGoodFeeCountry())?BigDecimal.ZERO:goodCategoryPrice.getPieceSiteToSiteSendGoodFeeCountry();
                }
                sendGoodFee = sendGoodFee.setScale(0, BigDecimal.ROUND_HALF_UP);
            }
            //按重量体积计费，按普货距离计算
            if(goodCategory.getChargeType() == 1){
                sendGoodFee = calculateSendGoodFeeByGeneral(input);
            }
        }
        return sendGoodFee;
    }
    /**
     * 计算送货费区间价
     *
     * @param distance
     * @param benchmarkPrice
     * @return
     */
    private BigDecimal calculateSendGoodFeeSection(Double distance, TFbBenchmarkPrice benchmarkPrice) {
        BigDecimal section = BigDecimal.ZERO;
        if (distance >= 0 && distance <= 10) {
            if (null == benchmarkPrice.getSendGoodFeeSection1()) {
                return new BigDecimal(-1);
            }
            section = benchmarkPrice.getSendGoodFeeSection1();
        }
        if (distance > 10 && distance <= 20) {
            if (null == benchmarkPrice.getSendGoodFeeSection2()) {
                return new BigDecimal(-1);
            }
            section = benchmarkPrice.getSendGoodFeeSection2();
        }
        if (distance > 20 && distance <= 30) {
            if (null == benchmarkPrice.getSendGoodFeeSection3()) {
                return new BigDecimal(-1);
            }
            section = benchmarkPrice.getSendGoodFeeSection3();
        }
        if (distance > 30 && distance <= 50) {
            if (null == benchmarkPrice.getSendGoodFeeSection4()) {
                return new BigDecimal(-1);
            }
            section = benchmarkPrice.getSendGoodFeeSection4();
        }
        return section;
    }

    /**
     * 计算进仓费
     *
     * @param input
     * @return
     */
    @Override
    public BigDecimal calculateEnterDepotFee(CalculateFeeInput input) {
        //进仓费，到付不允许进仓
        BigDecimal enterDepotFee = BigDecimal.ZERO;
        if (null != input.gethIsNeedEnterDepot() && input.gethIsNeedEnterDepot() == 1 && input.gethBalanceTypeWithZb() == 0) {//0现付
            //1：电商仓;2：外贸仓'
            if (null != input.gethDepotType()) {
                if (input.gethDepotType() == 1) {
                    //每方25元的标准计费
                    enterDepotFee = new BigDecimal(input.gethVolume() * setting.getEcommerceEnterFee());
                }
                if (input.gethDepotType() == 2) {
                    //每方15元，1.5方叉车费15元标准计费。即货物体积20方，则20*15+20/1.5*15=500元
                    enterDepotFee = new BigDecimal(input.gethVolume() * setting.getForeignEnterFee()
                            + input.gethVolume() / setting.getForkliftUnit() * setting.getForkliftFee());
                }
                enterDepotFee = enterDepotFee.setScale(0, BigDecimal.ROUND_HALF_UP);
            }
        }
        return enterDepotFee;
    }

    /**
     * 计算上楼费
     *
     * @param input
     * @return
     */
    @Override
    public BigDecimal calculateUpstairsFee(CalculateFeeInput input) {
        //上楼费(不区分普货和品类)
        BigDecimal upstairsFee = BigDecimal.ZERO;
        //计算上楼、卸货的货物属性(重抛比3方/吨以下（含3）为重货，3方/吨以上为抛货)
        Integer goodtype = GeneralGoodType.valueAddedGoodType(input.gethVolume(), input.gethWeight() / 1000);//立方米、公斤
        if (null != input.gethIsUpstairsIncre() && input.gethIsUpstairsIncre() == 1 && input.gethIsStandard() == 1) {//上楼且标准件
            if (input.gethIsElevator() != null && input.gethIsElevator() == 1) {//有电梯
                if (goodtype == 1) {//重货
                    upstairsFee = new BigDecimal(input.gethWeight() / 1000 * setting.getUpstairsElevatorFee1());
                } else {//抛货
                    upstairsFee = new BigDecimal(input.gethVolume() * setting.getUpstairsElevatorFee3());
                }
            } else {//无电梯
                //无电梯且未填写楼层信息的情况下，默认按照5层的标准收费
                Integer floorNum = input.gethFloorNum() == null ? 5 : input.gethFloorNum();
                if (goodtype == 1) {//重货
                    upstairsFee = new BigDecimal(input.gethWeight() / 1000 * floorNum * setting.getUpstairsNoElevatorFee1());
                } else {//抛货
                    upstairsFee = new BigDecimal(input.gethVolume() * floorNum * setting.getUpstairsNoElevatorFee3());
                }
            }
            upstairsFee = upstairsFee.setScale(0, BigDecimal.ROUND_HALF_UP);
        }
        return upstairsFee;
    }

    /**
     * 计算卸货费
     *
     * @param input
     * @return
     */
    @Override
    public BigDecimal calculateUnloadFee(CalculateFeeInput input) {
        //卸货费(不区分普货和品类)
        BigDecimal unloadFee = BigDecimal.ZERO;
        //计算上楼、卸货的货物属性(重抛比3方/吨以下（含3）为重货，3方/吨以上为抛货)
        Integer goodtype = GeneralGoodType.valueAddedGoodType(input.gethVolume(), input.gethWeight() / 1000);//立方米、公斤
        if (null != input.gethIsUnloadIncre() && input.gethIsUnloadIncre() == 1) {//卸货
            if (input.gethWeight() >= setting.getFreeUnloadWeight() && input.gethVolume() >= setting.getFreeUnloadVolume()) {
                if (goodtype == 1) {//重货
                    unloadFee = new BigDecimal(input.gethWeight() / 1000 * setting.getUnloadFee1());
                }
                if (goodtype == 3) {//抛货
                    unloadFee = new BigDecimal(input.gethVolume() * setting.getUnloadFee3());
                }
                unloadFee = unloadFee.setScale(0, BigDecimal.ROUND_HALF_UP);
            }
        }
        return unloadFee;
    }

    /**
     * 管理收发货人信息
     *
     * @param waybill
     * @param userName
     * @param type
     * @return
     */
    private int addOrModifyConsumerInfo(WaybillInput waybill, String userName, Integer type, Long lsp_id) {
        int i = 0;
        TLspReceiverShipperInfo info = setValueForReceiverShipper(waybill, type);//0发货人;1收货人
        //查询收发货人
        TLspReceiverShipperInfoCriteria lspcriteria = new TLspReceiverShipperInfoCriteria();
        lspcriteria.createCriteria().andLspUserIdEqualTo(lsp_id).andTypeEqualTo(type).andLinkNameEqualTo(userName);
        TLspReceiverShipperInfo queryInfo = lspReceiverShipperInfoDao.selectLspReceiverShipperInfo(lspcriteria);
        //收发货人是否存在
        if (null != queryInfo && queryInfo.getLinkName() != null && queryInfo.getLinkName().equals(userName)) {//存在，修改
            info.setId(queryInfo.getId());
            i = lspReceiverShipperInfoDao.updateByPrimaryKey(info);
        } else {//不存在，增加
            i = lspReceiverShipperInfoDao.insertSelective(info);
        }
        return i;
    }

    /**
     * 获取收发货人信息
     *
     * @param waybill
     * @param type
     * @return
     */
    private TLspReceiverShipperInfo setValueForReceiverShipper(WaybillInput waybill, Integer type) {
        TLspReceiverShipperInfo info = new TLspReceiverShipperInfo();
        if (type == 0) {
            info.setLspUserId(waybill.getUser().getId());//服务商id
            info.setLinkName(waybill.getShipperLinkName());
            info.setCompanyName(waybill.getShipperCustomerName());
            info.setMobile(waybill.getShipperLinkMobile());
            info.setTelphone(waybill.getShipperLinkPhone());
            info.setProvinceId(waybill.getShipperProvinceId());
            info.setProvinceName(waybill.getShipperProvinceName());
            info.setCityId(waybill.getShipperCityId());
            info.setCityName(waybill.getShipperCityName());
            info.setCountryId(waybill.getShipperCountryId());
            info.setCountryName(waybill.getShipperCountryName());
            info.setDetailedAddress(waybill.getShipperAddress());
        } else {
            info.setLspUserId(waybill.getUser().getId());//服务商id
            info.setLinkName(waybill.getReceiveLinkName());
            info.setCompanyName(waybill.getReceiveName());
            info.setMobile(waybill.getReceiveLinkMobile());
            info.setTelphone(waybill.getReceiveLinkPhone());
            info.setProvinceId(waybill.getReceiveProvinceId());
            info.setProvinceName(waybill.getReceiveProvinceName());
            info.setCityId(waybill.getReceiveCityId());
            info.setCityName(waybill.getReceiveCityName());
            info.setCountryId(waybill.getReceiveCountryId());
            info.setCountryName(waybill.getReceiveCountryName());
            info.setDetailedAddress(waybill.getReceiveAddress());
        }
        info.setType(type);//0:发货人;1：收货人
        return info;
    }

    @Override
    public int changeWaybill(ChangeWaybillInput input) {
        Long waybillId = input.getId();
        TSbWaybill waybill = waybillDao.selectByPrimaryKey(waybillId);

        TSbWaybillGoodCriteria example = new TSbWaybillGoodCriteria();
        example.createCriteria().andWaybillIdEqualTo(waybillId);
        List<TSbWaybillGood> goods = waybillGoodDao.selectByExample(example);
        TSbWaybillGood waybillGood = goods != null && goods.size() > 0 ? goods.get(0) : null;

        TSbWaybillFeeCriteria example1 = new TSbWaybillFeeCriteria();
        example1.createCriteria().andWaybillIdEqualTo(waybillId);
        List<TSbWaybillFee> fees = feeDao.selectByExample(example1);
        TSbWaybillFee waybillFee = fees != null && fees.size() > 0 ? fees.get(0) : null;

        TFbAllotWaybillCriteria example2 = new TFbAllotWaybillCriteria();
        example2.createCriteria().andWaybillIdEqualTo(waybillId);
        List<TFbAllotWaybill> allotWaybills = allotWaybillDao.selectByExample(example2);
        TFbAllotWaybill allotWaybill = allotWaybills != null && allotWaybills.size() > 0 ? allotWaybills.get(0) : null;

        TSbWaybillDepotCriteria example3 = new TSbWaybillDepotCriteria();
        example3.createCriteria().andWaybillIdEqualTo(waybillId);
        List<TSbWaybillDepot> depots = depotDao.selectByExample(example3);
        TSbWaybillDepot waybillDepot = depots != null && depots.size() > 0 ? depots.get(0) : null;
        if (waybillDepot == null) {
            waybillDepot = new TSbWaybillDepot();
            waybillDepot.setWaybillId(waybillId);
        }

        TSbWaybillInvoiceCriteria example4 = new TSbWaybillInvoiceCriteria();
        example4.createCriteria().andWaybillIdEqualTo(waybillId);
        List<TSbWaybillInvoice> invoices = invoiceDao.selectByExample(example4);
        TSbWaybillInvoice waybillInvoice = invoices != null && invoices.size() > 0 ? invoices.get(0) : null;
        if (waybillInvoice == null) {
            waybillInvoice = new TSbWaybillInvoice();
            waybillInvoice.setWaybillId(waybillId);
        }

        if (input.getBalanceTypeWithZb() == 0) input.setDfyfFeeWithZb(BigDecimal.ZERO);
        int error = computeFees(input, waybill.getAllocCenterId());
        if (error < 0) return error;

//        changeWaybillCompare(input, waybill, waybillGood, waybillFee, allotWaybill, waybillDepot, waybillInvoice);
        changeWaybillPersistent(input, waybill, waybillGood, waybillFee, allotWaybill, waybillDepot, waybillInvoice);
        return 1;
    }

    @Override
    public List<WaybillTrackOutput> selectListByWaybillId(Long waybillId) {
        TSbWaybillTrackCriteria criteria = new TSbWaybillTrackCriteria();
        criteria.createCriteria().andWaybillIdEqualTo(waybillId);
        List<TSbWaybillTrack> tracks = trackDao.selectByExample(criteria);
        return BeanMapper.mapList(tracks, WaybillTrackOutput.class);
    }

    @Override
    public WaybillGoodOutput selectGoodByWaybillId(Long waybillId) {
        TSbWaybillGoodCriteria example = new TSbWaybillGoodCriteria();
        example.createCriteria().andWaybillIdEqualTo(waybillId);
        List<TSbWaybillGood> goods = waybillGoodDao.selectByExample(example);
        if (goods != null && goods.size() > 0) {
            return BeanMapper.map(goods.get(0), WaybillGoodOutput.class);
        }
        return null;
    }

    @Override
    public WaybillFeeOutput selectFeeByWaybillId(Long waybillId) {
        TSbWaybillFeeCriteria criteria = new TSbWaybillFeeCriteria();
        criteria.createCriteria().andWaybillIdEqualTo(waybillId);
        List<TSbWaybillFee> fees = feeDao.selectByExample(criteria);
        if (fees != null && fees.size() > 0) {
            return BeanMapper.map(fees.get(0), WaybillFeeOutput.class);
        }
        return null;
    }

    @Override
    public StowageOutput selectStowageByWaybillId(Long waybillId) {
        TSbStowage sbStowage = stowageDao.selectStowageByWaybillId(waybillId);
        if (sbStowage != null) {
            return BeanMapper.map(sbStowage, StowageOutput.class);
        }
        return null;
    }


    @Override
    public WaybillDepotOutput selectDepotByWaybillId(Long waybillId) {
        TSbWaybillDepotCriteria criteria = new TSbWaybillDepotCriteria();
        criteria.createCriteria().andWaybillIdEqualTo(waybillId);
        List<TSbWaybillDepot> depots = depotDao.selectByExample(criteria);
        if (depots != null && depots.size() > 0) {
            return BeanMapper.map(depots.get(0), WaybillDepotOutput.class);
        }
        return null;
    }

    @Override
    public FbAllotWaybillOutput selectAllotWaybillByWaybillId(Long waybillId) {
        TFbAllotWaybillCriteria criteria = new TFbAllotWaybillCriteria();
        criteria.createCriteria().andWaybillIdEqualTo(waybillId);
        List<TFbAllotWaybill> allotWaybills = allotWaybillDao.selectByExample(criteria);
        if (allotWaybills != null && allotWaybills.size() > 0) {
            return BeanMapper.map(allotWaybills.get(0), FbAllotWaybillOutput.class);
        }
        return null;
    }

    @Override
    public WaybillReceiveOutput selectWaybillReceiveByWaybillId(Long waybillId) {
        TSbWaybillReceiveCriteria criteria = new TSbWaybillReceiveCriteria();
        criteria.createCriteria().andWaybillIdEqualTo(waybillId);
        List<TSbWaybillReceive> waybillReceives = receiveDao.selectByExample(criteria);
        if (waybillReceives != null && waybillReceives.size() > 0) {
            return BeanMapper.map(waybillReceives.get(0), WaybillReceiveOutput.class);
        }
        return null;
    }

    @Override
    public List<LspWaybillBalanceDetailOutput> selectBalanceDetailByWaybillId(Long waybillId) {
        List<LspWaybillBalanceDetailOutput> detailOutputs = new LinkedList<>();
        List<ZbLspBalanceDetailOutput> outputs = lspBalanceDetailDao.selectLspBalanceDetailListByWaybillId(waybillId);
        if (outputs != null && outputs.size() > 0) {
            for (ZbLspBalanceDetailOutput output : outputs) {
                if (isEqualZero(output.getFreightFee()) != 0) {
                    TSbWaybillFeeBalanceWithBenchmark benchmark = balanceWithBenchmarkDao.selectByPrimaryKey(output.getBenchmarkId());
                    LspWaybillBalanceDetailOutput detailOutput = getOutput(output.getFreightFee(), "运费", benchmark.getBookerTime());
                    detailOutputs.add(detailOutput);
                }
                if (isEqualZero(output.getSendGoodFee()) != 0) {
                    TSbWaybillFeeBalanceWithBenchmark benchmark = balanceWithBenchmarkDao.selectByPrimaryKey(output.getBenchmarkId());
                    LspWaybillBalanceDetailOutput detailOutput = getOutput(output.getSendGoodFee(), "送货费", benchmark.getBookerTime());
                    detailOutputs.add(detailOutput);
                }
                if (isEqualZero(output.getPremiumFee()) != 0) {
                    TSbWaybillFeeBalanceWithBenchmark benchmark = balanceWithBenchmarkDao.selectByPrimaryKey(output.getBenchmarkId());
                    LspWaybillBalanceDetailOutput detailOutput = getOutput(output.getPremiumFee(), "保费", benchmark.getBookerTime());
                    detailOutputs.add(detailOutput);
                }
                if (isEqualZero(output.getInvoiceFee()) != 0) {
                    TSbWaybillFeeBalanceWithBenchmark benchmark = balanceWithBenchmarkDao.selectByPrimaryKey(output.getBenchmarkId());
                    LspWaybillBalanceDetailOutput detailOutput = getOutput(output.getInvoiceFee(), "开票费", benchmark.getBookerTime());
                    detailOutputs.add(detailOutput);
                }
                if (isEqualZero(output.getEnterFee()) != 0) {
                    TSbWaybillFeeBalanceWithBenchmark benchmark = balanceWithBenchmarkDao.selectByPrimaryKey(output.getBenchmarkId());
                    LspWaybillBalanceDetailOutput detailOutput = getOutput(output.getEnterFee(), "进仓费", benchmark.getBookerTime());
                    detailOutputs.add(detailOutput);
                }
                if (isEqualZero(output.getUpstairsFee()) != 0) {
                    TSbWaybillFeeBalanceWithBenchmark benchmark = balanceWithBenchmarkDao.selectByPrimaryKey(output.getBenchmarkId());
                    LspWaybillBalanceDetailOutput detailOutput = getOutput(output.getUpstairsFee(), "上楼费", benchmark.getBookerTime());
                    detailOutputs.add(detailOutput);
                }
                if (isEqualZero(output.getSignedReceiveFee()) != 0) {
                    TSbWaybillFeeBalanceWithBenchmark benchmark = balanceWithBenchmarkDao.selectByPrimaryKey(output.getBenchmarkId());
                    LspWaybillBalanceDetailOutput detailOutput = getOutput(output.getSignedReceiveFee(), "签回单", benchmark.getBookerTime());
                    detailOutputs.add(detailOutput);

                }
                if (isEqualZero(output.getExpressFee()) != 0) {
                    TSbWaybillFeeBalanceWithBenchmark benchmark = balanceWithBenchmarkDao.selectByPrimaryKey(output.getBenchmarkId());
                    LspWaybillBalanceDetailOutput detailOutput = getOutput(output.getExpressFee(), "加急费", benchmark.getBookerTime());
                    detailOutputs.add(detailOutput);
                }
                if (isEqualZero(output.getChangeWaybillFee()) != 0) {
                    TSbWaybillFeeBalanceWithBenchmark benchmark = balanceWithBenchmarkDao.selectByPrimaryKey(output.getBenchmarkId());
                    LspWaybillBalanceDetailOutput detailOutput = getOutput(output.getChangeWaybillFee(), "改单费", benchmark.getBookerTime());
                    detailOutputs.add(detailOutput);
                }
                if (isEqualZero(output.getUnloadFee()) != 0) {
                    TSbWaybillFeeBalanceWithBenchmark benchmark = balanceWithBenchmarkDao.selectByPrimaryKey(output.getBenchmarkId());
                    LspWaybillBalanceDetailOutput detailOutput = getOutput(output.getUnloadFee(), "卸货费", benchmark.getBookerTime());
                    detailOutputs.add(detailOutput);
                }
                if (isEqualZero(output.getDamagerFee()) != 0) {
                    TSbWaybillFeeBalanceWithBenchmark benchmark = balanceWithBenchmarkDao.selectByPrimaryKey(output.getBenchmarkId());
                    LspWaybillBalanceDetailOutput detailOutput = getOutput(output.getDamagerFee(), "异常赔偿费", benchmark.getBookerTime());
                    detailOutputs.add(detailOutput);
                }
            }
        }
        return detailOutputs;
    }

    @Override
    public List<WaybillCustomerTrackOutput> selectWaybillCustomerTrackOutputByWaybillId(Long waybillId) {
        TSbWaybillCustomerTrackCriteria criteria = new TSbWaybillCustomerTrackCriteria();
        criteria.createCriteria().andWaybillIdEqualTo(waybillId);
        List<TSbWaybillCustomerTrack> tracks = waybillCustomerTrackDao.selectByExample(criteria);
        if (tracks != null && tracks.size() > 0) {
            return BeanMapper.mapList(tracks, WaybillCustomerTrackOutput.class);
        }
        return null;
    }

    @Override
    public int waybillQuote(WaybillQuoteInput input) {
        if (input.getWaybillId() == null) {
            return -1;
        }
        TSbWaybill waybill = waybillDao.selectByPrimaryKey(input.getWaybillId());
        if (waybill == null) {
            return -1;
        }
        if (waybill.getSource() != 2) {
            return -1;
        }
        if (waybill.getStatus() != 0) {
            return -1;
        }
        TSbWaybillFeeCriteria example1 = new TSbWaybillFeeCriteria();
        example1.createCriteria().andWaybillIdEqualTo(input.getWaybillId());
        List<TSbWaybillFee> fees = feeDao.selectByExample(example1);
        TSbWaybillFee waybillFee = new TSbWaybillFee();
        if (fees != null && fees.size() > 0) {
            waybillFee = fees.get(0);
        } else {
            return -1;
        }
        BigDecimal freightFee = (input.getFreightFee() == null ? BigDecimal.ZERO : input.getFreightFee());
        BigDecimal premiumFee = (input.getPremiumFee() == null ? BigDecimal.ZERO : input.getPremiumFee());
        BigDecimal invoiceFee = (input.getInvoiceFee() == null ? BigDecimal.ZERO : input.getInvoiceFee());
        BigDecimal allFee = (input.getAllFee() == null ? BigDecimal.ZERO : input.getAllFee());
        BigDecimal sendGoodFee = (input.getSendGoodFee() == null ? BigDecimal.ZERO : input.getSendGoodFee());
        BigDecimal upstairsFee = (input.getUpstairsFee() == null ? BigDecimal.ZERO : input.getUpstairsFee());
        BigDecimal unloadFee = (input.getUnloadFee() == null ? BigDecimal.ZERO : input.getUnloadFee());
        BigDecimal enterFee = (input.getEnterFee() == null ? BigDecimal.ZERO : input.getEnterFee());
        BigDecimal signedReceiveFee = (input.getSignedReceiveFee() == null ? BigDecimal.ZERO : input.getSignedReceiveFee());
        BigDecimal expressFee = (input.getExpressFee() == null ? BigDecimal.ZERO : input.getExpressFee());

        waybillFee.setFreightFee(freightFee);
        waybillFee.setPremiumFee(premiumFee);
        waybillFee.setInvoiceFee(invoiceFee);
        waybillFee.setAllFee(allFee);

        TFbAllotWaybillCriteria example2 = new TFbAllotWaybillCriteria();
        example2.createCriteria().andWaybillIdEqualTo(input.getWaybillId());
        List<TFbAllotWaybill> allotWaybills = allotWaybillDao.selectByExample(example2);
        TFbAllotWaybill allotWaybill = new TFbAllotWaybill();
        if (allotWaybills != null && allotWaybills.size() > 0) {
            allotWaybill = allotWaybills.get(0);
        } else {
            return -1;
        }
        allotWaybill.setSendGoodFee(sendGoodFee);
        allotWaybill.setUpstairsFee(upstairsFee);
        allotWaybill.setUnloadFee(unloadFee);
        allotWaybill.setEnterFee(enterFee);
        allotWaybill.setSignedReceiveFee(signedReceiveFee);
        allotWaybill.setExpressFee(expressFee);

        //干线结算价包含：运费、进仓费
        allotWaybill.setMainLineFee(freightFee.add(enterFee));
        //中转结算价包含：运费、送货费、上楼费、装卸费、进仓费
        allotWaybill.setRansitFee(freightFee.add(sendGoodFee).add(upstairsFee).add(unloadFee).add(enterFee));
        allotWaybillDao.updateByPrimaryKeySelective(allotWaybill);

        feeDao.updateByPrimaryKeySelective(waybillFee);
        allotWaybillDao.updateByPrimaryKeySelective(allotWaybill);

        Map map = addWaybillFeeBalanceWithBenchmark(waybill, waybillFee, allotWaybill, input.getCreateId(), input.getCreateName());
        Long id = (Long) map.get("benchmarkId");
        if (id > 0) {
            waybill.setStatus(5);
            waybillDao.updateByPrimaryKeySelective(waybill);
            return 1;
        }
        return -1;
    }

    private LspWaybillBalanceDetailOutput getOutput(BigDecimal fee, String name, Date date) {
        LspWaybillBalanceDetailOutput detailOutput = new LspWaybillBalanceDetailOutput();
        detailOutput.setFeeType(name);
        if (isEqualZero(fee) == -1) {
            detailOutput.setPayType("补付");
            detailOutput.setFee(BigDecimal.ZERO.subtract(fee));
        }
        if (isEqualZero(fee) == 1) {
            detailOutput.setPayType("补收");
            detailOutput.setFee(fee);
        }
        detailOutput.setCreateDate(date);
        return detailOutput;
    }

    private int isEqualZero(BigDecimal fee) {
        if (fee == null) return 0;
        return fee.compareTo(BigDecimal.ZERO);
    }

    private void changeWaybillCompare(ChangeWaybillInput input, TSbWaybill waybill, TSbWaybillGood waybillGood,
                                      TSbWaybillFee waybillFee, TFbAllotWaybill allotWaybill,
                                      TSbWaybillDepot waybillDepot, TSbWaybillInvoice waybillInvoice) {
        boolean verifyFlag = false;

        Integer originBalanceType = waybill.getBalanceTypeWithZb();
        BigDecimal originXF = waybillFee.getXfyfFeeWithZb();

        TLspWaybillChange change = new TLspWaybillChange();
        change.setWaybillId(waybill.getId());
        change.setWaybillSn(waybill.getSn());
        change.setCreateId(input.getCreateId());
        change.setCreateName(input.getCreateName());
        change.setCreateTime(input.getCreateTime());
        List<TLspWaybillChangeDetail> detailList = new LinkedList<>();

        //货物名称
        String originGoodName = waybillGood.getGoodName();
        String inputGoodName = input.getGoodName();
        if (!originGoodName.equals(inputGoodName)) {
            TLspWaybillChangeDetail detail = new TLspWaybillChangeDetail();
            detail.setChangeProperty("goodName");
            detail.setChangeName("货物名称");
            detail.setWaybillId(input.getId());
            detail.setBeforeChangeValue(originGoodName);
            detail.setAfterChangeValue(inputGoodName);
            detail.setBeforeChangeValueDesc(originGoodName);
            detail.setAfterChangeValueDesc(inputGoodName);
            detail.setIsChange(0);
            detailList.add(detail);
            waybillGood.setGoodName(inputGoodName);
        }

        //品类
        Long originCategoryId = waybillGood.getGoodCategoryId();
        Long inputCategoryId = input.getGoodCategoryId();
        inputCategoryId = inputCategoryId.equals(0L) ? null : inputCategoryId;
        if (originCategoryId != null || inputCategoryId != null) {
            if (originCategoryId == null || !originCategoryId.equals(inputCategoryId)) {
                TLspWaybillChangeDetail detail = new TLspWaybillChangeDetail();
                detail.setChangeProperty("goodCategoryName");
                detail.setChangeName("品类");
                detail.setWaybillId(input.getId());
                detail.setBeforeChangeValue(originCategoryId == null ? "" : originCategoryId + "");
                detail.setAfterChangeValue(inputCategoryId == null ? "" : inputCategoryId + "");
                detail.setBeforeChangeValueDesc(originGoodName);
                detail.setAfterChangeValueDesc(inputGoodName);
                detail.setIsChange(0);
                detailList.add(detail);
                waybillGood.setGoodName(inputGoodName);
            }
        }
//        if (originValue!=null||inputValue!=null) {
//            if (originValue==null||!originValue.equals(inputValue)) {
//                detail.setIsChange(0);
//                if (property.isLeadToVerify())
//                    verifyFlag = true;
//                originField.set(origin,inputValue);
//                detailList.add(detail);
//            } else {
//                if (property.needPersistent()) {
//                    detail.setIsChange(1);
//                    detailList.add(detail);
//                }
//            }
//        }
    }

    private int computeFees(ChangeWaybillInput input, Long allocCenterId) {
        //计算费用
        CalculateFeeInput feeInput = new CalculateFeeInput();
        feeInput.sethCategoryId(input.getGoodCategoryId());
        feeInput.sethAllocCenterId(allocCenterId);
        feeInput.sethReceiveProvinceId(input.getReceiveProvinceId());
        feeInput.sethReceiveProvinceName(input.getReceiveProvinceName());
        feeInput.sethReceiveCityId(input.getReceiveCityId());
        feeInput.sethReceiveCityName(input.getReceiveCityName());
        feeInput.sethReceiveCountryId(input.getReceiveCountryId());
        feeInput.sethReceiveCountryName(input.getReceiveCountryName());
        feeInput.sethReceiveAddress(input.getReceiveAddress());
        feeInput.sethWeight(input.getOfferWeight());
        feeInput.sethVolume(input.getOfferVolume());
        feeInput.sethNum(input.getNum());
        feeInput.sethPack(input.getPack());
        feeInput.sethIsStandard(input.getIsStandard());
        feeInput.sethConnectType(input.getConnectType());
        feeInput.sethBalanceTypeWithZb(input.getBalanceTypeWithZb());
        feeInput.sethDfyfFeeWithZb(input.getDfyfFeeWithZb());
        feeInput.sethPremiumFee(input.getPremiumFee());
        feeInput.sethIsOpenTicket(input.getIsOpenTicket());
        feeInput.sethIsNeedEnterDepot(input.getIsNeedEnterDepot());
        feeInput.sethDepotType(input.getType() == null ? 1 : input.getType());
        feeInput.sethIsElevator(input.getIsElevator());
        feeInput.sethFloorNum(input.getFloorNum());
        feeInput.sethIsNeedReceipt(input.getIsNeedReceipt());
        feeInput.sethIsUpstairsIncre(input.getIsUpstairsIncre());
        feeInput.sethIsUnloadIncre(input.getIsUnloadIncre());
        feeInput.sethInsuredFee(input.getInsuredFee());
        CalculateFeeOutput feeOutput = waybillBalanceFee(feeInput);

        //把计算得到的费用赋值回去
        input.setFreightFee(feeOutput.getMainLineFee());
        input.setSendGoodFee(feeOutput.getSendGoodFee());
        input.setPremiumFee(feeOutput.getPremiumFee());
        input.setInvoiceFee(feeOutput.getOpenTicketFee());
        input.setEnterFee(feeOutput.getEnterDepotFee());
        input.setUpstairsFee(feeOutput.getUpstairsFee());
        input.setUnloadFee(feeOutput.getUnloadFee());
        input.setSignedReceiveFee(feeOutput.getReceiptFee());
        input.setExpressFee(input.getExpressFee() == null ? BigDecimal.ZERO : input.getExpressFee());
        if (feeOutput.getMainLineFee() == null) return -2;
        BigDecimal all = feeOutput.getUpstairsFee()
                .add(feeOutput.getUnloadFee())
                .add(feeOutput.getReceiptFee())
                .add(input.getExpressFee())
                .add(feeOutput.getMainLineFee())
                .add(feeOutput.getEnterDepotFee())
                .add(feeOutput.getSendGoodFee())
                .add(feeOutput.getPremiumFee())
                .add(feeOutput.getOpenTicketFee());
        input.setAllFee(all);
        if (input.getBalanceTypeWithZb() == 1) {
            input.setXfyfFeeWithZb(input.getSignedReceiveFee().add(input.getInvoiceFee()).add(input.getPremiumFee()));
            input.setDifFee(input.getDfyfFeeWithZb()
                    .subtract(input.getFreightFee())
                    .subtract(input.getUpstairsFee())
                    .subtract(input.getUnloadFee()));
            input.setAllVasFee(input.getUpstairsFee()
                    .subtract(input.getUnloadFee())
                    .subtract(input.getSignedReceiveFee())
                    .subtract(input.getExpressFee()));
        } else {
            input.setAllVasFee(input.getUpstairsFee()
                    .subtract(input.getUnloadFee())
                    .subtract(input.getSignedReceiveFee())
                    .subtract(input.getExpressFee())
                    .subtract(input.getEnterFee()));
        }
        return 1;
    }

    private void changeWaybillPersistent(ChangeWaybillInput input, TSbWaybill waybill, TSbWaybillGood waybillGood,
                                         TSbWaybillFee waybillFee, TFbAllotWaybill allotWaybill,
                                         TSbWaybillDepot waybillDepot, TSbWaybillInvoice waybillInvoice) {
        boolean verifyFlag = false;

        TLspWaybillChange change = new TLspWaybillChange();
        change.setWaybillId(waybill.getId());
        change.setWaybillSn(waybill.getSn());
        change.setCreateId(input.getCreateId());
        change.setCreateName(input.getCreateName());
        change.setCreateTime(input.getCreateTime());
        List<TLspWaybillChangeDetail> detailList = new LinkedList<>();
        List<TLspWaybillChangeDetail> feeList = new LinkedList<>();

        Field[] fields = ChangeWaybillInput.class.getDeclaredFields();
        for (Field field : fields) {
            ChangeProperty property = field.getAnnotation(ChangeProperty.class);

            field.setAccessible(true);
            if (property == null) continue;
            switch (property.from()) {
                case "waybill":
                    verifyFlag = fieldCompare(field, input, waybill, waybill.getId(), property, detailList, feeList) || verifyFlag;
                    break;
                case "waybill_good":
                    verifyFlag = fieldCompare(field, input, waybillGood, waybill.getId(), property, detailList, feeList) || verifyFlag;
                    break;
                case "waybill_fee":
                    verifyFlag = fieldCompare(field, input, waybillFee, waybill.getId(), property, detailList, feeList) || verifyFlag;
                    break;
                case "allot_waybill":
                    verifyFlag = fieldCompare(field, input, allotWaybill, waybill.getId(), property, detailList, feeList) || verifyFlag;
                    break;
                case "waybill_depot":
                    verifyFlag = fieldCompare(field, input, waybillDepot, waybill.getId(), property, detailList, feeList) || verifyFlag;
                    break;
                case "waybill_invoice":
                    verifyFlag = fieldCompare(field, input, waybillInvoice, waybill.getId(), property, detailList, feeList) || verifyFlag;
                    break;
                default:
            }
        }


        if (detailList.size() > 0) {
            Set<TLspWaybillChangeDetail> set = new HashSet<>();
            set.addAll(detailList);
            set.addAll(feeList);
            detailList = new LinkedList<>(set);

            BigDecimal sumFee = BigDecimal.ZERO;
            BigDecimal lastChangeFee = waybillFee.getChangeFeeSum() == null ?
                    BigDecimal.ZERO : waybillFee.getChangeFeeSum();//累计改单费
            BigDecimal changeFee = input.getChangeWaybillFee() == null ? BigDecimal.ZERO : input.getChangeWaybillFee();
            sumFee = sumFee.add(lastChangeFee);

            if (changeFee.compareTo(BigDecimal.ZERO) > 0) {
                TLspWaybillChangeDetail changeFeeDetail = new TLspWaybillChangeDetail();
                changeFeeDetail.setChangeProperty("");
                changeFeeDetail.setChangeName("改单费");
                changeFeeDetail.setWaybillId(waybill.getId());
                changeFeeDetail.setBeforeChangeValue(null);
                changeFeeDetail.setAfterChangeValue(input.getChangeWaybillFee().toString());
                changeFeeDetail.setBeforeChangeValueDesc(null);
                changeFeeDetail.setAfterChangeValueDesc(input.getChangeWaybillFee().toString());
                detailList.add(changeFeeDetail);

                sumFee = sumFee.add(changeFee);
            }

            BigDecimal p = BigDecimal.ZERO;//修改后当前结算费用
            if (waybill.getBalanceTypeWithZb().equals(0)) {
                p = input.getAllFee();
            } else if (waybill.getBalanceTypeWithZb().equals(1)) {
                p = input.getAllFee().subtract(input.getDfyfFeeWithZb());
            }

            BigDecimal q = BigDecimal.ZERO;//累计已结算费用
            TSbWaybillFeeBalanceWithBenchmarkCriteria example = new TSbWaybillFeeBalanceWithBenchmarkCriteria();
            example.createCriteria().andWaybillIdEqualTo(waybill.getId()).andStatusGreaterThanOrEqualTo(1)
                    .andStatusLessThanOrEqualTo(2);
            List<TSbWaybillFeeBalanceWithBenchmark> list = balanceWithBenchmarkDao.selectByExample(example);
            for (TSbWaybillFeeBalanceWithBenchmark benchmark : list) {
                q = q.add(benchmark.getZbReceiveAllFee());
            }
            sumFee = sumFee.add(p).subtract(q);//累计改单费＋本次改单费＋本次改单后结算费用－返还已结算费用

            if (verifyFlag) {
                TSbWaybill updateWaybill = new TSbWaybill();
                updateWaybill.setId(waybill.getId());
                updateWaybill.setIsChange(1);//需要审核的话将运单置为变更中
                waybillDao.updateByPrimaryKeySelective(updateWaybill);
                change.setStatus(0);
            } else {
                change.setVerifyId(-1L);
                change.setVerifyName("系统");
                change.setVerifyTime(new Date());
                change.setStatus(1);

                int lastChangeTimes = waybill.getChangeTimes() == null ? 0 : waybill.getChangeTimes();
                waybill.setChangeTimes(lastChangeTimes + 1);
                waybillDao.updateByPrimaryKey(waybill);

                waybillGoodDao.updateByPrimaryKey(waybillGood);

                waybillFee.setChangeFeeSum(lastChangeFee.add(changeFee));
                feeDao.updateByPrimaryKey(waybillFee);

                BigDecimal transitFee = BigDecimal.ZERO
                        .add(waybillFee.getFreightFee() == null ? BigDecimal.ZERO : waybillFee.getFreightFee())
                        .add(allotWaybill.getSendGoodFee() == null ? BigDecimal.ZERO : allotWaybill.getSendGoodFee())
                        .add(allotWaybill.getUnloadFee() == null ? BigDecimal.ZERO : allotWaybill.getUnloadFee())
                        .add(allotWaybill.getUnloadFee() == null ? BigDecimal.ZERO : allotWaybill.getUnloadFee())
                        .add(allotWaybill.getEnterFee() == null ? BigDecimal.ZERO : allotWaybill.getEnterFee());
                BigDecimal mainLineFee = BigDecimal.ZERO
                        .add(waybillFee.getFreightFee() == null ? BigDecimal.ZERO : waybillFee.getFreightFee())
                        .add(allotWaybill.getEnterFee() == null ? BigDecimal.ZERO : allotWaybill.getEnterFee());
                allotWaybill.setRansitFee(transitFee);
                allotWaybill.setMainLineFee(mainLineFee);
                allotWaybillDao.updateByPrimaryKey(allotWaybill);

                if (waybillDepot.getId() == null) {
                    depotDao.insertSelective(waybillDepot);
                } else {
                    depotDao.updateByPrimaryKey(waybillDepot);
                }

                if (waybillInvoice.getId() == null) {
                    invoiceDao.insertSelective(waybillInvoice);
                } else if (waybill.getIsOpenTicket() == null || waybill.getIsOpenTicket() == 0) {
                    invoiceDao.deleteByPrimaryKey(waybillInvoice.getId());
                } else {
                    invoiceDao.updateByPrimaryKey(waybillInvoice);
                }
                //上行
                ExchangeUtils.afterCommit(applicationContext, new EditWaybillEvent(this, waybill.getId()));

                //作废未结算的费用
                TSbWaybillFeeBalanceWithBenchmarkCriteria updateExample = new TSbWaybillFeeBalanceWithBenchmarkCriteria();
                updateExample.createCriteria().andWaybillIdEqualTo(waybill.getId()).andStatusEqualTo(0);
                TSbWaybillFeeBalanceWithBenchmark updateBenchmark = new TSbWaybillFeeBalanceWithBenchmark();
                updateBenchmark.setStatus(3);
                balanceWithBenchmarkDao.updateByExampleSelective(updateBenchmark, updateExample);

                //改单后导致费用结清，且原状态为已确认交易，则修改运单状态为待配载
                if (sumFee.compareTo(BigDecimal.ZERO) == 0 && waybill.getStatus() == 5) {
                    waybill.setStatus(15);
                    waybillDao.updateByPrimaryKey(waybill);
                }
                //改单后费用未结清，而原状态为待配载，则修改运单状态为已确认交易
                if (sumFee.compareTo(BigDecimal.ZERO) != 0 && waybill.getStatus() == 15) {
                    waybill.setStatus(5);
                    waybillDao.updateByPrimaryKey(waybill);
                }

                TSbWaybillFeeBalanceWithBenchmark benchmark = new TSbWaybillFeeBalanceWithBenchmark();
                benchmark.setWaybillId(waybill.getId());
                benchmark.setType(2);
                benchmark.setZbReceiveAllFee(sumFee);
                benchmark.setZbReceiveBenchmarkFee(sumFee);
                benchmark.setStatus(0);
                benchmark.setBookerEmployeeId(-1L);
                benchmark.setBookerEmployeeName("系统");
                benchmark.setBookerTime(new Date());
                balanceWithBenchmarkDao.insertSelective(benchmark);

                //更新服务商运单更新信息
                change.setBenchmarkId(benchmark.getId());
            }

            change.setSumFee(sumFee);
            changeDao.insertSelective(change);

            for (TLspWaybillChangeDetail detail : detailList) {
                detail.setLspChangeId(change.getId());
                changeDetailDao.insertSelective(detail);
            }
        }
    }

    private <T> boolean fieldCompare(Field field, ChangeWaybillInput input, T origin, Long waybillId,
                                     ChangeProperty property, List<TLspWaybillChangeDetail> detailList,
                                     List<TLspWaybillChangeDetail> feeList) {
        boolean verifyFlag = false;
        try {
            Field originField = origin.getClass().getDeclaredField(field.getName());
            originField.setAccessible(true);
            Object inputValue = field.get(input);
            Object originValue = originField.get(origin);
            String[] key = property.key();
            String[] value = property.value();
            Map<String, String> map = new HashMap<>();
            for (int i = 0; i < key.length; i++) {
                map.put(key[i], value[i]);
            }

            TLspWaybillChangeDetail detail = new TLspWaybillChangeDetail();
            detail.setChangeProperty(field.getName());
            detail.setChangeName(property.name());
            detail.setWaybillId(waybillId);
            detail.setBeforeChangeValue(originValue == null ? "" : originValue.toString());
            detail.setAfterChangeValue(inputValue == null ? "" : inputValue.toString());
            detail.setBeforeChangeValueDesc(originValue == null ? "" : originValue.toString());
            detail.setAfterChangeValueDesc(inputValue == null ? "" : inputValue.toString());
            if (key.length > 0) {
                detail.setBeforeChangeValueDesc(map.get(originValue + ""));
                detail.setAfterChangeValueDesc(map.get(inputValue + ""));
            }

            if (property.needPersistent()) {
                detail.setIsChange(1);
                feeList.add(detail);
            }
            if (originValue != null || inputValue != null) {
                if (field.getType().equals(BigDecimal.class)) {
                    BigDecimal originBigDecimalValue = originValue == null ? BigDecimal.ZERO : (BigDecimal) originValue;
                    BigDecimal inputBigDecimalValue = inputValue == null ? BigDecimal.ZERO : (BigDecimal) inputValue;
                    if (originBigDecimalValue.compareTo(inputBigDecimalValue) != 0) {
                        detail.setIsChange(0);
                        if (property.isLeadToVerify())
                            verifyFlag = true;
                        originField.set(origin, inputValue);
                        detailList.add(detail);
                    }
                } else {
                    if (originValue == null || !originValue.equals(inputValue)) {
                        if (key.length > 0) {
                            String originMapValue = map.get(originValue + "");
                            String inputMapValue = map.get(inputValue + "");
                            if (!originMapValue.equals(inputMapValue)) {
                                detail.setIsChange(0);
                                if (property.isLeadToVerify())
                                    verifyFlag = true;
                                originField.set(origin, inputValue);
                                detailList.add(detail);
                            }
                        } else {
                            detail.setIsChange(0);
                            if (property.isLeadToVerify())
                                verifyFlag = true;
                            originField.set(origin, inputValue);
                            detailList.add(detail);
                        }
                    }
                }
            }
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return verifyFlag;
    }

    @Override
    public int close(Long id, Long userId) {

        TSbWaybillCriteria criteria = new TSbWaybillCriteria();
        criteria.createCriteria().andIdEqualTo(id).andLspIdEqualTo(userId);
        List<TSbWaybill> waybillList = waybillDao.selectByExample(criteria);

        if (waybillList == null || waybillList.size() == 0) {
            return 0;
        }

        TSbWaybill waybill = waybillList.get(0);

        //未确认交易的订单才可以关闭, 待报价

        if (waybill.getStatus() != 0) {
            return -1;
        }


        //检查费用状态是否存在已支付的.   如果存在已支付,则不能关闭运单
//        TSbWaybillFeeBalanceWithBenchmarkCriteria criteriaBalance = new TSbWaybillFeeBalanceWithBenchmarkCriteria();
//        criteriaBalance.createCriteria().andWaybillIdEqualTo(id).andStatusEqualTo(1);
//        List<TSbWaybillFeeBalanceWithBenchmark> balanceList =feeBalanceWithBenchmarkDao.selectByExample(criteriaBalance);
//
//        if (balanceList != null && balanceList.size() > 0) {
//            return -1;
//        }


        waybill.setId(id);
        waybill.setIsDelete(1);
        waybill.setStatus(50);
        waybillDao.updateByPrimaryKey(waybill);

        //增加运单关闭的轨迹
        TSbWaybillCustomerTrack customerTrack = new TSbWaybillCustomerTrack();
        customerTrack.setWaybillId(id);
        customerTrack.setWaybillSystemId(waybill.getDownId());
        customerTrack.setCreateTime(new Date());
        customerTrack.setCreateName(waybill.getLspCompanyName());
        customerTrack.setMemo("运单关闭");
        customerTrackDao.insertSelective(customerTrack);

        TSbWaybillTrack waybillTrack = new TSbWaybillTrack();
        waybillTrack.setWaybillId(id);
        waybillTrack.setStatus("关闭");
        waybillTrack.setCreateTime(new Date());
        waybillTrack.setWaybillSn(waybillList.get(0).getSn());
        waybillTrack.setCreateUserId(userId);
        waybillTrack.setCreateUserName(waybill.getLspCompanyName());
        trackDao.insertSelective(waybillTrack);

        //上行
        ExchangeUtils.afterCommit(applicationContext, new CloseWaybillEvent(this, waybill.getId(),waybill.getLspCompanyName()));

        return 1;
    }
}
