package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AccountManagementEventHasTemplatePK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "notification_event_id")
	private Integer eventTypeId;
	
	@Column(name = "project_id")
	private Integer projectId;
	
	@Column(name = "template_id")
	private Integer templateId;

	public AccountManagementEventHasTemplatePK() {
		super();
	}

	public AccountManagementEventHasTemplatePK(Integer eventTypeId,
			Integer projectId, Integer templateId) {
		super();
		this.eventTypeId = eventTypeId;
		this.projectId = projectId;
		this.templateId = templateId;
	}

	public Integer getEventTypeId() {
		return eventTypeId;
	}

	public void setEventTypeId(Integer eventTypeId) {
		this.eventTypeId = eventTypeId;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public Integer getTemplateId() {
		return templateId;
	}

	public void setTemplateId(Integer templateId) {
		this.templateId = templateId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((eventTypeId == null) ? 0 : eventTypeId.hashCode());
		result = prime * result
				+ ((projectId == null) ? 0 : projectId.hashCode());
		result = prime * result
				+ ((templateId == null) ? 0 : templateId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountManagementEventHasTemplatePK other = (AccountManagementEventHasTemplatePK) obj;
		if (eventTypeId == null) {
			if (other.eventTypeId != null)
				return false;
		} else if (!eventTypeId.equals(other.eventTypeId))
			return false;
		if (projectId == null) {
			if (other.projectId != null)
				return false;
		} else if (!projectId.equals(other.projectId))
			return false;
		if (templateId == null) {
			if (other.templateId != null)
				return false;
		} else if (!templateId.equals(other.templateId))
			return false;
		return true;
	}
}
