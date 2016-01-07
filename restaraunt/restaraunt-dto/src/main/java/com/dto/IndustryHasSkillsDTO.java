package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the industry_type database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class IndustryHasSkillsDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private IndustryTypeDTO industryType;
	
	private SkillDTO skill;

	public IndustryHasSkillsDTO() {
	}

	public IndustryHasSkillsDTO(IndustryTypeDTO industryType, SkillDTO skill) {
		super();
		this.industryType = industryType;
		this.skill = skill;
	}
	public IndustryTypeDTO getIndustryType() {
		return industryType;
	}

	public void setIndustryType(IndustryTypeDTO industryType) {
		this.industryType = industryType;
	}

	public SkillDTO getSkill() {
		return skill;
	}

	public void setSkill(SkillDTO skill) {
		this.skill = skill;
	}

}