package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
// TODO: Auto-generated Javadoc

/**
 * The Class ActionOptionDTO.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ActionOptionDTO extends AbsCommonDTO implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The value. */
	private String value;
	
	/** The href. */
	public String href;

	/**
	 * Instantiates a new action option dto.
	 */
	public ActionOptionDTO() {
	}

	/**
	 * Instantiates a new action option dto.
	 *
	 * @param value the value
	 * @param href the href
	 */
	public ActionOptionDTO(String value, String href) {
		super();
		this.setValue(value);
		this.href = href;
	}

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value.
	 *
	 * @param value the new value
	 */
	public void setValue(String value) {
		this.value = value;
	}
	
	
}