package com.dto;

import java.io.Serializable;

public class OtpDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5148233742089903675L;

	private String customerSid;
	
	private String requestId;
	
	private String otpKey;
	
	private String mobileNumber;
	
	private String activity;

	public String getCustomerSid() {
		return customerSid;
	}

	public void setCustomerSid(String customerSid) {
		this.customerSid = customerSid;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getOtpKey() {
		return otpKey;
	}

	public void setOtpKey(String otpKey) {
		this.otpKey = otpKey;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}
}
