package com.dto;

import java.io.Serializable;
import java.sql.Time;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * The persistent class for the events database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class EventDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String description;

	private String endDate;

	private Time endTime;

	private byte isAllDayEvent;

	private String repeatBy;

	private String repeatEndBy;

	private String repeatType;

	private String startDate;

	private Time startTime;

	private String timeOff;

	private String title;

	private String eventType;
	
	// bi-directional many-to-one association to CalendarHasEvent
	private List<CalendarHasEventDTO> calendarHasEvents;

	// bi-directional many-to-one association to EventRepeatsOn
	private List<EventRepeatsOnDTO> eventRepeatsOns;

	// bi-directional many-to-one association to EventsHasAttachment
	private List<EventsHasAttachmentDTO> eventsHasAttachments;

	// bi-directional many-to-one association to JobHasEvent
	private List<JobHasEventDTO> jobHasEvents;

	// bi-directional many-to-one association to ProjectUserHasEvent
	private List<ProjectUserHasEventDTO> projectUserHasEvents1;

	// bi-directional many-to-one association to ProjectUserHasEvent
	private List<ProjectUserHasEventDTO> projectUserHasEvents2;

	// bi-directional many-to-one association to ProposalHasEvent
	private List<ProposalHasEventDTO> proposalHasEvents;

	// bi-directional many-to-one association to UserTimeinTimeoff
	private List<UserTimeinTimeoffDTO> userTimeinTimeoffs;

	public EventDTO() {
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Time getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	public byte getIsAllDayEvent() {
		return this.isAllDayEvent;
	}

	public void setIsAllDayEvent(byte isAllDayEvent) {
		this.isAllDayEvent = isAllDayEvent;
	}

	public String getRepeatBy() {
		return this.repeatBy;
	}

	public void setRepeatBy(String repeatBy) {
		this.repeatBy = repeatBy;
	}

	public String getRepeatEndBy() {
		return repeatEndBy;
	}

	public void setRepeatEndBy(String repeatEndBy) {
		this.repeatEndBy = repeatEndBy;
	}

	public String getRepeatType() {
		return this.repeatType;
	}

	public void setRepeatType(String repeatType) {
		this.repeatType = repeatType;
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public Time getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public String getTimeOff() {
		return this.timeOff;
	}

	public void setTimeOff(String timeOff) {
		this.timeOff = timeOff;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<CalendarHasEventDTO> getCalendarHasEvents() {
		return this.calendarHasEvents;
	}

	public void setCalendarHasEvents(List<CalendarHasEventDTO> calendarHasEvents) {
		this.calendarHasEvents = calendarHasEvents;
	}

	public CalendarHasEventDTO addCalendarHasEvent(CalendarHasEventDTO calendarHasEvent) {
		getCalendarHasEvents().add(calendarHasEvent);
		calendarHasEvent.setEvent(this);

		return calendarHasEvent;
	}

	public CalendarHasEventDTO removeCalendarHasEvent(CalendarHasEventDTO calendarHasEvent) {
		getCalendarHasEvents().remove(calendarHasEvent);
		calendarHasEvent.setEvent(null);

		return calendarHasEvent;
	}

	public List<EventRepeatsOnDTO> getEventRepeatsOns() {
		return this.eventRepeatsOns;
	}

	public void setEventRepeatsOns(List<EventRepeatsOnDTO> eventRepeatsOns) {
		this.eventRepeatsOns = eventRepeatsOns;
	}

	public EventRepeatsOnDTO addEventRepeatsOn(EventRepeatsOnDTO eventRepeatsOn) {
		getEventRepeatsOns().add(eventRepeatsOn);
		eventRepeatsOn.setEvent(this);

		return eventRepeatsOn;
	}

	public EventRepeatsOnDTO removeEventRepeatsOn(EventRepeatsOnDTO eventRepeatsOn) {
		getEventRepeatsOns().remove(eventRepeatsOn);
		eventRepeatsOn.setEvent(null);

		return eventRepeatsOn;
	}

	public List<EventsHasAttachmentDTO> getEventsHasAttachments() {
		return this.eventsHasAttachments;
	}

	public void setEventsHasAttachments(List<EventsHasAttachmentDTO> eventsHasAttachments) {
		this.eventsHasAttachments = eventsHasAttachments;
	}

	public EventsHasAttachmentDTO addEventsHasAttachment(EventsHasAttachmentDTO eventsHasAttachment) {
		getEventsHasAttachments().add(eventsHasAttachment);
		eventsHasAttachment.setEvent(this);

		return eventsHasAttachment;
	}

	public EventsHasAttachmentDTO removeEventsHasAttachment(EventsHasAttachmentDTO eventsHasAttachment) {
		getEventsHasAttachments().remove(eventsHasAttachment);
		eventsHasAttachment.setEvent(null);

		return eventsHasAttachment;
	}

	public List<JobHasEventDTO> getJobHasEvents() {
		return this.jobHasEvents;
	}

	public void setJobHasEvents(List<JobHasEventDTO> jobHasEvents) {
		this.jobHasEvents = jobHasEvents;
	}

	public JobHasEventDTO addJobHasEvent(JobHasEventDTO jobHasEvent) {
		getJobHasEvents().add(jobHasEvent);
		jobHasEvent.setEvent(this);

		return jobHasEvent;
	}

	public JobHasEventDTO removeJobHasEvent(JobHasEventDTO jobHasEvent) {
		getJobHasEvents().remove(jobHasEvent);
		jobHasEvent.setEvent(null);

		return jobHasEvent;
	}

	public List<ProjectUserHasEventDTO> getProjectUserHasEvents1() {
		return this.projectUserHasEvents1;
	}

	public void setProjectUserHasEvents1(List<ProjectUserHasEventDTO> projectUserHasEvents1) {
		this.projectUserHasEvents1 = projectUserHasEvents1;
	}

	public ProjectUserHasEventDTO addProjectUserHasEvents1(ProjectUserHasEventDTO projectUserHasEvents1) {
		getProjectUserHasEvents1().add(projectUserHasEvents1);
		projectUserHasEvents1.setEvent1(this);

		return projectUserHasEvents1;
	}

	public ProjectUserHasEventDTO removeProjectUserHasEvents1(ProjectUserHasEventDTO projectUserHasEvents1) {
		getProjectUserHasEvents1().remove(projectUserHasEvents1);
		projectUserHasEvents1.setEvent1(null);

		return projectUserHasEvents1;
	}

	public List<ProjectUserHasEventDTO> getProjectUserHasEvents2() {
		return this.projectUserHasEvents2;
	}

	public void setProjectUserHasEvents2(List<ProjectUserHasEventDTO> projectUserHasEvents2) {
		this.projectUserHasEvents2 = projectUserHasEvents2;
	}

	public ProjectUserHasEventDTO addProjectUserHasEvents2(ProjectUserHasEventDTO projectUserHasEvents2) {
		getProjectUserHasEvents2().add(projectUserHasEvents2);
		projectUserHasEvents2.setEvent2(this);

		return projectUserHasEvents2;
	}

	public ProjectUserHasEventDTO removeProjectUserHasEvents2(ProjectUserHasEventDTO projectUserHasEvents2) {
		getProjectUserHasEvents2().remove(projectUserHasEvents2);
		projectUserHasEvents2.setEvent2(null);

		return projectUserHasEvents2;
	}

	public List<ProposalHasEventDTO> getProposalHasEvents() {
		return this.proposalHasEvents;
	}

	public void setProposalHasEvents(List<ProposalHasEventDTO> proposalHasEvents) {
		this.proposalHasEvents = proposalHasEvents;
	}

	public ProposalHasEventDTO addProposalHasEvent(ProposalHasEventDTO proposalHasEvent) {
		getProposalHasEvents().add(proposalHasEvent);
		proposalHasEvent.setEvent(this);

		return proposalHasEvent;
	}

	public ProposalHasEventDTO removeProposalHasEvent(ProposalHasEventDTO proposalHasEvent) {
		getProposalHasEvents().remove(proposalHasEvent);
		proposalHasEvent.setEvent(null);

		return proposalHasEvent;
	}

	public List<UserTimeinTimeoffDTO> getUserTimeinTimeoffs() {
		return this.userTimeinTimeoffs;
	}

	public void setUserTimeinTimeoffs(List<UserTimeinTimeoffDTO> userTimeinTimeoffs) {
		this.userTimeinTimeoffs = userTimeinTimeoffs;
	}

	public UserTimeinTimeoffDTO addUserTimeinTimeoff(UserTimeinTimeoffDTO userTimeinTimeoff) {
		getUserTimeinTimeoffs().add(userTimeinTimeoff);
		userTimeinTimeoff.setEvent(this);

		return userTimeinTimeoff;
	}

	public UserTimeinTimeoffDTO removeUserTimeinTimeoff(UserTimeinTimeoffDTO userTimeinTimeoff) {
		getUserTimeinTimeoffs().remove(userTimeinTimeoff);
		userTimeinTimeoff.setEvent(null);

		return userTimeinTimeoff;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	@Override
	public String toString() {
		return "EventDTO [description=" + description + ", endDate=" + endDate
				+ ", endTime=" + endTime + ", isAllDayEvent=" + isAllDayEvent
				+ ", repeatBy=" + repeatBy + ", repeatEndBy=" + repeatEndBy
				+ ", repeatType=" + repeatType + ", startDate=" + startDate
				+ ", startTime=" + startTime + ", timeOff=" + timeOff
				+ ", title=" + title + ", eventType=" + eventType
				+ ", calendarHasEvents=" + calendarHasEvents
				+ ", eventRepeatsOns=" + eventRepeatsOns
				+ ", eventsHasAttachments=" + eventsHasAttachments
				+ ", jobHasEvents=" + jobHasEvents + ", projectUserHasEvents1="
				+ projectUserHasEvents1 + ", projectUserHasEvents2="
				+ projectUserHasEvents2 + ", proposalHasEvents="
				+ proposalHasEvents + ", userTimeinTimeoffs="
				+ userTimeinTimeoffs + "]";
	}
   
}