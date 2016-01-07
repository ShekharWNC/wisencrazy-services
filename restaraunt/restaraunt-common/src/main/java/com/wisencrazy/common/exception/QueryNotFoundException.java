package com.wisencrazy.common.exception;
@SuppressWarnings("serial")
public class QueryNotFoundException extends Exception {
	private StringBuilder messageString;
	public QueryNotFoundException(String message) {
		messageString=new StringBuilder("Error while fetching the query: ");
		messageString.append("Query Name: ").append(message).append(" not found.");
	}
	public String toString(){
		return messageString.toString();
	}
}
