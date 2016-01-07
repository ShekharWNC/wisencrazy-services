package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.PrimaryKeyJoinColumns;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * UserTO: Hoa Ho
 * Date: 2/20/13
 * Time: 3:15 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "appuser_skill_rating")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = AppuserSkillRating.FIND_ALL, query = "SELECT a FROM AppuserSkillRating a"),
        @NamedQuery(name = AppuserSkillRating.FIND_BY_USER_ID, query = "SELECT a FROM AppuserSkillRating a WHERE a.appuserHasSkillPK.appuserId = :appuserHasSkillAppuserId"),
        @NamedQuery(name = AppuserSkillRating.FIND_BY_SKILL_ID, query = "SELECT a FROM AppuserSkillRating a WHERE a.appuserHasSkillPK.skillId = :appuserHasSkillSkillId"),
        @NamedQuery(name = AppuserSkillRating.FIND_BY_RATING, query = "SELECT a FROM AppuserSkillRating a WHERE a.rating = :rating")})
public class AppuserSkillRating extends AbsCompositeEntity {
    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.AppuserSkillRating.";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_USER_ID = PREFIX + "findByAppuserId";
    public static final String FIND_BY_SKILL_ID = PREFIX + "findBySkillId";
    public static final String FIND_BY_RATING = PREFIX + "findByRating";

    private static final long serialVersionUID = 1L;
    @EmbeddedId @AttributeOverrides({
            @AttributeOverride(name = "appuserId", column = @Column(name = "appuser_has_skill_appuser_id")),
            @AttributeOverride(name = "skillId", column = @Column(name = "appuser_has_skill_skill_id"))
    })
    protected AppuserHasSkillPK appuserHasSkillPK;

    @Basic(optional = false)
    @NotNull
    @Column(name = "rating")
    private short rating;

    @JoinColumn(name = "rating_type_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private RatingType ratingTypeId;

    @PrimaryKeyJoinColumns({
            @PrimaryKeyJoinColumn(name = "appuser_has_skill_appuser_id", referencedColumnName = "appuser_id"),
            @PrimaryKeyJoinColumn(name = "appuser_has_skill_skill_id", referencedColumnName = "skill_id")
    })
    @OneToOne(optional = false)
    private AppuserHasSkill appuserHasSkill;

    public AppuserSkillRating() {
    }

    public AppuserSkillRating(AppuserHasSkillPK appuserHasSkillPK) {
        this.appuserHasSkillPK = appuserHasSkillPK;
    }

    public AppuserSkillRating(AppuserHasSkillPK appuserHasSkillPK, short rating) {
        this.appuserHasSkillPK = appuserHasSkillPK;
        this.rating = rating;
    }

    public AppuserSkillRating(int appuserHasSkillAppuserId, int appuserHasSkillSkillId) {
        this.appuserHasSkillPK = new AppuserHasSkillPK(appuserHasSkillAppuserId, appuserHasSkillSkillId);
    }

    public AppuserHasSkillPK getAppuserHasSkillPK() {
        return appuserHasSkillPK;
    }

    public void setAppuserHasSkillPK(AppuserHasSkillPK appuserHasSkillPK) {
        this.appuserHasSkillPK = appuserHasSkillPK;
    }

    public short getRating() {
        return rating;
    }

    public void setRating(short rating) {
        this.rating = rating;
    }

    public RatingType getRatingTypeId() {
        return ratingTypeId;
    }

    public void setRatingTypeId(RatingType ratingTypeId) {
        this.ratingTypeId = ratingTypeId;
    }

    public AppuserHasSkill getAppuserHasSkill() {
        return appuserHasSkill;
    }

    public void setAppuserHasSkill(AppuserHasSkill appuserHasSkill) {
        this.appuserHasSkill = appuserHasSkill;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (appuserHasSkillPK != null ? appuserHasSkillPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof AppuserSkillRating)) {
            return false;
        }
        AppuserSkillRating other = (AppuserSkillRating) object;
        if ((this.appuserHasSkillPK == null && other.appuserHasSkillPK != null) || (this.appuserHasSkillPK != null && !this.appuserHasSkillPK.equals(other.appuserHasSkillPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.callcomm.eserve.persistence.entity.AppuserSkillRating[ appuserHasSkillPK=" + appuserHasSkillPK + " ]";
    }
}
