package com.wangkuo.zxb.lsp.provider.service;

import com.wangkuo.framework.mapper.BeanMapper;
import com.wangkuo.framework.persistence.PageableImpl;
import com.wangkuo.zxb.lsp.api.dto.input.LspUserAttachmentInput;
import com.wangkuo.zxb.lsp.api.dto.input.LspUserCarInput;
import com.wangkuo.zxb.lsp.api.dto.input.LspUserCenterRelationInput;
import com.wangkuo.zxb.lsp.api.dto.input.LspUserInput;
import com.wangkuo.zxb.lsp.api.dto.output.*;
import com.wangkuo.zxb.lsp.provider.service.interf.ILspUserAttachmentService;
import com.wangkuo.zxb.lsp.provider.service.interf.ILspUserCarService;
import com.wangkuo.zxb.lsp.provider.service.interf.ILspUserCenterRelationService;
import com.wangkuo.zxb.lsp.api.service.ILspUserService;
import com.wangkuo.zxb.lsp.provider.db.dao.TlspUserDao;
import com.wangkuo.zxb.lsp.provider.db.po.TlspUser;
import com.wangkuo.zxb.lsp.provider.db.po.TlspUserCriteria;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


/**
 * @author 王俊华
 * @version 1.0
 * @date 2016-03-29
 */
@Service
public class LspUserServiceImpl implements ILspUserService {

    @Autowired
    private TlspUserDao lspUserDao;
    @Autowired
    private ILspUserCarService carService;
    @Autowired
    private ILspUserCenterRelationService relationService;
    @Autowired
    private ILspUserAttachmentService attachmentService;

    /**
     * 新增用户
     *
     * @param userInput
     * @return 1成功 0 失败 -1 用户已存在
     */
    @Override
    public LspUserInput addLspUser(LspUserInput userInput) {
        TlspUserCriteria criteria = new TlspUserCriteria();
        criteria.createCriteria().andNickNameEqualTo(userInput.getNickName());
        int count = lspUserDao.countByExample(criteria);
        if (count > 0) {
            return null;//-1 用户已存在
        }
        TlspUser tlspUser = new TlspUser();
        BeanMapper.copy(userInput, tlspUser);
       // BeanUtils.copyProperties(userInput, tlspUser);
        tlspUser.setPassword(DigestUtils.md5Hex(tlspUser.getPassword()));
        tlspUser.setLastLoginDate(new Date());
        tlspUser.setRegisterDate(new Date());
        count = lspUserDao.insertSelective(tlspUser);
        userInput.setId(tlspUser.getId());
        return userInput;
    }

