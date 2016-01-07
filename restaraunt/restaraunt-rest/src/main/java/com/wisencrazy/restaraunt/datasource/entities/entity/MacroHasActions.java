package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "macro_has_actions")
public class MacroHasActions extends AbsBaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3538955725301253329L;

	@ManyToOne
	@JoinColumn(name = "rule_action_type_id", referencedColumnName = "id", nullable = false)
	private RuleActionType ruleActionType;
	
	private String value;

	public RuleActionType getRuleActionType() {
		return ruleActionType;
	}

	public void setRuleActionType(RuleActionType ruleActionType) {
		this.ruleActionType = ruleActionType;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
