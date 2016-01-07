package com.wisencrazy.common.exception;

public class PersistenceException extends Exception {
	private static final long serialVersionUID = 1L;
	private StringBuilder messageString;
	public PersistenceException(String message) {
		messageString=new StringBuilder("DB Error: "+message);
	}
	public String toString(){
		return messageString.toString();
	}
}
