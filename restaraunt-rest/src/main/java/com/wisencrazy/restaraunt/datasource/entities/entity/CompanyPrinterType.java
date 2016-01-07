package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.dto.constants.EnumConstants.PrinterType;



@Entity
@Table(name = "company_has_printer_type")
@NamedQueries({
@NamedQuery(name = CompanyPrinterType.FIND_BY_PRINTER_TYPE, query = "SELECT c FROM CompanyPrinterType c")
})
public class CompanyPrinterType extends AbsBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.CompanyPrinterType.";
	public static final String FIND_BY_PRINTER_TYPE = PREFIX + "findByPrinterType";
	
	
	private String description;

	@Enumerated(EnumType.STRING)
	@Column(name = "printer_type")
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
