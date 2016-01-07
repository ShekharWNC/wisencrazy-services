package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the appuser_skill_rating database table.
 * 
 */
@Embeddable
public class AppuserSkillRatingPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="appuser_has_skill_appuser_id")
	private int appuserHasSkillAppuserId;

	@Column(name="appuser_has_skill_skill_id")
	private int appuserHasSkillSkillId;

	public AppuserSkillRatingPK() {
	}
	public int getAppuserHasSkillAppuserId() {
		return this.appuserHasSkillAppuserId;
	}
	public void setAppuserHasSkillAppuserId(int appuserHasSkillAppuserId) {
		this.appuserHasSkillAppuserId = appuserHasSkillAppuserId;
	}
	public int getAppuserHasSkillSkillId() {
		return this.appuserHasSkillSkillId;
	}
	public void setAppuserHasSkillSkillId(int appuserHasSkillSkillId) {
		this.appuserHasSkillSkillId = appuserHasSkillSkillId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AppuserSkillRatingPK)) {
			return false;
		}
		AppuserSkillRatingPK castOther = (AppuserSkillRatingPK)other;
		return 
			(this.appuserHasSkillAppuserId == castOther.appuserHasSkillAppuserId)
			&& (this.appuserHasSkillSkillId == castOther.appuserHasSkillSkillId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.appuserHasSkillAppuserId;
		hash = hash * prime + this.appuserHasSkillSkillId;
		
		return hash;
	}
}