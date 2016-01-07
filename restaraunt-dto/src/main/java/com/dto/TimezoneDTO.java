package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the timezone database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class TimezoneDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String timezoneAbbr;

	private String timezoneName;

	//bi-directional many-to-one association to User
	private List<AppuserDTO> users;

	public TimezoneDTO() {
	}

	public TimezoneDTO(String timezoneAbbr, String timezoneName,
			List<AppuserDTO> users) {
		super();
		this.timezoneAbbr = timezoneAbbr;
		this.timezoneName = timezoneName;
		this.users = users;
	}
	public String getTimezoneAbbr() {
		return this.timezoneAbbr;
	}

	public void setTimezoneAbbr(String timezoneAbbr) {
		this.timezoneAbbr = timezoneAbbr;
	}

	public String getTimezoneName() {
		return this.timezoneName;
	}

	public void setTimezoneName(String timezoneName) {
		this.timezoneName = timezoneName;
	}

	public List<AppuserDTO> getUsers() {
		return this.users;
	}

	public void setUsers(List<AppuserDTO> users) {
		this.users = users;
	}

	/*public UserDTO addUser(UserDTO user) {
		getUsers().add(user);
		user.setTimezone(this);

		return user;
	}

	public UserDTO removeUser(UserDTO user) {
		getUsers().remove(user);
		user.setTimezone(null);

		return user;
	}*/

}