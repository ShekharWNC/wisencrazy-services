package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class CommonDTO extends AbsCommonDTO {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6171814347598836082L;

	protected final String  CASE_VIEW_CONDITON_TYPE = "CaseViewConditionType";
	
	protected final String COPARISON_OPERATOR = "ComparisonOperator";
	
	private String version;
	
	private String name;
	

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Integer populateCaseViewConditionTypeIdBySid() {
		return populateIdByEntityNameAndSid(CASE_VIEW_CONDITON_TYPE);
	}
	
	public Integer populateComparisonOperatorIdBySid(){
		return populateIdByEntityNameAndSid(COPARISON_OPERATOR);
	}

}
