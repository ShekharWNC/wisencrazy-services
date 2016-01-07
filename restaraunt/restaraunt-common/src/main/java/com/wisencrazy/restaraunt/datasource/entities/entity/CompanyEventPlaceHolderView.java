package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
/**
 * 
 * @author vikash
 *
 */
@Entity
@Table(name="vw_company_event_template_processor")
public class CompanyEventPlaceHolderView extends AbsBaseEntity{

	private static final long serialVersionUID = -3493695894348048285L;

	@Column(name="name")
    private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="status")
	private Boolean status;
	
	@Column(name="website")
	private String website;
	
	@Column(name = "created_date")
	private Timestamp createdDate;

	@Column(name = "updated_date")
	private Timestamp updatedDate;
	
	@Column(name="industry_type")
	private String industryType;

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

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Timestamp getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getIndustryType() {
		return industryType;
	}

	public void setIndustryType(String industryType) {
		this.industryType = industryType;
	}
}
