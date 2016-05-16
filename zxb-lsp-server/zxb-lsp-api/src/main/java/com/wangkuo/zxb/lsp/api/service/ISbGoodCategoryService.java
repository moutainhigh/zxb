package com.wangkuo.zxb.lsp.api.service;

import com.wangkuo.zxb.lsp.api.dto.input.SbGoodCategoryInput;
import com.wangkuo.zxb.lsp.api.dto.output.LspUserOutput;
import com.wangkuo.zxb.lsp.api.dto.output.PagedList;
import com.wangkuo.zxb.lsp.api.dto.output.SbGoodCategoryOutput;

import java.util.List;

import java.util.List;
import java.util.Map;


/**
 * @author 王俊华
 * @version 1.0
 * @date 2016-03-30
 */
public interface ISbGoodCategoryService {
    /**
     * 分页查询品类
     *
     * @param sbGoodCategoryInput
     * @return
     */
    PagedList findCategorys(SbGoodCategoryInput sbGoodCategoryInput);

    /**
     * 查询所有的品类
     * @param sbGoodCategoryInput
     * @return
     */
    List<SbGoodCategoryOutput> findAllCategory(SbGoodCategoryInput sbGoodCategoryInput);

    /**
     * 根据条件查询品类
     * @param sbGoodCategoryInput
     * @return
     */
    PagedList findCategorysByCondition(SbGoodCategoryInput sbGoodCategoryInput);

    int addCategory(SbGoodCategoryInput sbGoodCategoryInput,String fileUrl, LspUserOutput lspUserOutput,boolean isApply);

    int updateOneById(SbGoodCategoryInput sbGoodCategoryInput, String fileUrl, LspUserOutput lspUserOutput,boolean isApply);

    SbGoodCategoryOutput findOneById(Long id);

    List<SbGoodCategoryOutput> findDetailByAllotId(Long allotId);
    /**
     * 品类查询
     * @param input
     * @return
     */
    PagedList<SbGoodCategoryOutput> findCategoryPrice(SbGoodCategoryInput input);


    /**
     * 查找品类基准价格
     * @param input
     * @return
     */
    PagedList<SbGoodCategoryOutput> findCategoryBasicPrice(SbGoodCategoryInput input);

    /**
     * 查询服务商的所有品类
     * @param userId
     * @return
     */
    List<SbGoodCategoryOutput> findCategoryByLspId(Long userId);

    /**
     *
     */
    int findCategoryByName(String categoryName,Long userId,int addOrupdate);
}