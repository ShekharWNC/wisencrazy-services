package com.dto;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class CompanyContactDTO extends AbsCommonDTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String contactNumber;
	private String contactType;
	private Boolean status;
	
	
	public CompanyContactDTO() {
		super();
	}

	public String getContactNumber() {
		return contactNumber;
	}
	public String getContactType() {
		return contactType;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public void setContactType(String contactType) {
		this.contactType = contactType;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	

}
