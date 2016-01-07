package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the component database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ComponentDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String componentName;

	//bi-directional many-to-one association to AuditLog
	private List<AuditLogDTO> auditLogs;

	public ComponentDTO() {
	}

	public ComponentDTO(String componentName, List<AuditLogDTO> auditLogs) {
		super();
		this.componentName = componentName;
		this.auditLogs = auditLogs;
	}

	public String getComponentName() {
		return this.componentName;
	}

	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}

	public List<AuditLogDTO> getAuditLogs() {
		return this.auditLogs;
	}

	public void setAuditLogs(List<AuditLogDTO> auditLogs) {
		this.auditLogs = auditLogs;
	}

	public AuditLogDTO addAuditLog(AuditLogDTO auditLog) {
		getAuditLogs().add(auditLog);
		auditLog.setComponent(this);

		return auditLog;
	}

	public AuditLogDTO removeAuditLog(AuditLogDTO auditLog) {
		getAuditLogs().remove(auditLog);
		auditLog.setComponent(null);

		return auditLog;
	}

	@Override
	public String toString() {
		return "ComponentDTO [componentName=" + componentName + ", auditLogs="
				+ auditLogs + "]";
	}

}