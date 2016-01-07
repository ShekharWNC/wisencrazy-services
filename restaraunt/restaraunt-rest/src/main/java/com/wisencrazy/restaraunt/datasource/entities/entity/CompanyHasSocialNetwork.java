package com.wisencrazy.restaraunt.datasource.entities.entity;


import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * The persistent class for the company_has_social_network database table.
 * 
 */
@Entity
@Table(name="company_has_social_network")
public class CompanyHasSocialNetwork extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	private String type;

	private String url;

	public CompanyHasSocialNetwork() {
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
