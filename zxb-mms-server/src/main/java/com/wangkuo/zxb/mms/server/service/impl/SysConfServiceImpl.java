package com.wangkuo.zxb.mms.server.service.impl;

import com.wangkuo.framework.mapper.BeanMapper;
import com.wangkuo.zxb.mms.server.db.dao.TSysConfDao;
import com.wangkuo.zxb.mms.server.db.po.TSysConf;
import com.wangkuo.zxb.mms.server.db.po.TSysConfExample;
import com.wangkuo.zxb.mms.server.service.ISysConfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author 柳朋朋
 * @version 1.0
 * @date 2016-05-07
 */
@Service
public class SysConfServiceImpl implements ISysConfService {
    @Autowired
    private TSysConfDao sysConfDao;

    @Override
    public int update(TSysConf sysConf) {
        TSysConfExample example = new TSysConfExample();
        example.createCriteria().andCodeEqualTo(sysConf.getCode());
        List<TSysConf> sysConfList= sysConfDao.selectByExample(example);
        if(!CollectionUtils.isEmpty(sysConfList)){
            //更新
            sysConf.setMemo(sysConfList.get(0).getMemo());
            return sysConfDao.updateByExample(sysConf, example);
        }else{
            TSysConf temp = new TSysConf();
            BeanMapper.copy(sysConf,temp);
            //保存
            if ("password".equals(sysConf.getCode())) {//用户初始密码
                temp.setMemo("用户初始密码");
            }
            if ("outerTime".equals(sysConf.getCode())) {//外客户服务有效期
                temp.setMemo("外客户服务有效期");
            }
            if ("innerTime".equals(sysConf.getCode())) {//内客户服务有效期
                temp.setMemo("内客户服务有效期");
            }
            return sysConfDao.insert(temp);
        }
    }

    @Override
    public List<TSysConf> findAll() {
        return sysConfDao.selectByExample(new TSysConfExample());
    }
}
