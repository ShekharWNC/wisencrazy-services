package com.dto;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the user_has_experience database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class UserHasExperienceDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Date endDate;

	private Date startDate;

	private String title;

	private byte verified;

	//bi-directional many-to-one association to Company
	private CompanyDTO company;

	//bi-directional many-to-one association to User
	private AppuserDTO user;

	public UserHasExperienceDTO() {
	}

	public UserHasExperienceDTO(Date endDate, Date startDate,
			String title, byte verified, CompanyDTO company, AppuserDTO user) {
		super();
		this.endDate = endDate;
		this.startDate = startDate;
		this.title = title;
		this.verified = verified;
		this.company = company;
		this.user = user;
	}
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public byte getVerified() {
		return this.verified;
	}

	public void setVerified(byte verified) {
		this.verified = verified;
	}

	public CompanyDTO getCompany() {
		return this.company;
	}

	public void setCompany(CompanyDTO company) {
		this.company = company;
	}

	public AppuserDTO getUser() {
		return this.user;
	}

	public void setUser(AppuserDTO user) {
		this.user = user;
	}

}