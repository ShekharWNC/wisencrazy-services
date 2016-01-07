package com.viachat.dto.ordermngt.core;

import java.io.Serializable;

public class OrderCostDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4666796806234007702L;

	private String priceCategoryName = null;
	private double percentageVal = 0;
	private double totalValue = 0;

	public String getPriceCategoryName() {
		return priceCategoryName;
	}

	public void setPriceCategoryName(String priceCategoryName) {
		this.priceCategoryName = priceCategoryName;
	}

	public double getPercentageVal() {
		return percentageVal;
	}

	public void setPercentageVal(double percentageVal) {
		this.percentageVal = percentageVal;
	}

	public double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}

}
