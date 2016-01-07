package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the job_audit_log database table.
 *
 */
@Entity
@Table(name="job_audit_log")
public class JobAuditLog implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    //bi-directional many-to-one association to AuditLog
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="audit_log_id", referencedColumnName = "id")
    private AuditLog auditLog;

    //bi-directional many-to-one association to Job
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "job_id", referencedColumnName = "id")
    private Job job;

    public JobAuditLog() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AuditLog getAuditLog() {
        return this.auditLog;
    }

    public void setAuditLog(AuditLog auditLog) {
        this.auditLog = auditLog;
    }

    public Job getJob() {
        return this.job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

}