package com.wangkuo.zxb.mms.server.service;

import com.wangkuo.zxb.mms.server.db.po.TSysConf;

import java.util.List;

/**
 * @author 柳朋朋
 * @version 1.0
 * @date 2016-05-07
 */
public interface ISysConfService {
    int update(TSysConf sysConf);

    List<TSysConf> findAll();
}
