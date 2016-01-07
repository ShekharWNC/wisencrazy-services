package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * The persistent class for the event_repeats_on database table.
 *
 */
@Entity
@Table(name="event_repeats_on")
public class EventRepeatsOn extends AbsBaseEntity {
    private static final long serialVersionUID = 1L;

    @Column(name="repeat_on")
    private String repeatsOn;

    //bi-directional many-to-one association to Event
    /*@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="events_id", referencedColumnName = "id")
    private Event event;*/

    public EventRepeatsOn() {
    }

    public String getRepeatsOn() {
        return this.repeatsOn;
    }

    public void setRepeatsOn(String repeatsOn) {
        this.repeatsOn = repeatsOn;
    }

    /*public Event getEvent() {
        return this.event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }*/

}