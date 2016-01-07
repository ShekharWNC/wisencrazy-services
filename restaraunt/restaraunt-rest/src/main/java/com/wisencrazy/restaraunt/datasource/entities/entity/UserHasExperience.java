package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the user_has_experience database table.
 * 
 */
@Entity
@Table(name="user_has_experience")
public class UserHasExperience extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="end_date")
	private Date endDate;

	@Temporal(TemporalType.DATE)
	@Column(name="start_date")
	private Date startDate;

	private String title;

	private byte verified;

	//bi-directional many-to-one association to Appuser
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="user_id")
	private Appuser appuser;

	//bi-directional many-to-one association to Company
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "company_id")
	private Company company;

	public UserHasExperience() {
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public byte getVerified() {
		return this.verified;
	}

	public void setVerified(byte verified) {
		this.verified = verified;
	}

	public Appuser getAppuser() {
		return this.appuser;
	}

	public void setAppuser(Appuser appuser) {
		this.appuser = appuser;
	}

	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

}