package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the customer_business_has_contact database table.
 * 
 */
@Entity
@Table(name="customer_business_has_contact")
public class CustomerBusinessHasContact extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(name="conatact_type")
	private String conatactType;

	@Column(name="contact_number")
	private String contactNumber;

	public CustomerBusinessHasContact() {
	}

	public String getConatactType() {
		return this.conatactType;
	}

	public void setConatactType(String conatactType) {
		this.conatactType = conatactType;
	}

	public String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
}