    @Override
    public int updateProviderById(LspUserInput input) {
        TlspUser record = BeanMapper.map(input, TlspUser.class);
        return lspUserDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public void recordLastLoginDate(Long id) {
        TlspUser tlspUser = new TlspUser();
        tlspUser.setId(id);
        tlspUser.setLastLoginDate(new Date());
        lspUserDao.updateByPrimaryKeySelective(tlspUser);
    }

    /**
     * 根据账号或者密码查找用户
     *
     * @param userInput
     * @return
     */
    @Override
    public LspUserOutput findUserByNameOrPwd(LspUserInput userInput) {
        TlspUserCriteria userCriteria = new TlspUserCriteria();
        TlspUserCriteria.Criteria criteria = userCriteria.createCriteria();
        criteria.andNickNameEqualTo(userInput.getNickName());
        if (userInput.getPassword() != null) {
            criteria.andPasswordEqualTo(DigestUtils.md5Hex(userInput.getPassword()));
        }
        List list = lspUserDao.selectByExample(userCriteria);
        LspUserOutput lspUserOutput = null;
        if(list.size()>0) {
            lspUserOutput = new LspUserOutput();
            BeanMapper.copy(list.get(0), lspUserOutput);
        }
        return lspUserOutput;
    }

    /**
     * 根据id修改绑定手机号
     * @param userInput
     * @return
     */
    @Override
    public int updateBindMobileById(LspUserInput userInput) {
        boolean flag = isBindMobileExist(userInput.getBindMobile());
        if(flag) {
            return updateProviderById(userInput);
        }else{
            return 0;
        }
    }

    /**
     * 判断输入的原绑定手机号码是否正确
     * @param userInput
     * @return
     */
    @Override
    public boolean judgeBindMobile(LspUserInput userInput) {
        TlspUserCriteria criteria = new TlspUserCriteria();
        criteria.createCriteria().andBindMobileEqualTo(userInput.getBindMobile())
                .andIdEqualTo(userInput.getId());
        List<TlspUser> list =lspUserDao.selectByExample(criteria);

        return list.size()>0;
    }

    /**
     *
     * @param bindMobile
     * @return true-手机号未绑定过账号 false-该号码已经绑定
     */
    @Override
    public boolean isBindMobileExist(String bindMobile) {
        TlspUserCriteria criteria = new TlspUserCriteria();
        criteria.createCriteria().andBindMobileEqualTo(bindMobile);
        List<TlspUser> users = lspUserDao.selectByExample(criteria);
        if(users.size()>0) {
            return false;
        }else{
            return true;
        }
    }


    @Override
    public PagedList<LspUserOutput> listProvider(LspUserInput input) {
        TlspUserCriteria example = new TlspUserCriteria();
        example.setOrderByClause("verify_status asc , registrant_date asc");
        TlspUserCriteria.Criteria criteria = example.createCriteria();
        TlspUserCriteria.Criteria criteria2 = example.createCriteria();
        if (input.getCompanyName() != null) {
            criteria.andCompanyNameLike("%" + input.getCompanyName() + "%");
            criteria2.andCompanyNameLike("%" + input.getCompanyName() + "%");
        }
        if (input.getRealUserName() != null) {
            criteria.andRealUserNameLike("%" + input.getRealUserName() + "%");
            criteria2.andRealUserNameLike("%" + input.getRealUserName() + "%");
        }
        if (input.getVerifyStatus() != null) {
            criteria.andVerifyStatusEqualTo(input.getVerifyStatus());
            if (input.getVerifyStatus().equals(0)) {
                criteria2.andVerifyStatusIsNull();
            }
        }
        if (input.getProvinceId() != null && !input.getProvinceId().equals(0L)) {
            criteria.andProvinceIdEqualTo(input.getProvinceId());
            criteria2.andProvinceIdEqualTo(input.getProvinceId());
            if (input.getCityId() != null && !input.getCityId().equals(0L)) {
                criteria.andCityIdEqualTo(input.getCityId());
                criteria2.andCityIdEqualTo(input.getCityId());
                if (input.getCountryId() != null && !input.getCountryId().equals(0L)) {
                    criteria.andCountryIdEqualTo(input.getCountryId());
                    criteria2.andCountryIdEqualTo(input.getCountryId());
                }
            }
        }
        PageableImpl pageable = BeanMapper.map(input, PageableImpl.class);
        List<TlspUser> list = lspUserDao.selectByExample(example, pageable);
        return new PagedList<>(input, pageable.getCount(), BeanMapper.mapList(list, LspUserOutput.class));
    }

    @Override
    public boolean block(Long id) {
        TlspUser user = new TlspUser();
        user.setBlocked(1);
        TlspUserCriteria example = new TlspUserCriteria();
        example.createCriteria().andIdEqualTo(id);
        lspUserDao.updateByExampleSelective(user,example);
        return true;
    }

    @Override
    public boolean unblock(Long id) {
        TlspUser user = new TlspUser();
        user.setId(id);
        user.setBlocked(0);
        lspUserDao.updateByPrimaryKeySelective(user);
        return true;
    }

    @Override
    public LspUserOutput findOneProviderById(Long id) {
        TlspUser user = lspUserDao.selectByPrimaryKey(id);
        return BeanMapper.map(user, LspUserOutput.class);
    }

    @Override
    public List<LspUserCarOutput> findProviderCarsById(Long id) {
        return carService.findCarsByUserId(id);
    }

    @Override
    public int deleteProviderCarById(Long id) {
        return carService.deleteProviderCarById(id);
    }

    @Override
    public int createProviderCar(LspUserCarInput input) {
        return carService.createProviderCar(input);
    }

    @Override
    public List<LspUserCenterRelationOutput> loadCenterRelationByProviderId(Long id) {
        return relationService.loadCenterRelationByProviderId(id);
    }

    @Override
    public int insertRelations(List<LspUserCenterRelationInput> relationInputs, Long providerId) {
        return relationService.insertRelations(relationInputs, providerId);
    }

    @Override
    public List<LspUserAttachmentOutput> imageList(Long providerId) {
        return attachmentService.imageList(providerId);
    }

    @Override
    public int addLspUserImage(LspUserAttachmentInput input) {
        return attachmentService.addLspUserImage(input);
    }

    @Override
    public int deleteProviderImage(Long imageId) {
        return attachmentService.deleteImage(imageId);
    }

    @Override
    public List<LspUserAttachmentOutput> providerFileList(Long providerId) {
        return attachmentService.fileList(providerId);
    }

    @Override
    public int deleteProviderFiles(Long[] ids) {
        return attachmentService.deleteFiles(ids);
    }
}
