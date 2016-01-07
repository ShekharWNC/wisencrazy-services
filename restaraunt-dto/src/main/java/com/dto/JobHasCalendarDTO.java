package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the job_has_calendar database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class JobHasCalendarDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to Calendar
	private CalendarDTO calendar;

	//bi-directional many-to-one association to Job
	private JobDTO job;

	public JobHasCalendarDTO() {
	}

	public JobHasCalendarDTO(CalendarDTO calendar, JobDTO job) {
		super();
		this.calendar = calendar;
		this.job = job;
	}

	public CalendarDTO getCalendar() {
		return this.calendar;
	}

	public void setCalendar(CalendarDTO calendar) {
		this.calendar = calendar;
	}

	public JobDTO getJob() {
		return this.job;
	}

	public void setJob(JobDTO job) {
		this.job = job;
	}

}