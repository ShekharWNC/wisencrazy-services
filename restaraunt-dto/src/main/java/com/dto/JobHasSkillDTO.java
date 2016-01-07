package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the job_has_skills database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class JobHasSkillDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to Job
	private JobDTO job;

	//bi-directional many-to-one association to Skill
	private SkillDTO skill;

	public JobHasSkillDTO() {
	}

	public JobHasSkillDTO(JobDTO job, SkillDTO skill) {
		super();
		this.job = job;
		this.skill = skill;
	}
	public JobDTO getJob() {
		return this.job;
	}

	public void setJob(JobDTO job) {
		this.job = job;
	}

	public SkillDTO getSkill() {
		return this.skill;
	}

	public void setSkill(SkillDTO skill) {
		this.skill = skill;
	}

}