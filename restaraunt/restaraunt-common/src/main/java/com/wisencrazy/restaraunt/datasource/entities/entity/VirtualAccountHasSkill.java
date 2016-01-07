package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/*
 * author: Vikash Pandey
 */
@Entity
@Table(name="virtual_account_has_skills")
public class VirtualAccountHasSkill extends AbsCompositeEntity{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3724716194332459944L;

	@EmbeddedId
	private VirtualAccountHasSkillPK virtualAccountHasSkillPk;
	
	@Column(name="skills_rating_level")
	private String skillLevel;
	
	@JoinColumn(name = "skill_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Skill skill;
	
    @JoinColumn(name = "virtual_account_id", referencedColumnName = "id", insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private VirtualAccount virtualAccount;

    
	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public VirtualAccount getVirtualAccount() {
		return virtualAccount;
	}

	public void setVirtualAccount(VirtualAccount virtualAccount) {
		this.virtualAccount = virtualAccount;
	}

	public VirtualAccountHasSkillPK getVirtualAccountHasSkillPk() {
		return virtualAccountHasSkillPk;
	}

	public void setVirtualAccountHasSkillPk(
			VirtualAccountHasSkillPK virtualAccountHasSkillPk) {
		this.virtualAccountHasSkillPk = virtualAccountHasSkillPk;
	}

	public String getSkillLevel() {
		return skillLevel;
	}

	public void setSkillLevel(String skillLevel) {
		this.skillLevel = skillLevel;
	}
	 @Override
    public int hashCode() {
        int hash = 0;
        hash += (virtualAccountHasSkillPk != null ? virtualAccountHasSkillPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof VirtualAccountHasSkill)) {
            return false;
        }
        VirtualAccountHasSkill other = (VirtualAccountHasSkill) object;
        if ((this.virtualAccountHasSkillPk == null && other.virtualAccountHasSkillPk != null) || (this.virtualAccountHasSkillPk != null && !this.virtualAccountHasSkillPk.equals(other.virtualAccountHasSkillPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.callcomm.eserve.persistence.entity.VirtualAccountHasSkill[ virtualAccountHasSkillPk=" + virtualAccountHasSkillPk + " ]";
    }
}
