package com.wisencrazy.common.exception;
@SuppressWarnings("serial")
public class ApplicationException extends Exception {
	public CommonErrorCode errorCode;
	
	public ApplicationException(){}
	public ApplicationException(String message){
		super(message);
	}
		
	public ApplicationException(String message, Throwable cause){
		super(message,cause);
	}
	
	public ApplicationException(String errorCode,String message,Throwable cause){
		super(message,cause);
		this.errorCode=new CommonErrorCode(errorCode, message, message);
	}
	
}
