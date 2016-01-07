package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the user_timein_timeoff database table.
 * 
 */
@Entity
@Table(name="user_timein_timeoff")
public class UserTimeinTimeoff extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	private String description;

	private String status;

	private String type;

	//bi-directional many-to-one association to Event
	@ManyToOne
	@JoinColumn(name="events_id")
	private Event event;

	//bi-directional many-to-one association to VirtualAccount
	@ManyToOne
	@JoinColumn(name="virtual_account_id")
	private VirtualAccount virtualAccount;

	public UserTimeinTimeoff() {
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Event getEvent() {
		return this.event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public VirtualAccount getVirtualAccount() {
		return this.virtualAccount;
	}

	public void setVirtualAccount(VirtualAccount virtualAccount) {
		this.virtualAccount = virtualAccount;
	}

}