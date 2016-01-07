package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="rq_criteria_action_has_skill")
public class RoutingQueueCriteriaActionHasSkill extends AbsBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7425047586900145473L;

	@ManyToOne
	@JoinColumn(name="skill_id")
	private Skill skill;
	
	@ManyToOne
	@JoinColumn(name="comparison_operator_id")
	private ComparisonOperator comparisonOperator;
	
	@Column(name="comparison_value")
	private Integer comparisonValue;

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public ComparisonOperator getComparisonOperator() {
		return comparisonOperator;
	}

	public void setComparisonOperator(ComparisonOperator comparisonOperator) {
		this.comparisonOperator = comparisonOperator;
	}

	public Integer getComparisonValue() {
		return comparisonValue;
	}

	public void setComparisonValue(Integer comparisonValue) {
		this.comparisonValue = comparisonValue;
	}
}