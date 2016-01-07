package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class OperationDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8776459608560848584L;
	private String templateSid;
	private String operationName;
	public String getTemplateSid() {
		return templateSid;
	}
	public void setTemplateSid(String templateSid) {
		this.templateSid = templateSid;
	}
	public String getOperationName() {
		return operationName;
	}
	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}
	

}
