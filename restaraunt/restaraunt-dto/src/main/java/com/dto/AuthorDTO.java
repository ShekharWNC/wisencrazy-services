package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class AuthorDTO extends AbsCommonDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String firstName;
	String lastName;
	String photoUrl;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public AuthorDTO() {
		// TODO Auto-generated constructor stub
	}

	public AuthorDTO(String firstName, String lastName, String photoUrl) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.photoUrl = photoUrl;
	}

}
