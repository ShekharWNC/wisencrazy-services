package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the timesheet database table.
 * 
 */
@Entity
@Table(name="timesheet")
public class Timesheet extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.TIMESTAMP)
	private Date login;

	@Temporal(TemporalType.TIMESTAMP)
	private Date logout;

	//bi-directional many-to-one association to Appuser
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="user_id", referencedColumnName = "id")
	private Appuser appuser;

	public Timesheet() {
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

	public Appuser getAppuser() {
		return this.appuser;
	}

	public void setAppuser(Appuser appuser) {
		this.appuser = appuser;
	}

}