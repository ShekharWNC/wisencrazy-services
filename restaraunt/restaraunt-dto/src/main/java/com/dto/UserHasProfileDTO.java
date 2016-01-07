package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the user_has_profiles database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class UserHasProfileDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<ProjectDTO> projects;

	private ProfileTypeDTO profileType;

	private AppuserDTO user;
	
	private AttachmentCommonDTO attachment;

	public UserHasProfileDTO() {
	}

	public UserHasProfileDTO(List<ProjectDTO> projects,
			ProfileTypeDTO profileType, AppuserDTO user) {
		super();
		this.projects = projects;
		this.profileType = profileType;
		this.user = user;
	}

	public List<ProjectDTO> getProjects() {
		return this.projects;
	}

	public void setProjects(List<ProjectDTO> projects) {
		this.projects = projects;
	}

	public ProfileTypeDTO getProfileType() {
		return this.profileType;
	}

	public void setProfileType(ProfileTypeDTO profileType) {
		this.profileType = profileType;
	}

	public AppuserDTO getUser() {
		return this.user;
	}

	public void setUser(AppuserDTO user) {
		this.user = user;
	}

	public AttachmentCommonDTO getAttachment() {
		return attachment;
	}

	public void setAttachment(AttachmentCommonDTO attachment) {
		this.attachment = attachment;
	}

}