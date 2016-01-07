package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "external_phone_number")
public class ExternalPhoneNumber extends AbsBaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8824034031252121359L;

	@Column(name = "external_number")
	private String exteralNumber;
	
	@ManyToOne
	@JoinColumn(name = "caller_id", referencedColumnName = "id")
	private RegisteredPhoneNo callerId;
	
	@Column(name = "send_digits")
	private String sendDigits;

	public ExternalPhoneNumber() {
		// TODO Auto-generated constructor stub
	}
	
	public String getSendDigits() {
		return sendDigits;
	}

	public void setSendDigits(String sendDigits) {
		this.sendDigits = sendDigits;
	}

	public RegisteredPhoneNo getCallerId() {
		return callerId;
	}

	public void setCallerId(RegisteredPhoneNo callerId) {
		this.callerId = callerId;
	}

	public String getExteralNumber() {
		return exteralNumber;
	}

	public void setExteralNumber(String exteralNumber) {
		this.exteralNumber = exteralNumber;
	}
}
