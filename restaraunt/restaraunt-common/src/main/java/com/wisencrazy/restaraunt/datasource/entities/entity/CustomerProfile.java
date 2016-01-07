package com.wisencrazy.restaraunt.datasource.entities.entity;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the customer_profile database table.
 * 
 */
@Entity
@Table(name="customer_profile")
public class CustomerProfile extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	private String title;

	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name="company_id")
	private Company company;

	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name = "department_id")
	private Department department;
	
	@ManyToOne
	@JoinColumn(name = "appuser_id", nullable = false)
	private Appuser appuser;

	public CustomerProfile() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Appuser getAppuser() {
		return appuser;
	}

	public void setAppuser(Appuser appuser) {
		this.appuser = appuser;
	}

}
