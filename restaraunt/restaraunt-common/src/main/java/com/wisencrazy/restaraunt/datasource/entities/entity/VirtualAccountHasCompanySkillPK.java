package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the virtual_account_has_company_skill database table.
 * 
 */
@Embeddable
public class VirtualAccountHasCompanySkillPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="virtual_account_id")
	private Integer virtualAccountId;

	@Column(name="company_skill_id")
	private Integer companySkillId;

	public VirtualAccountHasCompanySkillPK() {
	}
	public Integer getVirtualAccountId() {
		return this.virtualAccountId;
	}
	public void setVirtualAccountId(Integer virtualAccountId) {
		this.virtualAccountId = virtualAccountId;
	}
	public int getCompanySkillId() {
		return this.companySkillId;
	}
	public void setCompanySkillId(Integer companySkillId) {
		this.companySkillId = companySkillId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof VirtualAccountHasCompanySkillPK)) {
			return false;
		}
		VirtualAccountHasCompanySkillPK castOther = (VirtualAccountHasCompanySkillPK)other;
		return 
			(this.virtualAccountId == castOther.virtualAccountId)
			&& (this.companySkillId == castOther.companySkillId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.virtualAccountId;
		hash = hash * prime + this.companySkillId;
		
		return hash;
	}
}