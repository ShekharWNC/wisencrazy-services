package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ProjectScheduleHasShiftDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	

	private String shiftStatus;

	private ShiftDTO shift;

	public ProjectScheduleHasShiftDTO() {
	}
	public String getShiftStatus() {
		return this.shiftStatus;
	}

	public void setShiftStatus(String shiftStatus) {
		this.shiftStatus = shiftStatus;
	}

	public ShiftDTO getShift() {
		return shift;
	}

	public void setShift(ShiftDTO shift) {
		this.shift = shift;
	}


}