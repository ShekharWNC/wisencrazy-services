package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * User: Hoa Ho
 * Date: 3/1/13
 * Time: 1:15 PM
 */
@Entity
@Table(name = "routing_rule")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = RoutingRule.FIND_ALL, query = "SELECT r FROM RoutingRule r"),
        @NamedQuery(name = RoutingRule.FIND_BY_ID, query = "SELECT r FROM RoutingRule r WHERE r.id = :id"),
        @NamedQuery(name = RoutingRule.FIND_BY_SID, query = "SELECT r FROM RoutingRule r WHERE hex(r.sid) = :sid"),
        @NamedQuery(name = RoutingRule.FIND_BY_NAME, query = "SELECT r FROM RoutingRule r WHERE r.name = :name"),
		@NamedQuery(name = RoutingRule.VALIDATE_NAME, query = "SELECT r FROM RoutingRule r WHERE r.name = :name and hex(r.project.sid) = :projectSid and hex(r.sid) != :sid"),
        @NamedQuery(name = RoutingRule.FIND_BY_ENABLE, query = "SELECT r FROM RoutingRule r WHERE r.enable = :enable"),
		@NamedQuery(name = RoutingRule.FIND_STATUS_BY_SID, query = "SELECT r.enable FROM RoutingRule r WHERE hex(r.sid) = :routingRuleSid"),
		@NamedQuery(name = RoutingRule.FIND_BY_PROJECT, query = "SELECT r FROM RoutingRule r WHERE hex(r.project.sid) = :projectSid order by r.priorityOrder"),
		@NamedQuery(name = RoutingRule.FIND_BY_PROJECT_AND_RULE_TYPE, query = "SELECT r FROM RoutingRule r WHERE hex(r.project.sid) = :projectSid and r.ruleType.name = :ruleType and r.createdType != com.callcomm.eserve.persistence.entity.RoutingRule$CreatedType.SYSTEM_DEFINED_FAIL_SAFE order by r.priorityOrder"),
        @NamedQuery(name = RoutingRule.FIND_BY_PRIORITY_ORDER, query = "SELECT r FROM RoutingRule r WHERE r.priorityOrder = :priorityOrder"),
        @NamedQuery(name=RoutingRule.FIND_BY_SUPPORT_CHANNEL_ID, query="SELECT r FROM RoutingRule r where r.project.id=:projectId and r.channel.id=:channelId"),
		@NamedQuery(name = RoutingRule.FIND_BY_RULE_TYPE_ID, query = "SELECT r FROM RoutingRule r where r.project.id=:projectId and r.ruleType.id=:ruleTypeId and r.enable=true order by r.priorityOrder"),
		@NamedQuery(name = RoutingRule.FIND_ALL_TIMED_RULES, query = "SELECT r FROM RoutingRule r where r.ruleType.id=2 and enable=true order by r.id asc"),
		@NamedQuery(name = RoutingRule.FIND_DEFAULT_BY_RULE_TYPE, query = "SELECT r FROM RoutingRule r where hex(r.project.sid)=:projectSid and r.ruleType.name=:ruleTypeName and r.createdType = com.callcomm.eserve.persistence.entity.RoutingRule$CreatedType.SYSTEM_DEFINED"),
		@NamedQuery(name = RoutingRule.FIND_DEFAULT_BY_RULE_TYPE_FOR_CHANNEL, query = "SELECT r FROM RoutingRule r where hex(r.project.sid)=:projectSid and r.ruleType.name=:ruleTypeName and r.createdType = com.callcomm.eserve.persistence.entity.RoutingRule$CreatedType.SYSTEM_DEFINED and hex(r.channel.sid) =:channelSid"),
        @NamedQuery(name=RoutingRule.FIND_ENABLED_BY_SUPPORT_CHANNEL_ID, query="SELECT r FROM RoutingRule r where r.project.id=:projectId and r.channel.id=:channelId and r.enable=true order by r.priorityOrder")
        })
