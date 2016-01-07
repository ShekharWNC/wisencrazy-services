package com.dto;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class RuleConditionTypeHasComparisonOperatorDTO extends AbsCommonDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -440642804570922766L;

	private CommonDTO comparisonOperator;

    private CommonDTO ruleConditionType;

	public CommonDTO getComparisonOperator() {
		return comparisonOperator;
	}

	public CommonDTO getRuleConditionType() {
		return ruleConditionType;
	}

	public void setComparisonOperator(CommonDTO comparisonOperator) {
		this.comparisonOperator = comparisonOperator;
	}

	public void setRuleConditionType(CommonDTO ruleConditionType) {
		this.ruleConditionType = ruleConditionType;
	}

}
