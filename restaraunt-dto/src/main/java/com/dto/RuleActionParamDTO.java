package com.dto;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class RuleActionParamDTO extends AbsCommonDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8709231379728316333L;
	
	private String param;
	
	public String getParam() {
		return param;
	}
	
	public void setParam(String param) {
		this.param = param;
	}
}
