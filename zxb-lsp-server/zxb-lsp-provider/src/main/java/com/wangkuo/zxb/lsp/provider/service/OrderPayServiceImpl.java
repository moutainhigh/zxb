package com.wangkuo.zxb.lsp.provider.service;

import com.wangkuo.framework.mapper.BeanMapper;
import com.wangkuo.zxb.lsp.api.dto.input.CreatePaymentInput;
import com.wangkuo.zxb.lsp.api.dto.input.PayMentParam;
import com.wangkuo.zxb.lsp.api.dto.output.OrderOutput;
import com.wangkuo.zxb.lsp.api.dto.output.OrderPaySuccessOutput;
import com.wangkuo.zxb.lsp.api.dto.output.PaymentInformationOutput;
import com.wangkuo.zxb.lsp.api.service.IOrderPayService;
import com.wangkuo.zxb.lsp.api.service.IZbSequenceNumberService;
import com.wangkuo.zxb.lsp.provider.db.common.SequenceNumberCode;
import com.wangkuo.zxb.lsp.provider.db.dao.*;
import com.wangkuo.zxb.lsp.provider.db.po.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by mark on 16/4/14.
 */
@Service
public class OrderPayServiceImpl implements IOrderPayService {

    @Autowired
    private TSbWaybillFeeBalanceWithBenchmarkDao benchmarkDao;
    @Autowired
    private TZbLspBalanceDetailDao detailDao;
    @Autowired
    private TSbWaybillDao waybillDao;
    @Autowired
    private TSbWaybillGoodDao goodDao;
    @Autowired
    TSbWaybillFeeDao feeDao;
    @Autowired
    TFbAllotWaybillDao allotWaybillDao;
    @Autowired
    private TSbOrderDao orderDao;
    @Autowired
    private TSbOrderWaybillRelationDao relationDao;
    @Autowired
    private IZbSequenceNumberService zbSequenceNumberService;
    @Autowired
    private TLspWalletBalanceLogDao lspWalletBalanceLogDao;


    private final int PAY_BEGIN = 0;
    private final int PAY_SUCCESS = 1;
    private final int PAY_FAIL = 2;

    private final int CREATE_WAYBILL = 1;
    private final int CHANGE_WAYBILL = 2;

    private final int LSP_PAY_FOR_CREATE = 5;
    private final int LSP_PAY_FOR_CHANGE = 6;


    @Override
    public PaymentInformationOutput createOrderInformation(CreatePaymentInput input) {
        PaymentInformationOutput info = new PaymentInformationOutput();

        Long benchmarkId = input.getBenchmarkId();
        Long waybillId = input.getWaybillId();

        TSbWaybillFeeBalanceWithBenchmark benchmark = benchmarkDao.selectByPrimaryKey(benchmarkId);
        if (benchmark.getStatus()!=null && benchmark.getStatus()>0){
            info.setStatus(PaymentInformationOutput.WAYBILL_PAYED);
            info.setErrorMsg(PaymentInformationOutput.WAYBILL_PAYED_ERR);
            return info;
        }

        TZbLspBalanceDetailCriteria criteria = new TZbLspBalanceDetailCriteria();
        criteria.createCriteria().andBenchmarkIdEqualTo(benchmarkId);
        List<TZbLspBalanceDetail> details = detailDao.selectByExample(criteria);
        TZbLspBalanceDetail balanceDetail = details!=null&&details.size()>0?details.get(0):null;

        TSbWaybill waybill = waybillDao.selectByPrimaryKey(waybillId);
        if (waybill.getIsDelete()==1){
            info.setStatus(PaymentInformationOutput.WAYBILL_CLOSED);
            info.setErrorMsg(PaymentInformationOutput.WAYBILL_CLOSED_ERR);
            return info;
        }

        TSbWaybillGoodCriteria example = new TSbWaybillGoodCriteria();
        example.createCriteria().andWaybillIdEqualTo(waybillId);
        List<TSbWaybillGood> goods = goodDao.selectByExample(example);
        TSbWaybillGood waybillGood = goods!=null&&goods.size()>0?goods.get(0):null;

        int type = benchmark.getType();
        type = type==CREATE_WAYBILL?LSP_PAY_FOR_CREATE:type==CHANGE_WAYBILL?LSP_PAY_FOR_CHANGE:0;
        BigDecimal allFee = benchmark.getZbReceiveAllFee();
        if (balanceDetail==null||waybillGood==null||
                type == 0||allFee.compareTo(BigDecimal.ZERO)<0){
            info.setStatus(PaymentInformationOutput.DATA_ERROR);
            info.setErrorMsg(PaymentInformationOutput.DATA_ERROR_ERR);
            return info;
        }

        //生成订单
        String paySn = zbSequenceNumberService.createSequenceNumber(SequenceNumberCode.BODY_TYPE,
                SequenceNumberCode.BODY_ID,
                SequenceNumberCode.PAY_CODE);
        TSbOrder order = new TSbOrder();
        order.setPaySn(paySn);
        order.setType(type);
        order.setPayFee(allFee);
        order.setPayStatus(PAY_BEGIN);
        order.setBookerEmployeeId(input.getBookerId());
        order.setBookerEmployeeName(input.getBookerName());
        order.setCreateTime(input.getCreateTime());
        order.setCreateTime(new Date());
        order.setSiteId(waybill.getLspId());
        order.setSiteName(waybill.getLspCompanyName());
        int r1 = orderDao.insertSelective(order);

        TSbOrderWaybillRelation relation = new TSbOrderWaybillRelation();
        relation.setOrderId(order.getId());
        relation.setWaybillId(benchmarkId);
        int r2 = relationDao.insertSelective(relation);
        if (r1!=1||r2!=1){
            info.setStatus(PaymentInformationOutput.DATA_ERROR);
            info.setErrorMsg(PaymentInformationOutput.DATA_ERROR_ERR);
            return info;
        }

        //支付信息
        info = new PaymentInformationOutput();
        info.setStatus(PaymentInformationOutput.SUCCESS);
        info.setOrderId(order.getId());
        info.setBenchmarkId(benchmarkId);
        info.setSystemSn(waybill.getSystemSn());
        info.setGoodName(waybillGood.getGoodName());
        info.setReceiveName(waybill.getReceiveLinkName());
        info.setOperationTime(waybill.getOperationTime());
        info.setMainLineFee(BigDecimal.ZERO
                .add(balanceDetail.getFreightFee()==null?BigDecimal.ZERO:balanceDetail.getFreightFee())
                .add(balanceDetail.getSendGoodFee()==null?BigDecimal.ZERO:balanceDetail.getSendGoodFee()));
        info.setPremiumFee(balanceDetail.getPremiumFee()==null?BigDecimal.ZERO:balanceDetail.getPremiumFee());
        info.setInvoiceFee(balanceDetail.getInvoiceFee()==null?BigDecimal.ZERO:balanceDetail.getInvoiceFee());
        info.setVasFee(balanceDetail.getUpstairsFee() == null ? BigDecimal.ZERO : balanceDetail.getUpstairsFee()
            .add(balanceDetail.getUnloadFee() == null ? BigDecimal.ZERO : balanceDetail.getUnloadFee())
            .add(balanceDetail.getSignedReceiveFee() == null ? BigDecimal.ZERO : balanceDetail.getSignedReceiveFee())
            .add(balanceDetail.getExpressFee() == null ? BigDecimal.ZERO : balanceDetail.getExpressFee())
            .add(balanceDetail.getEnterFee() == null ? BigDecimal.ZERO : balanceDetail.getEnterFee())
        );
        info.setAllFee(allFee);

        return info;
    }

