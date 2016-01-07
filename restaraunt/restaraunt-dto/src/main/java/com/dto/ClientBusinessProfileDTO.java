package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the client_buisness_profile database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ClientBusinessProfileDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String contactEmailInformation = "";

	private String contactPhoneNo = "";

	private String keyword = "";

	private String tagline = "";
	
	private String serviceDescription;
	
	private String overview;

	//bi-directional many-to-one association to Company
	private CompanyDTO company = null;

	//bi-directional many-to-one association to User
	private AppuserDTO appuser = null;

	public ClientBusinessProfileDTO() {
	}

	public ClientBusinessProfileDTO(String contactEmailInformation,
			String contactPhoneNo, String keyword, String tagline,
			CompanyDTO company, AppuserDTO user) {
		super();
		this.contactEmailInformation = contactEmailInformation;
		this.contactPhoneNo = contactPhoneNo;
		this.keyword = keyword;
		this.tagline = tagline;
		this.company = company;
		this.appuser = user;
	}

	public String getContactEmailInformation() {
		return this.contactEmailInformation;
	}

	public void setContactEmailInformation(String contactEmailInformation) {
		this.contactEmailInformation = contactEmailInformation;
	}

	public String getContactPhoneNo() {
		return this.contactPhoneNo;
	}

	public void setContactPhoneNo(String contactPhoneNo) {
		this.contactPhoneNo = contactPhoneNo;
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getTagline() {
		return this.tagline;
	}

	public void setTagline(String tagline) {
		this.tagline = tagline;
	}

	public CompanyDTO getCompany() {
		return this.company;
	}

	public void setCompany(CompanyDTO company) {
		this.company = company;
	}

	public AppuserDTO getAppuser() {
		return appuser;
	}

	public void setAppuser(AppuserDTO appuser) {
		this.appuser = appuser;
	}

	public String getServiceDescription() {
		return serviceDescription;
	}

	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	@Override
	public String toString() {
		return "ClientBusinessProfileDTO [contactEmailInformation="
				+ contactEmailInformation + ", contactPhoneNo="
				+ contactPhoneNo + ", keyword=" + keyword + ", tagline="
				+ tagline + ", serviceDescription=" + serviceDescription
				+ ", overview=" + overview + ", company=" + company + ", user="
				+ appuser + "]";
	}

}