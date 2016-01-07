package com.wisencrazy.common.exception;

public class IncorrectArgumentException extends ApplicationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5778519495956517582L;
	private StringBuilder messageString;

	public IncorrectArgumentException() {
		super();
	}
	
	public IncorrectArgumentException(String errorCode,String developerMessage,Throwable cause){
		super(errorCode, developerMessage, cause);
		messageString=new StringBuilder("Incorrect Argument Exception: ").append(developerMessage);
	}
	
	public IncorrectArgumentException(String developerMessage){
		super(developerMessage);
		messageString=new StringBuilder("Incorrect Argument Exception: ").append(developerMessage);
	}
	
	@Override
	public String toString() {
		return messageString.toString();
	}

}