    @Override
    public OrderOutput findOrder(Long id) {
        return BeanMapper.map(orderDao.selectByPrimaryKey(id), OrderOutput.class);
    }

    @Override
    public OrderPaySuccessOutput findOrderAndWaybillId(Long id) {
        return orderDao.selectOrderAndWaybill(id);
    }

    @Override
    public int paySuccess(Long id,PayMentParam param) {
        TSbOrder order = orderDao.selectByPrimaryKey(id);
        if(order==null||order.getPayStatus() ==2){
            return -2;//运单已为失败
        }else if(order.getPayStatus() ==1)
        {
            return 1;
        }
        switch (order.getType().intValue())
        {
            case 5://5服务商运单支付
            case 6://6服务商补付款。
            {
                //此为结算支付，relation.getWaybillId() 表示是与网点结算表的id
                TSbOrderWaybillRelationCriteria sbOrderWaybillRelationCriteria=new TSbOrderWaybillRelationCriteria();
                sbOrderWaybillRelationCriteria.createCriteria().andOrderIdEqualTo(id);
                List<TSbOrderWaybillRelation> relations =relationDao.selectByExample(sbOrderWaybillRelationCriteria);
                if(relations.size() > 0){
                    for(TSbOrderWaybillRelation relation : relations){
                        //修改网点结算表
                        TSbWaybillFeeBalanceWithBenchmark balanceWithBenchmark=new TSbWaybillFeeBalanceWithBenchmark();
                        balanceWithBenchmark.setId(relation.getWaybillId());
                        balanceWithBenchmark.setStatus(1);
                        balanceWithBenchmark.setPayTime(new Date());
                        balanceWithBenchmark.setFreeSingleId(order.getBookerEmployeeId());
                        balanceWithBenchmark.setFreeSingleName(order.getBookerEmployeeName());
                        balanceWithBenchmark.setFreeTime(new Date());
                        benchmarkDao.updateByPrimaryKeySelective(balanceWithBenchmark);

                        if (order.getType()!=null && (order.getType().equals(LSP_PAY_FOR_CREATE) || order.getType().equals(LSP_PAY_FOR_CHANGE))) {
                            TSbWaybill updateWaybill = new TSbWaybill();
                            TSbWaybillFeeBalanceWithBenchmark benchmark = benchmarkDao.selectByPrimaryKey(relation.getWaybillId());
                            updateWaybill.setId(benchmark.getWaybillId());
                            updateWaybill.setStatus(15);
                            waybillDao.updateByPrimaryKeySelective(updateWaybill);
                        }
                    }
                }
               // if(param.getPaymentType()!=2) {
                    //生成资金变动日志
                    TLspWalletBalanceLog log = new TLspWalletBalanceLog();
                    log.setLspUserId(order.getSiteId());
                    log.setType(2);
                    log.setTransactionSum(order.getPayFee());
                    log.setCreateDate(new Date());
                    log.setOperatorId(order.getBookerEmployeeId());
                    log.setOperatorName(order.getBookerEmployeeName());
                    log.setAccountBalance(BigDecimal.ZERO);
                    log.setMemo("服务商支付");
                    log.setOrderId(order.getId());

                    lspWalletBalanceLogDao.insertSelective(log);
               // }
                break;
            }
            default:
            {
                new Throwable("非法的订单信息，回调失败!");
            }
        }
        TSbOrder updateOrder=new TSbOrder();
        updateOrder.setId(order.getId());
        updateOrder.setPayStatus(PAY_SUCCESS);
        updateOrder.setPaymentType(param != null ? param.getPaymentType() : null);
        updateOrder.setPaymentNo(param!=null?param.getPaymentNo():null);
        updateOrder.setPaymentTime(new Date());
        updateOrder.setPaymentMemo(param!=null?param.getPaymentMemo():null);
        orderDao.updateByPrimaryKeySelective(updateOrder);
        return 1;
    }
}