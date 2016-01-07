package com.dto;

import java.util.List;

public class KnowledgeBaseDTO extends AbsCommonDTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7740716982870496463L;
	private String title;
	private String access;
	private List<CategoryDTO> categories;
	private String status;
	private Boolean isDefault;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<CategoryDTO> getCategories() {
		return categories;
	}
	public void setCategories(List<CategoryDTO> categories) {
		this.categories = categories;
	}
	public String getAccess() {
		return access;
	}
	public void setAccess(String access) {
		this.access = access;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Boolean getIsDefault() {
		return isDefault;
	}
	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}
	
}
