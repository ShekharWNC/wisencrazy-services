package com.dto;

import java.io.Serializable;

public class CustomerReviewDTO extends AbsCommonDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8469199087627287989L;
	
	private String name;
	private String photoUrl;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhotoUrl() {
		return photoUrl;
	}
	
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

}
