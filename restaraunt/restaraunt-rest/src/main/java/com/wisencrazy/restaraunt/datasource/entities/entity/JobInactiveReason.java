package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * The persistent class for the job_inactive_reasons database table.
 *
 */
@Entity
@Table(name="job_inactive_reasons")
public class JobInactiveReason extends AbsBaseEntity {
    private static final long serialVersionUID = 1L;

    @Column(name="inactive_decription")
    private String inactiveDecription;

    @Column(name="inactive_on")
    private Timestamp inactiveOn;

    //bi-directional one-to-one association to Job
    /*@OneToOne
     @JoinColumn(name="Job_id")
     private Job job;*/

    public JobInactiveReason() {
    }

    public String getInactiveDecription() {
        return this.inactiveDecription;
    }

    public void setInactiveDecription(String inactiveDecription) {
        this.inactiveDecription = inactiveDecription;
    }

    public Timestamp getInactiveOn() {
        return this.inactiveOn;
    }

    public void setInactiveOn(Timestamp inactiveOn) {
        this.inactiveOn = inactiveOn;
    }

    /*public Job getJob() {
         return this.job;
     }

     public void setJob(Job job) {
         this.job = job;
     }*/

}