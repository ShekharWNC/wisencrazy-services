package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the skill_type database table.
 * @author vikash pandey
 */
@Entity
@Table(name="skill_type")
public class SkillType extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(name="skill_type")
	private String skillType;
	
	@ManyToOne/*(cascade = CascadeType.ALL)*/
    @JoinColumn(name="company_id", referencedColumnName = "id")
    private Company company;

	//bi-directional many-to-one association to Skill
	/*@OneToMany(mappedBy="skillType")
	private List<Skill> skills;*/

	public SkillType() {
	}

	public String getSkillType() {
		return this.skillType;
	}

	public void setSkillType(String skillType) {
		this.skillType = skillType;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	
}