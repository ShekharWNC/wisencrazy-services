package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
/*
 * author:- vikash pandey
 */
@Embeddable
public class VirtualAccountHasSkillPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5452584180787811311L;
	@Column(name="skill_id")
	private Integer skillId;

	@Column(name="virtual_account_id")
	private Integer virtualAccountId;

	public Integer getSkillId() {
		return skillId;
	}

	public void setSkillId(Integer skillId) {
		this.skillId = skillId;
	}

	public Integer getVirtualAccountId() {
		return virtualAccountId;
	}

	public void setVirtualAccountId(Integer virtualAccountId) {
		this.virtualAccountId = virtualAccountId;
	}
	
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof VirtualAccountHasSkillPK)) {
			return false;
		}
		VirtualAccountHasSkillPK castOther = (VirtualAccountHasSkillPK)other;
		return 
			(this.virtualAccountId == castOther.virtualAccountId)
			&& (this.skillId == castOther.skillId);
	}
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.virtualAccountId;
		hash = hash * prime + this.skillId;
		return hash;
	}
}
