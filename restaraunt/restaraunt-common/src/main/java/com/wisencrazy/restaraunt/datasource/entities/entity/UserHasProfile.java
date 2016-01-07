package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the user_has_profiles database table.
 * 
 */
@Entity
@Table(name="user_has_profiles")
public class UserHasProfile extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;
	
	//bi-directional many-to-one association to Appuser
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="appuser_id")
	private Appuser appuser;

	//bi-directional many-to-one association to ProfileType
	@ManyToOne/*(cascade = CascadeType.ALL)*/
	@JoinColumn(name="profile_type_id")
	private ProfileType profileType;
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name = "attachment_id")
	private Attachment attachment;

	public UserHasProfile() {
	}

	public Appuser getAppuser() {
		return this.appuser;
	}

	public void setAppuser(Appuser appuser) {
		this.appuser = appuser;
	}

	public ProfileType getProfileType() {
		return this.profileType;
	}

	public void setProfileType(ProfileType profileType) {
		this.profileType = profileType;
	}

	public Attachment getAttachment() {
		return attachment;
	}

	public void setAttachment(Attachment attachment) {
		this.attachment = attachment;
	}

}