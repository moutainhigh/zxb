package com.wangkuo.zxb.lsp.exchange.event.listener;

import com.wangkuo.dec.data.wdtoyy.WaybillAdd;
import com.wangkuo.zxb.lsp.api.service.IWaybillService;
import com.wangkuo.zxb.lsp.exchange.IExChangeSendDataService;
import com.wangkuo.zxb.lsp.exchange.event.AddWaybillEvent;
import com.wangkuo.zxb.lsp.provider.db.dao.*;
import com.wangkuo.zxb.lsp.provider.db.po.*;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by cuihe on 16/4/13.
 */
@Component
public class AddWaybillEventListener implements ApplicationListener<AddWaybillEvent> {

    @Autowired
    private   TSbWaybillDao sbWaybillDao;
    @Autowired
    private TSbWaybillFeeDao sbWaybillFeeDao;
    @Autowired
    private TSbWaybillGoodDao sbWaybillGoodDao;
    @Autowired
    private TSbWaybillInvoiceDao sbWaybillInvoiceDao;
    @Autowired
    private TSbAreaInfoDao sbAreaInfoDao;
    @Autowired
    private TSbWaybillDepotDao sbWaybillDepotDao;
    @Autowired
    private IExChangeSendDataService exChangeSendDataService;

    @Override
    public void onApplicationEvent(AddWaybillEvent addWaybillEvent) {
        TSbWaybill waybill = sbWaybillDao.selectByPrimaryKey(addWaybillEvent.getWaybillId());

        TSbWaybillFeeCriteria sbWaybillFeeCriteria=new TSbWaybillFeeCriteria();
        sbWaybillFeeCriteria.createCriteria().andWaybillIdEqualTo(waybill.getId());
        TSbWaybillFee fee = sbWaybillFeeDao.selectByExample(sbWaybillFeeCriteria).get(0);
        TSbWaybillGoodCriteria sbWaybillGoodCriteria=new TSbWaybillGoodCriteria();
        sbWaybillGoodCriteria.createCriteria().andWaybillIdEqualTo(waybill.getId());
        TSbWaybillGood good=sbWaybillGoodDao.selectByExample(sbWaybillGoodCriteria).get(0);
        TSbWaybillInvoiceCriteria sbWaybillInvoiceCriteria=new TSbWaybillInvoiceCriteria();
        sbWaybillInvoiceCriteria.createCriteria().andWaybillIdEqualTo(waybill.getId());
        List<TSbWaybillInvoice> lstInvoice=sbWaybillInvoiceDao.selectByExample(sbWaybillInvoiceCriteria);
        TSbWaybillInvoice waybillInvoice =null;
        if(lstInvoice!=null && lstInvoice.size()>0)
        {
            waybillInvoice=lstInvoice.get(0);
        }
        TSbWaybillDepotCriteria sbWaybillDepotCriteria=new TSbWaybillDepotCriteria();
        sbWaybillDepotCriteria.createCriteria().andWaybillIdEqualTo(waybill.getId());
        List<TSbWaybillDepot> lstDepot=sbWaybillDepotDao.selectByExample(sbWaybillDepotCriteria);
        TSbWaybillDepot waybillDepot=null;
        if(lstDepot!=null && lstDepot.size()>0)
        {
            waybillDepot=lstDepot.get(0);
        }

        WaybillAdd add = new WaybillAdd();
        //插入数据，上行
        add.setSystemId(waybill.getDownId());
        add.setSn(waybill.getSn());
        add.setSystemSn(waybill.getSystemSn());

        String shipperLinkPhone="";
        if(waybill.getShipperLinkPhone()!=null&& !waybill.getShipperLinkPhone().trim().equals(""))
        {
            shipperLinkPhone+=waybill.getShipperLinkPhone()+",";
        }
        if(waybill.getShipperLinkMobile()!=null && !waybill.getShipperLinkMobile().trim().equals(""))
        {
            shipperLinkPhone+=waybill.getShipperLinkMobile();
        }
        add.setShipperCustomerName(waybill.getShipperCustomerName());
        TSbAreaInfo shipperArea = sbAreaInfoDao.selectByPrimaryKey( waybill.getShipperCountryId());
        add.setShipperBarrioCode(shipperArea.getBarrioCode());
        add.setShipperAddress(waybill.getShipperAddress());
        add.setShipperLinkName(waybill.getShipperLinkName());
        add.setShipperLinkPhone(shipperLinkPhone);
        add.setReceiveName(waybill.getReceiveName());

        String receiveLinkPhone="";
        if(waybill.getReceiveLinkPhone()!=null && !waybill.getReceiveLinkPhone().trim().equals(""))
        {
            receiveLinkPhone+=waybill.getReceiveLinkPhone()+",";
        }
        if(waybill.getReceiveLinkMobile()!=null&&!waybill.getReceiveLinkMobile().trim().equals(""))
        {
            receiveLinkPhone+=waybill.getReceiveLinkMobile();
        }
        TSbAreaInfo receiveAreas=sbAreaInfoDao.selectByPrimaryKey(waybill.getReceiveCountryId());
        add.setReceiveBarrioCode(receiveAreas.getBarrioCode());
        add.setReceiveAddress(waybill.getReceiveAddress());
        add.setReceiveLinkName(waybill.getReceiveLinkName());
        add.setReceiveLinkPhone(receiveLinkPhone);
        add.setConnectType(waybill.getConnectType());
        add.setNeedNotify(StringUtils.isEmpty(waybill.getOtherConnectType()) || "无".equalsIgnoreCase(waybill.getOtherConnectType()) ? 0 : 1);
        add.setDeliveryType(waybill.getDeliveryType()==null?1:waybill.getDeliveryType());


        add.setIsNeedReceipt(waybill.getIsNeedReceipt());
        add.setIsOpenTicket(waybill.getIsOpenTicket());
        add.setLoadUnloadType(returnLoadType(waybill.getLoadUnloadType()));
        add.setStackRequire(returnStackRequire(waybill.getStackRequire()));
        add.setOperation_time(waybill.getOperationTime());


        add.setCreateTime(new Date());

        if(fee.getDfyfFeeWithZb() != null && fee.getDfyfFeeWithZb().compareTo(BigDecimal.ZERO) == 1){
            add.setBalanceType(1);
        }else {
            add.setBalanceType(0);
        }
        //费用
        add.setInsuredFee(null==fee.getInsuredFee()? BigDecimal.ZERO:fee.getInsuredFee());
        add.setPremiumFee(null==fee.getPremiumFee()? BigDecimal.ZERO:fee.getPremiumFee());
        add.setFreightFee(fee.getFreightFee().add(null==fee.getBusinessFee()? BigDecimal.ZERO:fee.getBusinessFee()));
        add.setActivePremiumFee(null==fee.getActivePremiumFee()? BigDecimal.ZERO:fee.getActivePremiumFee());
        //货物信息
        String feeMemo = "";
        if(waybill.getBalanceTypeWithZb() == 0){
            BigDecimal xfFee = (fee.getXfyfFeeWithZb() == null ? BigDecimal.ZERO:fee.getXfyfFeeWithZb());
            BigDecimal dfFee = (fee.getDfyfFeeWithZb() == null ? BigDecimal.ZERO:fee.getDfyfFeeWithZb());
            feeMemo = "费用说明:现付"+xfFee+"元,"+"到付"+dfFee+"元";
        }
        add.setMemo(waybill.getMemo() + "," + feeMemo);

        add.setGoodMemo(good.getGoodMomo());
        add.setGoodName(good.getGoodName());
        add.setNum(good.getNum());
        add.setOfferVolume(good.getOfferVolume());
        add.setOfferWeight(good.getOfferWeight());
        add.setRunWeight(good.getRunWeight());
        add.setRunVolume(good.getRunVolume());
        add.setFormat(good.getFormat());
        add.setPack(returnPack(good.getPack()));

        add.setInvoiceFee(fee.getInvoiceFee() == null ? BigDecimal.ZERO : round(fee.getInvoiceFee()));

        if(waybillInvoice!=null) {
            add.setInvoiceCompanyName(waybillInvoice.getCompanyName());
            add.setInvoiceConsigneeName(waybillInvoice.getConsigneeName());
            add.setInvoiceConsigneeMobile(waybillInvoice.getConsigneeMobile());
            add.setInvoiceShipperAddress(waybillInvoice.getConsigneeAddress());
            if (waybillInvoice.getConsigneeCountyId() != null) {
                TSbAreaInfo invoiceArea = sbAreaInfoDao.selectByPrimaryKey( waybillInvoice.getConsigneeCountyId());
                add.setInvoiceShipperBarrioCode(invoiceArea.getBarrioCode());
            }
        }

        add.setIsNeedEnterDepot(waybill.getIsNeedEnterDepot());
        if(waybillDepot!=null) {
            add.setDepotId(waybillDepot.getDepotId());
            add.setDepotName(waybillDepot.getDepotName());
            add.setEnterTime(waybillDepot.getEnterTime());
            add.setEnterSn(waybillDepot.getEnterSn());
            add.setEnterFee(waybillDepot.getEnterFee());
        }

        add.setSource(waybill.getSource());
        add.setLspUserName(waybill.getLspCompanyName());

        exChangeSendDataService.addToSendQueue(add);
    }

