package com.dto;




/**
 * The dto class for the CustomTrackingVariable entity.
 * 
 * @author Krish Lakshmanan
 */
public class CustomTrackingVariableDTO extends AbsCommonDTO {

	/** 
	 * 
	 */
	private static final long serialVersionUID = 5129919163929265992L;

	private String name;

	private String value;
	
	private String groupName;
	
	private String groupSid;

	public CustomTrackingVariableDTO() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupSid() {
		return groupSid;
	}

	public void setGroupSid(String groupSid) {
		this.groupSid = groupSid;
	}

}