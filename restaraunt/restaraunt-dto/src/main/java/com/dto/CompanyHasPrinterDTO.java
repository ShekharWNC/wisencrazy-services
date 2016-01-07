package com.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class CompanyHasPrinterDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3426860697174564688L;

	private String ipAddress;

	private Boolean enabled;

	private String model;

	private String printerName;
	
	private String location;
	
	private Integer noOfCopies;
	
	private String header;
	
	private String footer;
	
	private Boolean isDefault;
	
    private CompanyPrinterTypeDTO  printerType;

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPrinterName() {
		return printerName;
	}

	public void setPrinterName(String printerName) {
		this.printerName = printerName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(Integer noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getFooter() {
		return footer;
	}

	public void setFooter(String footer) {
		this.footer = footer;
	}

	public Boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public CompanyPrinterTypeDTO getPrinterType() {
		return printerType;
	}

	public void setPrinterType(CompanyPrinterTypeDTO printerType) {
		this.printerType = printerType;
	}
}
