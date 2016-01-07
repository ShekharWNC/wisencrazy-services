package com.wisencrazy.common.exception;
@SuppressWarnings("serial")
public class ObjectNotFoundException extends Exception {
	public ObjectNotFoundException(){
	}
	public ObjectNotFoundException(String strMsg){
		super(strMsg);
	}
}
