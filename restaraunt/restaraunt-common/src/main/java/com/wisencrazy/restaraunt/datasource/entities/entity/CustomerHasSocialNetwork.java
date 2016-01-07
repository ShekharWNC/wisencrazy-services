package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the customer_social_network database table.
 * 
 */
@Entity
@Table(name="customer_has_social_network")
public class CustomerHasSocialNetwork extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	private String type;

	private String url;

	public CustomerHasSocialNetwork() {
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