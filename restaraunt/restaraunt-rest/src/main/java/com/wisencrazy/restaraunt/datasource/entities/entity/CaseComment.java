package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the case_comment database table.
 * 
 */
@Entity
@Table(name="case_comment")
public class CaseComment extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	private String comment;

	//bi-directional many-to-one association to Appuser
	@ManyToOne
	@JoinColumn(name="created_by_user_id")
	private Appuser appuser;

	//bi-directional many-to-one association to Ecase
	@ManyToOne
	@JoinColumn(name="case_id", referencedColumnName = "id")
	private Ecase ecase;

	public CaseComment() {
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Appuser getAppuser() {
		return this.appuser;
	}

	public void setAppuser(Appuser appuser) {
		this.appuser = appuser;
	}

	public Ecase getEcase() {
		return this.ecase;
	}

	public void setEcase(Ecase ecase) {
		this.ecase = ecase;
	}

}