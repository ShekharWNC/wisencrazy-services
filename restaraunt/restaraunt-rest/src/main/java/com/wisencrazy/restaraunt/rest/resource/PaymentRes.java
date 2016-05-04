package com.wisencrazy.restaraunt.rest.resource;

import java.io.Serializable;
import java.util.Date;

public class PaymentRes implements Serializable{
		

	/**
	 * 
	 */
	private static final long serialVersionUID = 3788574607883560843L;

	private String paymentMode;
	
	private Double paymentAmount;
	
	private String paymentStatus;
	
	private Date paymentStatusTime;


	public Double getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(Double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}


	public Date getPaymentStatusTime() {
		return paymentStatusTime;
	}

	public void setPaymentStatusTime(Date paymentStatusTime) {
		this.paymentStatusTime = paymentStatusTime;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}


}
