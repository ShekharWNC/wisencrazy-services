package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the calendar_has_properties database table.
 *
 */
@Entity
@Table(name="calendar_has_properties")
public class CalendarHasProperty extends AbsBaseEntity {
    private static final long serialVersionUID = 1L;

    //bi-directional many-to-one association to Calendar
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "calendar_id", referencedColumnName = "id")
    private Calendar calendar;

    //bi-directional many-to-one association to Property
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="properties_id", referencedColumnName = "id")
    private Property property;

    public CalendarHasProperty() {
    }

    public Calendar getCalendar() {
        return this.calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public Property getProperty() {
        return this.property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

}