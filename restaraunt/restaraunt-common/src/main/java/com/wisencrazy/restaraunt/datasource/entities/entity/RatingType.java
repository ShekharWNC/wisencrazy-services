package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * UserTO: Hoa Ho
 * Date: 2/20/13
 * Time: 3:18 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "rating_type")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = RatingType.FIND_ALL, query = "SELECT r FROM RatingType r"),
        @NamedQuery(name = RatingType.FIND_BY_ID, query = "SELECT r FROM RatingType r WHERE r.id = :id"),
        @NamedQuery(name = RatingType.FIND_BY_NAME, query = "SELECT r FROM RatingType r WHERE r.name = :name")})
public class RatingType extends AbsBaseEntity {
    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.RatingType.";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_ID = PREFIX + "findById";
    public static final String FIND_BY_NAME = PREFIX + "findByName";

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "name")
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ratingTypeId")
    private List<AppuserSkillRating> appuserSkillRatingList;

    public RatingType() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public List<AppuserSkillRating> getAppuserSkillRatingList() {
        return appuserSkillRatingList;
    }

    public void setAppuserSkillRatingList(List<AppuserSkillRating> appuserSkillRatingList) {
        this.appuserSkillRatingList = appuserSkillRatingList;
    }

}
