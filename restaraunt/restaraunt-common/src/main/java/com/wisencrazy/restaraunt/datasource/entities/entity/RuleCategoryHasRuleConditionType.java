package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the rule_category_has_rule_condition_type database table.
 * 
 * @author Krish Lakshmanan
 * @since 17/02/2014
 */
@Entity
@Table(name="rule_category_has_rule_condition_type")
@NamedQueries({
		@NamedQuery(name = RuleCategoryHasRuleConditionType.FIND_BY_CATEGORY, query = "SELECT r.ruleConditionType FROM RuleCategoryHasRuleConditionType r where r.ruleCategory.name = :ruleCategory"),
		@NamedQuery(name = RuleCategoryHasRuleConditionType.FIND_BY_CATEGORY_FOR_CHANNEL, query = "SELECT r.ruleConditionType FROM RuleCategoryHasRuleConditionType r where r.ruleCategory.name in (:ruleCategory,'ALL_CHANNEL')"),
		@NamedQuery(name = RuleCategoryHasRuleConditionType.FIND_BY_TIMER_CATEGORY, query = "SELECT r.ruleConditionType FROM RuleCategoryHasRuleConditionType r where r.ruleCategory.name in (:ruleCategory)") })
public class RuleCategoryHasRuleConditionType extends AbsBaseEntity {

	private static final long serialVersionUID = 5174973235344170248L;

	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.RuleCategoryHasRuleConditionType.";
	public static final String FIND_BY_CATEGORY = PREFIX + "findByCategory";
	public static final String FIND_BY_CATEGORY_FOR_CHANNEL = PREFIX + "findByCategoryForChannel";
	public static final String FIND_BY_TIMER_CATEGORY = PREFIX + "findByTimerCategory";
	
	@JoinColumn(name = "rule_condition_type_id")
	@ManyToOne
	private RuleConditionType ruleConditionType;

	@ManyToOne
	@JoinColumn(name="rule_category_id")
	private RuleCategory ruleCategory;

	public RuleCategoryHasRuleConditionType() {
	}

	public RuleConditionType getRuleConditionType() {
		return ruleConditionType;
	}

	public void setRuleConditionType(RuleConditionType ruleConditionType) {
		this.ruleConditionType = ruleConditionType;
	}

	public RuleCategory getRuleCategory() {
		return this.ruleCategory;
	}

	public void setRuleCategory(RuleCategory ruleCategory) {
		this.ruleCategory = ruleCategory;
	}

}