package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the job_has_calendar database table.
 *
 */
@Entity
@Table(name="job_has_calendar")
public class JobHasCalendar extends AbsBaseEntity {
    private static final long serialVersionUID = 1L;

    //bi-directional many-to-one association to Calendar
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "calendar_id", referencedColumnName = "id")
    private Calendar calendar;

    //bi-directional many-to-one association to Job
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="job_id", referencedColumnName = "id")
    private Job job;

    public JobHasCalendar() {
    }

    public Calendar getCalendar() {
        return this.calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public Job getJob() {
        return this.job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

}