package com.dto;

import java.io.Serializable;
/**
 * 
 * @author pooja
 *
 */
public class SingleSMSDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6925774099267037542L;
	private String number;
	private String message;
	private String senderId;
	private boolean resend;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getSenderId() {
		return senderId;
	}
	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}
	public boolean isResend() {
		return resend;
	}
	public void setResend(boolean resend) {
		this.resend = resend;
	}
		
}
