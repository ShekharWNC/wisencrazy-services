package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * User: Hoa Ho
 * Date: 3/4/13
 * Time: 1:56 PM
 */
@Entity
@Table(name = "rule_action_param")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "RuleActionParam.findAll", query = "SELECT r FROM RuleActionParam r"),
        @NamedQuery(name = "RuleActionParam.findById", query = "SELECT r FROM RuleActionParam r WHERE r.id = :id"),
        @NamedQuery(name = "RuleActionParam.findByParam", query = "SELECT r FROM RuleActionParam r WHERE r.param = :param")})
public class RuleActionParam extends AbsBaseEntity {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "param")
    private String param;
	@ManyToOne
	@JoinColumn(name = "rule_action_id", nullable = false)
    private RuleAction ruleAction;

    public RuleActionParam() {
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

	public RuleAction getRuleAction() {
		return ruleAction;
	}

	public void setRuleAction(RuleAction ruleAction) {
		this.ruleAction = ruleAction;
	}

}

