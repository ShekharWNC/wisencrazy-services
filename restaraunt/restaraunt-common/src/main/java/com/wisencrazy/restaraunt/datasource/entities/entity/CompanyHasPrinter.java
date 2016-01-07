package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;



/**
 * The persistent class for the company_has_printer database table.
 * 
 */
@Entity
@Table(name="company_has_printer")
@NamedQueries({
	@NamedQuery(name = CompanyHasPrinter.FIND_BY_COMPANY_ID, query = "select c FROM CompanyHasPrinter c where c.id.companyId = :id "),
	@NamedQuery(name = CompanyHasPrinter.FIND_BY_COMPANY_IPADDRESS, query = "FROM CompanyHasPrinter c where c.id.companyId = :id AND c.id.ipAddress = :ipAddress")
})
public class CompanyHasPrinter implements Serializable {
	private static final long serialVersionUID = 1L;
	private static final String PREFIX = "com.callcomm.eserve.persistence.entity.CompanyHasPrinter.";
	public static final String FIND_BY_COMPANY_ID = PREFIX + "findAllByCompanyId";
	public static final String FIND_BY_COMPANY_IPADDRESS = PREFIX + "findPrinterByCompanyIdAddress";
    public static final String DELETE_PRINTER = "DELETE FROM company_has_printer where company_id = (select id from company where hex(sid) = :sid) and  ip_address = :ipAddress";
	public static final String UPDATE_PRINTER = "UPDATE company_has_printer set is_default = 0 where company_id = (select id from company where hex(sid) = :sid) ";
    @EmbeddedId
	private CompanyHasPrinterPK id;

	private Boolean enabled;

	private String model;

	@Column(name="printer_name")
	private String printerName;

	private String location;
	
	@Column(name="no_of_copies")
	private  Integer noOfCopies;
	
	private String header;
	
	private String footer;
	
	@Column(name = "is_default")
	private Boolean isDefault;
	
	
	@ManyToOne
    @JoinColumn(name = "printer_type_id")
    private CompanyPrinterType  printerType;

	public CompanyHasPrinter() {
	}

	public CompanyHasPrinterPK getId() {
		return this.id;
	}

	public void setId(CompanyHasPrinterPK id) {
		this.id = id;
	}

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPrinterName() {
		return this.printerName;
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

	public CompanyPrinterType getPrinterType() {
		return printerType;
	}

	public void setPrinterType(CompanyPrinterType printerType) {
		this.printerType = printerType;
	}
}