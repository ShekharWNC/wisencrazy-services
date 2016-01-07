package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the audit_log database table.
 *
 */
@Entity
@Table(name="audit_log")
public class AuditLog implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String description;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="updated_date")
    private Date updatedDate;

    //bi-directional many-to-one association to ActionTag
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="action_tag_id", referencedColumnName = "id")
    private ActionTag actionTag;

    //bi-directional many-to-one association to Appuser
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="updated_by", referencedColumnName = "id")
    private Appuser appuser;

    //bi-directional many-to-one association to Component
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "component_id", referencedColumnName = "id")
    private Component component;

    //bi-directional many-to-one association to JobAuditLog
    /*@OneToMany(mappedBy="auditLog")
     private List<JobAuditLog> jobAuditLogs;

     //bi-directional many-to-one association to JobProposalAuditLog
     @OneToMany(mappedBy="auditLog")
     private List<JobProposalAuditLog> jobProposalAuditLogs;

     //bi-directional many-to-one association to ProjectAuditLog
     @OneToMany(mappedBy="auditLog")
     private List<ProjectAuditLog> projectAuditLogs;*/

    public AuditLog() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getUpdatedDate() {
        return this.updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public ActionTag getActionTag() {
        return this.actionTag;
    }

    public void setActionTag(ActionTag actionTag) {
        this.actionTag = actionTag;
    }

    public Appuser getAppuser() {
        return this.appuser;
    }

    public void setAppuser(Appuser appuser) {
        this.appuser = appuser;
    }

    public Component getComponent() {
        return this.component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    /*public List<JobAuditLog> getJobAuditLogs() {
         return this.jobAuditLogs;
     }

     public void setJobAuditLogs(List<JobAuditLog> jobAuditLogs) {
         this.jobAuditLogs = jobAuditLogs;
     }

     public JobAuditLog addJobAuditLog(JobAuditLog jobAuditLog) {
         getJobAuditLogs().add(jobAuditLog);
         jobAuditLog.setAuditLog(this);

         return jobAuditLog;
     }

     public JobAuditLog removeJobAuditLog(JobAuditLog jobAuditLog) {
         getJobAuditLogs().remove(jobAuditLog);
         jobAuditLog.setAuditLog(null);

         return jobAuditLog;
     }

     public List<JobProposalAuditLog> getJobProposalAuditLogs() {
         return this.jobProposalAuditLogs;
     }

     public void setJobProposalAuditLogs(List<JobProposalAuditLog> jobProposalAuditLogs) {
         this.jobProposalAuditLogs = jobProposalAuditLogs;
     }

     public JobProposalAuditLog addJobProposalAuditLog(JobProposalAuditLog jobProposalAuditLog) {
         getJobProposalAuditLogs().add(jobProposalAuditLog);
         jobProposalAuditLog.setAuditLog(this);

         return jobProposalAuditLog;
     }

     public JobProposalAuditLog removeJobProposalAuditLog(JobProposalAuditLog jobProposalAuditLog) {
         getJobProposalAuditLogs().remove(jobProposalAuditLog);
         jobProposalAuditLog.setAuditLog(null);

         return jobProposalAuditLog;
     }

     public List<ProjectAuditLog> getProjectAuditLogs() {
         return this.projectAuditLogs;
     }

     public void setProjectAuditLogs(List<ProjectAuditLog> projectAuditLogs) {
         this.projectAuditLogs = projectAuditLogs;
     }

     public ProjectAuditLog addProjectAuditLog(ProjectAuditLog projectAuditLog) {
         getProjectAuditLogs().add(projectAuditLog);
         projectAuditLog.setAuditLog(this);

         return projectAuditLog;
     }

     public ProjectAuditLog removeProjectAuditLog(ProjectAuditLog projectAuditLog) {
         getProjectAuditLogs().remove(projectAuditLog);
         projectAuditLog.setAuditLog(null);

         return projectAuditLog;
     }*/

}