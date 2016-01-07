package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the job_has_events database table.
 * 
 */
@Entity
@Table(name="job_has_events")
public class JobHasEvent extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(name="no_of_positions")
	private byte noOfPositions;

	@Column(name="positions_filled")
	private byte positionsFilled;

	//bi-directional many-to-one association to Event
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="events_id", referencedColumnName = "id")
	private Event event;

	//bi-directional many-to-one association to Job
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "job_id", referencedColumnName = "id")
	private Job job;

	public JobHasEvent() {
	}

	public byte getNoOfPositions() {
		return this.noOfPositions;
	}

	public void setNoOfPositions(byte noOfPositions) {
		this.noOfPositions = noOfPositions;
	}

	public byte getPositionsFilled() {
		return this.positionsFilled;
	}

	public void setPositionsFilled(byte positionsFilled) {
		this.positionsFilled = positionsFilled;
	}

	public Event getEvent() {
		return this.event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public Job getJob() {
		return this.job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

}