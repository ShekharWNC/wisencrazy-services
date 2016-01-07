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
 * The persistent class for the project_audit_log database table.
 * 
 */
@Entity
@Table(name="project_audit_log")
public class ProjectAuditLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	//bi-directional many-to-one association to AuditLog
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="audit_log_id", referencedColumnName = "id")
	private AuditLog auditLog;

	//bi-directional many-to-one association to Project
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "project_id", referencedColumnName = "id")
	private Project project;

	public ProjectAuditLog() {
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

	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

}