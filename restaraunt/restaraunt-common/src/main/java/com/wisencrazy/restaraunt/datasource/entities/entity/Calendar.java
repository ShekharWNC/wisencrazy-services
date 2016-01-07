package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the calendar database table.
 *
 */
@Entity
@Table(name="calendar")
public class Calendar extends AbsBaseEntity {
    private static final long serialVersionUID = 1L;

    @Column(name="calendar_name")
    private String calendarName;

    //bi-directional many-to-one association to CalendarHasEvent
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "calendar_id")
    private List<CalendarHasEvent> calendarHasEvents;

    /* //bi-directional many-to-one association to CalendarHasPermission
     @OneToMany(mappedBy="calendar")
     private List<CalendarHasPermission> calendarHasPermissions;

     //bi-directional many-to-one association to CalendarHasProperty
     @OneToMany(mappedBy="calendar")
     private List<CalendarHasProperty> calendarHasProperties;

     //bi-directional many-to-one association to JobHasCalendar
     @OneToMany(mappedBy="calendar")
     private List<JobHasCalendar> jobHasCalendars;

     //bi-directional many-to-one association to ProjectHasCalendar
     @OneToMany(mappedBy="calendar")
     private List<ProjectHasCalendar> projectHasCalendars;

     //bi-directional many-to-one association to UserHasCalendar
     @OneToMany(mappedBy="calendar")
     private List<UserHasCalendar> userHasCalendars;*/

    public Calendar() {
    }

    public String getCalendarName() {
        return this.calendarName;
    }

    public void setCalendarName(String calendarName) {
        this.calendarName = calendarName;
    }

    public List<CalendarHasEvent> getCalendarHasEvents() {
         return this.calendarHasEvents;
     }

     public void setCalendarHasEvents(List<CalendarHasEvent> calendarHasEvents) {
         this.calendarHasEvents = calendarHasEvents;
     }

     /*public CalendarHasEvent addCalendarHasEvent(CalendarHasEvent calendarHasEvent) {
         getCalendarHasEvents().add(calendarHasEvent);
         calendarHasEvent.setCalendar(this);

         return calendarHasEvent;
     }

     public CalendarHasEvent removeCalendarHasEvent(CalendarHasEvent calendarHasEvent) {
         getCalendarHasEvents().remove(calendarHasEvent);
         calendarHasEvent.setCalendar(null);

         return calendarHasEvent;
     }

     public List<CalendarHasPermission> getCalendarHasPermissions() {
         return this.calendarHasPermissions;
     }

     public void setCalendarHasPermissions(List<CalendarHasPermission> calendarHasPermissions) {
         this.calendarHasPermissions = calendarHasPermissions;
     }

     public CalendarHasPermission addCalendarHasPermission(CalendarHasPermission calendarHasPermission) {
         getCalendarHasPermissions().add(calendarHasPermission);
         calendarHasPermission.setCalendar(this);

         return calendarHasPermission;
     }

     public CalendarHasPermission removeCalendarHasPermission(CalendarHasPermission calendarHasPermission) {
         getCalendarHasPermissions().remove(calendarHasPermission);
         calendarHasPermission.setCalendar(null);

         return calendarHasPermission;
     }

     public List<CalendarHasProperty> getCalendarHasProperties() {
         return this.calendarHasProperties;
     }

     public void setCalendarHasProperties(List<CalendarHasProperty> calendarHasProperties) {
         this.calendarHasProperties = calendarHasProperties;
     }

     public CalendarHasProperty addCalendarHasProperty(CalendarHasProperty calendarHasProperty) {
         getCalendarHasProperties().add(calendarHasProperty);
         calendarHasProperty.setCalendar(this);

         return calendarHasProperty;
     }

     public CalendarHasProperty removeCalendarHasProperty(CalendarHasProperty calendarHasProperty) {
         getCalendarHasProperties().remove(calendarHasProperty);
         calendarHasProperty.setCalendar(null);

         return calendarHasProperty;
     }

     public List<JobHasCalendar> getJobHasCalendars() {
         return this.jobHasCalendars;
     }

     public void setJobHasCalendars(List<JobHasCalendar> jobHasCalendars) {
         this.jobHasCalendars = jobHasCalendars;
     }

     public JobHasCalendar addJobHasCalendar(JobHasCalendar jobHasCalendar) {
         getJobHasCalendars().add(jobHasCalendar);
         jobHasCalendar.setCalendar(this);

         return jobHasCalendar;
     }

     public JobHasCalendar removeJobHasCalendar(JobHasCalendar jobHasCalendar) {
         getJobHasCalendars().remove(jobHasCalendar);
         jobHasCalendar.setCalendar(null);

         return jobHasCalendar;
     }

     public List<ProjectHasCalendar> getProjectHasCalendars() {
         return this.projectHasCalendars;
     }

     public void setProjectHasCalendars(List<ProjectHasCalendar> projectHasCalendars) {
         this.projectHasCalendars = projectHasCalendars;
     }

     public ProjectHasCalendar addProjectHasCalendar(ProjectHasCalendar projectHasCalendar) {
         getProjectHasCalendars().add(projectHasCalendar);
         projectHasCalendar.setCalendar(this);

         return projectHasCalendar;
     }

     public ProjectHasCalendar removeProjectHasCalendar(ProjectHasCalendar projectHasCalendar) {
         getProjectHasCalendars().remove(projectHasCalendar);
         projectHasCalendar.setCalendar(null);

         return projectHasCalendar;
     }

     public List<UserHasCalendar> getUserHasCalendars() {
         return this.userHasCalendars;
     }

     public void setUserHasCalendars(List<UserHasCalendar> userHasCalendars) {
         this.userHasCalendars = userHasCalendars;
     }

     public UserHasCalendar addUserHasCalendar(UserHasCalendar userHasCalendar) {
         getUserHasCalendars().add(userHasCalendar);
         userHasCalendar.setCalendar(this);

         return userHasCalendar;
     }

     public UserHasCalendar removeUserHasCalendar(UserHasCalendar userHasCalendar) {
         getUserHasCalendars().remove(userHasCalendar);
         userHasCalendar.setCalendar(null);

         return userHasCalendar;
     }*/

}