package com.dto;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class VirtualAccountCommonDTO extends AbsCommonDTO {
	
	private static final long serialVersionUID = -527248256750250696L;

	public enum UserType{
    	AUTO_AGENT_USER,GENERAL_USER
    } 
	private Date accountActiveSince;

	private byte accountStatus;

	private byte importStatus;
	
	private UserType userType;
	
	private boolean isDefaultAutoAgent;

	public Date getAccountActiveSince() {
		return accountActiveSince;
	}

	public void setAccountActiveSince(Date accountActiveSince) {
		this.accountActiveSince = accountActiveSince;
	}

	public byte getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(byte accountStatus) {
		this.accountStatus = accountStatus;
	}

	public byte getImportStatus() {
		return importStatus;
	}

	public void setImportStatus(byte importStatus) {
		this.importStatus = importStatus;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public boolean isDefaultAutoAgent() {
		return isDefaultAutoAgent;
	}

	public void setDefaultAutoAgent(boolean isDefaultAutoAgent) {
		this.isDefaultAutoAgent = isDefaultAutoAgent;
	}
	
}