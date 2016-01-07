package com.dto;

import java.io.Serializable;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * The persistent class for the skill database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class SkillDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String skill;
	private SkillTypeDTO skillType;
	private CompanyDTO company;

	/*//bi-directional many-to-one association to JobHasSkill
	private List<JobHasSkillDTO> jobHasSkills;

	//bi-directional many-to-one association to UserHasSkill
	private List<AppuserHasSkillDTO> userHasSkills;

	//bi-directional many-to-one association to IndustryHasSkills
	private List<IndustryHasSkillsDTO> industryHasSkills;*/
	
	public SkillDTO() {
	}

	public CompanyDTO getCompany() {
		return company;
	}

	public void setCompany(CompanyDTO company) {
		this.company = company;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public SkillTypeDTO getSkillType() {
		return skillType;
	}

	public void setSkillType(SkillTypeDTO skillType) {
		this.skillType = skillType;
	}
	
}