    public String returnStackRequire(String stack){
        if (stack==null || stack .equals("")||stack.equals("|")) return "";
        String s[]=stack.split("|");
        String require="";
        for(int i=0 ; i<s.length; i++){
            if(s[i].equals("1"))     require+="不能混装,";
            else if(s[i].equals("2"))require+="不能挤压,";
            else if(s[i].equals("3"))require+="不能侧放,";
            else if(s[i].equals("4"))require+="不能倒置,";
            else if(s[i].equals("5"))require+="不能分拆,";
            else if(s[i].equals("6"))require+="不能堆叠";
        }
        return require;
    }

    public String returnPack(String type){
        if(type.equals("0"))return "无";
        if(type.equals("1"))return "纸箱";
        if(type.equals("2"))return "袋";
        if(type.equals("3"))return "桶";
        if(type.equals("4"))return "包";
        if(type.equals("5"))return "托";
        if(type.equals("6"))return "木架";
        if(type.equals("7"))return "纸";
        return "托";
    }

    public String returnLoadType(Integer type){
        if(null==type) return "";
        if(type==0)return "人工搬运";
        if(type==1)return "吊装作业";
        return "叉车作业";
    }

    /**
     * 四舍五入取整
     * @param decimal
     * @return
     */
    private BigDecimal round(BigDecimal decimal){
        return decimal.setScale(0,BigDecimal.ROUND_HALF_UP);
    }
}
