package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the group_has_users database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class GroupHasUserDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to Group
	private GroupDTO group;

	//bi-directional many-to-one association to User
	private AppuserDTO user;

	public GroupHasUserDTO() {
	}

	public GroupHasUserDTO(GroupDTO group, AppuserDTO user) {
		super();
		this.group = group;
		this.user = user;
	}
	public GroupDTO getGroup() {
		return this.group;
	}

	public void setGroup(GroupDTO group) {
		this.group = group;
	}

	public AppuserDTO getUser() {
		return this.user;
	}

	public void setUser(AppuserDTO user) {
		this.user = user;
	}

}