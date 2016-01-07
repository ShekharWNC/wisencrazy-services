package com.dto.payment;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * @author vikash
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveCardTokenInput implements Serializable {
	private static final long serialVersionUID = -358292446472095608L;
	private String customerSid;
	private String merchantName;
	private String cardToken;

	public String getCustomerSid() {
		return customerSid;
	}

	public void setCustomerSid(String customerSid) {
		this.customerSid = customerSid;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getCardToken() {
		return cardToken;
	}

	public void setCardToken(String cardToken) {
		this.cardToken = cardToken;
	}
}
