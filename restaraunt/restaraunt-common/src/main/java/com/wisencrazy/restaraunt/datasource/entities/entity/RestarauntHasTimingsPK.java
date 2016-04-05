package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;

import com.wisencrazy.restaraunt.datasource.entities.entity.RestarauntHasTimings.Timings;

@Embeddable
public class RestarauntHasTimingsPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6270759323628004440L;

	@Basic(optional=false)
	@NotNull
	@Column(name="restaraunt_id")
	private int restarauntId;
	
	@Basic(optional=false)
	@NotNull
	@Column(name="timing")
	@Enumerated(EnumType.STRING)
	private Timings timing;

	public Timings getTiming() {
		return timing;
	}

	public void setTiming(Timings timing) {
		this.timing = timing;
	}

	public int getRestarauntId() {
		return restarauntId;
	}

	public void setRestarauntId(int restarauntId) {
		this.restarauntId = restarauntId;
	}
	
}
