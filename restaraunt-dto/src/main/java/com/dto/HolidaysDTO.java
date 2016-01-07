package com.dto;


public class HolidaysDTO extends AbsCommonDTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -269344777046146229L;
	
	public static final int insert = 0;
	public static final int update = 1;
	public static final int delete = 2;

	private String holiday;
	
	private String holidayDate;
	
	private HolidayDTOPK compositeId;
	
	private int status;

	public String getHoliday() {
		return holiday;
	}

	public void setHoliday(String holiday) {
		this.holiday = holiday;
	}

	public String getHolidayDate() {
		return holidayDate;
	}

	public void setHolidayDate(String holidayDate) {
		this.holidayDate = holidayDate;
	}

	public HolidayDTOPK getCompositeId() {
		return compositeId;
	}

	public void setCompositeId(HolidayDTOPK compositeId) {
		this.compositeId = compositeId;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
