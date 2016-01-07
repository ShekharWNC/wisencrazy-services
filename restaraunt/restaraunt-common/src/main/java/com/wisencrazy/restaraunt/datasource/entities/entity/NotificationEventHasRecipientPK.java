package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
@Embeddable
public class NotificationEventHasRecipientPK implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6178784346536294724L;
	@Basic(optional = false)
    @NotNull
    @Column(name = "recipient_id")
	private Integer recipientId;
	@Basic(optional = false)
    @NotNull
    @Column(name = "notification_event_id")
	private Integer notificationEventId;
	@Basic(optional = false)
    @NotNull
    @Column(name = "project_id")
	private Integer projectId;
	
	public Integer getRecipientId() {
		return recipientId;
	}
	public void setRecipientId(Integer recipientId) {
		this.recipientId = recipientId;
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
        hash += (recipientId != null ? recipientId.hashCode() : 0);
        return hash;
    }
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof NotificationEventHasRecipientPK)) {
            return false;
        }
        NotificationEventHasRecipientPK other = (NotificationEventHasRecipientPK) object;
        if ((this.recipientId == null && other.recipientId != null) || (this.recipientId != null && !this.recipientId.equals(other.recipientId))) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "com.callcomm.eserve.persistence.entity.NotificationEventHasRecipientPK[ id=" + recipientId + " ]";
    }

}

