package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the proposal_has_events database table.
 * 
 */
@Entity
@Table(name="proposal_has_events")
public class ProposalHasEvent extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	private String status;

	//bi-directional many-to-one association to Event
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="events_id", referencedColumnName = "id")
	private Event event;

	//bi-directional many-to-one association to Proposal
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "proposal_id", referencedColumnName = "id")
	private Proposal proposal;

	public ProposalHasEvent() {
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Event getEvent() {
		return this.event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public Proposal getProposal() {
		return this.proposal;
	}

	public void setProposal(Proposal proposal) {
		this.proposal = proposal;
	}

}