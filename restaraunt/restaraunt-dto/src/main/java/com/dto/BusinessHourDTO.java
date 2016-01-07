package com.dto;

import java.util.Date;



public class BusinessHourDTO extends AbsCommonDTO {

    /**
	 * 
	 */
	private static final long serialVersionUID = -3587088475129617934L;
	private String weekday;
    private String startHr;
    private String endHr;
    private CompanyDTO company;

    public BusinessHourDTO() {
    }

    public BusinessHourDTO(Integer id) {
        this.id = id;
    }

    public BusinessHourDTO(Integer id, String weekday, String startHr, String endHr) {
        this.id = id;
        this.weekday = weekday;
        this.startHr = startHr;
        this.endHr = endHr;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }
	public String getStartHr() {
		return startHr;
	}

	public void setStartHr(String startHr) {
		this.startHr = startHr;
	}

	public String getEndHr() {
		return endHr;
	}

	public void setEndHr(String endHr) {
		this.endHr = endHr;
	}

	public CompanyDTO getCompany() {
		return company;
	}

	public void setCompany(CompanyDTO company) {
		this.company = company;
	}


}
