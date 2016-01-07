package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * The persistent class for the customer_business_has_social_network database table.
 * 
 */
@Entity
@Table(name="customer_business_has_social_network")
public class CustomerBusinessHasSocialNetwork extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	private String type;

	private String url;

	public CustomerBusinessHasSocialNetwork() {
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