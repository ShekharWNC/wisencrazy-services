package com.dto;

public class IntialSetupDTO {
	private String companySid;
	
	private String projectSid;
	
	private String virtualAccountSid;
	
	private boolean isDefault;
	
	public IntialSetupDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public IntialSetupDTO(String companySid, String projectSid,
			String virtualAccountSid, boolean isDefault) {
		this.companySid = companySid;
		this.projectSid = projectSid;
		this.virtualAccountSid = virtualAccountSid;
		this.isDefault = isDefault;
	}



	public String getCompanySid() {
		return companySid;
	}

	public void setCompanySid(String companySid) {
		this.companySid = companySid;
	}

	public String getProjectSid() {
		return projectSid;
	}

	public void setProjectSid(String projectSid) {
		this.projectSid = projectSid;
	}

	public String getVirtualAccountSid() {
		return virtualAccountSid;
	}

	public void setVirtualAccountSid(String virtualAccountSid) {
		this.virtualAccountSid = virtualAccountSid;
	}

	public boolean isDefault() {
		return isDefault;
	}

	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}
}
