package com.dto;

/**
 * 
 * @author vikash
 * 
 */
public class MerchantDTO extends AbsCommonDTO {

	private static final long serialVersionUID = 1624780430315800753L;

	public enum GATEWAY {
		payu,ebs
	}

	private String apiKey;
	private String salt;
	private GATEWAY gateway;

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public GATEWAY getGateway() {
		return gateway;
	}

	public void setGateway(GATEWAY gateway) {
		this.gateway = gateway;
	}

}
