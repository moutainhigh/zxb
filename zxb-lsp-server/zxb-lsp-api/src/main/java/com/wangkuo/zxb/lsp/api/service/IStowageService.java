package com.wangkuo.zxb.lsp.api.service;

import com.wangkuo.zxb.lsp.api.dto.input.AddStowageInput;
import com.wangkuo.zxb.lsp.api.dto.input.EditStowageInput;
import com.wangkuo.zxb.lsp.api.dto.input.QueryStowageListInput;
import com.wangkuo.zxb.lsp.api.dto.input.StowageInput;
import com.wangkuo.zxb.lsp.api.dto.output.PagedList;
import com.wangkuo.zxb.lsp.api.dto.output.StowageOutput;

/**
 * Created by chaizf on 2016/3/31.
 */
public interface IStowageService {

    /**
     * 增加配载信息
     *
     * @param input
     * @return
     */
    int addStowage(AddStowageInput input);

    /**
     * 配载信息分页查询
     *
     * @param input
     * @return
     */
    PagedList<StowageOutput> getStowagePagedList(QueryStowageListInput input);

    /**
     * 查询配载信息
     *
     * @param id
     * @return
     */
    StowageOutput findOneStowage(Long id);

    /**
     * 确认发车
     *
     * @param id
     * @return
     */
    int confirmDepart(Long id,Long userId);

    /**
     * 修改配载信息
     *
     * @param input
     * @return
     */
    int updateStowage(EditStowageInput input);

}
