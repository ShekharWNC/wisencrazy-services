package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the rule_category_has_rule_action_type database table.
 * 
 * @author Krish Lakshmanan
 * @since 17/02/2014
 */
@Entity
@Table(name="rule_category_has_rule_action_type")
@NamedQueries({
		@NamedQuery(name = RuleCategoryHasRuleActionType.FIND_BY_CATEGORY, query = "SELECT r.ruleActionType FROM RuleCategoryHasRuleActionType r where r.ruleCategory.name = :ruleCategory"),
		@NamedQuery(name = RuleCategoryHasRuleActionType.FIND_BY_CATEGORY_FOR_CHANNEL, query = "SELECT r.ruleActionType FROM RuleCategoryHasRuleActionType r where r.ruleCategory.name in (:ruleCategory,'ALL_CHANNEL')") })
public class RuleCategoryHasRuleActionType extends AbsBaseEntity {

	private static final long serialVersionUID = -210634904472300051L;
	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.RuleCategoryHasRuleActionType.";
	public static final String FIND_BY_CATEGORY = PREFIX + "findByCategory";
	public static final String FIND_BY_CATEGORY_FOR_CHANNEL = PREFIX + "findByCategoryForChannel";

	@JoinColumn(name = "rule_action_type_id")
	@ManyToOne
	private RuleActionType ruleActionType;

	@ManyToOne
	@JoinColumn(name="rule_category_id")
	private RuleCategory ruleCategory;
	
	private String component;

	public RuleCategoryHasRuleActionType() {
	}

	public RuleActionType getRuleActionType() {
		return ruleActionType;
	}

	public void setRuleActionType(RuleActionType ruleActionType) {
		this.ruleActionType = ruleActionType;
	}

	public RuleCategory getRuleCategory() {
		return this.ruleCategory;
	}

	public void setRuleCategory(RuleCategory ruleCategory) {
		this.ruleCategory = ruleCategory;
	}

	public String getComponent() {
		return component;
	}

	public void setComponent(String component) {
		this.component = component;
	}

}