package com.wisencrazy.restaraunt.datasource.entities.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "company_contacts")
public class CompanyContact extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;
	
	public CompanyContact() {
		// TODO Auto-generated constructor stub
	}

	@Column(name="contact_number")
	private String contactNumber;

	@Column(name="contact_type")
	private String contactType;
	
	@Column(name = "status")
	private String status;

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getContactType() {
		return contactType;
	}

	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
