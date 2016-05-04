package com.dto;

import java.util.Date;

public class PaymentDTO extends AbsCommonDTO {
		

	/**
	 * 
	 */
	private static final long serialVersionUID = -6750064349687330553L;

	public enum PaymentMode{
		COD,
		ONLINE
	}
	
	public enum PaymentStatus{
		STARTED,
		PENDING,
		COMPLETED,
		PENDING_CONFIRM
	}
	
	private PaymentMode paymentMode;
	
	private Double paymentAmount;
	
	private PaymentStatus paymentStatus;
	
	private Date paymentStatusTime;

	public PaymentMode getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(PaymentMode paymentMode) {
		this.paymentMode = paymentMode;
	}

	public Double getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(Double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public Date getPaymentStatusTime() {
		return paymentStatusTime;
	}

	public void setPaymentStatusTime(Date paymentStatusTime) {
		this.paymentStatusTime = paymentStatusTime;
	}


}
