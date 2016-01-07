package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * UserTO: Hoa Ho
 * Date: 2/20/13
 * Time: 3:11 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "appuser_has_skill")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = AppuserHasSkill.FIND_ALL, query = "SELECT a FROM AppuserHasSkill a"),
        @NamedQuery(name = AppuserHasSkill.FIND_BY_USER_ID, query = "SELECT a FROM AppuserHasSkill a WHERE a.appuserHasSkillPK.appuserId = :appuserId"),
        @NamedQuery(name = AppuserHasSkill.FIND_BY_SKILL_ID, query = "SELECT a FROM AppuserHasSkill a WHERE a.appuserHasSkillPK.skillId = :skillId")})
public class AppuserHasSkill extends AbsCompositeEntity {
    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.AppuserHasSkill.";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_USER_ID = PREFIX + "findByAppuserId";
    public static final String FIND_BY_SKILL_ID = PREFIX + "findBySkillId";

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AppuserHasSkillPK appuserHasSkillPK;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "appuserHasSkill")
    private AppuserSkillRating appuserSkillRating;

    @JoinColumn(name = "skill_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Skill skill;

    @JoinColumn(name = "appuser_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Appuser appuser;

    @Column(name="additional_comments")
    private String additionalComments;

    @Column(name="relevant_exp")
    private Integer relevantExp;

    public AppuserHasSkill() {
    }

    public AppuserHasSkill(AppuserHasSkillPK appuserHasSkillPK) {
        this.appuserHasSkillPK = appuserHasSkillPK;
    }

    public AppuserHasSkill(int appuserId, int skillId) {
        this.appuserHasSkillPK = new AppuserHasSkillPK(appuserId, skillId);
    }

    public AppuserHasSkillPK getAppuserHasSkillPK() {
        return appuserHasSkillPK;
    }

    public void setAppuserHasSkillPK(AppuserHasSkillPK appuserHasSkillPK) {
        this.appuserHasSkillPK = appuserHasSkillPK;
    }

    public AppuserSkillRating getAppuserSkillRating() {
        return appuserSkillRating;
    }

    public void setAppuserSkillRating(AppuserSkillRating appuserSkillRating) {
        this.appuserSkillRating = appuserSkillRating;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Appuser getAppuser() {
        return appuser;
    }

    public void setAppuser(Appuser appuser) {
        this.appuser = appuser;
    }

    public String getAdditionalComments() {
        return additionalComments;
    }

    public void setAdditionalComments(String additionalComments) {
        this.additionalComments = additionalComments;
    }

    public Integer getRelevantExp() {
        return relevantExp;
    }

    public void setRelevantExp(Integer relevantExp) {
        this.relevantExp = relevantExp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (appuserHasSkillPK != null ? appuserHasSkillPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof AppuserHasSkill)) {
            return false;
        }
        AppuserHasSkill other = (AppuserHasSkill) object;
        if ((this.appuserHasSkillPK == null && other.appuserHasSkillPK != null) || (this.appuserHasSkillPK != null && !this.appuserHasSkillPK.equals(other.appuserHasSkillPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.callcomm.eserve.persistence.entity.AppuserHasSkill[ appuserHasSkillPK=" + appuserHasSkillPK + " ]";
    }
}
