package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the job database table.
 *
 */
@Entity
@Table(name="job")
public class Job extends AbsBaseEntity {
    private static final long serialVersionUID = 1L;

    private float budget;

    @Column(name="city_id")
    private int cityId;

    private String description;

    @Column(name="end_date")
    private Timestamp endDate;

    @Column(name="job_posted_on")
    private Timestamp jobPostedOn;

    @Column(name="job_status")
    private String jobStatus;

    @Column(name="job_type")
    private String jobType;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="proposal_submission_end_date")
    private Date proposalSubmissionEndDate;

    @Column(name="save_as_template")
    private String saveAsTemplate;

    @Column(name="start_date")
    private Timestamp startDate;

    private String title;

    //bi-directional many-to-one association to Appuser
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="user_id", referencedColumnName = "id")
    private Appuser appuser;

    //bi-directional many-to-one association to Company
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    private Company company;

    //bi-directional many-to-one association to Country
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "country_id", referencedColumnName = "id")
    private Country country;

    //bi-directional many-to-one association to Project
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "project_id", referencedColumnName = "id")
    private Project project;

    //bi-directional many-to-one association to State
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "state_id", referencedColumnName = "id")
    private State state;

    //bi-directional many-to-one association to JobAuditLog
    /*@OneToMany(mappedBy="job")
     private List<JobAuditLog> jobAuditLogs;

     //bi-directional many-to-one association to JobHasCalendar
     @OneToMany(mappedBy="job")
     private List<JobHasCalendar> jobHasCalendars;

     //bi-directional many-to-one association to JobHasEvent
     @OneToMany(mappedBy="job")
     private List<JobHasEvent> jobHasEvents;

     //bi-directional many-to-one association to JobHasProposal
     @OneToMany(mappedBy="job")
     private List<JobHasProposal> jobHasProposals;

     //bi-directional many-to-one association to JobHasSkill
     @OneToMany(mappedBy="job")
     private List<JobHasSkill> jobHasSkills;*/

    //bi-directional one-to-one association to JobInactiveReason
    @OneToOne
    @PrimaryKeyJoinColumn
    private JobInactiveReason jobInactiveReason;

    //bi-directional many-to-one association to JobProposalAuditLog
    /*@OneToMany(mappedBy="job")
     private List<JobProposalAuditLog> jobProposalAuditLogs;

     //bi-directional many-to-one association to PrivateJobHasProvider
     @OneToMany(mappedBy="job")
     private List<PrivateJobHasProvider> privateJobHasProviders;*/

    public Job() {
    }

    public float getBudget() {
        return this.budget;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }

    public int getCityId() {
        return this.cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
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

    public Timestamp getJobPostedOn() {
        return this.jobPostedOn;
    }

    public void setJobPostedOn(Timestamp jobPostedOn) {
        this.jobPostedOn = jobPostedOn;
    }

    public String getJobStatus() {
        return this.jobStatus;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    public String getJobType() {
        return this.jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public Date getProposalSubmissionEndDate() {
        return this.proposalSubmissionEndDate;
    }

    public void setProposalSubmissionEndDate(Date proposalSubmissionEndDate) {
        this.proposalSubmissionEndDate = proposalSubmissionEndDate;
    }

    public String getSaveAsTemplate() {
        return this.saveAsTemplate;
    }

    public void setSaveAsTemplate(String saveAsTemplate) {
        this.saveAsTemplate = saveAsTemplate;
    }

    public Timestamp getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Appuser getAppuser() {
        return this.appuser;
    }

    public void setAppuser(Appuser appuser) {
        this.appuser = appuser;
    }

    public Company getCompany() {
        return this.company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Country getCountry() {
        return this.country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Project getProject() {
        return this.project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }

    /*public List<JobAuditLog> getJobAuditLogs() {
         return this.jobAuditLogs;
     }

     public void setJobAuditLogs(List<JobAuditLog> jobAuditLogs) {
         this.jobAuditLogs = jobAuditLogs;
     }

     public JobAuditLog addJobAuditLog(JobAuditLog jobAuditLog) {
         getJobAuditLogs().add(jobAuditLog);
         jobAuditLog.setJob(this);

         return jobAuditLog;
     }

     public JobAuditLog removeJobAuditLog(JobAuditLog jobAuditLog) {
         getJobAuditLogs().remove(jobAuditLog);
         jobAuditLog.setJob(null);

         return jobAuditLog;
     }

     public List<JobHasCalendar> getJobHasCalendars() {
         return this.jobHasCalendars;
     }

     public void setJobHasCalendars(List<JobHasCalendar> jobHasCalendars) {
         this.jobHasCalendars = jobHasCalendars;
     }

     public JobHasCalendar addJobHasCalendar(JobHasCalendar jobHasCalendar) {
         getJobHasCalendars().add(jobHasCalendar);
         jobHasCalendar.setJob(this);

         return jobHasCalendar;
     }

     public JobHasCalendar removeJobHasCalendar(JobHasCalendar jobHasCalendar) {
         getJobHasCalendars().remove(jobHasCalendar);
         jobHasCalendar.setJob(null);

         return jobHasCalendar;
     }

     public List<JobHasEvent> getJobHasEvents() {
         return this.jobHasEvents;
     }

     public void setJobHasEvents(List<JobHasEvent> jobHasEvents) {
         this.jobHasEvents = jobHasEvents;
     }

     public JobHasEvent addJobHasEvent(JobHasEvent jobHasEvent) {
         getJobHasEvents().add(jobHasEvent);
         jobHasEvent.setJob(this);

         return jobHasEvent;
     }

     public JobHasEvent removeJobHasEvent(JobHasEvent jobHasEvent) {
         getJobHasEvents().remove(jobHasEvent);
         jobHasEvent.setJob(null);

         return jobHasEvent;
     }

     public List<JobHasProposal> getJobHasProposals() {
         return this.jobHasProposals;
     }

     public void setJobHasProposals(List<JobHasProposal> jobHasProposals) {
         this.jobHasProposals = jobHasProposals;
     }

     public JobHasProposal addJobHasProposal(JobHasProposal jobHasProposal) {
         getJobHasProposals().add(jobHasProposal);
         jobHasProposal.setJob(this);

         return jobHasProposal;
     }

     public JobHasProposal removeJobHasProposal(JobHasProposal jobHasProposal) {
         getJobHasProposals().remove(jobHasProposal);
         jobHasProposal.setJob(null);

         return jobHasProposal;
     }

     public List<JobHasSkill> getJobHasSkills() {
         return this.jobHasSkills;
     }

     public void setJobHasSkills(List<JobHasSkill> jobHasSkills) {
         this.jobHasSkills = jobHasSkills;
     }

     public JobHasSkill addJobHasSkill(JobHasSkill jobHasSkill) {
         getJobHasSkills().add(jobHasSkill);
         jobHasSkill.setJob(this);

         return jobHasSkill;
     }

     public JobHasSkill removeJobHasSkill(JobHasSkill jobHasSkill) {
         getJobHasSkills().remove(jobHasSkill);
         jobHasSkill.setJob(null);

         return jobHasSkill;
     }*/

    public JobInactiveReason getJobInactiveReason() {
        return this.jobInactiveReason;
    }

    public void setJobInactiveReason(JobInactiveReason jobInactiveReason) {
        this.jobInactiveReason = jobInactiveReason;
    }

    /*public List<JobProposalAuditLog> getJobProposalAuditLogs() {
            return this.jobProposalAuditLogs;
        }

        public void setJobProposalAuditLogs(List<JobProposalAuditLog> jobProposalAuditLogs) {
            this.jobProposalAuditLogs = jobProposalAuditLogs;
        }

        public JobProposalAuditLog addJobProposalAuditLog(JobProposalAuditLog jobProposalAuditLog) {
            getJobProposalAuditLogs().add(jobProposalAuditLog);
            jobProposalAuditLog.setJob(this);

            return jobProposalAuditLog;
        }

        public JobProposalAuditLog removeJobProposalAuditLog(JobProposalAuditLog jobProposalAuditLog) {
            getJobProposalAuditLogs().remove(jobProposalAuditLog);
            jobProposalAuditLog.setJob(null);

            return jobProposalAuditLog;
        }

        public List<PrivateJobHasProvider> getPrivateJobHasProviders() {
            return this.privateJobHasProviders;
        }

        public void setPrivateJobHasProviders(List<PrivateJobHasProvider> privateJobHasProviders) {
            this.privateJobHasProviders = privateJobHasProviders;
        }

        public PrivateJobHasProvider addPrivateJobHasProvider(PrivateJobHasProvider privateJobHasProvider) {
            getPrivateJobHasProviders().add(privateJobHasProvider);
            privateJobHasProvider.setJob(this);

            return privateJobHasProvider;
        }

        public PrivateJobHasProvider removePrivateJobHasProvider(PrivateJobHasProvider privateJobHasProvider) {
            getPrivateJobHasProviders().remove(privateJobHasProvider);
            privateJobHasProvider.setJob(null);

            return privateJobHasProvider;
        }
    */
}