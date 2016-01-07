package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the profile_type database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ProfileTypeDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String profileType;

	//bi-directional many-to-one association to UserHasProfile
	private List<UserHasProfileDTO> userHasProfiles;

	public ProfileTypeDTO() {
	}

	public ProfileTypeDTO(String profileType,List<UserHasProfileDTO> userHasProfiles) {
		super();
		this.profileType = profileType;
		this.userHasProfiles = userHasProfiles;
	}
	public String getProfileType() {
		return this.profileType;
	}

	public void setProfileType(String profileType) {
		this.profileType = profileType;
	}

	public List<UserHasProfileDTO> getUserHasProfiles() {
		return this.userHasProfiles;
	}

	public void setUserHasProfiles(List<UserHasProfileDTO> userHasProfiles) {
		this.userHasProfiles = userHasProfiles;
	}

	public UserHasProfileDTO addUserHasProfile(UserHasProfileDTO userHasProfile) {
		getUserHasProfiles().add(userHasProfile);
		userHasProfile.setProfileType(this);

		return userHasProfile;
	}

	public UserHasProfileDTO removeUserHasProfile(UserHasProfileDTO userHasProfile) {
		getUserHasProfiles().remove(userHasProfile);
		userHasProfile.setProfileType(null);

		return userHasProfile;
	}

}