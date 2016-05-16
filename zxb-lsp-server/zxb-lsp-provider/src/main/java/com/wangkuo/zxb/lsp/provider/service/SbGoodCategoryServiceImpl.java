package com.wangkuo.zxb.lsp.provider.service;

import com.wangkuo.framework.mapper.BeanMapper;
import com.wangkuo.framework.persistence.PageableImpl;
import com.wangkuo.zxb.lsp.api.dto.input.FbBenchmarkPriceSectionInput;
import com.wangkuo.zxb.lsp.api.dto.input.SbGoodCategoryInput;
import com.wangkuo.zxb.lsp.api.dto.output.*;
import com.wangkuo.zxb.lsp.api.service.ISbGoodCategoryService;
import com.wangkuo.zxb.lsp.provider.db.common.ProviderCommon;
import com.wangkuo.zxb.lsp.provider.db.common.SequenceNumberCode;
import com.wangkuo.zxb.lsp.provider.db.dao.*;
import com.wangkuo.zxb.lsp.provider.db.po.*;
import com.wangkuo.zxb.lsp.provider.service.interf.ILspUserCenterRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author 王俊华
 * @version 1.0
 * @date 2016-03-30
 */
@Service
public class SbGoodCategoryServiceImpl implements ISbGoodCategoryService {
    public static String CATEGORY_OSS_PIC_PRE_URL="56123/demo/lsp/category/";
    @Autowired
    private TSbGoodCategoryDao sbGoodCategoryDao;

    @Autowired
    private TSbOtherFileAttachmentDao sbOtherFileAttachmentDao;

    @Autowired
    private ILspUserCenterRelationService lspUserCenterRelationService;

    @Autowired
    private TSbGoodCategoryAllotDao sbGoodCategoryAllotDao;

    @Autowired
    private TSbGoodCategoryPriceSectionDao sbGoodCategoryPriceSectionDao;

    @Autowired
    private TFbBenchmarkPriceSectionDao fbBenchmarkPriceSectionDao;
    /**
     * 分页查询品类
     *
     * @param sbGoodCategoryInput
     * @return
     */
    @Override
    public PagedList findCategorys(SbGoodCategoryInput sbGoodCategoryInput) {
        TSbGoodCategoryCriteria criteria = new TSbGoodCategoryCriteria();
        criteria.createCriteria().andLspUserIdEqualTo(sbGoodCategoryInput.getLspUserId());
        PageableImpl pageable = BeanMapper.map(sbGoodCategoryInput, PageableImpl.class);
        List<TSbGoodCategory> branches = sbGoodCategoryDao.selectByExample(criteria, pageable);
        List<SbGoodCategoryOutput> sbGoodCategoryOutputs = BeanMapper.mapList(branches, SbGoodCategoryOutput.class);
        return new PagedList<SbGoodCategoryOutput>(sbGoodCategoryInput, pageable.getCount(), sbGoodCategoryOutputs);

    }

    @Override
    public List<SbGoodCategoryOutput> findAllCategory(SbGoodCategoryInput sbGoodCategoryInput) {
        TSbGoodCategoryCriteria criteria = new TSbGoodCategoryCriteria();
        criteria.createCriteria().andLspUserIdEqualTo(sbGoodCategoryInput.getLspUserId());
        List<TSbGoodCategory> categoryList = sbGoodCategoryDao.selectByExample(criteria);
        List<SbGoodCategoryOutput> categorys = BeanMapper.mapList(categoryList, SbGoodCategoryOutput.class);
        return categorys;
    }

    @Override
    public PagedList findCategorysByCondition(SbGoodCategoryInput sbGoodCategoryInput) {

        PageableImpl page = BeanMapper.map(sbGoodCategoryInput, PageableImpl.class);


        List<SbGoodCategoryOutput> outputs = sbGoodCategoryDao.findCategorysByCondition(sbGoodCategoryInput, page);

        int count = page.getCount();
        //int count = sbGoodCategoryDao.findCategorysByConditionCount(sbGoodCategoryInput);
        PagedList<SbGoodCategoryOutput> pagedList = new PagedList<SbGoodCategoryOutput>(sbGoodCategoryInput, count, outputs);
        return pagedList;
    }

