package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 * UserTO: Hoa Ho
 * Date: 2/20/13
 * Time: 3:12 PM
 * To change this template use File | Settings | File Templates.
 */
@Embeddable
public class AppuserHasSkillPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Basic(optional = false)
    @NotNull
    @Column(name = "appuser_id")
    private Integer appuserId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "skill_id")
    private Integer skillId;

    public AppuserHasSkillPK() {
    }

    public AppuserHasSkillPK(Integer appuserId, Integer skillId) {
        this.appuserId = appuserId;
        this.skillId = skillId;
    }

    public Integer getAppuserId() {
        return appuserId;
    }

    public void setAppuserId(Integer appuserId) {
        this.appuserId = appuserId;
    }

    public Integer getSkillId() {
        return skillId;
    }

    public void setSkillId(Integer skillId) {
        this.skillId = skillId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) appuserId;
        hash += (int) skillId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof AppuserHasSkillPK)) {
            return false;
        }
        AppuserHasSkillPK other = (AppuserHasSkillPK) object;
        if (this.appuserId != other.appuserId) {
            return false;
        }
        if (this.skillId != other.skillId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.callcomm.eserve.persistence.entity.AppuserHasSkillPK[ appuserId=" + appuserId + ", skillId=" + skillId + " ]";
    }
}
