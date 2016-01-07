package com.dto;

import java.util.List;
import java.util.Map;

public class CommonSettings {
	
	private String name;
	private String method;
	private List<Map<String, String>> arguments;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public List<Map<String, String>> getArguments() {
		return arguments;
	}
	public void setArguments(List<Map<String, String>> arguments) {
		this.arguments = arguments;
	}
}
