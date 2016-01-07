package com.wisencrazy.restaraunt.datasource.entities.to;

import java.io.Serializable;
/**
 * 
 * @author Vikash Pandey
 *
 */
public class RecipientAddressTO implements Serializable{

	private static final long serialVersionUID = -2740110698665732578L;
	private String email;
	private String name;
	private String sid;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	
}
