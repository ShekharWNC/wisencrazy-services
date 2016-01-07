package com.dto;
import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
// TODO: Auto-generated Javadoc

/**
 * The Class CompanyNameDTO.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class CompanyNameDTO extends AbsCommonDTO implements Serializable{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The version. */
	private String version;
	
	/** The company name. */
	private List<CompanyName> companyName;
	
	/**
	 * Gets the version.
	 *
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}
	
	/**
	 * Gets the company name.
	 *
	 * @return the company name
	 */
	public List<CompanyName> getCompanyName() {
		return companyName;
	}
	
	/**
	 * Sets the version.
	 *
	 * @param version the new version
	 */
	public void setVersion(String version) {
		this.version = version;
	}
	
	/**
	 * Sets the company name.
	 *
	 * @param companyName the new company name
	 */
	public void setCompanyName(List<CompanyName> companyName) {
		this.companyName = companyName;
	}

}
