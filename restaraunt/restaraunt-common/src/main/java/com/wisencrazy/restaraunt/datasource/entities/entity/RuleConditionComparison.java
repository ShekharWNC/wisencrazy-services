package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * User: Hoa Ho
 * Date: 3/1/13
 * Time: 1:27 PM
 */
@Entity
@Table(name = "rule_condition_comparison")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = RuleConditionComparison.FIND_ALL, query = "SELECT r FROM RuleConditionComparison r"),
        @NamedQuery(name = RuleConditionComparison.FIND_BY_ID, query = "SELECT r FROM RuleConditionComparison r WHERE r.id = :id"),
        @NamedQuery(name = RuleConditionComparison.FIND_BY_VALUE_2_COMPARE, query = "SELECT r FROM RuleConditionComparison r WHERE r.value2Compare = :value2Compare")})
public class RuleConditionComparison extends AbsBaseEntity {
    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.RuleConditionComparison";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_ID = PREFIX + "findById";
    public static final String FIND_BY_VALUE_2_COMPARE = PREFIX + "findByValue2Compare";

    private static final long serialVersionUID = 1L;
    @Size(max = 255)
    @Column(name = "value_2_compare")
    private String value2Compare;
	@ManyToOne
	@JoinColumn(name = "rule_condition_id", nullable = false)
    private RuleCondition ruleCondition;
    @JoinColumns({
            @JoinColumn(name = "rule_condition_type_id", referencedColumnName = "rule_condition_type_id"),
            @JoinColumn(name = "comparison_operator_id", referencedColumnName = "comparison_operator_id")})
    @ManyToOne(optional = false)
    private RuleConditionTypeHasComparisonOperator ruleConditionTypeHasComparisonOperator;

    public RuleConditionComparison() {
    }

    public String getValue2Compare() {
        return value2Compare;
    }

    public void setValue2Compare(String value2Compare) {
        this.value2Compare = value2Compare;
    }

    public RuleCondition getRuleCondition() {
		return ruleCondition;
	}

	public void setRuleCondition(RuleCondition ruleCondition) {
		this.ruleCondition = ruleCondition;
	}

	public RuleConditionTypeHasComparisonOperator getRuleConditionTypeHasComparisonOperator() {
        return ruleConditionTypeHasComparisonOperator;
    }

    public void setRuleConditionTypeHasComparisonOperator(RuleConditionTypeHasComparisonOperator ruleConditionTypeHasComparisonOperator) {
        this.ruleConditionTypeHasComparisonOperator = ruleConditionTypeHasComparisonOperator;
    }
}

