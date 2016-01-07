package com.dto;

import java.util.Date;

public class BusinessHourCommonDTO extends AbsCommonDTO {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7187224855216169900L;
	private String weekday;
    private Date startHr;
    private Date endHr;
    
    
	public String getWeekday() {
		return weekday;
	}
	public void setWeekday(String weekday) {
		this.weekday = weekday;
	}
	public Date getStartHr() {
		return startHr;
	}
	public void setStartHr(Date startHr) {
		this.startHr = startHr;
	}
	public Date getEndHr() {
		return endHr;
	}
	public void setEndHr(Date endHr) {
		this.endHr = endHr;
	}
    
    
}