public class RoutingRule extends AbsBaseEntity {
	private static final long serialVersionUID = 2076003342476563991L;
	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.RoutingRule.";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_ID = PREFIX + "findById";
    public static final String FIND_BY_SID = PREFIX + "findBySid";
    public static final String FIND_BY_NAME = PREFIX + "findByName";
	public static final String VALIDATE_NAME = PREFIX + "validateName";
    public static final String FIND_BY_ENABLE = PREFIX + "findByEnable";
    public static final String FIND_BY_PRIORITY_ORDER = PREFIX + "findByPriorityOrder";
    public static final String FIND_BY_SUPPORT_CHANNEL_ID=PREFIX+"findBySupportChannelId";
	public static final String FIND_BY_PROJECT = PREFIX + "findByProject";
	public static final String FIND_BY_PROJECT_AND_RULE_TYPE = PREFIX + "findByProjectAndRuleType";
	public static final String FIND_STATUS_BY_SID = PREFIX + "findStatusBySid";
    public static final String RUN_RULE_ALWAYS = "A";
    public static final String RUN_RULE_DURING_BUSINESS_HR = "BH";
    public static final String RUN_RULE_NOT_DURING_BUSINESS_HR = "NBH";
    public static final String FIND_BY_RULE_TYPE_ID=PREFIX+"findByRuleTypeId";
	public static final String FIND_DEFAULT_BY_RULE_TYPE = PREFIX + "findDefaultByRuleType";
	public static final String FIND_DEFAULT_BY_RULE_TYPE_FOR_CHANNEL = PREFIX + "findDefaultByRuleTypeForChannel";
	public static final String FIND_ALL_TIMED_RULES=PREFIX+"findTimedRules";
    public static final String FIND_ENABLED_BY_SUPPORT_CHANNEL_ID=PREFIX+"findEnabledBySupportChannelId";
	
	public enum CreatedType {
		SYSTEM_DEFINED,
		USER_DEFINED,
		SYSTEM_DEFINED_FAIL_SAFE
	}
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "enable")
    private boolean enable;
    @Basic(optional = false)
    @NotNull
    @Column(name = "priority_order")
    private short priorityOrder;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "run_rule")
    private String runRule;

	@Column(name = "created_type")
	@Enumerated(EnumType.STRING)
	private CreatedType createdType;

	@JoinColumn(name = "project_id", referencedColumnName = "id")
    @ManyToOne
	private Project project;
	@OneToMany(mappedBy = "routingRule", cascade = { CascadeType.ALL }, orphanRemoval = true)
    private List<RuleCondition> ruleConditions;
	@OneToMany(mappedBy = "routingRule", cascade = { CascadeType.ALL }, orphanRemoval = true)
    private List<RuleAction> ruleActions;
	@JoinColumn(name = "rule_type_id")
	@ManyToOne
	private RuleType ruleType;

	@JoinTable(name = "routing_rule_has_channel", joinColumns = { @JoinColumn(name = "routing_rule_id", referencedColumnName = "id") }, inverseJoinColumns = {
            @JoinColumn(name = "channel_id", referencedColumnName = "id")})
    @OneToOne
	private Channel channel;
	
    public RoutingRule() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public short getPriorityOrder() {
        return priorityOrder;
    }

    public void setPriorityOrder(short priorityOrder) {
        this.priorityOrder = priorityOrder;
    }

    public String getRunRule() {
        return runRule;
    }

    public void setRunRule(String runRule) {
        this.runRule = runRule;
    }

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@XmlTransient
    public List<RuleCondition> getRuleConditions() {
		return ruleConditions;
	}

	public void setRuleConditions(List<RuleCondition> ruleConditions) {
		this.ruleConditions = ruleConditions;
	}

    @XmlTransient
	public List<RuleAction> getRuleActions() {
		return ruleActions;
	}

	public void setRuleActions(List<RuleAction> ruleActions) {
		this.ruleActions = ruleActions;
	}

	public RuleType getRuleType() {
		return ruleType;
	}

	public void setRuleType(RuleType ruleType) {
		this.ruleType = ruleType;
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	public CreatedType getCreatedType() {
		return createdType;
	}

	public void setCreatedType(CreatedType createdType) {
		this.createdType = createdType;
	}

}
