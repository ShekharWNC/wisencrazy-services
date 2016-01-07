package com.dto;

import java.io.Serializable;

import com.dto.constants.EnumConstants.SettingFor;

public class SubscriptionDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -553327229082823907L;

	private String name;
	
	private String email;
	
	private String customerSid;
	
	private String projectSid;
	
	private String agentSid;
	
	private boolean isSystem;
	
	private String featureSid;
	
	private String referenceCode;
	
	private Integer customerId;
	
	private Integer agentId;
	
	private String feature;
	
	private String featureKey;
	
	private Integer projectId;
	
	private SettingFor isRequestFromDevice;
	
	private String deviceInfo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCustomerSid() {
		return customerSid;
	}

	public void setCustomerSid(String customerSid) {
		this.customerSid = customerSid;
	}

	public String getProjectSid() {
		return projectSid;
	}

	public void setProjectSid(String projectSid) {
		this.projectSid = projectSid;
	}

	public String getAgentSid() {
		return agentSid;
	}

	public void setAgentSid(String agentSid) {
		this.agentSid = agentSid;
	}


	public String getFeatureSid() {
		return featureSid;
	}

	public void setFeatureSid(String featureSid) {
		this.featureSid = featureSid;
	}

	public String getReferenceCode() {
		return referenceCode;
	}

	public void setReferenceCode(String referenceCode) {
		this.referenceCode = referenceCode;
	}

	public boolean getIsSystem() {
		return isSystem;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getAgentId() {
		return agentId;
	}

	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public String getFeatureKey() {
		return featureKey;
	}

	public void setFeatureKey(String featureKey) {
		this.featureKey = featureKey;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public SettingFor getIsRequestFromDevice() {
		return isRequestFromDevice;
	}

	public void setIsRequestFromDevice(SettingFor isRequestFromDevice) {
		this.isRequestFromDevice = isRequestFromDevice;
	}

	public String getDeviceInfo() {
		return deviceInfo;
	}

	public void setDeviceInfo(String deviceInfo) {
		this.deviceInfo = deviceInfo;
	}
}
