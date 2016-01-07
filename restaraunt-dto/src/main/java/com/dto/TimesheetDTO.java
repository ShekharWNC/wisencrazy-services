package com.dto;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the timesheet database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class TimesheetDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Date login;

	private Date logout;

	//bi-directional many-to-one association to User
	private AppuserDTO user;

	public TimesheetDTO() {
	}

	public TimesheetDTO(Date login, Date logout, AppuserDTO user) {
		super();
		this.login = login;
		this.logout = logout;
		this.user = user;
	}
	public Date getLogin() {
		return this.login;
	}

	public void setLogin(Date login) {
		this.login = login;
	}

	public Date getLogout() {
		return this.logout;
	}

	public void setLogout(Date logout) {
		this.logout = logout;
	}

	public AppuserDTO getUser() {
		return this.user;
	}

	public void setUser(AppuserDTO user) {
		this.user = user;
	}

}