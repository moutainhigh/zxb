package com.wangkuo.zxb.lsp.provider.service;

import com.wangkuo.framework.mapper.BeanMapper;
import com.wangkuo.framework.persistence.PageableImpl;
import com.wangkuo.zxb.lsp.api.dto.input.ChangeWaybillInput;
import com.wangkuo.zxb.lsp.api.dto.input.LspWaybillChangeVerifyInput;
import com.wangkuo.zxb.lsp.api.dto.input.QueryLspWaybillChangeInput;
import com.wangkuo.zxb.lsp.api.dto.output.LspWaybillChangeDetailOutput;
import com.wangkuo.zxb.lsp.api.dto.output.LspWaybillChangeOutput;
import com.wangkuo.zxb.lsp.api.dto.output.PagedList;
import com.wangkuo.zxb.lsp.api.service.ChangeProperty;
import com.wangkuo.zxb.lsp.api.service.ILspWaybillChangeService;
import com.wangkuo.zxb.lsp.exchange.ExchangeUtils;
import com.wangkuo.zxb.lsp.exchange.event.EditWaybillEvent;
import com.wangkuo.zxb.lsp.provider.db.common.ResultStatus;
import com.wangkuo.zxb.lsp.provider.db.dao.*;
import com.wangkuo.zxb.lsp.provider.db.po.*;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sanshao on 16-4-9.
 */
@Service
public class LspWaybillChangeServiceImpl implements ILspWaybillChangeService{

    @Autowired
    private TLspWaybillChangeDao lspWaybillChangeDao;

    @Autowired
    private TLspWaybillChangeDetailDao lspWaybillChangeDetailDao;

    @Autowired
    private TSbWaybillDao waybillDao;

    @Autowired
    private TSbWaybillGoodDao waybillGoodDao;

    @Autowired
    TSbWaybillFeeDao feeDao;

    @Autowired
    TFbAllotWaybillDao allotWaybillDao;

    @Autowired
    TSbWaybillDepotDao depotDao;

    @Autowired
    TSbWaybillInvoiceDao invoiceDao;

    @Autowired
    private TSbWaybillFeeBalanceWithBenchmarkDao waybillFeeBalanceWithBenchmarkDao;

    @Autowired
    private TZbLspBalanceDetailDao lspBalanceDetailDao;

    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public PagedList<LspWaybillChangeOutput> selectListByCondition(QueryLspWaybillChangeInput input) {
        PageableImpl pageable = BeanMapper.map(input, PageableImpl.class);
        List<LspWaybillChangeOutput> outputs = lspWaybillChangeDao.selectListByCondition(input,pageable);
        return new PagedList<>(input, pageable.getCount(), BeanMapper.mapList(outputs, LspWaybillChangeOutput.class));
    }

    @Override
    public List<LspWaybillChangeDetailOutput> selectChangeDetailByIdAndStatus(Long waybillId, Long lspChangeId, Integer isChange) {
        TLspWaybillChangeDetailCriteria criteria = new TLspWaybillChangeDetailCriteria();
        if(isChange != null){
            criteria.createCriteria().andWaybillIdEqualTo(waybillId).andLspChangeIdEqualTo(lspChangeId).andIsChangeEqualTo(isChange);
        }else {
            criteria.createCriteria().andWaybillIdEqualTo(waybillId).andLspChangeIdEqualTo(lspChangeId);
        }
        return BeanMapper.mapList(lspWaybillChangeDetailDao.selectByExample(criteria), LspWaybillChangeDetailOutput.class);
    }

    @Override
    public List<LspWaybillChangeOutput> selectListByWaybillIdAndStatus(Long waybillId, Integer status) {
        TLspWaybillChangeCriteria criteria = new TLspWaybillChangeCriteria();
        criteria.createCriteria().andWaybillIdEqualTo(waybillId).andStatusEqualTo(status);
        return BeanMapper.mapList(lspWaybillChangeDao.selectByExample(criteria), LspWaybillChangeOutput.class);
    }

