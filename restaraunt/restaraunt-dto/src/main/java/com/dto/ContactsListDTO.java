package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class ContactsListDTO.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ContactsListDTO implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The contacts category. */
	private String contactsCategory;
    
    /** The href. */
    private String href;
    
    /** The contacts category total. */
    private String contactsCategoryTotal;
    
    /** The contact group list dto. */
    private List<ContactGroupListDTO> contactGroupListDTO;
	
	/**
	 * Gets the contacts category.
	 *
	 * @return the contacts category
	 */
	public String getContactsCategory() {
		return contactsCategory;
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
	 * Gets the contacts category total.
	 *
	 * @return the contacts category total
	 */
	public String getContactsCategoryTotal() {
		return contactsCategoryTotal;
	}
	
	/**
	 * Gets the contact group list dto.
	 *
	 * @return the contact group list dto
	 */
	public List<ContactGroupListDTO> getContactGroupListDTO() {
		return contactGroupListDTO;
	}
	
	/**
	 * Sets the contacts category.
	 *
	 * @param contactsCategory the new contacts category
	 */
	public void setContactsCategory(String contactsCategory) {
		this.contactsCategory = contactsCategory;
	}
	
	/**
	 * Sets the href.
	 *
	 * @param href the new href
	 */
	public void setHref(String href) {
		this.href = href;
	}
	
	/**
	 * Sets the contacts category total.
	 *
	 * @param contactsCategoryTotal the new contacts category total
	 */
	public void setContactsCategoryTotal(String contactsCategoryTotal) {
		this.contactsCategoryTotal = contactsCategoryTotal;
	}
	
	/**
	 * Sets the contact group list dto.
	 *
	 * @param contactGroupListDTO the new contact group list dto
	 */
	public void setContactGroupListDTO(List<ContactGroupListDTO> contactGroupListDTO) {
		this.contactGroupListDTO = contactGroupListDTO;
	}
}
