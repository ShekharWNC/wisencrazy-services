package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="recipient")
public class Recipient extends AbsBaseEntity {

	 /**
	 * 
	 */
	private static final long serialVersionUID = -6494299350451600669L;
	
	//TODO Instead of String we should use Enum value which will keep the DB values and the entity values in Sync and save unnecessary DB hit for verification of an existing recipient name.
	@Column(name="name")
	private String name;
	@OneToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE}, mappedBy = "recipient")
    private List<NotificationEventHasRecipient> notificationEventHasRecipient;
	
	public List<NotificationEventHasRecipient> getNotificationEventHasRecipient() {
		return notificationEventHasRecipient;
	}
	public void setNotificationEventHasRecipient(
			List<NotificationEventHasRecipient> notificationEventHasRecipient) {
		this.notificationEventHasRecipient = notificationEventHasRecipient;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
	    int hash = 0;
	    hash += (id != null ? id.hashCode() : 0);
	    return hash;
	}

	@Override
	public boolean equals(Object object) {
	    if (!(object instanceof Recipient)) {
	        return false;
	    }
	    Recipient other = (Recipient) object;
	    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
	        return false;
	    }
	    return true;
	}
	@Override
	public String toString() {
	    return "com.callcomm.eserve.persistence.entity.Recipient[ id=" + id + " ]";
	}
}

