package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class CompanyName.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class CompanyName extends AbsCommonDTO implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The name. */
	private String name;
	
	/** The href. */
	private String href;
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Gets the href.
	 *
	 * @return the href
	 */
	public String getHref() {
		return href;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Sets the href.
	 *
	 * @param href the new href
	 */
	public void setHref(String href) {
		this.href = href;
	}

}