    @Override
    public int addCategory(SbGoodCategoryInput sbGoodCategoryInput, String fileUrl, LspUserOutput lspUserOutput, boolean isApply) {
        /**向品类表（sb_good_category）插入数据*/
        TSbGoodCategory goodCategory = BeanMapper.map(sbGoodCategoryInput, TSbGoodCategory.class);
        int count = 0;
        String fileName = "";
        /*goodCategory.setSiteId(SequenceNumberCode.BODY_ID);
        goodCategory.setSiteName(ProviderCommon.LSP);*/
        goodCategory.setType(1);
        goodCategory.setCreateTime(new Date());
        goodCategory.setLspUserId(lspUserOutput.getId());
        goodCategory.setLspUserName(lspUserOutput.getNickName());
        count += sbGoodCategoryDao.insertSelective(goodCategory);

        /**向附件表（sb_other_file_attachment）插入数据*/

        TSbOtherFileAttachment attachment = new TSbOtherFileAttachment();

        attachment.setBusiType(37);
        attachment.setBusiId(goodCategory.getId());
        attachment.setFileType(0);
        attachment.setCreateTime(new Date());
        attachment.setBookerEmployeeId(lspUserOutput.getId());
        attachment.setBookerEmployeeName(lspUserOutput.getNickName());
        attachment.setUserBodyType(SequenceNumberCode.BODY_TYPE);
        attachment.setUserBodyId(SequenceNumberCode.BODY_ID);
        String[] urls = fileUrl.split(",");
        for (String url : urls) {

            if (null != url && !url.trim().equals("") && !url.trim().endsWith("/")) {
                attachment.setFileUrl(url);
                fileName = url.substring(url.lastIndexOf("/") + 1);
                attachment.setFileName(fileName);
                count += sbOtherFileAttachmentDao.insertSelective(attachment);
            }
        }

        /**向品类集散关联表（sb_good_category_allot）插入数据*/
        /*1,查出该服务商关联的集散中心*/
        List<LspUserCenterRelationOutput> relations = lspUserCenterRelationService.loadCenterRelationByProviderId(lspUserOutput.getId());
        int status = 0;
        for (LspUserCenterRelationOutput output : relations) {
            TSbGoodCategoryAllot allot = new TSbGoodCategoryAllot();
            allot.setCategoryId(goodCategory.getId());
            if (isApply) {
                status = 1;
                allot.setApplyEmployeeName(lspUserOutput.getNickName());
                allot.setApplyTime(new Date());
            }
            allot.setStatus(status);
            allot.setAllocCenterId(output.getCenterId());
            allot.setAllocCenterName(output.getAllocCenterName());
            allot.setApplyEmployeeId(lspUserOutput.getId());


            count += sbGoodCategoryAllotDao.insertSelective(allot);
        }


        return count;
    }

    @Override
    public int updateOneById(SbGoodCategoryInput sbGoodCategoryInput, String fileUrl, LspUserOutput lspUserOutput, boolean isApply) {
        String[] urls = {};
        int count = 0;
        TSbOtherFileAttachmentCriteria criteria = new TSbOtherFileAttachmentCriteria();
        criteria.createCriteria().andBusiIdEqualTo(sbGoodCategoryInput.getId()).andBusiTypeEqualTo(37);
        if (fileUrl != null) {
            urls = fileUrl.split(",");
        }
        sbOtherFileAttachmentDao.deleteByExample(criteria);
        if (urls.length > 0) {

            TSbOtherFileAttachment attachment = new TSbOtherFileAttachment();
            attachment.setBusiType(37);
            attachment.setBusiId(sbGoodCategoryInput.getId());
            attachment.setFileType(0);
            attachment.setCreateTime(new Date());
            attachment.setBookerEmployeeId(lspUserOutput.getId());
            attachment.setBookerEmployeeName(lspUserOutput.getNickName());
            attachment.setUserBodyType(SequenceNumberCode.BODY_TYPE);
            attachment.setUserBodyId(SequenceNumberCode.BODY_ID);
            for (String url : urls) {
                if (null != url && !url.trim().equals("") && !url.trim().endsWith("/")) {
                    attachment.setFileUrl(url);
                    String fileName = url.substring(url.lastIndexOf("/") + 1);
                    attachment.setFileName(fileName);
                    count += sbOtherFileAttachmentDao.insertSelective(attachment);
                }
            }

        }
        TSbGoodCategory category = BeanMapper.map(sbGoodCategoryInput, TSbGoodCategory.class);
        count += sbGoodCategoryDao.updateByPrimaryKeySelective(category);


        //allot.setCategoryId(category.getId());
        if (isApply) {
            TSbGoodCategoryAllotCriteria allotCriteria = new TSbGoodCategoryAllotCriteria();
            TSbGoodCategoryAllot allot = new TSbGoodCategoryAllot();
            allot.setStatus(1);
            allot.setApplyEmployeeName(lspUserOutput.getNickName());
            allot.setApplyTime(new Date());
            allotCriteria.createCriteria().andCategoryIdEqualTo(category.getId());
            count += sbGoodCategoryAllotDao.updateByExampleSelective(allot, allotCriteria);
        }

        return count;
    }

