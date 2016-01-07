package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the events database table.
 *
 */
@Entity
@Table(name="events")
public class Event extends AbsBaseEntity {
    private static final long serialVersionUID = 1L;

    private String description;

//  @Temporal(TemporalType.DATE)
    @Column(name="end_date")
    private Timestamp endDate;

    @Column(name="end_time")
    private Time endTime;

    @Column(name="event_type")
    private String eventType;

    @Column(name="is_all_day_event")
    private boolean isAllDayEvent;

    @Column(name="repeat_by")
    private String repeatBy;

//    @Temporal(TemporalType.DATE)
    @Column(name="repeat_endby")
    private Timestamp repeatEndBy;

    @Column(name="repeat_type")
    private String repeatType;

//    @Temporal(TemporalType.DATE)
    @Column(name="start_date")
    private Timestamp startDate;

    @Column(name="start_time")
    private Time startTime;

    @Column(name="time_off")
    private String timeOff;

    private String title;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="events_id", referencedColumnName = "id")
    private List<EventRepeatsOn> eventRepeatsOns;
    
    //bi-directional many-to-one association to CalendarHasEvent
    /*@OneToMany(mappedBy="event")
     private List<CalendarHasEvent> calendarHasEvents;

     //bi-directional many-to-one association to EventsHasAttachment
     @OneToMany(mappedBy="event")
     private List<EventsHasAttachment> eventsHasAttachments;

     //bi-directional many-to-one association to JobHasEvent
     @OneToMany(mappedBy="event")
     private List<JobHasEvent> jobHasEvents;

     //bi-directional many-to-one association to ProjectUserHasEvent
     @OneToMany(mappedBy="event1")
     private List<ProjectUserHasEvent> projectUserHasEvents1;

     //bi-directional many-to-one association to ProjectUserHasEvent
     @OneToMany(mappedBy="event2")
     private List<ProjectUserHasEvent> projectUserHasEvents2;

     //bi-directional many-to-one association to ProposalHasEvent
     @OneToMany(mappedBy="event")
     private List<ProposalHasEvent> proposalHasEvents;

     //bi-directional many-to-one association to UserTimeinTimeoff
     @OneToMany(mappedBy="event")
     private List<UserTimeinTimeoff> userTimeinTimeoffs;*/

    public Event() {
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public Time getEndTime() {
        return this.endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public String getEventType() {
        return this.eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public boolean getIsAllDayEvent() {
        return this.isAllDayEvent;
    }

    public void setIsAllDayEvent(boolean isAllDayEvent) {
        this.isAllDayEvent = isAllDayEvent;
    }

    public String getRepeatBy() {
        return this.repeatBy;
    }

    public void setRepeatBy(String repeatBy) {
        this.repeatBy = repeatBy;
    }

    public Timestamp getRepeatEndBy() {
		return repeatEndBy;
	}

	public void setRepeatEndBy(Timestamp repeatEndBy) {
		this.repeatEndBy = repeatEndBy;
	}

	public void setAllDayEvent(boolean isAllDayEvent) {
		this.isAllDayEvent = isAllDayEvent;
	}

	public String getRepeatType() {
        return this.repeatType;
    }

    public void setRepeatType(String repeatType) {
        this.repeatType = repeatType;
    }

    public Timestamp getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Timestamp startDate) {
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
    
    public List<EventRepeatsOn> getEventRepeatsOns() {
        return this.eventRepeatsOns;
    }

    public void setEventRepeatsOns(List<EventRepeatsOn> eventRepeatsOns) {
        this.eventRepeatsOns = eventRepeatsOns;
    }

    /*public List<CalendarHasEvent> getCalendarHasEvents() {
         return this.calendarHasEvents;
     }

     public void setCalendarHasEvents(List<CalendarHasEvent> calendarHasEvents) {
         this.calendarHasEvents = calendarHasEvents;
     }

     public CalendarHasEvent addCalendarHasEvent(CalendarHasEvent calendarHasEvent) {
         getCalendarHasEvents().add(calendarHasEvent);
         calendarHasEvent.setEvent(this);

         return calendarHasEvent;
     }

     public CalendarHasEvent removeCalendarHasEvent(CalendarHasEvent calendarHasEvent) {
         getCalendarHasEvents().remove(calendarHasEvent);
         calendarHasEvent.setEvent(null);

         return calendarHasEvent;
     }

     public EventRepeatsOn addEventRepeatsOn(EventRepeatsOn eventRepeatsOn) {
         getEventRepeatsOns().add(eventRepeatsOn);
         eventRepeatsOn.setEvent(this);

         return eventRepeatsOn;
     }

     public EventRepeatsOn removeEventRepeatsOn(EventRepeatsOn eventRepeatsOn) {
         getEventRepeatsOns().remove(eventRepeatsOn);
         eventRepeatsOn.setEvent(null);

         return eventRepeatsOn;
     }

     public List<EventsHasAttachment> getEventsHasAttachments() {
         return this.eventsHasAttachments;
     }

     public void setEventsHasAttachments(List<EventsHasAttachment> eventsHasAttachments) {
         this.eventsHasAttachments = eventsHasAttachments;
     }

     public EventsHasAttachment addEventsHasAttachment(EventsHasAttachment eventsHasAttachment) {
         getEventsHasAttachments().add(eventsHasAttachment);
         eventsHasAttachment.setEvent(this);

         return eventsHasAttachment;
     }

     public EventsHasAttachment removeEventsHasAttachment(EventsHasAttachment eventsHasAttachment) {
         getEventsHasAttachments().remove(eventsHasAttachment);
         eventsHasAttachment.setEvent(null);

         return eventsHasAttachment;
     }

     public List<JobHasEvent> getJobHasEvents() {
         return this.jobHasEvents;
     }

     public void setJobHasEvents(List<JobHasEvent> jobHasEvents) {
         this.jobHasEvents = jobHasEvents;
     }

     public JobHasEvent addJobHasEvent(JobHasEvent jobHasEvent) {
         getJobHasEvents().add(jobHasEvent);
         jobHasEvent.setEvent(this);

         return jobHasEvent;
     }

     public JobHasEvent removeJobHasEvent(JobHasEvent jobHasEvent) {
         getJobHasEvents().remove(jobHasEvent);
         jobHasEvent.setEvent(null);

         return jobHasEvent;
     }

     public List<ProjectUserHasEvent> getProjectUserHasEvents1() {
         return this.projectUserHasEvents1;
     }

     public void setProjectUserHasEvents1(List<ProjectUserHasEvent> projectUserHasEvents1) {
         this.projectUserHasEvents1 = projectUserHasEvents1;
     }

     public ProjectUserHasEvent addProjectUserHasEvents1(ProjectUserHasEvent projectUserHasEvents1) {
         getProjectUserHasEvents1().add(projectUserHasEvents1);
         projectUserHasEvents1.setEvent1(this);

         return projectUserHasEvents1;
     }

     public ProjectUserHasEvent removeProjectUserHasEvents1(ProjectUserHasEvent projectUserHasEvents1) {
         getProjectUserHasEvents1().remove(projectUserHasEvents1);
         projectUserHasEvents1.setEvent1(null);

         return projectUserHasEvents1;
     }

     public List<ProjectUserHasEvent> getProjectUserHasEvents2() {
         return this.projectUserHasEvents2;
     }

     public void setProjectUserHasEvents2(List<ProjectUserHasEvent> projectUserHasEvents2) {
         this.projectUserHasEvents2 = projectUserHasEvents2;
     }

     public ProjectUserHasEvent addProjectUserHasEvents2(ProjectUserHasEvent projectUserHasEvents2) {
         getProjectUserHasEvents2().add(projectUserHasEvents2);
         projectUserHasEvents2.setEvent2(this);

         return projectUserHasEvents2;
     }

     public ProjectUserHasEvent removeProjectUserHasEvents2(ProjectUserHasEvent projectUserHasEvents2) {
         getProjectUserHasEvents2().remove(projectUserHasEvents2);
         projectUserHasEvents2.setEvent2(null);

         return projectUserHasEvents2;
     }

     public List<ProposalHasEvent> getProposalHasEvents() {
         return this.proposalHasEvents;
     }

     public void setProposalHasEvents(List<ProposalHasEvent> proposalHasEvents) {
         this.proposalHasEvents = proposalHasEvents;
     }

     public ProposalHasEvent addProposalHasEvent(ProposalHasEvent proposalHasEvent) {
         getProposalHasEvents().add(proposalHasEvent);
         proposalHasEvent.setEvent(this);

         return proposalHasEvent;
     }

     public ProposalHasEvent removeProposalHasEvent(ProposalHasEvent proposalHasEvent) {
         getProposalHasEvents().remove(proposalHasEvent);
         proposalHasEvent.setEvent(null);

         return proposalHasEvent;
     }

     public List<UserTimeinTimeoff> getUserTimeinTimeoffs() {
         return this.userTimeinTimeoffs;
     }

     public void setUserTimeinTimeoffs(List<UserTimeinTimeoff> userTimeinTimeoffs) {
         this.userTimeinTimeoffs = userTimeinTimeoffs;
     }

     public UserTimeinTimeoff addUserTimeinTimeoff(UserTimeinTimeoff userTimeinTimeoff) {
         getUserTimeinTimeoffs().add(userTimeinTimeoff);
         userTimeinTimeoff.setEvent(this);

         return userTimeinTimeoff;
     }

     public UserTimeinTimeoff removeUserTimeinTimeoff(UserTimeinTimeoff userTimeinTimeoff) {
         getUserTimeinTimeoffs().remove(userTimeinTimeoff);
         userTimeinTimeoff.setEvent(null);

         return userTimeinTimeoff;
     }*/

}