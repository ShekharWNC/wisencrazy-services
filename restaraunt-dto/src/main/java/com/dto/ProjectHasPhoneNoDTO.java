package com.dto;


public class ProjectHasPhoneNoDTO extends AbsCommonDTO{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer phoneNoId;
    
	private boolean enableOutgoingCalls;

	private ProjectDTO projectId;

	private RegisteredPhoneNoDTO registeredPhoneNo;

	public Integer getPhoneNoId() {
		return phoneNoId;
	}

	public void setPhoneNoId(Integer phoneNoId) {
		this.phoneNoId = phoneNoId;
	}

	public boolean isEnableOutgoingCalls() {
		return enableOutgoingCalls;
	}

	public void setEnableOutgoingCalls(boolean enableOutgoingCalls) {
		this.enableOutgoingCalls = enableOutgoingCalls;
	}

	public ProjectDTO getProjectId() {
		return projectId;
	}

	public void setProjectId(ProjectDTO projectId) {
		this.projectId = projectId;
	}

	public RegisteredPhoneNoDTO getRegisteredPhoneNo() {
		return registeredPhoneNo;
	}

	public void setRegisteredPhoneNo(RegisteredPhoneNoDTO registeredPhoneNo) {
		this.registeredPhoneNo = registeredPhoneNo;
	}
	
	
}
