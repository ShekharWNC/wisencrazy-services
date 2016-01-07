package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

// TODO: Auto-generated Javadoc
/**
 * The Class NotificationGroupHasMembersPK.
 */
@Embeddable
public class NotificationGroupHasMembersPK implements Serializable {
		
	/** The Constant serialVersionUID. */

	/**
	 * 
	 */
	private static final long serialVersionUID = -8404866567623999855L;

	/** The member id. */
	@Basic(optional=false)
	@NotNull
	@Column(name="member_sid")
	private String memberSid;
	
	/** The notification group id. */
	@Basic(optional=false)
	@NotNull
	@Column(name="notification_group_id")
	private int notificationGroupId;

	public String getMemberSid() {
		return memberSid;
	}

	public void setMemberSid(String memberSid) {
		this.memberSid = memberSid;
	}

	/**
	 * Gets the notification group id.
	 *
	 * @return the notification group id
	 */
	public int getNotificationGroupId() {
		return notificationGroupId;
	}

	/**
	 * Sets the notification group id.
	 *
	 * @param notificationGroupId the new notification group id
	 */
	public void setNotificationGroupId(int notificationGroupId) {
		this.notificationGroupId = notificationGroupId;
	}
	
	/**
	 * Instantiates a new notification group has members pk.
	 */
	public  NotificationGroupHasMembersPK(){
		
	}
	
	/**
	 * Instantiates a new notification group has members pk.
	 *
	 * @param memberId the member id
	 * @param notificationGroupId the notification group id
	 */
	public NotificationGroupHasMembersPK(String memberSid,int notificationGroupId){
		this();
		this.memberSid=memberSid;
		this.notificationGroupId=notificationGroupId;
	}
}
