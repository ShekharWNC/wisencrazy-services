package com.dto;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class RuleActionDTO extends AbsCommonDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 870449267706357416L;

	private CommonDTO ruleActionType;
	
	private List<RuleActionParamDTO> ruleActionParams;

	private List<RecipientDTO> recipients;

	public CommonDTO getRuleActionType() {
		return ruleActionType;
	}

	public List<RuleActionParamDTO> getRuleActionParams() {
		return ruleActionParams;
	}

	public void setRuleActionType(CommonDTO ruleActionType) {
		this.ruleActionType = ruleActionType;
	}

	public void setRuleActionParams(List<RuleActionParamDTO> ruleActionParams) {
		this.ruleActionParams = ruleActionParams;
	}

	public List<RecipientDTO> getRecipients() {
		return recipients;
	}

	public void setRecipients(List<RecipientDTO> recipients) {
		this.recipients = recipients;
	}
	
}
