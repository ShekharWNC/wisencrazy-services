package com.dto;

import java.io.Serializable;

public class TableAssociationDTO implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 6690417665736717358L;

	private String tableSid;
	
	private String virtualAccountSid;
	
	private String projectSid;
	
	private String adminSid;

	public String getTableSid() {
		return tableSid;
	}

	public void setTableSid(String tableSid) {
		this.tableSid = tableSid;
	}

	public String getVirtualAccountSid() {
		return virtualAccountSid;
	}

	public void setVirtualAccountSid(String virtualAccountSid) {
		this.virtualAccountSid = virtualAccountSid;
	}

	public String getProjectSid() {
		return projectSid;
	}

	public void setProjectSid(String projectSid) {
		this.projectSid = projectSid;
	}

	public String getAdminSid() {
		return adminSid;
	}

	public void setAdminSid(String adminSid) {
		this.adminSid = adminSid;
	}
}
