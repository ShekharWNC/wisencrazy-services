package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 * User: Hoa Ho
 * Date: 3/1/13
 * Time: 1:28 PM
 */
@Embeddable
public class RuleConditionTypeHasComparisonOperatorPK implements Serializable {
	private static final long serialVersionUID = 1L;
	@Basic(optional = false)
    @NotNull
    @Column(name = "rule_condition_type_id")
    private int ruleConditionTypeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "comparison_operator_id")
    private int comparisonOperatorId;

    public RuleConditionTypeHasComparisonOperatorPK() {
    }

    public RuleConditionTypeHasComparisonOperatorPK(int ruleConditionTypeId, int comparisonOperatorId) {
        this.ruleConditionTypeId = ruleConditionTypeId;
        this.comparisonOperatorId = comparisonOperatorId;
    }

    public int getRuleConditionTypeId() {
        return ruleConditionTypeId;
    }

    public void setRuleConditionTypeId(int ruleConditionTypeId) {
        this.ruleConditionTypeId = ruleConditionTypeId;
    }

    public int getComparisonOperatorId() {
        return comparisonOperatorId;
    }

    public void setComparisonOperatorId(int comparisonOperatorId) {
        this.comparisonOperatorId = comparisonOperatorId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) ruleConditionTypeId;
        hash += (int) comparisonOperatorId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof RuleConditionTypeHasComparisonOperatorPK)) {
            return false;
        }
        RuleConditionTypeHasComparisonOperatorPK other = (RuleConditionTypeHasComparisonOperatorPK) object;
        if (this.ruleConditionTypeId != other.ruleConditionTypeId) {
            return false;
        }
        if (this.comparisonOperatorId != other.comparisonOperatorId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.callcomm.eserve.persistence.entity.RuleConditionTypeHasComparisonOperatorPK[ ruleConditionTypeId=" + ruleConditionTypeId + ", comparisonOperatorId=" + comparisonOperatorId + " ]";
    }

}