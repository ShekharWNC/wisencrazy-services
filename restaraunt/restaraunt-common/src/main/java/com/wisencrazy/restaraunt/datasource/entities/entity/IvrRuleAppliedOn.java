package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ivr_rule_applied_on")
public class IvrRuleAppliedOn extends AbsBaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "day")
	private String day;

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}
}
