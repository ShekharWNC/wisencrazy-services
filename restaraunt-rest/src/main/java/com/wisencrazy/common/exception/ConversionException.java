package com.wisencrazy.common.exception;

@SuppressWarnings("serial")
public class ConversionException extends Exception {
	private StringBuilder messageString;
	public ConversionException (String message) {
		// TODO Auto-generated constructor stub
		messageString=new StringBuilder("Error while Converting in Repository Utils: ");
		messageString.append("Method Name: ").append(message).append(" not executed ");
	}
	public String toString(){
		return messageString.toString();
	}
}
