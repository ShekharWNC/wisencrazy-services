package com.dto;

import java.io.Serializable;

import com.dto.constants.EnumConstants.PrinterType;


public class CompanyPrinterTypeDTO extends AbsCommonDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String description;

	private PrinterType printerType;


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public PrinterType getPrinterType() {
		return printerType;
	}

	public void setPrinterType(PrinterType printerType) {
		this.printerType = printerType;
	}
	

}
