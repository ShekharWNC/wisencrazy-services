package com.dto;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class RoutingRuleDTO extends AbsCommonDTO{

	public enum CreatedType {
		SYSTEM_DEFINED,
		USER_DEFINED,
		SYSTEM_DEFINED_FAIL_SAFE		
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5816779737587032083L;

	private String name;
    
    private boolean enable;
    
    private short priorityOrder;

    private String runRule;
    
    private String ruleType;
    
    private CreatedType createdType;

    private List<RuleConditionDTO> ruleConditions;

    private List<RuleActionDTO> ruleActions;
    
    private CommonDTO channel;

	private List<RecipientDTO> recipients;

    public RoutingRuleDTO() {
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

	public List<RuleConditionDTO> getRuleConditions() {
		return ruleConditions;
	}

	public List<RuleActionDTO> getRuleActions() {
		return ruleActions;
	}

	public void setRuleConditions(List<RuleConditionDTO> ruleConditions) {
		this.ruleConditions = ruleConditions;
	}

	public void setRuleActions(List<RuleActionDTO> ruleActions) {
		this.ruleActions = ruleActions;
	}

	public String getRuleType() {
		return ruleType;
	}

	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
	}

	public CommonDTO getChannel() {
		return channel;
	}

	public void setChannel(CommonDTO channel) {
		this.channel = channel;
	}

	public List<RecipientDTO> getRecipients() {
		return recipients;
	}

	public void setRecipients(List<RecipientDTO> recipients) {
		this.recipients = recipients;
	}

	public CreatedType getCreatedType() {
		return createdType;
	}

	public void setCreatedType(CreatedType createdType) {
		this.createdType = createdType;
	}
    
}
