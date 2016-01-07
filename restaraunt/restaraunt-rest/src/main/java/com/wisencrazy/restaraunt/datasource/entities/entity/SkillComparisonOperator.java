package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.wisencrazy.restaraunt.datasource.entities.entity.AbsBaseEntity;

/**
 * The persistaence class for skill_comparison_operator table
 *
 */
@Entity
@Table(name="skill_comparison_operator")
public class SkillComparisonOperator extends AbsBaseEntity {

	private static final long serialVersionUID = -3883523862088745128L;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="comparison_operator_id")
	private ComparisonOperator comparisonOperator;
	
	public SkillComparisonOperator() {
	}

	public ComparisonOperator getComparisonOperator() {
		return comparisonOperator;
	}

	public void setComparisonOperator(ComparisonOperator comparisonOperator) {
		this.comparisonOperator = comparisonOperator;
	}
   
}
