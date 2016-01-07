package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the project_audit_log database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ProjectAuditLogDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to AuditLog
	private AuditLogDTO auditLog;

	//bi-directional many-to-one association to Project
	private ProjectDTO project;

	public ProjectAuditLogDTO() {
	}

	public ProjectAuditLogDTO(AuditLogDTO auditLog, ProjectDTO project) {
		super();
		this.auditLog = auditLog;
		this.project = project;
	}
	public AuditLogDTO getAuditLog() {
		return this.auditLog;
	}

	public void setAuditLog(AuditLogDTO auditLog) {
		this.auditLog = auditLog;
	}

	public ProjectDTO getProject() {
		return this.project;
	}

	public void setProject(ProjectDTO project) {
		this.project = project;
	}

}