    @Override
    public int verify(LspWaybillChangeVerifyInput input) {
        TSbWaybill waybill = waybillDao.selectByPrimaryKey(input.getWaybillId());
        if(waybill == null){
            return ResultStatus.RECORD_DOES_NOT_EXIST;
        }
        TLspWaybillChange change = lspWaybillChangeDao.selectByPrimaryKey(input.getLspChangeId());
        if(change == null){
            return ResultStatus.RECORD_DOES_NOT_EXIST;
        }
        //判断该运单是否还有记录未审核
        List<LspWaybillChangeOutput> lspWaybillChangeOutputs = selectListByWaybillIdAndStatus(input.getWaybillId(),0);
        if(lspWaybillChangeOutputs != null && lspWaybillChangeOutputs.size() > 1){
            return ResultStatus.RECORD_NOT_AUDITED;
        }
        //审核通过
        if(input.getStatus() == 1){
            //将运单变更值 修改
            updateChangedValues(waybill.getId(), input.getLspChangeId());

            //将变更明细中的费用信息取出来，生成一条结算及结算明细
            List<LspWaybillChangeDetailOutput> lspWaybillChangeDetailOutputs = selectChangeDetailByIdAndStatus(input.getWaybillId(),input.getLspChangeId(),null);
            if(lspWaybillChangeDetailOutputs != null && lspWaybillChangeDetailOutputs.size() != 0){
                //结算明细
                TZbLspBalanceDetail lspBalanceDetail = new TZbLspBalanceDetail();

                TSbWaybillFeeCriteria feeExample = new TSbWaybillFeeCriteria();
                feeExample.createCriteria().andWaybillIdEqualTo(input.getWaybillId());
                List<TSbWaybillFee> fees = feeDao.selectByExample(feeExample);
                TSbWaybillFee waybillFee = fees!=null&&fees.size()>0?fees.get(0):null;
                assert waybillFee!=null;//运单费用逻辑上不应该为空

                for(LspWaybillChangeDetailOutput output : lspWaybillChangeDetailOutputs){
                    if(output.getChangeName().equals("运费")){
                        BigDecimal differenceFee = getDifferenceFee(output.getBeforeChangeValue(),output.getAfterChangeValue());
                        lspBalanceDetail.setFreightFee(differenceFee);
                    }
                    if(output.getChangeName().equals("送货费")){
                        BigDecimal differenceFee = getDifferenceFee(output.getBeforeChangeValue(),output.getAfterChangeValue());
                        lspBalanceDetail.setSendGoodFee(differenceFee);
                    }
                    if(output.getChangeName().equals("保费")){
                        BigDecimal differenceFee = getDifferenceFee(output.getBeforeChangeValue(),output.getAfterChangeValue());
                        lspBalanceDetail.setPremiumFee(differenceFee);
                    }
                    if(output.getChangeName().equals("开票费")){
                        BigDecimal differenceFee = getDifferenceFee(output.getBeforeChangeValue(),output.getAfterChangeValue());
                        lspBalanceDetail.setInvoiceFee(differenceFee);
                    }
                    if(output.getChangeName().equals("进仓费")){
                        BigDecimal differenceFee = getDifferenceFee(output.getBeforeChangeValue(),output.getAfterChangeValue());
                        lspBalanceDetail.setEnterFee(differenceFee);
                    }
                    if(output.getChangeName().equals("上楼费")){
                        BigDecimal differenceFee = getDifferenceFee(output.getBeforeChangeValue(),output.getAfterChangeValue());
                        lspBalanceDetail.setUpstairsFee(differenceFee);
                    }
                    if(output.getChangeName().equals("签回单费")){
                        BigDecimal differenceFee = getDifferenceFee(output.getBeforeChangeValue(),output.getAfterChangeValue());
                        lspBalanceDetail.setSignedReceiveFee(differenceFee);
                    }
                    if(output.getChangeName().equals("加急费")){
                        BigDecimal differenceFee = getDifferenceFee(output.getBeforeChangeValue(),output.getAfterChangeValue());
                        lspBalanceDetail.setExpressFee(differenceFee);
                    }
                    if(output.getChangeName().equals("改单费")){
                        BigDecimal differenceFee = getDifferenceFee(output.getBeforeChangeValue(),output.getAfterChangeValue());
                        lspBalanceDetail.setChangeWaybillFee(differenceFee);

                        BigDecimal lastChangeFee = waybillFee.getChangeFeeSum()==null? BigDecimal.ZERO:waybillFee.getChangeFeeSum();
                        waybillFee.setChangeFeeSum(lastChangeFee.add(differenceFee));
                        feeDao.updateByPrimaryKey(waybillFee);
                    }
                    if(output.getChangeName().equals("卸货费")){
                        BigDecimal differenceFee = getDifferenceFee(output.getBeforeChangeValue(),output.getAfterChangeValue());
                        lspBalanceDetail.setUnloadFee(differenceFee);
                    }
                }

                BigDecimal sumFee = BigDecimal.ZERO;//结算费用总计
                BigDecimal lastChangeFee = waybillFee.getChangeFeeSum()==null?
                        BigDecimal.ZERO:waybillFee.getChangeFeeSum();//累计改单费
                sumFee = sumFee.add(lastChangeFee);//累计的改单费中已包含本次改单的费用

                BigDecimal p = BigDecimal.ZERO;//修改后当前结算费用
                if (waybill.getBalanceTypeWithZb().equals(0)) {
                    p = waybillFee.getAllFee();
                } else if (waybill.getBalanceTypeWithZb().equals(1)) {
                    p = waybillFee.getAllFee().subtract(waybillFee.getDfyfFeeWithZb());
                }

                BigDecimal q = BigDecimal.ZERO;//累计已结算费用
                TSbWaybillFeeBalanceWithBenchmarkCriteria sumExample = new TSbWaybillFeeBalanceWithBenchmarkCriteria();
                sumExample.createCriteria().andWaybillIdEqualTo(waybill.getId()).andStatusGreaterThanOrEqualTo(1)
                        .andStatusLessThanOrEqualTo(2);
                List<TSbWaybillFeeBalanceWithBenchmark> list = waybillFeeBalanceWithBenchmarkDao.selectByExample(sumExample);
                for (TSbWaybillFeeBalanceWithBenchmark benchmark : list){
                    q = q.add(benchmark.getZbReceiveAllFee());
                }
                sumFee = sumFee.add(p).subtract(q);//累计改单费＋本次改单费＋本次改单后结算费用－(返还)已结算费用

                //作废未结算的费用
                TSbWaybillFeeBalanceWithBenchmarkCriteria updateExample = new TSbWaybillFeeBalanceWithBenchmarkCriteria();
                updateExample.createCriteria().andWaybillIdEqualTo(waybill.getId()).andStatusEqualTo(0);
                TSbWaybillFeeBalanceWithBenchmark updateBenchmark = new TSbWaybillFeeBalanceWithBenchmark();
                updateBenchmark.setStatus(3);
                waybillFeeBalanceWithBenchmarkDao.updateByExampleSelective(updateBenchmark,updateExample);

                //改单后导致费用结清，且原状态为已确认交易，则修改运单状态为待配载
                if (sumFee.compareTo(BigDecimal.ZERO)==0&&waybill.getStatus()==5){
                    waybill.setStatus(15);
                    waybillDao.updateByPrimaryKey(waybill);
                }
                //改单后费用未结清，而原状态为待配载，则修改运单状态为已确认交易
                if (sumFee.compareTo(BigDecimal.ZERO)!=0&&waybill.getStatus()==15){
                    waybill.setStatus(5);
                    waybillDao.updateByPrimaryKey(waybill);
                }

                TSbWaybillFeeBalanceWithBenchmark benchmark = new TSbWaybillFeeBalanceWithBenchmark();
                benchmark.setWaybillId(input.getWaybillId());
                benchmark.setType(2);
                benchmark.setZbReceiveAllFee(sumFee);
                benchmark.setZbReceiveBenchmarkFee(sumFee);
                benchmark.setStatus(0);
                benchmark.setBookerEmployeeId(input.getVerifyId());
                benchmark.setBookerEmployeeName(input.getVerifyName());
                benchmark.setBookerTime(input.getVerifyTime());
                waybillFeeBalanceWithBenchmarkDao.insertSelective(benchmark);
                lspBalanceDetail.setBenchmarkId(benchmark.getId());
                lspBalanceDetailDao.insertSelective(lspBalanceDetail);
                //更新服务商运单更新信息
                change.setBenchmarkId(benchmark.getId());

            }
        }
        //将运单IsChange置为未变更
        waybill.setIsChange(0);
        waybillDao.updateByPrimaryKeySelective(waybill);
        //更新服务商运单更新信息
        change.setVerifyId(input.getVerifyId());
        change.setVerifyName(input.getVerifyName());
        change.setVerifyTime(input.getVerifyTime());
        change.setStatus(input.getStatus());
        change.setMemo(input.getMemo());
        lspWaybillChangeDao.updateByPrimaryKeySelective(change);
        return ResultStatus.SUCCESS;
    }

