package com.dto;

import java.io.Serializable;
import java.util.Date;

public class RestarauntHasReviewsInput implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6169701313254790571L;
	
	private Date timestamp;
	private Integer limit;

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}


}
