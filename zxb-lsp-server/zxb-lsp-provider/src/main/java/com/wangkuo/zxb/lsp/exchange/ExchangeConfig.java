package com.wangkuo.zxb.lsp.exchange;

import org.springframework.stereotype.Component;

@Component
public class ExchangeConfig 
{

	public String getApplicationSecurityUrl() {
		return applicationSecurityUrl;
	}

	public void setApplicationSecurityUrl(String applicationSecurityUrl) {
		this.applicationSecurityUrl = applicationSecurityUrl;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMessageTransportUrl() {
		return messageTransportUrl;
	}

	public void setMessageTransportUrl(String messageTransportUrl) {
		this.messageTransportUrl = messageTransportUrl;
	}

	public String getToAddress() {
		return toAddress;
	}

	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}
	
	private String applicationSecurityUrl;
	
	private String account;
	
	private String password;
	
	private String messageTransportUrl;
	
	private String toAddress;
}
