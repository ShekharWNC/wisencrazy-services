package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the skill_type database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class SkillTypeDTO extends AbsCommonDTO {


	/**
	 * 
	 */
	private static final long serialVersionUID = 5737292966654797157L;

	private String skillType;

	//bi-directional many-to-one association to Skill
	private List<SkillDTO> skills;

	public SkillTypeDTO() {
	}

	public SkillTypeDTO(String skillType, List<SkillDTO> skills) {
		super();
		this.skillType = skillType;
		this.skills = skills;
	}

	public String getSkillType() {
		return this.skillType;
	}

	public void setSkillType(String skillType) {
		this.skillType = skillType;
	}

	public List<SkillDTO> getSkills() {
		return this.skills;
	}

	public void setSkills(List<SkillDTO> skills) {
		this.skills = skills;
	}


}