package com.dto;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * @author vikash
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemHasTimingDTO extends AbsCommonDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 164039901394270379L;

	public enum WEEK {
		SUN, MON, TUE, WED, THU, FRI, SAT
	}

	private Integer sTime;// startTime
	private Integer eTime;// eTime
	private String week;
	private String desc;// description

	public Integer getsTime() {
		return sTime;
	}

	public void setsTime(Integer sTime) {
		this.sTime = sTime;
	}

	public Integer geteTime() {
		return eTime;
	}

	public void seteTime(Integer eTime) {
		this.eTime = eTime;
	}

	public String getWeek() {
		return week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
