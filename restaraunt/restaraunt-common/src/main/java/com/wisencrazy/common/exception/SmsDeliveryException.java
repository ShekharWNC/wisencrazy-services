package com.wisencrazy.common.exception;

public class SmsDeliveryException extends ApplicationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5778519495956517582L;
	private StringBuilder messageString;

	public SmsDeliveryException() {
		super();
	}
	
	public SmsDeliveryException(String errorCode,String developerMessage,Throwable cause){
		super(errorCode, developerMessage, cause);
		messageString=new StringBuilder("SmsDeliveryException: ").append(developerMessage);
	}
	
	public SmsDeliveryException(String developerMessage){
		super(developerMessage);
		messageString=new StringBuilder("SmsDeliveryException: ").append(developerMessage);
	}
	
	@Override
	public String toString() {
		return messageString.toString();
	}

}
