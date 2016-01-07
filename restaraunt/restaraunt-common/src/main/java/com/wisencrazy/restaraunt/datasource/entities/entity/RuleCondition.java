package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * User: Hoa Ho
 * Date: 3/1/13
 * Time: 1:24 PM
 */
@Entity
@Table(name = "rule_condition")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = RuleCondition.FIND_ALL, query = "SELECT r FROM RuleCondition r"),
        @NamedQuery(name = RuleCondition.FIND_BY_ID, query = "SELECT r FROM RuleCondition r WHERE r.id = :id"),
        @NamedQuery(name = RuleCondition.FIND_BY_COMPARISION_CONDITION, query = "SELECT r FROM RuleCondition r WHERE r.comparisonCondition = :comparisonCondition")})
public class RuleCondition extends AbsBaseEntity {
    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.RuleCondition.";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_ID = PREFIX + "findById";
    public static final String FIND_BY_COMPARISION_CONDITION = PREFIX + "findByComparisonCondition";

    public static final String COMPARISON_CONDITION_ALL = "ALL";
    public static final String COMPARISON_CONDITION_ANY = "ANY";

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "comparison_condition")
    private String comparisonCondition;
	@ManyToOne
	@JoinColumn(name = "routing_rules_id", nullable = false)
    private RoutingRule routingRule;
	@OneToMany(mappedBy = "ruleCondition", cascade = { CascadeType.ALL }, orphanRemoval = true)
    private List<RuleConditionComparison> ruleConditionComparisons;

    public RuleCondition() {
    }

    public String getComparisonCondition() {
        return comparisonCondition;
    }

    public void setComparisonCondition(String comparisonCondition) {
        this.comparisonCondition = comparisonCondition;
    }

    public RoutingRule getRoutingRule() {
		return routingRule;
	}

	public void setRoutingRule(RoutingRule routingRule) {
		this.routingRule = routingRule;
	}
	
	@XmlTransient
	public List<RuleConditionComparison> getRuleConditionComparisons() {
		return ruleConditionComparisons;
	}

	public void setRuleConditionComparisons(
			List<RuleConditionComparison> ruleConditionComparisons) {
		this.ruleConditionComparisons = ruleConditionComparisons;
	}
    
}
