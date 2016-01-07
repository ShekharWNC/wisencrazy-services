package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * User: Hoa Ho
 * Date: 3/1/13
 * Time: 1:33 PM
 */
@Entity
@Table(name = "comparison_operator")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = ComparisonOperator.FIND_ALL, query = "SELECT c FROM ComparisonOperator c"),
        @NamedQuery(name = ComparisonOperator.FIND_BY_ID, query = "SELECT c FROM ComparisonOperator c WHERE c.id = :id"),
		@NamedQuery(name = ComparisonOperator.FIND_BY_NAME, query = "SELECT c FROM ComparisonOperator c WHERE c.name = :name"),
		@NamedQuery(name = ComparisonOperator.FIND_BY_RULE_CONDITIONTYPE, query = "SELECT r.comparisonOperator FROM RuleConditionTypeHasComparisonOperator r WHERE hex(r.ruleConditionType.sid) = :ruleConditionTypeSid") })
public class ComparisonOperator extends AbsBaseEntity {
    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.ComparisonOperator.";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_ID = PREFIX + "findById";
    public static final String FIND_BY_NAME = PREFIX + "findByName";
	public static final String FIND_BY_RULE_CONDITIONTYPE = PREFIX + "findByRuleConditionType";

    private static final long serialVersionUID = 1L;
    @Size(max = 45)
    @Column(name = "name")
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "comparisonOperator")
    private List<RuleConditionTypeHasComparisonOperator> ruleConditionTypeHasComparisonOperatorList;

    public ComparisonOperator() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public List<RuleConditionTypeHasComparisonOperator> getRuleConditionTypeHasComparisonOperatorList() {
        return ruleConditionTypeHasComparisonOperatorList;
    }

    public void setRuleConditionTypeHasComparisonOperatorList(List<RuleConditionTypeHasComparisonOperator> ruleConditionTypeHasComparisonOperatorList) {
        this.ruleConditionTypeHasComparisonOperatorList = ruleConditionTypeHasComparisonOperatorList;
    }
}
