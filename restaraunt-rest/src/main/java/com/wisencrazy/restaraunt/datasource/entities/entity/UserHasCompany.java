package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="user_has_company")
public class UserHasCompany extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;
	@ManyToOne
	@JoinColumn(name="company_id")
	private Company company;
	@ManyToOne
	@JoinColumn(name="appuser_id")
	private Appuser appuser;
	public UserHasCompany() {
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Appuser getAppuser() {
		return appuser;
	}
	public void setAppuser(Appuser appuser) {
		this.appuser = appuser;
	}
	
	
}