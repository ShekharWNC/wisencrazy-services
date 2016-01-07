package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the virtual_account_has_company_skill database table.
 * 
 */
@Entity
@Table(name="virtual_account_has_company_skill")
public class VirtualAccountHasCompanySkill extends AbsCompositeEntity {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VirtualAccountHasCompanySkillPK id;

	private byte rating;

	//bi-directional many-to-one association to CompanySkill
	@ManyToOne
	@JoinColumn(name="company_skill_id", insertable = false, updatable = false)
	private CompanySkill companySkill;

	//bi-directional many-to-one association to VirtualAccount
	@ManyToOne
	@JoinColumn(name="virtual_account_id", insertable = false, updatable = false)
	private VirtualAccount virtualAccount;

	public VirtualAccountHasCompanySkill() {
	}

	public VirtualAccountHasCompanySkillPK getId() {
		return this.id;
	}

	public void setId(VirtualAccountHasCompanySkillPK id) {
		this.id = id;
	}

	public byte getRating() {
		return this.rating;
	}

	public void setRating(byte rating) {
		this.rating = rating;
	}

	public CompanySkill getCompanySkill() {
		return this.companySkill;
	}

	public void setCompanySkill(CompanySkill companySkill) {
		this.companySkill = companySkill;
	}

	public VirtualAccount getVirtualAccount() {
		return this.virtualAccount;
	}

	public void setVirtualAccount(VirtualAccount virtualAccount) {
		this.virtualAccount = virtualAccount;
	}
	@Override
	public int hashCode() {
	    int hash = 0;
	    hash += (id.getVirtualAccountId() != null ? id.getVirtualAccountId().hashCode() : 0);
	    return hash;
	}

	@Override
	public boolean equals(Object object) {
	    if (!(object instanceof VirtualAccountHasCompanySkill)) {
	        return false;
	    }
	    VirtualAccountHasCompanySkill other = (VirtualAccountHasCompanySkill) object;
	    if ((this.id.getVirtualAccountId() == null && other.id.getVirtualAccountId() != null) || (this.id.getVirtualAccountId() != null && !this.id.getVirtualAccountId().equals(other.id.getVirtualAccountId()))) {
	        return false;
	    }
	    return true;
	}
	@Override
	public String toString() {
	    return "com.callcomm.eserve.persistence.entity.VirtualAccountHasCompanySkill[ id=" + id.getVirtualAccountId() + " ]";
	}
}