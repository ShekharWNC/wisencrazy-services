package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * The persistent class for the profile_type database table.
 * 
 */
@Entity
@Table(name="profile_type")
public class ProfileType extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(name="profile_type")
	private String profileType;

	//bi-directional many-to-one association to UserHasProfile
	/*@OneToMany(mappedBy="profileType")
	private List<UserHasProfile> userHasProfiles;*/

	public ProfileType() {
	}

	public String getProfileType() {
		return this.profileType;
	}

	public void setProfileType(String profileType) {
		this.profileType = profileType;
	}

	/*public List<UserHasProfile> getUserHasProfiles() {
		return this.userHasProfiles;
	}

	public void setUserHasProfiles(List<UserHasProfile> userHasProfiles) {
		this.userHasProfiles = userHasProfiles;
	}

	public UserHasProfile addUserHasProfile(UserHasProfile userHasProfile) {
		getUserHasProfiles().add(userHasProfile);
		userHasProfile.setProfileType(this);

		return userHasProfile;
	}

	public UserHasProfile removeUserHasProfile(UserHasProfile userHasProfile) {
		getUserHasProfiles().remove(userHasProfile);
		userHasProfile.setProfileType(null);

		return userHasProfile;
	}*/

}