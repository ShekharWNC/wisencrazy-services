package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the proposal_has_events database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ProposalHasEventDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String status;

	//bi-directional many-to-one association to Event
	private EventDTO event;

	//bi-directional many-to-one association to Proposal
	private ProposalDTO proposal;

	public ProposalHasEventDTO() {
	}

	public ProposalHasEventDTO(String status, EventDTO event,
			ProposalDTO proposal) {
		super();
		this.status = status;
		this.event = event;
		this.proposal = proposal;
	}
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public EventDTO getEvent() {
		return this.event;
	}

	public void setEvent(EventDTO event) {
		this.event = event;
	}

	public ProposalDTO getProposal() {
		return this.proposal;
	}

	public void setProposal(ProposalDTO proposal) {
		this.proposal = proposal;
	}

}