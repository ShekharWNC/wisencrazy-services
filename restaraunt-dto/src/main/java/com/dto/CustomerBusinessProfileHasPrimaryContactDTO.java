package com.dto;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerBusinessProfileHasPrimaryContactDTO extends AbsCommonDTO {
	
	private static final long serialVersionUID = 1L;
	
	private PrimaryContactDTO appuser;
   
   private String title;
   
   
	public CustomerBusinessProfileHasPrimaryContactDTO() {
		super();
	}
	public PrimaryContactDTO getAppuser() {
		return appuser;
	}
	public void setAppuser(PrimaryContactDTO appuser) {
		this.appuser = appuser;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
