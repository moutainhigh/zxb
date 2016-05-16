package com.wangkuo.zxb.lsp.provider.service.interf;

import com.wangkuo.zxb.lsp.api.dto.input.LspUserCarInput;
import com.wangkuo.zxb.lsp.api.dto.output.LspUserCarOutput;

import java.util.List;

/**
 * Created by mark on 16/3/30.
 */
public interface ILspUserCarService {
    /**
     * 根据服务商ID查所属车辆
     * @param id
     * @return
     */
    List<LspUserCarOutput> findCarsByUserId(Long id);

    /**
     * 删除车辆
     * @param id
     * @return
     */
    int deleteProviderCarById(Long id);

    /**
     * 创建服务商车辆
     * @param input
     * @return
     */
    int createProviderCar(LspUserCarInput input);
}
