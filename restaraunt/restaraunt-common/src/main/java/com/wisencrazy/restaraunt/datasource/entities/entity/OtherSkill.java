package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the other_skills database table.
 * 
 */
@Entity
@Table(name="other_skills")
public class OtherSkill extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(name="skill_name")
	private String skillName;

	private byte status;

	//bi-directional many-to-one association to Appuser
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="user_id", referencedColumnName = "id")
	private Appuser appuser1;

	//bi-directional many-to-one association to Appuser
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="admin_user_id", referencedColumnName = "id")
	private Appuser appuser2;

	public OtherSkill() {
	}

	public String getSkillName() {
		return this.skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public Appuser getAppuser1() {
		return this.appuser1;
	}

	public void setAppuser1(Appuser appuser1) {
		this.appuser1 = appuser1;
	}

	public Appuser getAppuser2() {
		return this.appuser2;
	}

	public void setAppuser2(Appuser appuser2) {
		this.appuser2 = appuser2;
	}

}