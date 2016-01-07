package com.dto;

public class RegisteredPhoneNoDTO extends AbsCommonDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String phoneNo;

	private CompanyDTO company;

	private ProjectDTO project;

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	private boolean voiceEnabled;

	private boolean smsEnabled;

	private boolean mmsEnabled;

	private String region;

	private String friendlyName;

	private String postalCode;

	private Integer areaCode;

	private String status;
	
	private boolean enableVm;
	
	private boolean enableCallRecord;

	public boolean isVoiceEnabled() {
		return voiceEnabled;
	}

	public void setVoiceEnabled(boolean voiceEnabled) {
		this.voiceEnabled = voiceEnabled;
	}

	public boolean isSmsEnabled() {
		return smsEnabled;
	}

	public void setSmsEnabled(boolean smsEnabled) {
		this.smsEnabled = smsEnabled;
	}

	public boolean isMmsEnabled() {
		return mmsEnabled;
	}

	public void setMmsEnabled(boolean mmsEnabled) {
		this.mmsEnabled = mmsEnabled;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getFriendlyName() {
		return friendlyName;
	}

	public void setFriendlyName(String friendlyName) {
		this.friendlyName = friendlyName;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Integer getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(Integer areaCode) {
		this.areaCode = areaCode;
	}

	public CompanyDTO getCompany() {
		return company;
	}

	public void setCompany(CompanyDTO company) {
		this.company = company;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ProjectDTO getProject() {
		return project;
	}

	public void setProject(ProjectDTO project) {
		this.project = project;
	}

	public boolean isEnableVm() {
		return enableVm;
	}

	public void setEnableVm(boolean enableVm) {
		this.enableVm = enableVm;
	}

	public boolean isEnableCallRecord() {
		return enableCallRecord;
	}

	public void setEnableCallRecord(boolean enableCallRecord) {
		this.enableCallRecord = enableCallRecord;
	}

}
