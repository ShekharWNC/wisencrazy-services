package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * @author eServeTeam
 * The Data transfer class for the entity ActionTag database table.
 * @version 1.1
 * @see ActionTagDTO
 *  
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ActionTagDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String actionTag;

	//bi-directional many-to-one association to AuditLog
	private List<AuditLogDTO> auditLogs;

	public ActionTagDTO() {
	}
	

	public ActionTagDTO(String actionTag, List<AuditLogDTO> auditLogs) {
		super();
		this.actionTag = actionTag;
		this.auditLogs = auditLogs;
	}
	/**
	 * Gets the Action Tag
	 * @return String The name of the Action Tag
	 */
	public String getActionTag() {
		return this.actionTag;
	}

	/**
	 * Sets the name of the Action Tag
	 * @param actionTag
	 */
	public void setActionTag(String actionTag) {
		this.actionTag = actionTag;
	}

	/**
	 * Get a list of all the {@link AuditLogs} Audit Logs associated with this ActionTag
	 * @return List of all the {@link AuditLogs}
	 */
	public List<AuditLogDTO> getAuditLogs() {
		return this.auditLogs;
	}

	/**
	 * Set a list of all the {@link AuditLogs} Audit Logs associated with this ActionTag
	 * @return List of all the {@link AuditLogs}
	 */
	public void setAuditLogs(List<AuditLogDTO> auditLogs) {
		this.auditLogs = auditLogs;
	}

	/**
	 * Add a {@link AuditLogDTO}
	 * @param auditLog AuditLog to be set
	 * @return {@link AuditLogDTO} that has been added
	 */
	public AuditLogDTO addAuditLog(AuditLogDTO auditLog) {
		getAuditLogs().add(auditLog);
		auditLog.setActionTag(this);

		return auditLog;
	}

	/**
	 * Removes a {@link AuditLogDTO}
	 * @param auditLog AuditLog to be removed
	 * @return {@link AuditLogDTO} that was removed
	 */
	public AuditLogDTO removeAuditLog(AuditLogDTO auditLog) {
		getAuditLogs().remove(auditLog);
		auditLog.setActionTag(null);

		return auditLog;
	}


	@Override
	public String toString() {
		return "ActionTagDTO [actionTag=" + actionTag + ", auditLogs="
				+ auditLogs + "]";
	}

	
}