package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the calendar_has_events database table.
 *
 */
@Entity
@Table(name="calendar_has_events")
public class CalendarHasEvent extends AbsBaseEntity {
    private static final long serialVersionUID = 1L;

    @Column(name="status_type")
    private String statusType;

    //bi-directional many-to-one association to Calendar
    /*@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "calendar_id", referencedColumnName = "id")
    private Calendar calendar;*/

    //bi-directional many-to-one association to Event
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="events_id", referencedColumnName = "id")
    private Event event;

    public CalendarHasEvent() {
    }

    public String getStatusType() {
        return this.statusType;
    }

    public void setStatusType(String statusType) {
        this.statusType = statusType;
    }

    /*public Calendar getCalendar() {
        return this.calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }*/

    public Event getEvent() {
        return this.event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

}