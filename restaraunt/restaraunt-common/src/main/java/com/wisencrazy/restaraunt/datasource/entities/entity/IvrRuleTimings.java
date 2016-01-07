package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.sql.Time;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "ivr_rule_timings")
public class IvrRuleTimings extends AbsBaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "start_time")
	private Time startTime;
	
	@Column(name = "end_time")
	private Time endTime;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "ivr_rule_timings_id", nullable = false)
	private List<IvrRuleAppliedOn> ivrRuleAppliedOns;
	
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

	public List<IvrRuleAppliedOn> getIvrRuleAppliedOns() {
		return ivrRuleAppliedOns;
	}

	public void setIvrRuleAppliedOns(List<IvrRuleAppliedOn> ivrRuleAppliedOns) {
		this.ivrRuleAppliedOns = ivrRuleAppliedOns;
	}
}
