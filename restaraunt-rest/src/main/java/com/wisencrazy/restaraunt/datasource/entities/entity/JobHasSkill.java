package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the job_has_skills database table.
 * 
 */
@Entity
@Table(name="job_has_skills")
public class JobHasSkill extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to Job
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "job_id", referencedColumnName = "id")
	private Job job;

	//bi-directional many-to-one association to Skill
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "skill_id", referencedColumnName = "id")
	private Skill skill;

	public JobHasSkill() {
	}

	public Job getJob() {
		return this.job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public Skill getSkill() {
		return this.skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

}