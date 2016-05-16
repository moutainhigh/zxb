package com.wangkuo.zxb.lsp.provider.service;

import com.wangkuo.dec.client.exchangeserver.define.WkDecDefineValue;
import com.wangkuo.dec.client.exchangeserver.dto.back.ValuesBaseResult;
import com.wangkuo.dec.client.exchangeserver.request.SendRequest;
import com.wangkuo.dec.client.exchangeserver.transport.MessageTransporter;
import com.wangkuo.framework.mapper.JsonMapper;
import com.wangkuo.zxb.lsp.exchange.ExchangeConfig;
import com.wangkuo.zxb.lsp.exchange.ExchangeUtils;
import com.wangkuo.zxb.lsp.exchange.IExChangeSendDataService;
import com.wangkuo.zxb.lsp.provider.db.dao.ExchSendDataDao;
import com.wangkuo.zxb.lsp.provider.db.po.ExchSendData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service("exChangesendDataService")
@Transactional
public class ExChangeSendDataServiceImpl implements IExChangeSendDataService
{
	private Logger logger = LoggerFactory.getLogger(ExChangeSendDataServiceImpl.class);
	
	@Autowired
	private ExchSendDataDao sendDataDao;
	
	@Autowired
	private ExchangeUtils exchangeUtils;

	@Resource
	private ExchangeConfig exchangeConfig;

	private static final JsonMapper jsonMapper = JsonMapper.nonDefaultMapper();
	
	@Override
	public boolean send(ExchSendData tSendData) throws Exception
	{	
		MessageTransporter messageTransporter = exchangeUtils.getMessageTransporter();
		SendRequest request = new SendRequest();
		BeanUtils.copyProperties(tSendData, request);
		Date date = new Date();
		request.setSendTime(date);
		ValuesBaseResult<Long> result = messageTransporter.send(request);
		if(result ==null || result.getCode().equals(WkDecDefineValue.TOKEN_INVAILD))
		{
			exchangeUtils.setMessageTransporter(exchangeUtils.createMessageTransporter());
			logger.error("当前数据ID＝" + tSendData.getId() + "; 类型＝" + tSendData.getActionType() + ";数据中心会话过期，已重新获取，本次条数据处理将延后到下次");
			return  false;
		}

		if(result.getCode().equals(WkDecDefineValue.FAIL))
		{
			logger.error("当前数据ID＝" + tSendData.getId() + "; 类型＝" + tSendData.getActionType() + ";数据提交失败。下次将继续提交。");
			return  false;
		}
		ExchSendData sendData = new ExchSendData();
		sendData.setId(tSendData.getId());
		sendData.setEventId(result.getValues());
		sendData.setIsSend(Boolean.TRUE);
		sendData.setSendTime(date);
		sendDataDao.updateByPrimaryKeySelective(sendData);
		return  true;
	}

	@Override
	public int addToSendQueue(String actionType, Object sendObj) {
		Assert.notNull(actionType);
		Assert.notNull(sendObj);


        ExchSendData sendData = new ExchSendData();
		sendData.setActionType(actionType);
		sendData.setContent(jsonMapper.toJson(sendObj));
		sendData.setIsSend(Boolean.FALSE);
		sendData.setFromAddress(exchangeConfig.getAccount());
		sendData.setToAddress(exchangeConfig.getToAddress());
		sendData.setCreateTime(new Date());
		sendDataDao.insertSelective(sendData);

		return 1;
	}

    @Override
    public int addToSendQueue(Object sendObj) {

        Assert.notNull(sendObj);
        return addToSendQueue(sendObj.getClass().getSimpleName().toLowerCase(),sendObj);
    }


}
