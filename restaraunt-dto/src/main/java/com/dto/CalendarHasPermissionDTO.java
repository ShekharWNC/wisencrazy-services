package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the calendar_has_permissions database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class CalendarHasPermissionDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String permissions;

	private CalendarDTO calendar;

	private GroupDTO group;

	private AppuserDTO user;

	public CalendarHasPermissionDTO() {
	}

	public CalendarHasPermissionDTO(String permissions, CalendarDTO calendar,
			GroupDTO group, AppuserDTO user) {
		super();
		this.permissions = permissions;
		this.calendar = calendar;
		this.group = group;
		this.user = user;
	}

	public String getPermissions() {
		return this.permissions;
	}

	public void setPermissions(String permissions) {
		this.permissions = permissions;
	}

	public CalendarDTO getCalendar() {
		return this.calendar;
	}

	public void setCalendar(CalendarDTO calendar) {
		this.calendar = calendar;
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

	@Override
	public String toString() {
		return "CalendarHasPermissionDTO [permissions=" + permissions
				+ ", calendar=" + calendar + ", group=" + group + ", user="
				+ user + "]";
	}


}