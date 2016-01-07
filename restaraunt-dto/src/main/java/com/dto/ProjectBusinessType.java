package com.dto;

import java.io.Serializable;
public class ProjectBusinessType implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String businessType;
	private int count;
	private String businessRuleHref;
	private String sid;

	public ProjectBusinessType(){
		
	}

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getBusinessRuleHref() {
		return businessRuleHref;
	}

	public void setBusinessRuleHref(String businessRuleHref) {
		this.businessRuleHref = businessRuleHref;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}
	
}
