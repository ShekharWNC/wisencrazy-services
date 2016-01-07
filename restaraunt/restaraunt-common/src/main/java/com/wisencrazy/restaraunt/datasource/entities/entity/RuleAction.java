package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * User: Hoa Ho
 * Date: 3/4/13
 * Time: 1:55 PM
 */
@Entity
@Table(name = "rule_action")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "RuleAction.findAll", query = "SELECT r FROM RuleAction r"),
        @NamedQuery(name = "RuleAction.findById", query = "SELECT r FROM RuleAction r WHERE r.id = :id")})
public class RuleAction extends AbsBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -348479309535861573L;

	@JoinColumn(name = "rule_action_type_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private RuleActionType ruleActionType;
	@ManyToOne
	@JoinColumn(name = "routing_rule_id", nullable = false)
    private RoutingRule routingRule;
	@OneToMany(mappedBy = "ruleAction", cascade = { CascadeType.ALL }, orphanRemoval = true)
    private List<RuleActionParam> ruleActionParams;

	@JoinTable(name = "rule_action_has_recipient", joinColumns = { @JoinColumn(name = "rule_action_id", referencedColumnName = "id") }, inverseJoinColumns = { @JoinColumn(name = "recipient_id", referencedColumnName = "id") })
	@ManyToMany
	private List<Recipient> recipients;

	public RuleAction() {
    }

    public RuleActionType getRuleActionType() {
		return ruleActionType;
	}

	public void setRuleActionType(RuleActionType ruleActionType) {
		this.ruleActionType = ruleActionType;
	}


	public RoutingRule getRoutingRule() {
		return routingRule;
	}

	public void setRoutingRule(RoutingRule routingRule) {
		this.routingRule = routingRule;
	}

	@XmlTransient
	public List<RuleActionParam> getRuleActionParams() {
		return ruleActionParams;
	}

	public void setRuleActionParams(List<RuleActionParam> ruleActionParams) {
		this.ruleActionParams = ruleActionParams;
	}

	public List<Recipient> getRecipients() {
		return recipients;
	}

	public void setRecipients(List<Recipient> recipients) {
		this.recipients = recipients;
	}
}

