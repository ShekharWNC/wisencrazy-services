package com.wisencrazy.restaraunt.datasource.entities.entity;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the customer_business_profile_has_primary_contact database table.
 * 
 */
@Entity
@Table(name="customer_business_profile_has_primary_contact")
public class CustomerBusinessProfileHasPrimaryContact extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	@ManyToOne(cascade = {CascadeType.MERGE})
	@JoinColumn(name="appuser_id")
	private Appuser appuser;
	
	private String title;

	public CustomerBusinessProfileHasPrimaryContact() {
	}

	public Appuser getAppuser() {
		return appuser;
	}

	public void setAppuser(Appuser appuser) {
		this.appuser = appuser;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
