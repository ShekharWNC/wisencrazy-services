package com.wisencrazy.common.exception;
@SuppressWarnings("serial")
public class IllegalOperationException extends Exception {
	private StringBuilder messageString;
	public IllegalOperationException(String message) {
		messageString=new StringBuilder("Operation Not allowed: "+message);
	}
	public String toString(){
		return messageString.toString();
	}
}
