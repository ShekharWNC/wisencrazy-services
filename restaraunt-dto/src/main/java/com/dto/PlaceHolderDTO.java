package com.dto;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class PlaceHolderDTO.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class PlaceHolderDTO extends AbsCommonDTO{
   
   /** The Constant serialVersionUID. */
   private static final long serialVersionUID = 6337585566483963925L;
   
   /** The name. */
   private String name;
   
   /** The place holder type. */
   private String placeHolderType;
   
   /** The attribute name. */
   private String attributeName;
   
   
	/**
	 * Gets the attribute name.
	 *
	 * @return the attribute name
	 */
	public String getAttributeName() {
		return attributeName;
	}

	/**
	 * Sets the attribute name.
	 *
	 * @param attributeName the new attribute name
	 */
	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
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
	 * Gets the place holder type.
	 *
	 * @return the place holder type
	 */
	public String getPlaceHolderType() {
		return placeHolderType;
	}

	/**
	 * Sets the place holder type.
	 *
	 * @param placeHolderType the new place holder type
	 */
	public void setPlaceHolderType(String placeHolderType) {
		this.placeHolderType = placeHolderType;
	}
	   
}
