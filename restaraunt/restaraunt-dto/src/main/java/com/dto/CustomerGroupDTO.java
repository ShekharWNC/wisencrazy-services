package com.dto;

public class CustomerGroupDTO extends AbsCommonDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6363885647548969349L;

	private String email;
	
	private String groupName;
	
	private String description;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
