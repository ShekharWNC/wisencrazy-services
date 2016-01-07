package com.dto;

import java.io.Serializable;

public class ExternalPhoneNumberDTO extends AbsCommonDTO implements
		Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4357339944546424521L;

	private String exteralNumber;
	
	private RegisteredPhoneNoDTO callerId;
	
	private String sendDigits;

	public String getSendDigits() {
		return sendDigits;
	}

	public void setSendDigits(String sendDigits) {
		this.sendDigits = sendDigits;
	}

	public RegisteredPhoneNoDTO getCallerId() {
		return callerId;
	}

	public void setCallerId(RegisteredPhoneNoDTO callerId) {
		this.callerId = callerId;
	}

	public String getExteralNumber() {
		return exteralNumber;
	}

	public void setExteralNumber(String exteralNumber) {
		this.exteralNumber = exteralNumber;
	}
}
