package com.wisencrazy.restaraunt.datasource.entities.entity;
import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="template_has_notification_event")
public class TemplateHasNotificationEvent implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 452177971426023061L;
	@EmbeddedId
	protected TemplateHasNotificationEventPK templateHasNotificationEventPK;
	public TemplateHasNotificationEventPK getTemplateHasNotificationEventPK() {
		return templateHasNotificationEventPK;
	}
	public void setTemplateHasNotificationEventPK(
			TemplateHasNotificationEventPK templateHasNotificationEventPK) {
		this.templateHasNotificationEventPK = templateHasNotificationEventPK;
	}
	@JoinColumn(name = "notification_event_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private NotificationEvent notificationEvents;
	
	@JoinColumn(name = "template_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Template template;
 
	public Template getTemplate() {
		return template;
	}
	public void setTemplate(Template template) {
		this.template = template;
	}
	
	public NotificationEvent getNotificationEvents() {
		return notificationEvents;
	}
	public void setNotificationEvents(NotificationEvent notificationEvents) {
		this.notificationEvents = notificationEvents;
	}
	@Override
	public int hashCode() {
	    int hash = 0;
	    hash += (templateHasNotificationEventPK.getTemplateId() != null ? templateHasNotificationEventPK.getTemplateId().hashCode() : 0);
	    return hash;
	}

	@Override
	public boolean equals(Object object) {
	    if (!(object instanceof TemplateHasNotificationEvent)) {
	        return false;
	    }
	    TemplateHasNotificationEvent other = (TemplateHasNotificationEvent) object;
	    if ((this.templateHasNotificationEventPK.getTemplateId() == null && other.templateHasNotificationEventPK.getTemplateId() != null) || (this.templateHasNotificationEventPK.getTemplateId() != null && !this.templateHasNotificationEventPK.getTemplateId().equals(other.templateHasNotificationEventPK.getTemplateId()))) {
	        return false;
	    }
	    return true;
	}
	@Override
	public String toString() {
	    return "com.callcomm.eserve.persistence.entity.TemplateHasNotificationEvent[ id=" + templateHasNotificationEventPK.getTemplateId() + " ]";
	}

}

