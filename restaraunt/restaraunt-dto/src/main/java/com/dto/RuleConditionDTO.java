package com.dto;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class RuleConditionDTO extends AbsCommonDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6407659868378916963L;

	private String comparisonCondition;

    private List<RuleConditionComparisonDTO> ruleConditionComparisons;

	public String getComparisonCondition() {
		return comparisonCondition;
	}

	public void setComparisonCondition(String comparisonCondition) {
		this.comparisonCondition = comparisonCondition;
	}

	public List<RuleConditionComparisonDTO> getRuleConditionComparisons() {
		return ruleConditionComparisons;
	}

	public void setRuleConditionComparisons(
			List<RuleConditionComparisonDTO> ruleConditionComparisons) {
		this.ruleConditionComparisons = ruleConditionComparisons;
	}

}
