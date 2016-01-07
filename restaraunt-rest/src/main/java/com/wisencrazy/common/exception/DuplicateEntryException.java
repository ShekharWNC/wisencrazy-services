package com.wisencrazy.common.exception;

public class DuplicateEntryException extends ApplicationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5778519495956517582L;
	private StringBuilder messageString;

	public DuplicateEntryException() {
		super();
	}
	
	public DuplicateEntryException(String errorCode,String developerMessage,Throwable cause){
		super(errorCode, developerMessage, cause);
		messageString=new StringBuilder("Duplicate Record Exception: ").append(developerMessage);
	}
	
	public DuplicateEntryException(String developerMessage){
		super(developerMessage);
		messageString=new StringBuilder("Duplicate Record Exception: ").append(developerMessage);
	}
	
	public DuplicateEntryException(String developerMessage,Throwable t){
		super(developerMessage,t);
		messageString=new StringBuilder("Duplicate Record Exception: ").append(developerMessage);
	}
	
	@Override
	public String toString() {
		return messageString.toString();
	}

}
