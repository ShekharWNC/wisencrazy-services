package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the user_contacts database table.
 * 
 */
@Entity
@Table(name="user_contacts")
public class UserContact extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(name="contact_number")
	private String contactNumber;

	@Column(name="contact_type")
	private String contactType;

	private byte status;

	@Column(name="user_companies_id")
	private int userCompaniesId;
    

	public UserContact() {
	}

	public String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getContactType() {
		return this.contactType;
	}

	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public int getUserCompaniesId() {
		return this.userCompaniesId;
	}

	public void setUserCompaniesId(int userCompaniesId) {
		this.userCompaniesId = userCompaniesId;
	}
}