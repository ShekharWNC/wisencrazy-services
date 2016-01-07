package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: ProjectGroupHasEmail
 *
 */
@Entity
@Table(name="project_group_has_email")
public class ProjectGroupHasEmail extends AbsBaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6765144974174063428L;
	@Column(name="default_email_id",unique=true)
	private String email;
	@Column(name="forward_email_id",unique=true)
	private String forwardEmail;
	@Column(name="sub_domain_url")
	private String subDomainUrl;
	@Column(name="project_group_id")
	private Integer projectGroupId;
	public ProjectGroupHasEmail() {
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getProjectGroupId() {
		return projectGroupId;
	}

	public void setProjectGroupId(Integer projectGroupId) {
		this.projectGroupId = projectGroupId;
	}

	public String getForwardEmail() {
		return forwardEmail;
	}

	public void setForwardEmail(String forwardEmail) {
		this.forwardEmail = forwardEmail;
	}

	public String getSubDomainUrl() {
		return subDomainUrl;
	}

	public void setSubDomainUrl(String subDomainUrl) {
		this.subDomainUrl = subDomainUrl;
	}
   
}
