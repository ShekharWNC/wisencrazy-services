package com.wisencrazy.common.exception;

public class NullKeyException extends ApplicationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5778519495956517582L;
	private StringBuilder messageString;

	public NullKeyException() {
		super();
	}
	
	public NullKeyException(String errorCode,String developerMessage,Throwable cause){
		super(errorCode, developerMessage, cause);
		messageString=new StringBuilder("NullKeyException  Exception: ").append(developerMessage);
	}
	
	public NullKeyException(String developerMessage){
		super(developerMessage);
		messageString=new StringBuilder("NullKeyException Exception: ").append(developerMessage);
	}
	
	@Override
	public String toString() {
		return messageString.toString();
	}

}
