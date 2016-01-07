package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "company_category")
@NamedQueries({
	@NamedQuery(name = CompanyCategory.VALIDATE_BY_NAME, query = "select c.sid from CompanyCategory c where c.name = :name"),
	@NamedQuery(name = CompanyCategory.DELETE_BY_SID, query = "delete from CompanyCategory c where hex(c.sid) = :sid"),
	@NamedQuery(name = CompanyCategory.FIND_BY_SID, query = "select c from CompanyCategory c where hex(c.sid) = :sid"),
	@NamedQuery(name = CompanyCategory.FIND_ALL, query = "select c from CompanyCategory c")
})
public class CompanyCategory extends AbsBaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2501184354375824309L;
	
	private static final String PREFIX = "com.callcomm.eserve.persistence.entity.CompanyCategory.";
	
	public static final String VALIDATE_BY_NAME = PREFIX + "validateByName";
	
	public static final String DELETE_BY_SID = PREFIX + "deleteBySid";
	
	public static final String FIND_BY_SID = PREFIX + "findBySid";

	public static final String FIND_ALL = PREFIX + "findAll";

	@NotNull
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "is_default", nullable = false, columnDefinition = "tinyint(1) default 1")
	private Boolean isDefault;
	
	@Column(name = "is_enabled",nullable = false, columnDefinition = "tinyint(1) default 1")
	private Boolean isEnabled;
	
	@ManyToOne
	@JoinColumn(name="logo_id")
	private Attachment logo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = (isDefault == null)? true : isDefault;
	}

	public Boolean getIsEnabled() {
		return isEnabled;
	}

	public void setIsEnabled(Boolean isEnabled) {
		this.isEnabled = (isEnabled == null)? true : isEnabled;
	}

	public Attachment getLogo() {
		return logo;
	}

	public void setLogo(Attachment logo) {
		this.logo = logo;
	}
}
