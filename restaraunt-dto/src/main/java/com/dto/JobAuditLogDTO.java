package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the job_audit_log database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class JobAuditLogDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to AuditLog
	private AuditLogDTO auditLog;

	//bi-directional many-to-one association to Job
	private JobDTO job;

	public JobAuditLogDTO() {
	}

	public JobAuditLogDTO(AuditLogDTO auditLog, JobDTO job) {
		super();
		this.auditLog = auditLog;
		this.job = job;
	}
	public AuditLogDTO getAuditLog() {
		return this.auditLog;
	}

	public void setAuditLog(AuditLogDTO auditLog) {
		this.auditLog = auditLog;
	}

	public JobDTO getJob() {
		return this.job;
	}

	public void setJob(JobDTO job) {
		this.job = job;
	}

}