package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the job_has_events database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class JobHasEventDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;


	private byte noOfPositions;

	private byte positionsFilled;

	//bi-directional many-to-one association to Event
	private EventDTO event;

	//bi-directional many-to-one association to Job
	private JobDTO job;

	public JobHasEventDTO() {
	}

	public JobHasEventDTO(byte noOfPositions, byte positionsFilled,
			EventDTO event, JobDTO job) {
		super();
		this.noOfPositions = noOfPositions;
		this.positionsFilled = positionsFilled;
		this.event = event;
		this.job = job;
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

	public EventDTO getEvent() {
		return this.event;
	}

	public void setEvent(EventDTO event) {
		this.event = event;
	}

	public JobDTO getJob() {
		return this.job;
	}

	public void setJob(JobDTO job) {
		this.job = job;
	}

}