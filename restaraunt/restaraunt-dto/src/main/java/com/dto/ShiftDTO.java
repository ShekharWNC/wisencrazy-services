package com.dto;

import java.io.Serializable;
import java.sql.Time;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class ShiftDTO extends AbsCommonDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Time startTime;
	
	private Time endTime;
	
	private String shiftRepeatsBy;
	
	private List<EventRepeatsOnDTO> shiftRepeatsOn;
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

	public String getShiftRepeatsBy() {
		return shiftRepeatsBy;
	}

	public void setShiftRepeatsBy(String shiftRepeatsBy) {
		this.shiftRepeatsBy = shiftRepeatsBy;
	}

	public List<EventRepeatsOnDTO> getShiftRepeatsOn() {
		return shiftRepeatsOn;
	}

	public void setShiftRepeatsOn(List<EventRepeatsOnDTO> shiftRepeatsOn) {
		this.shiftRepeatsOn = shiftRepeatsOn;
	}
	
	
	
}
