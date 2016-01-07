package com.wisencrazy.restaraunt.datasource.entities.entity;


import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * The persistent class for the user_has_social_network database table.
 * 
 */
@Entity
@Table(name="user_has_social_network")
public class UserHasSocialNetwork extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	private String type;

	private String url;

	public UserHasSocialNetwork() {
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
