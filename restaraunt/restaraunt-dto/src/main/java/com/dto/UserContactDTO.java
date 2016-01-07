package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the user_contacts database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class UserContactDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String contactNumber;

	private String contactType;

	private int userCompaniesId;

	//bi-directional many-to-one association to User
	private AppuserDTO user;
	
	private Boolean status;
	private UserInfoDTO userInfo;

	public UserInfoDTO getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfoDTO userInfo) {
		this.userInfo = userInfo;
	}

	public UserContactDTO() {
	}

	public UserContactDTO(String contactNumber, String contactType,
			int userCompaniesId, AppuserDTO user) {
		super();
		this.contactNumber = contactNumber;
		this.contactType = contactType;
		this.userCompaniesId = userCompaniesId;
		this.user = user;
	}
	public String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getContactType() {
		return this.contactType;
	}

	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	public int getUserCompaniesId() {
		return this.userCompaniesId;
	}

	public void setUserCompaniesId(int userCompaniesId) {
		this.userCompaniesId = userCompaniesId;
	}

	public AppuserDTO getUser() {
		return this.user;
	}

	public void setUser(AppuserDTO user) {
		this.user = user;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

}