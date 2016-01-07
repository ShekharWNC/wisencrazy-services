package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
 * Time: 1:33 PM
 */
@Entity
@Table(name = "rule_condition_type")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = RuleConditionType.FIND_ALL, query = "SELECT r FROM RuleConditionType r"),
        @NamedQuery(name = RuleConditionType.FIND_BY_ID, query = "SELECT r FROM RuleConditionType r WHERE r.id = :id"),
        @NamedQuery(name = RuleConditionType.FIND_BY_NAME, query = "SELECT r FROM RuleConditionType r WHERE r.name = :name")})
public class RuleConditionType extends AbsBaseEntity {
    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.RuleConditionType.";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_ID = PREFIX + "findById";
    public static final String FIND_BY_NAME = PREFIX + "findByName";

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "name")
    private String name;

	@Column(name = "entity_name")
	private String entityName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ruleConditionType")
    private List<RuleConditionTypeHasComparisonOperator> ruleConditionTypeHasComparisonOperators;

    public RuleConditionType() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	@XmlTransient
	public List<RuleConditionTypeHasComparisonOperator> getRuleConditionTypeHasComparisonOperators() {
		return ruleConditionTypeHasComparisonOperators;
	}

	public void setRuleConditionTypeHasComparisonOperators(
			List<RuleConditionTypeHasComparisonOperator> ruleConditionTypeHasComparisonOperators) {
		this.ruleConditionTypeHasComparisonOperators = ruleConditionTypeHasComparisonOperators;
	}

}