    private void updateChangedValues(Long waybillId, Long lspChangeId) {
        TSbWaybill waybill = waybillDao.selectByPrimaryKey(waybillId);

        TSbWaybillGoodCriteria example = new TSbWaybillGoodCriteria();
        example.createCriteria().andWaybillIdEqualTo(waybillId);
        List<TSbWaybillGood> goods = waybillGoodDao.selectByExample(example);
        TSbWaybillGood waybillGood = goods!=null&&goods.size()>0?goods.get(0):null;
        assert waybillGood!=null;//运单费用逻辑上不应该为空

        TSbWaybillFeeCriteria example1 = new TSbWaybillFeeCriteria();
        example1.createCriteria().andWaybillIdEqualTo(waybillId);
        List<TSbWaybillFee> fees = feeDao.selectByExample(example1);
        TSbWaybillFee waybillFee = fees!=null&&fees.size()>0?fees.get(0):null;
        assert waybillFee!=null;//运单费用逻辑上不应该为空

        TFbAllotWaybillCriteria example2 = new TFbAllotWaybillCriteria();
        example2.createCriteria().andWaybillIdEqualTo(waybillId);
        List<TFbAllotWaybill> allotWaybills = allotWaybillDao.selectByExample(example2);
        TFbAllotWaybill allotWaybill = allotWaybills!=null&&allotWaybills.size()>0?allotWaybills.get(0):null;
        assert allotWaybill!=null;//运单费用逻辑上不应该为空

        TSbWaybillDepotCriteria example3 = new TSbWaybillDepotCriteria();
        example3.createCriteria().andWaybillIdEqualTo(waybillId);
        List<TSbWaybillDepot> depots = depotDao.selectByExample(example3);
        TSbWaybillDepot waybillDepot = depots!=null&&depots.size()>0?depots.get(0):null;
        if (waybillDepot==null){
            waybillDepot=new TSbWaybillDepot();
            waybillDepot.setWaybillId(waybillId);
        }

        TSbWaybillInvoiceCriteria example4 = new TSbWaybillInvoiceCriteria();
        example4.createCriteria().andWaybillIdEqualTo(waybillId);
        List<TSbWaybillInvoice> invoices = invoiceDao.selectByExample(example4);
        TSbWaybillInvoice waybillInvoice = invoices!=null&&invoices.size()>0?invoices.get(0):null;
        if (waybillInvoice==null){
            waybillInvoice=new TSbWaybillInvoice();
            waybillInvoice.setWaybillId(waybillId);
        }

        TLspWaybillChangeDetailCriteria criteria = new TLspWaybillChangeDetailCriteria();
        criteria.createCriteria().andWaybillIdEqualTo(waybillId).andLspChangeIdEqualTo(lspChangeId);
        List<TLspWaybillChangeDetail> detailList =  lspWaybillChangeDetailDao.selectByExample(criteria);

        Field[] fs = ChangeWaybillInput.class.getDeclaredFields();
        Map<String,String> map = new HashMap<>();
        for (Field f : fs) {
            ChangeProperty p = f.getAnnotation(ChangeProperty.class);
            if (p==null) continue;
            map.put(f.getName(),p.from());
        }
        for (TLspWaybillChangeDetail detail : detailList) {
            try {
                String key = detail.getChangeProperty();
                if (key.equals("")) continue;
                switch (map.get(key)) {
                    case "waybill":
                        BeanUtils.setProperty(waybill,detail.getChangeProperty(),detail.getAfterChangeValue());
                        break;
                    case "waybill_good":
                        BeanUtils.setProperty(waybillGood,detail.getChangeProperty(),detail.getAfterChangeValue());
                        break;
                    case "waybill_fee":
                        if (detail.getAfterChangeValue()==null||detail.getAfterChangeValue().equals("")){
                            Field feeField = TSbWaybillFee.class.getDeclaredField(detail.getChangeProperty());
                            feeField.setAccessible(true);
                            feeField.set(waybillFee, null);
                        } else
                        BeanUtils.setProperty(waybillFee,detail.getChangeProperty(),detail.getAfterChangeValue());
                        break;
                    case "allot_waybill":
                        if (detail.getAfterChangeValue()==null||detail.getAfterChangeValue().equals("")){
                            Field allotField = TFbAllotWaybill.class.getDeclaredField(detail.getChangeProperty());
                            allotField.setAccessible(true);
                            allotField.set(allotWaybill, null);
                        } else
                        BeanUtils.setProperty(allotWaybill,detail.getChangeProperty(),detail.getAfterChangeValue());
                        break;
                    case "waybill_depot":
                        BeanUtils.setProperty(waybillDepot,detail.getChangeProperty(),detail.getAfterChangeValue());
                        break;
                    case "waybill_invoice":
                        BeanUtils.setProperty(waybillInvoice,detail.getChangeProperty(),detail.getAfterChangeValue());
                        break;
                    default:
                }
            } catch (IllegalAccessException | InvocationTargetException | NoSuchFieldException e) {
                e.printStackTrace();
            }
        }
        int lastChangeTimes = waybill.getChangeTimes()==null?0:waybill.getChangeTimes();
        waybill.setChangeTimes(lastChangeTimes+1);
        waybillDao.updateByPrimaryKey(waybill);
        waybillGoodDao.updateByPrimaryKey(waybillGood);
        feeDao.updateByPrimaryKey(waybillFee);
        BigDecimal transitFee = BigDecimal.ZERO
                .add(waybillFee.getFreightFee() == null ? BigDecimal.ZERO:waybillFee.getFreightFee())
                .add(allotWaybill.getSendGoodFee() == null ? BigDecimal.ZERO:allotWaybill.getSendGoodFee())
                .add(allotWaybill.getUnloadFee()==null? BigDecimal.ZERO:allotWaybill.getUnloadFee())
                .add(allotWaybill.getUnloadFee()==null? BigDecimal.ZERO:allotWaybill.getUnloadFee())
                .add(allotWaybill.getEnterFee() == null ? BigDecimal.ZERO : allotWaybill.getEnterFee());
        BigDecimal mainLineFee = BigDecimal.ZERO
                .add(waybillFee.getFreightFee() == null ? BigDecimal.ZERO:waybillFee.getFreightFee())
                .add(allotWaybill.getEnterFee() == null ? BigDecimal.ZERO : allotWaybill.getEnterFee());
        allotWaybill.setRansitFee(transitFee);
        allotWaybill.setMainLineFee(mainLineFee);
        allotWaybillDao.updateByPrimaryKey(allotWaybill);
        if (waybillDepot.getId()==null){
            depotDao.insertSelective(waybillDepot);
        } else depotDao.updateByPrimaryKey(waybillDepot);
        if (waybillInvoice.getId()==null){
            invoiceDao.insertSelective(waybillInvoice);
        } else if (waybill.getIsOpenTicket()==null||waybill.getIsOpenTicket()==0) {
            invoiceDao.deleteByPrimaryKey(waybillInvoice.getId());
        } else invoiceDao.updateByPrimaryKey(waybillInvoice);

        //上行
        ExchangeUtils.afterCommit(applicationContext, new EditWaybillEvent(this, waybill.getId()));
    }

    @Override
    public LspWaybillChangeOutput findById(Long id) {
        TLspWaybillChange change = lspWaybillChangeDao.selectByPrimaryKey(id);
        return BeanMapper.map(change, LspWaybillChangeOutput.class);
    }

    /**
     * 计算相差的费用
     * @param beforeChangeValue
     * @param afterChangeValue
     * @return
     */
    private BigDecimal getDifferenceFee(String beforeChangeValue,String afterChangeValue){
        BigDecimal beforeValue = BigDecimal.ZERO;
        BigDecimal afterValue = BigDecimal.ZERO;
        if(beforeChangeValue != null && !beforeChangeValue.trim().equals("")){
            beforeValue = new BigDecimal(beforeChangeValue);
        }
        if(afterChangeValue != null && !afterChangeValue.trim().equals("")){
            afterValue = new BigDecimal(afterChangeValue);
        }
        return afterValue.subtract(beforeValue);
    }
}
