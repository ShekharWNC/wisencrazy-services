package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the project_user_has_events database table.
 * 
 */
@Entity
@Table(name="project_user_has_events")
public class ProjectUserHasEvent extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	private String status;

	//bi-directional many-to-one association to Event
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="shift_id", referencedColumnName = "id")
	private Event event1;

	//bi-directional many-to-one association to Event
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="events_id", referencedColumnName = "id")
	private Event event2;

	//bi-directional many-to-one association to VirtualAccount
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="virtual_account_id", referencedColumnName = "id")
	private VirtualAccount virtualAccount;

	public ProjectUserHasEvent() {
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Event getEvent1() {
		return this.event1;
	}

	public void setEvent1(Event event1) {
		this.event1 = event1;
	}

	public Event getEvent2() {
		return this.event2;
	}

	public void setEvent2(Event event2) {
		this.event2 = event2;
	}

	public VirtualAccount getVirtualAccount() {
		return this.virtualAccount;
	}

	public void setVirtualAccount(VirtualAccount virtualAccount) {
		this.virtualAccount = virtualAccount;
	}

}