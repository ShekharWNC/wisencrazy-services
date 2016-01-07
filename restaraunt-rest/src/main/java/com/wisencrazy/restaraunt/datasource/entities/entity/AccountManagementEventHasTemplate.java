package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "accountmanagement_event_has_template")
public class AccountManagementEventHasTemplate implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private AccountManagementEventHasTemplatePK id;

	public AccountManagementEventHasTemplatePK getId() {
		return id;
	}

	public void setId(AccountManagementEventHasTemplatePK id) {
		this.id = id;
	}

}
