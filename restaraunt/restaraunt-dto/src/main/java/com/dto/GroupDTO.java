package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the group database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class GroupDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String groupName;

	//bi-directional many-to-one association to CalendarHasPermission
	private List<CalendarHasPermissionDTO> calendarHasPermissions;

	//bi-directional many-to-one association to GroupHasUser
	private List<GroupHasUserDTO> groupHasUsers;

	public GroupDTO() {
	}

	public GroupDTO(String groupName,
			List<CalendarHasPermissionDTO> calendarHasPermissions,
			List<GroupHasUserDTO> groupHasUsers) {
		super();
		this.groupName = groupName;
		this.calendarHasPermissions = calendarHasPermissions;
		this.groupHasUsers = groupHasUsers;
	}
	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public List<CalendarHasPermissionDTO> getCalendarHasPermissions() {
		return this.calendarHasPermissions;
	}

	public void setCalendarHasPermissions(List<CalendarHasPermissionDTO> calendarHasPermissions) {
		this.calendarHasPermissions = calendarHasPermissions;
	}

	public CalendarHasPermissionDTO addCalendarHasPermission(CalendarHasPermissionDTO calendarHasPermission) {
		getCalendarHasPermissions().add(calendarHasPermission);
		calendarHasPermission.setGroup(this);

		return calendarHasPermission;
	}

	public CalendarHasPermissionDTO removeCalendarHasPermission(CalendarHasPermissionDTO calendarHasPermission) {
		getCalendarHasPermissions().remove(calendarHasPermission);
		calendarHasPermission.setGroup(null);

		return calendarHasPermission;
	}

	public List<GroupHasUserDTO> getGroupHasUsers() {
		return this.groupHasUsers;
	}

	public void setGroupHasUsers(List<GroupHasUserDTO> groupHasUsers) {
		this.groupHasUsers = groupHasUsers;
	}

	public GroupHasUserDTO addGroupHasUser(GroupHasUserDTO groupHasUser) {
		getGroupHasUsers().add(groupHasUser);
		groupHasUser.setGroup(this);

		return groupHasUser;
	}

	public GroupHasUserDTO removeGroupHasUser(GroupHasUserDTO groupHasUser) {
		getGroupHasUsers().remove(groupHasUser);
		groupHasUser.setGroup(null);

		return groupHasUser;
	}

}