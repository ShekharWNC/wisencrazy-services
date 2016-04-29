package com.wisencrazy.restaraunt.rest.dto;

import java.io.Serializable;
import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * The Class OrderSearchDTO.
 */
public class OrderSearchDTO implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 3370786295444017431L;
	
	/** The to date. */
	private Date fromDate,toDate;
	
	/** The count. */
	private Integer count;
	
	/** The page index. */
	private Integer pageIndex;
	
	/**
	 * Gets the from date.
	 *
	 * @return the from date
	 */
	public Date getFromDate() {
		return fromDate;
	}
	
	/**
	 * Sets the from date.
	 *
	 * @param fromDate the new from date
	 */
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	
	/**
	 * Gets the to date.
	 *
	 * @return the to date
	 */
	public Date getToDate() {
		return toDate;
	}
	
	/**
	 * Sets the to date.
	 *
	 * @param toDate the new to date
	 */
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	
	/**
	 * Gets the count.
	 *
	 * @return the count
	 */
	public Integer getCount() {
		return count;
	}
	
	/**
	 * Sets the count.
	 *
	 * @param count the new count
	 */
	public void setCount(Integer count) {
		this.count = count;
	}
	
	/**
	 * Gets the page index.
	 *
	 * @return the page index
	 */
	public Integer getPageIndex() {
		return pageIndex;
	}
	
	/**
	 * Sets the page index.
	 *
	 * @param pageIndex the new page index
	 */
	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	
}
