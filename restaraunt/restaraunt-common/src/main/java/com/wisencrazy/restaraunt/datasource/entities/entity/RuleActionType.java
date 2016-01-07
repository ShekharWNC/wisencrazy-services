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
 * Date: 3/4/13
 * Time: 1:51 PM
 */
@Entity
@Table(name = "rule_action_type")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = RuleActionType.FIND_ALL, query = "SELECT r FROM RuleActionType r"),
        @NamedQuery(name = RuleActionType.FIND_BY_ID, query = "SELECT r FROM RuleActionType r WHERE r.id = :id"),
		@NamedQuery(name = RuleActionType.FIND_BY_NAME, query = "SELECT r FROM RuleActionType r WHERE r.name = :name"),
		@NamedQuery(name = RuleActionType.FIND_BY_SID, query = "SELECT r FROM RuleActionType r WHERE hex(r.sid) = :sid") })
public class RuleActionType extends AbsBaseEntity {

	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.RuleActionType.";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_ID = PREFIX + "findById";
    public static final String FIND_BY_NAME = PREFIX + "findByName";
	public static final String FIND_BY_SID = PREFIX + "findBySid";

    /**
	 * 
	 */
	private static final long serialVersionUID = 4698775651665190093L;
	
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "name")
    private String name;

	@Column(name = "entity_name")
	private String entityName;
	
	@Column(name = "name_constant")
	private String nameConstant;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ruleActionType")
    private List<RuleAction> ruleActions;

    public RuleActionType() {
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
	public List<RuleAction> getRuleActions() {
		return ruleActions;
	}

	public void setRuleActions(List<RuleAction> ruleActions) {
		this.ruleActions = ruleActions;
	}

	public String getNameConstant() {
		return nameConstant;
	}

	public void setNameConstant(String nameConstant) {
		this.nameConstant = nameConstant;
	}

}

