package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * UserTO: Hoa Ho
 * Date: 2/20/13
 * Time: 3:09 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "skill")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = Skill.FIND_ALL, query = "SELECT s FROM Skill s"),
        @NamedQuery(name = Skill.FIND_BY_ID, query = "SELECT s FROM Skill s WHERE s.id = :id"),
        @NamedQuery(name = Skill.FIND_BY_NAME, query = "SELECT s FROM Skill s WHERE s.name = :name")})
public class Skill extends AbsBaseEntity {
    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.Skill.";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_ID = PREFIX + "findById";
    public static final String FIND_BY_NAME = PREFIX + "findByName";

    private static final long serialVersionUID = 1L;
    @Size(max = 45)
    @Column(name = "name")
    private String name;
    //bi-directional many-to-one association to SkillType
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="skill_type_id", referencedColumnName = "id")
    private SkillType skillType;
    
    @ManyToOne/*(cascade = CascadeType.ALL)*/
    @JoinColumn(name="company_id", referencedColumnName = "id")
    private Company company;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "skill")
    private List<AppuserHasSkill> appuserHasSkillList;
    
	public Skill() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SkillType getSkillType() {
        return skillType;
    }

    public void setSkillType(SkillType skillType) {
        this.skillType = skillType;
    }

    @XmlTransient
    public List<AppuserHasSkill> getAppuserHasSkillList() {
        return appuserHasSkillList;
    }

    public void setAppuserHasSkillList(List<AppuserHasSkill> appuserHasSkillList) {
        this.appuserHasSkillList = appuserHasSkillList;
    }

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
    
}
