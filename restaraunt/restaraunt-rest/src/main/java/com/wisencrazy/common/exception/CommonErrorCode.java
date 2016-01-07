package com.wisencrazy.common.exception;

import java.io.Serializable;

public class CommonErrorCode implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1326240927071681637L;

	public CommonErrorCode(String errorCode, String errorMessage,
			String developerMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.developerMessage = developerMessage;
	}

	private String errorCode;
	
	private String errorMessage;
	
	private String developerMessage;
	
	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getDeveloperMessage() {
		return developerMessage;
	}

	public void setDeveloperMessage(String developerMessage) {
		this.developerMessage = developerMessage;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CommonErrorCode [errorCode=");
		builder.append(errorCode);
		builder.append(", errorMessage=");
		builder.append(errorMessage);
		builder.append(", developerMessage=");
		builder.append(developerMessage);
		builder.append("]");
		return builder.toString();
	}
}
