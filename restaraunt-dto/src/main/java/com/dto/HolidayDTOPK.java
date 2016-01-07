package com.dto;

import java.io.Serializable;

public class HolidayDTOPK implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7871868362152563760L;

	private int companyId;

	private String holidayDate;

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getHolidayDate() {
		return holidayDate;
	}

	public void setHolidayDate(String holidayDate) {
		this.holidayDate = holidayDate;
	}
}
