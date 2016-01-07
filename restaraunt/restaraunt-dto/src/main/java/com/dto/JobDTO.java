package com.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * The persistent class for the job database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class JobDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;
    public static final String JOB_HIRING="HIRING";
    public static final String JOB_CLOSED="CLOSED";
    public static final String JOB_INACTIVE="INACTIVE";
    public static final String JOB_PRIVATE="PRIVATE";
    public static final String JOB_PUBLIC="PUBLIC";
    public static final String JOB_SAVED="SAVED";    
        

	private float budget;

	private String description;

	private Date endDate;

	private String jobType;

	private Date proposalSubmissionEndDate;

	private Date startDate;

	private String title;

	//bi-directional many-to-one association to Country
	private CountryDTO country;

    private String jobStatus;
     
    private int cityId;
        
	private Date jobPostedOn;
        
        private char saveAsTemplate;
        
	//bi-directional many-to-one association to State
	private StateDTO state;

	//bi-directional many-to-one association to Company
	private CompanyDTO company;

        //bi-directional many-to-one association to Project
	private ProjectDTO project;

	//bi-directional many-to-one association to User
	private AppuserDTO user;

	//bi-directional many-to-one association to JobAuditLog
	private List<JobAuditLogDTO> jobAuditLogs;

	//bi-directional many-to-one association to JobHasCalendar
	private List<JobHasCalendarDTO> jobHasCalendars;

	//bi-directional many-to-one association to JobHasEvent
	private List<JobHasEventDTO> jobHasEvents;

	//bi-directional many-to-one association to JobHasProposal
	private List<JobHasProposalDTO> jobHasProposals;

	//bi-directional many-to-one association to JobHasSkill
	private List<JobHasSkillDTO> jobHasSkills;

	//bi-directional many-to-one association to JobProposalAuditLog
	private List<JobProposalAuditLogDTO> jobProposalAuditLogs;

	//bi-directional many-to-one association to JobProposalAuditLog
	private List<PrivateJobHasProvidersDTO> privateJobHasProviders;

        private JobInactiveReasonsDTO jobInactiveReasons;

        public JobDTO() {
	}


	public float getBudget() {
		return this.budget;
	}

	public void setBudget(float budget) {
		this.budget = budget;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public CountryDTO getCountry() {
		return this.country;
	}

	public void setCountry(CountryDTO country) {
		this.country = country;
	}

	public ProjectDTO getProject() {
		return this.project;
	}

	public void setProject(ProjectDTO project) {
		this.project = project;
	}

	public AppuserDTO getUser() {
		return this.user;
	}

	public void setUser(AppuserDTO user) {
		this.user = user;
	}

	public List<JobAuditLogDTO> getJobAuditLogs() {
		return this.jobAuditLogs;
	}

	public void setJobAuditLogs(List<JobAuditLogDTO> jobAuditLogs) {
		this.jobAuditLogs = jobAuditLogs;
	}

	public JobAuditLogDTO addJobAuditLog(JobAuditLogDTO jobAuditLog) {
		getJobAuditLogs().add(jobAuditLog);
		jobAuditLog.setJob(this);

		return jobAuditLog;
	}

	public JobAuditLogDTO removeJobAuditLog(JobAuditLogDTO jobAuditLog) {
		getJobAuditLogs().remove(jobAuditLog);
		jobAuditLog.setJob(null);

		return jobAuditLog;
	}

	public List<JobHasCalendarDTO> getJobHasCalendars() {
		return this.jobHasCalendars;
	}

	public void setJobHasCalendars(List<JobHasCalendarDTO> jobHasCalendars) {
		this.jobHasCalendars = jobHasCalendars;
	}

	public JobHasCalendarDTO addJobHasCalendar(JobHasCalendarDTO jobHasCalendar) {
		getJobHasCalendars().add(jobHasCalendar);
		jobHasCalendar.setJob(this);

		return jobHasCalendar;
	}

	public JobHasCalendarDTO removeJobHasCalendar(JobHasCalendarDTO jobHasCalendar) {
		getJobHasCalendars().remove(jobHasCalendar);
		jobHasCalendar.setJob(null);

		return jobHasCalendar;
	}

	public List<JobHasEventDTO> getJobHasEvents() {
		return this.jobHasEvents;
	}

	public void setJobHasEvents(List<JobHasEventDTO> jobHasEvents) {
		this.jobHasEvents = jobHasEvents;
	}

	public JobHasEventDTO addJobHasEvent(JobHasEventDTO jobHasEvent) {
		getJobHasEvents().add(jobHasEvent);
		jobHasEvent.setJob(this);

		return jobHasEvent;
	}

	public JobHasEventDTO removeJobHasEvent(JobHasEventDTO jobHasEvent) {
		getJobHasEvents().remove(jobHasEvent);
		jobHasEvent.setJob(null);

		return jobHasEvent;
	}

	public List<JobHasProposalDTO> getJobHasProposals() {
		return this.jobHasProposals;
	}

	public void setJobHasProposals(List<JobHasProposalDTO> jobHasProposals) {
		this.jobHasProposals = jobHasProposals;
	}

	public JobHasProposalDTO addJobHasProposal(JobHasProposalDTO jobHasProposal) {
		getJobHasProposals().add(jobHasProposal);
		jobHasProposal.setJob(this);

		return jobHasProposal;
	}

	public JobHasProposalDTO removeJobHasProposal(JobHasProposalDTO jobHasProposal) {
		getJobHasProposals().remove(jobHasProposal);
		jobHasProposal.setJob(null);

		return jobHasProposal;
	}

	public List<JobHasSkillDTO> getJobHasSkills() {
		return this.jobHasSkills;
	}

	public void setJobHasSkills(List<JobHasSkillDTO> jobHasSkills) {
		this.jobHasSkills = jobHasSkills;
	}

	public JobHasSkillDTO addJobHasSkill(JobHasSkillDTO jobHasSkill) {
		getJobHasSkills().add(jobHasSkill);
		jobHasSkill.setJob(this);

		return jobHasSkill;
	}

	public JobHasSkillDTO removeJobHasSkill(JobHasSkillDTO jobHasSkill) {
		getJobHasSkills().remove(jobHasSkill);
		jobHasSkill.setJob(null);

		return jobHasSkill;
	}

	public List<JobProposalAuditLogDTO> getJobProposalAuditLogs() {
		return this.jobProposalAuditLogs;
	}

	public void setJobProposalAuditLogs(List<JobProposalAuditLogDTO> jobProposalAuditLogs) {
		this.jobProposalAuditLogs = jobProposalAuditLogs;
	}

	public JobProposalAuditLogDTO addJobProposalAuditLog(JobProposalAuditLogDTO jobProposalAuditLog) {
		getJobProposalAuditLogs().add(jobProposalAuditLog);
		jobProposalAuditLog.setJob(this);

		return jobProposalAuditLog;
	}

	public JobProposalAuditLogDTO removeJobProposalAuditLog(JobProposalAuditLogDTO jobProposalAuditLog) {
		getJobProposalAuditLogs().remove(jobProposalAuditLog);
		jobProposalAuditLog.setJob(null);

		return jobProposalAuditLog;
	}
        public String getJobStatus() {
            return jobStatus;
        }

        public void setJobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
        }

        public int getCityId() {
            return cityId;
        }

        public void setCityId(int cityId) {
            this.cityId = cityId;
        }

        public Date getJobPostedOn() {
            return jobPostedOn;
        }

        public void setJobPostedOn(Date jobPostedOn) {
            this.jobPostedOn = jobPostedOn;
        }

        public char getSaveAsTemplate() {
            return saveAsTemplate;
        }

        public void setSaveAsTemplate(char saveAsTemplate) {
            this.saveAsTemplate = saveAsTemplate;
        }

        public StateDTO getState() {
            return state;
        }

        public void setState(StateDTO state) {
            this.state = state;
        }

        public CompanyDTO getCompany() {
            return company;
        }

        public void setCompany(CompanyDTO company) {
            this.company = company;
        }
        public List<PrivateJobHasProvidersDTO> getPrivateJobHasProviders() {
            return privateJobHasProviders;
        }

        public void setPrivateJobHasProviders(List<PrivateJobHasProvidersDTO> privateJobHasProviders) {
            this.privateJobHasProviders = privateJobHasProviders;
        }

        public JobInactiveReasonsDTO getJobInactiveReasons() {
            return jobInactiveReasons;
        }

        public void setJobInactiveReasons(JobInactiveReasonsDTO jobInactiveReasons) {
            this.jobInactiveReasons = jobInactiveReasons;
        }
}