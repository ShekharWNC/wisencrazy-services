package com.dto;

import java.io.Serializable;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class OtherSkillDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String skillName;

	private byte status;

	private AppuserDTO user;
	
	private AppuserDTO adminUser;

	public OtherSkillDTO() {
	}
	public String getSkillName() {
		return this.skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public AppuserDTO getUser() {
		return user;
	}

	public void setUser(AppuserDTO user) {
		this.user = user;
	}

	public AppuserDTO getAdminUser() {
		return adminUser;
	}

	public void setAdminUser(AppuserDTO adminUser) {
		this.adminUser = adminUser;
	}
}