package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


/**
 * The Class NotificationGroupHasMembers.
 */
@Entity
@Table(name="notification_group_has_users")
@NamedQueries({
	@NamedQuery(name = NotificationGroupHasMembers.FIND_ACTIVE_MEMBER_BY_GROUP_ID, query = "SELECT nghm FROM NotificationGroupHasMembers nghm where nghm.groupHasMembersPK.notificationGroupId=:id and nghm.status=1"),
	@NamedQuery(name = NotificationGroupHasMembers.FIND_ACTIVE_MEMBER_BY_GROUP_SID, query = "SELECT nghm FROM NotificationGroupHasMembers nghm where hex(nghm.notificationGroup.sid)=:sid and nghm.status=1"),
	@NamedQuery(name = NotificationGroupHasMembers.FIND_ALL_MEMBER_BY_GROUP_SID, query = "SELECT nghm FROM NotificationGroupHasMembers nghm where hex(nghm.notificationGroup.sid)=:sid")
})
public class NotificationGroupHasMembers implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	
	public  static final String PREFIX="com.callcomm.eserve.persistence.entity.NotificationGroupHasMembers";
	public static final String FIND_ACTIVE_MEMBER_BY_GROUP_SID=PREFIX+"findActiveMemberbyGroupSid";
	public static final String FIND_ACTIVE_MEMBER_BY_GROUP_ID=PREFIX+"findActiveMemberbyGroupId";
	public static final String FIND_ALL_MEMBER_BY_GROUP_SID=PREFIX+"findAllMemberByGroupSid";
	
	
	/**
	 * The Enum Permission.
	 */
	public  enum Permission{
		
		/** The u. */
		U,
		
		/** The a. */
		A,
		
		/** The o. */
		O
	}

	/** The group has members pk. */
	@EmbeddedId
	private NotificationGroupHasMembersPK groupHasMembersPK;
	
	/** The permission. */
	@Column(name="permission")
	@NotNull
	@Enumerated(EnumType.STRING)
	private Permission permission;

	/** The status. */
	@Column(name="status")
	@NotNull
	private Integer	status;
	
	/** The subscribed since. */
	@Column(name="subscribed_since")
	@NotNull
	private Timestamp  subscribedSince;
	
    /** The notification group. */
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "notification_group_id", referencedColumnName = "id", insertable = false, updatable = false)
    private NotificationGroup notificationGroup;
    
    @Column(name="user_type")
    private String userType;


	/**
	 * Gets the permission.
	 *
	 * @return the permission
	 */
	public Permission getPermission() {
		return permission;
	}

	/**
	 * Sets the permission.
	 *
	 * @param permission the new permission
	 */
	public void setPermission(Permission permission) {
		this.permission = permission;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * Gets the subscribed since.
	 *
	 * @return the subscribed since
	 */
	public Timestamp getSubscribedSince() {
		return subscribedSince;
	}

	/**
	 * Sets the subscribed since.
	 *
	 * @param subscribedSince the new subscribed since
	 */
	public void setSubscribedSince(Timestamp subscribedSince) {
		this.subscribedSince = subscribedSince;
	}

	/**
	 * Gets the group has members pk.
	 *
	 * @return the group has members pk
	 */
	public NotificationGroupHasMembersPK getGroupHasMembersPK() {
		return groupHasMembersPK;
	}

	/**
	 * Sets the group has members pk.
	 *
	 * @param groupHasMembersPK the new group has members pk
	 */
	public void setGroupHasMembersPK(NotificationGroupHasMembersPK groupHasMembersPK) {
		this.groupHasMembersPK = groupHasMembersPK;
	}

	/**
	 * Gets the notification group.
	 *
	 * @return the notification group
	 */
	public NotificationGroup getNotificationGroup() {
		return notificationGroup;
	}

	/**
	 * Sets the notification group.
	 *
	 * @param notificationGroup the new notification group
	 */
	public void setNotificationGroup(NotificationGroup notificationGroup) {
		this.notificationGroup = notificationGroup;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
	
}
