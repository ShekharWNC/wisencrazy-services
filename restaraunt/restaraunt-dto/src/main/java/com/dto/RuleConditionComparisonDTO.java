package com.dto;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class RuleConditionComparisonDTO extends AbsCommonDTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7105594969005301769L;

	private String value2Compare;
    
	private RuleConditionTypeHasComparisonOperatorDTO ruleConditionTypeHasComparisonOperator;

	public String getValue2Compare() {
		return value2Compare;
	}

	public void setValue2Compare(String value2Compare) {
		this.value2Compare = value2Compare;
	}

	public RuleConditionTypeHasComparisonOperatorDTO getRuleConditionTypeHasComparisonOperator() {
		return ruleConditionTypeHasComparisonOperator;
	}

	public void setRuleConditionTypeHasComparisonOperator(
			RuleConditionTypeHasComparisonOperatorDTO ruleConditionTypeHasComparisonOperator) {
		this.ruleConditionTypeHasComparisonOperator = ruleConditionTypeHasComparisonOperator;
	}

}
