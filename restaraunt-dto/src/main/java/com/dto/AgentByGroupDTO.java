package com.dto;
public class AgentByGroupDTO extends AbsCommonDTO{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
   private String name;
   private String virtualSid;
   private String firstName;
   private String lastName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVirtualSid() {
		return virtualSid;
	}
	public void setVirtualSid(String virtualSid) {
		this.virtualSid = virtualSid;
	}
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
}