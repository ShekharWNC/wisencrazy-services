package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


/**
 * The Class NotificationGroup.
 * This class represent the table notification_group
 */
@Entity
@Table(name="notification_group")
@NamedQueries({
	@NamedQuery(name = NotificationGroup.FIND_ALL_BY_OWNER, query = "SELECT ng FROM NotificationGroup ng where hex(ng.ownerSid)=:sid"),
	@NamedQuery(name=NotificationGroup.FIND_COUNT_BY_OWNER,query="SELECT count(ng) FROM NotificationGroup ng where hex(ng.ownerSid)=:sid and ng.groupStatus='A'")
})
public class NotificationGroup extends AbsBaseEntity{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	public  static final String PREFIX="com.callcomm.eserve.persistence.entity.NotificationGroup";
	
	public static final String FIND_ALL_BY_OWNER=PREFIX+"findAllByOwner";
	public static final String FIND_COUNT_BY_OWNER=PREFIX+"findCountByOwner";
	public static final String FIND_ACTIVE_BY_OWNER=PREFIX+"findActiveByOwner";
	public static final String FIND_BY_OWNER_VISIBILITY=PREFIX+"findByOwnerVisible";
	public static final String FIND_BY_OWNER_TYPE=PREFIX+"findByOwnerType";
	public static final String FIND_BY_OWNER_STATUS=PREFIX+"findByOwnerStatus";
	
	/**
	 * The Enum GroupStatus.
	 */
	public enum GroupStatus{
		
		/** Active. */
		A,
		
		/** Inactive. */
		I,
		
		/** Delete. */
		D
	}
	
	/**
	 * The Enum GroupType.
	 */
	public enum GroupType {
		
		/** The chat. */
		CHAT,
		
		/** The channel. */
		CHANNEL
	}
	
	/**
	 * The Enum Visiblity.
	 */
	public enum Visiblity{
		
		/** Private. */
		Pr,
		
		/** Public. */
		Pu
	}
	
	/** The profile pic. */
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="profile_pic",referencedColumnName="id")
	private Attachment profilePic;
	
	/** The name. */
	@Column(name="name")
    @NotNull
    private String name;
	
	/** The group status. */
	@Column(name="group_status")
	@NotNull
	@Enumerated(EnumType.STRING)
	private GroupStatus groupStatus;
	
	/** The group type. */
	@Column(name="group_type")
	@NotNull
	@Enumerated(EnumType.STRING)
	private GroupType groupType;
	
	/** The created on. */
	@Column(name="created_on")
	@NotNull
	private Timestamp createdOn;
	
	/** The owner sid. */
	@Column(name="owner_sid")
	@NotNull
	private byte[] ownerSid;
	
	/** The group visible. */
	@Column(name="group_visible")
	@NotNull
	@Enumerated(EnumType.STRING)
	private Visiblity groupVisible;

	/** The last updated on. */
	@Column(name="last_updated_on")
	private Timestamp lastUpdatedOn;
	
	/*@OneToMany(cascade ={CascadeType.MERGE, CascadeType.PERSIST},mappedBy="groupHasMembersPK.notificationGroupId")
//	@JoinColumn(name="notification_group_id",referencedColumnName="id")
	private List<NotificationGroupHasMembers> members;
*/
	public Attachment getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(Attachment profilePic) {
		this.profilePic = profilePic;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GroupStatus getGroupStatus() {
		return groupStatus;
	}

	public void setGroupStatus(GroupStatus groupStatus) {
		this.groupStatus = groupStatus;
	}

	public GroupType getGroupType() {
		return groupType;
	}

	public void setGroupType(GroupType groupType) {
		this.groupType = groupType;
	}

	public Timestamp getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public byte[] getOwnerSid() {
		return ownerSid;
	}

	public void setOwnerSid(byte[] ownerSid) {
		this.ownerSid = ownerSid;
	}

	public Visiblity getGroupVisible() {
		return groupVisible;
	}

	public void setGroupVisible(Visiblity groupVisible) {
		this.groupVisible = groupVisible;
	}

	public Timestamp getLastUpdatedOn() {
		return lastUpdatedOn;
	}

	public void setLastUpdatedOn(Timestamp lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

/*	public List<NotificationGroupHasMembers> getMembers() {
		return members;
	}

	public void setMembers(List<NotificationGroupHasMembers> members) {
		this.members = members;
	}
	
*/	
}
