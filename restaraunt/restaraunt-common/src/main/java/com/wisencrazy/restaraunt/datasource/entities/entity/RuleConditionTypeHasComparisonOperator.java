package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * User: Hoa Ho
 * Date: 3/1/13
 * Time: 1:28 PM
 */
@Entity
@Table(name = "rule_condition_type_has_comparison_operator")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = RuleConditionTypeHasComparisonOperator.FIND_ALL, query = "SELECT r FROM RuleConditionTypeHasComparisonOperator r"),
        @NamedQuery(name = RuleConditionTypeHasComparisonOperator.FIND_BY_RULE_CONDITIONTYPE, query = "SELECT r FROM RuleConditionTypeHasComparisonOperator r WHERE r.ruleConditionTypeHasComparisonOperatorPK.ruleConditionTypeId = :ruleConditionTypeId"),
		@NamedQuery(name = RuleConditionTypeHasComparisonOperator.FIND_BY_COMPARISONOPERATORID, query = "SELECT r FROM RuleConditionTypeHasComparisonOperator r WHERE r.ruleConditionTypeHasComparisonOperatorPK.comparisonOperatorId = :comparisonOperatorId"),
		@NamedQuery(name = RuleConditionTypeHasComparisonOperator.FIND_BY_CONDITION_TYPE_COMPARISON, query = "SELECT r FROM RuleConditionTypeHasComparisonOperator r WHERE hex(r.ruleConditionType.sid) = :ruleConditionTypeSid and hex(r.comparisonOperator.sid) = :comparisonOperatorSid") })
public class RuleConditionTypeHasComparisonOperator extends AbsCompositeEntity {
    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.RuleConditionTypeHasComparisonOperator.";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_RULE_CONDITIONTYPE = PREFIX + "findByRuleConditionTypeId";
    public static final String FIND_BY_COMPARISONOPERATORID = PREFIX + "findByComparisonOperatorId";
    public static final String FIND_BY_CONDITION_TYPE_COMPARISON = PREFIX + "findByConditionTypeComparison";

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RuleConditionTypeHasComparisonOperatorPK ruleConditionTypeHasComparisonOperatorPK;
    @JoinColumn(name = "comparison_operator_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ComparisonOperator comparisonOperator;
    @JoinColumn(name = "rule_condition_type_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private RuleConditionType ruleConditionType;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ruleConditionTypeHasComparisonOperator")
    private List<RuleConditionComparison> ruleConditionComparisons;

    public RuleConditionTypeHasComparisonOperator() {
    }

    public RuleConditionTypeHasComparisonOperator(RuleConditionTypeHasComparisonOperatorPK ruleConditionTypeHasComparisonOperatorPK) {
        this.ruleConditionTypeHasComparisonOperatorPK = ruleConditionTypeHasComparisonOperatorPK;
    }

    public RuleConditionTypeHasComparisonOperator(int ruleConditionTypeId, int comparisonOperatorId) {
        this.ruleConditionTypeHasComparisonOperatorPK = new RuleConditionTypeHasComparisonOperatorPK(ruleConditionTypeId, comparisonOperatorId);
    }

    public RuleConditionTypeHasComparisonOperatorPK getRuleConditionTypeHasComparisonOperatorPK() {
        return ruleConditionTypeHasComparisonOperatorPK;
    }

    public void setRuleConditionTypeHasComparisonOperatorPK(RuleConditionTypeHasComparisonOperatorPK ruleConditionTypeHasComparisonOperatorPK) {
        this.ruleConditionTypeHasComparisonOperatorPK = ruleConditionTypeHasComparisonOperatorPK;
    }

    public ComparisonOperator getComparisonOperator() {
        return comparisonOperator;
    }

    public void setComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    public RuleConditionType getRuleConditionType() {
        return ruleConditionType;
    }

    public void setRuleConditionType(RuleConditionType ruleConditionType) {
        this.ruleConditionType = ruleConditionType;
    }

    @XmlTransient
    public List<RuleConditionComparison> getRuleConditionComparisons() {
		return ruleConditionComparisons;
	}

	public void setRuleConditionComparisons(
			List<RuleConditionComparison> ruleConditionComparisons) {
		this.ruleConditionComparisons = ruleConditionComparisons;
	}
	
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ruleConditionTypeHasComparisonOperatorPK != null ? ruleConditionTypeHasComparisonOperatorPK.hashCode() : 0);
        return hash;
    }

	@Override
    public boolean equals(Object object) {
        if (!(object instanceof RuleConditionTypeHasComparisonOperator)) {
            return false;
        }
        RuleConditionTypeHasComparisonOperator other = (RuleConditionTypeHasComparisonOperator) object;
        if ((this.ruleConditionTypeHasComparisonOperatorPK == null && other.ruleConditionTypeHasComparisonOperatorPK != null) || (this.ruleConditionTypeHasComparisonOperatorPK != null && !this.ruleConditionTypeHasComparisonOperatorPK.equals(other.ruleConditionTypeHasComparisonOperatorPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.callcomm.eserve.persistence.entity.RuleConditionTypeHasComparisonOperator[ ruleConditionTypeHasComparisonOperatorPK=" + ruleConditionTypeHasComparisonOperatorPK + " ]";
    }

}
