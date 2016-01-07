package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
@Embeddable
public class TemplateHasNotificationEventPK implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 452177971426023061L;
	@Basic(optional = false)
    @NotNull
    @Column(name = "template_id")
	private Integer templateId;
	@Basic(optional = false)
    @NotNull
    @Column(name = "notification_event_id")
	private Integer notificationEventId;
	@Basic(optional = false)
    @NotNull
    @Column(name = "project_id")
	private Integer projectId;
	public Integer getTemplateId() {
		return templateId;
	}
	public void setTemplateId(Integer templateId) {
		this.templateId = templateId;
	}
	public Integer getNotificationEventId() {
		return notificationEventId;
	}
	public void setNotificationEventId(Integer notificationEventId) {
		this.notificationEventId = notificationEventId;
	}
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	@Override
	public int hashCode() {
	    int hash = 0;
	    hash += (templateId != null ? templateId.hashCode() : 0);
	    return hash;
	}

	@Override
	public boolean equals(Object object) {
	    if (!(object instanceof TemplateHasNotificationEventPK)) {
	        return false;
	    }
	    TemplateHasNotificationEventPK other = (TemplateHasNotificationEventPK) object;
	    if ((this.templateId == null && other.templateId != null) || (this.templateId != null && !this.templateId.equals(other.templateId))) {
	        return false;
	    }
	    return true;
	}
	@Override
	public String toString() {
	    return "com.callcomm.eserve.persistence.entity.TemplateHasNotificationEventPK[ id=" + templateId + " ]";
	}
}