    @Override
    public SbGoodCategoryOutput findOneById(Long id) {
        TSbGoodCategory sbGoodCategory = sbGoodCategoryDao.selectByPrimaryKey(id);
        return BeanMapper.map(sbGoodCategory, SbGoodCategoryOutput.class);
    }

    @Override
    public List<SbGoodCategoryOutput> findDetailByAllotId(Long allotId) {
        return sbGoodCategoryDao.findDetailByAllotId(allotId);
    }

    @Override
    public PagedList<SbGoodCategoryOutput> findCategoryPrice(SbGoodCategoryInput input) {
        /**价格区间*/
        List<String> priceTitle = new ArrayList<>();
        /**对应的价格*/
        List<BigDecimal> prices = new ArrayList<>();


        PageableImpl pageable = BeanMapper.map(input, PageableImpl.class);
        List<SbGoodCategoryOutput> branches = sbGoodCategoryDao.findCategoryPrice(input, pageable);
        for (SbGoodCategoryOutput output : branches) {
            Long goodCategoryPriceId = output.getGoodCategoryPriceId();
            List<TSbGoodCategoryPriceSection> list = new ArrayList<>();
            if (goodCategoryPriceId != null) {
                TSbGoodCategoryPriceSectionCriteria criteria = new TSbGoodCategoryPriceSectionCriteria();
                criteria.createCriteria().andGoodCategoryPriceIdEqualTo(goodCategoryPriceId);
                list = sbGoodCategoryPriceSectionDao.selectByExample(criteria);
            }

            /*priceTitle.add(list);*/
            if (list.size() > 0) {
                for (TSbGoodCategoryPriceSection section : list) {
                    priceTitle.add(section.getStartSec().intValue() + "-" + section.getEndSec().intValue());
                    prices.add(section.getUnitPrice());
                }
                output.setPriceTitle(priceTitle);
                output.setPrices(prices);
                priceTitle = new ArrayList<>();
                prices = new ArrayList<>();
            }
        }

        return new PagedList<SbGoodCategoryOutput>(input, pageable.getCount(), branches);
    }

