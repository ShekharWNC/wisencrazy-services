package com.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the audit_log database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class AuditLogDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String description;

	private Date updatedDate;

	private ActionTagDTO actionTag;

	private ComponentDTO component;

	private AppuserDTO user;

	private List<JobAuditLogDTO> jobAuditLogs;

	private List<JobProposalAuditLogDTO> jobProposalAuditLogs;

	private List<ProjectAuditLogDTO> projectAuditLogs;

	public AuditLogDTO() {
	}

	public AuditLogDTO(String description, Date updatedDate,
			ActionTagDTO actionTag, ComponentDTO component, AppuserDTO user,
			List<JobAuditLogDTO> jobAuditLogs,
			List<JobProposalAuditLogDTO> jobProposalAuditLogs,
			List<ProjectAuditLogDTO> projectAuditLogs) {
		super();
		this.description = description;
		this.updatedDate = updatedDate;
		this.actionTag = actionTag;
		this.component = component;
		this.user = user;
		this.jobAuditLogs = jobAuditLogs;
		this.jobProposalAuditLogs = jobProposalAuditLogs;
		this.projectAuditLogs = projectAuditLogs;
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

	public ActionTagDTO getActionTag() {
		return this.actionTag;
	}

	public void setActionTag(ActionTagDTO actionTag) {
		this.actionTag = actionTag;
	}

	public ComponentDTO getComponent() {
		return this.component;
	}

	public void setComponent(ComponentDTO component) {
		this.component = component;
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
		jobAuditLog.setAuditLog(this);

		return jobAuditLog;
	}

	public JobAuditLogDTO removeJobAuditLog(JobAuditLogDTO jobAuditLog) {
		getJobAuditLogs().remove(jobAuditLog);
		jobAuditLog.setAuditLog(null);

		return jobAuditLog;
	}

	public List<JobProposalAuditLogDTO> getJobProposalAuditLogs() {
		return this.jobProposalAuditLogs;
	}

	public void setJobProposalAuditLogs(List<JobProposalAuditLogDTO> jobProposalAuditLogs) {
		this.jobProposalAuditLogs = jobProposalAuditLogs;
	}

	public JobProposalAuditLogDTO addJobProposalAuditLog(JobProposalAuditLogDTO jobProposalAuditLog) {
		getJobProposalAuditLogs().add(jobProposalAuditLog);
		jobProposalAuditLog.setAuditLog(this);

		return jobProposalAuditLog;
	}

	public JobProposalAuditLogDTO removeJobProposalAuditLog(JobProposalAuditLogDTO jobProposalAuditLog) {
		getJobProposalAuditLogs().remove(jobProposalAuditLog);
		jobProposalAuditLog.setAuditLog(null);

		return jobProposalAuditLog;
	}

	public List<ProjectAuditLogDTO> getProjectAuditLogs() {
		return this.projectAuditLogs;
	}

	public void setProjectAuditLogs(List<ProjectAuditLogDTO> projectAuditLogs) {
		this.projectAuditLogs = projectAuditLogs;
	}

	public ProjectAuditLogDTO addProjectAuditLog(ProjectAuditLogDTO projectAuditLog) {
		getProjectAuditLogs().add(projectAuditLog);
		projectAuditLog.setAuditLog(this);

		return projectAuditLog;
	}

	public ProjectAuditLogDTO removeProjectAuditLog(ProjectAuditLogDTO projectAuditLog) {
		getProjectAuditLogs().remove(projectAuditLog);
		projectAuditLog.setAuditLog(null);

		return projectAuditLog;
	}

	@Override
	public String toString() {
		return "AuditLogDTO [description=" + description + ", updatedDate="
				+ updatedDate + ", actionTag=" + actionTag + ", component="
				+ component + ", user=" + user + ", jobAuditLogs="
				+ jobAuditLogs + ", jobProposalAuditLogs="
				+ jobProposalAuditLogs + ", projectAuditLogs="
				+ projectAuditLogs + "]";
	}

}