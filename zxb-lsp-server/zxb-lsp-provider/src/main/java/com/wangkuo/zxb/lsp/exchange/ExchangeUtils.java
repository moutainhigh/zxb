package com.wangkuo.zxb.lsp.exchange;

import com.wangkuo.dec.client.exchangeserver.applicationsecurty.ApplicationSecurityClient;
import com.wangkuo.dec.client.exchangeserver.applicationsecurty.ApplicationSecurityClientFactory;
import com.wangkuo.dec.client.exchangeserver.define.WkDecDefineValue;
import com.wangkuo.dec.client.exchangeserver.dto.back.ValuesBaseResult;
import com.wangkuo.dec.client.exchangeserver.response.TokenResponse;
import com.wangkuo.dec.client.exchangeserver.transport.MessageTransporter;
import com.wangkuo.dec.client.exchangeserver.transport.TransportClientFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionSynchronizationAdapter;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import javax.annotation.Resource;


@Component
public class ExchangeUtils 
{	
	
	private MessageTransporter messageTransporter;
	
	@Resource
	private ExchangeConfig exchangeConfig;

	public MessageTransporter createMessageTransporter() throws Exception
	{	
		
		ApplicationSecurityClient applicationSecurityClient = ApplicationSecurityClientFactory.createUserSecurityClient(exchangeConfig.getApplicationSecurityUrl());
		
		ValuesBaseResult<TokenResponse> result = applicationSecurityClient.authenticate(exchangeConfig.getAccount(), exchangeConfig.getPassword());
		if(!result.getCode().equals(WkDecDefineValue.SUCCESS))
		{
			return messageTransporter;
		}
		
		TokenResponse tokenResponse = result.getValues();
		
		messageTransporter = TransportClientFactory.createMessageTransporter(tokenResponse, exchangeConfig.getMessageTransportUrl());

        return messageTransporter;
	}

	public MessageTransporter getMessageTransporter() throws Exception
	{
		if(messageTransporter == null)
		{
			messageTransporter = createMessageTransporter();
		}
		return messageTransporter;
	}
	
	public void setMessageTransporter(MessageTransporter messageTransporter)
	{
		this.messageTransporter = messageTransporter;
	}


	public static void afterCommit(final ApplicationContext applicationContext,final ApplicationEvent event) {
		TransactionSynchronizationManager.registerSynchronization(new TransactionSynchronizationAdapter() {
			@Override
			public void afterCommit() {
				applicationContext.publishEvent(event);
			}
		});
	}
}
