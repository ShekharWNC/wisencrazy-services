package com.wisencrazy.common.exception;

public class NoResultException extends ApplicationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5778519495956517582L;
	private StringBuilder messageString;

	public NoResultException() {
		super();
	}
	
	public NoResultException(String errorCode,String developerMessage,Throwable cause){
		super(errorCode, developerMessage, cause);
		messageString=new StringBuilder("No Record Found Exception: ").append(developerMessage);
	}
	
	public NoResultException(String developerMessage){
		super(developerMessage);
		messageString=new StringBuilder("No Record found Exception: ").append(developerMessage);
	}
	
	public NoResultException(String developerMessage,Throwable t){
		super(developerMessage,t);
		messageString=new StringBuilder("No Record found Exception: ").append(developerMessage);
	}
	
	@Override
	public String toString() {
		return messageString.toString();
	}

}