    @Override
    public PagedList<SbGoodCategoryOutput> findCategoryBasicPrice(SbGoodCategoryInput input) {

        /**价格区间*/
        List<String> priceTitle = new ArrayList<>();
        /**对应的价格*/
        List<BigDecimal> prices = new ArrayList<>();


        PageableImpl pageable = BeanMapper.map(input, PageableImpl.class);
        List<SbGoodCategoryOutput> branches = sbGoodCategoryDao.findCategoryBasicPrice(input, pageable);


        for (SbGoodCategoryOutput output : branches) {
            FbBenchmarkPriceSectionInput priceSectioninput = new FbBenchmarkPriceSectionInput();
            priceSectioninput.setAllocCenterId(output.getAllocCenterId());
            priceSectioninput.setEndCountryId(output.getEndCountryId());
            priceSectioninput.setType(output.getGoodType());
            List<FbBenchmarkPriceSectionOutput> priceSections =fbBenchmarkPriceSectionDao.selectByAllocCenterIdAndCountryId(priceSectioninput);

            if(output.getChargeType()==1){//按重量体积计费

                if(null!=output.getFloatType() && priceSections.size()>0){

                    for(FbBenchmarkPriceSectionOutput sectionOutput : priceSections) {
                        BigDecimal price = sectionOutput.getUnitPrice();
                        if (null!=output.getFloatType() &&  output.getFloatType() == 1) {//固定值上浮
                            price = price.add(output.getFloatFixedCountry());
                        } else if(null!=output.getFloatType() &&  output.getFloatType() == 2) {//比例上浮
                            price = price.multiply(new BigDecimal(1).add(output.getFloatRateCountry()));
                        }
                        priceTitle.add(sectionOutput.getStartSec().intValue() + "-" + sectionOutput.getEndSec().intValue());
                        prices.add(price);
                    }

                }


            }else if(output.getChargeType()==2){//按件计费
                BigDecimal price = new BigDecimal(0.00);
                    if(null != output.getPieceType() && output.getPieceType() == 1){//站到站
                        priceTitle.add("站到站");

                        if(output.getPieceSiteToSiteFeeCountry()!=null) {
                            price = price.add(output.getPieceSiteToSiteFeeCountry());

                        }
                        if(output.getPieceSiteToSiteSendGoodFeeCountry()!=null) {
                            price = price.add(output.getPieceSiteToSiteSendGoodFeeCountry());
                        }

                    }else if(null != output.getPieceType() && output.getPieceType() == 2){//站到门
                        priceTitle.add("站到门");
                        if(output.getPieceSiteToSiteSendGoodFeeCountry()!=null) {
                            price = price.add(output.getPieceSiteToDoorFeeCountry());
                        }
                    }
                prices.add(price);

            }else{
                priceTitle.add(" ");
            }

            output.setPriceTitle(priceTitle);
            output.setPrices(prices);
            priceTitle = new ArrayList<>();
            prices = new ArrayList<>();

            /*Long goodCategoryPriceId = output.getGoodCategoryPriceId();
            List<TSbGoodCategoryPriceSection> list = new ArrayList<>();
            if (goodCategoryPriceId != null) {
                TSbGoodCategoryPriceSectionCriteria criteria = new TSbGoodCategoryPriceSectionCriteria();
                criteria.createCriteria().andGoodCategoryPriceIdEqualTo(goodCategoryPriceId);
                list = sbGoodCategoryPriceSectionDao.selectByExample(criteria);
            }



            *//*priceTitle.add(list);*//*
            if (list.size() > 0) {
                for (TSbGoodCategoryPriceSection section : list) {
                    priceTitle.add(section.getStartSec().intValue() + "-" + section.getEndSec().intValue());
                    prices.add(section.getUnitPrice());
                }
                output.setPriceTitle(priceTitle);
                output.setPrices(prices);
                priceTitle = new ArrayList<>();
                prices = new ArrayList<>();
            }
*/


        }

        return new PagedList<SbGoodCategoryOutput>(input, pageable.getCount(), branches);
    }

    @Override
    public List<SbGoodCategoryOutput> findCategoryByLspId(Long userId) {
        //TSbGoodCategoryCriteria criteria = new TSbGoodCategoryCriteria();
        //criteria.createCriteria().andLspUserIdEqualTo(userId);
        SbGoodCategoryInput input = new SbGoodCategoryInput();
        input.setLspUserId(userId);
        input.setStatus(2);//2审核通过
        List<SbGoodCategoryOutput> categorys = sbGoodCategoryDao.findCategoryByLspId(input);
        //List<TSbGoodCategory> categoryList = sbGoodCategoryDao.selectByExample(criteria);
        //List<SbGoodCategoryOutput> categorys = BeanMapper.mapList(categoryList, SbGoodCategoryOutput.class);
        return categorys;
    }

    /**
     * @param categoryName
     * @param userId
     * @param addOrUpdate  0 新增  1 修改
     * @return
     */
    @Override
    public int findCategoryByName(String categoryName, Long userId, int addOrUpdate) {
        TSbGoodCategoryCriteria criteria = new TSbGoodCategoryCriteria();
        criteria.createCriteria().andNameEqualTo(categoryName).andLspUserIdEqualTo(userId);
        List<TSbGoodCategory> list = sbGoodCategoryDao.selectByExample(criteria);
        if (list == null) {
            return 0;
        }
        if (list.size() == 1 && addOrUpdate == 1 && categoryName.equals(list.get(0).getName())) {//修改时未修改名称时
            return 0;
        }
        return list.size();
    }

}
