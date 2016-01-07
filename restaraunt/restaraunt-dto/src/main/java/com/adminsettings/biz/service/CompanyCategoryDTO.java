package com.adminsettings.biz.service;

import com.dto.AbsCommonDTO;
import com.dto.AttachmentCommonDTO;

public class CompanyCategoryDTO extends AbsCommonDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 205206593234658680L;

	private String name;
	
	private String description;
	
	private Boolean isDefault;
	
	private Boolean isEnabled;
	
	private AttachmentCommonDTO logo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = (isDefault == null)? true : isDefault;
	}

	public Boolean getIsEnabled() {
		return isEnabled;
	}

	public void setIsEnabled(Boolean isEnabled) {
		this.isEnabled = (isEnabled == null)? true : isEnabled;
	}

	public AttachmentCommonDTO getLogo() {
		return logo;
	}

	public void setLogo(AttachmentCommonDTO logo) {
		this.logo = logo;
	}
}
