package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * The persistent class for the properties database table.
 *
 */
@Entity
@Table(name="properties")
public class Property extends AbsBaseEntity {
    private static final long serialVersionUID = 1L;

    private String colour;

    @Column(name="default_event_status")
    private String defaultEventStatus;

    @Column(name="week_start")
    private String weekStart;

    @Column(name="working_hours_end")
    private Time workingHoursEnd;

    @Column(name="working_hours_start")
    private Time workingHoursStart;

    //bi-directional many-to-one association to CalendarHasProperty
    /*@OneToMany(mappedBy="property")
     private List<CalendarHasProperty> calendarHasProperties;*/

    public Property() {
    }

    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getDefaultEventStatus() {
        return this.defaultEventStatus;
    }

    public void setDefaultEventStatus(String defaultEventStatus) {
        this.defaultEventStatus = defaultEventStatus;
    }

    public String getWeekStart() {
        return this.weekStart;
    }

    public void setWeekStart(String weekStart) {
        this.weekStart = weekStart;
    }

    public Time getWorkingHoursEnd() {
        return this.workingHoursEnd;
    }

    public void setWorkingHoursEnd(Time workingHoursEnd) {
        this.workingHoursEnd = workingHoursEnd;
    }

    public Time getWorkingHoursStart() {
        return this.workingHoursStart;
    }

    public void setWorkingHoursStart(Time workingHoursStart) {
        this.workingHoursStart = workingHoursStart;
    }

    /*public List<CalendarHasProperty> getCalendarHasProperties() {
         return this.calendarHasProperties;
     }

     public void setCalendarHasProperties(List<CalendarHasProperty> calendarHasProperties) {
         this.calendarHasProperties = calendarHasProperties;
     }

     public CalendarHasProperty addCalendarHasProperty(CalendarHasProperty calendarHasProperty) {
         getCalendarHasProperties().add(calendarHasProperty);
         calendarHasProperty.setProperty(this);

         return calendarHasProperty;
     }

     public CalendarHasProperty removeCalendarHasProperty(CalendarHasProperty calendarHasProperty) {
         getCalendarHasProperties().remove(calendarHasProperty);
         calendarHasProperty.setProperty(null);

         return calendarHasProperty;
     }*/

}