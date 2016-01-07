package com.dto;

import java.sql.Time;
import java.util.List;

public class IvrRuleTimingsDTO extends AbsCommonDTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Time startTime;
	
	private Time endTime;
	
	private List<IvrRuleAppliedOnDTO> ivrRuleAppliedOns;

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Time getEndTime() {
		return endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	public List<IvrRuleAppliedOnDTO> getIvrRuleAppliedOns() {
		return ivrRuleAppliedOns;
	}

	public void setIvrRuleAppliedOns(List<IvrRuleAppliedOnDTO> ivrRuleAppliedOns) {
		this.ivrRuleAppliedOns = ivrRuleAppliedOns;
	}	
	
	
}
