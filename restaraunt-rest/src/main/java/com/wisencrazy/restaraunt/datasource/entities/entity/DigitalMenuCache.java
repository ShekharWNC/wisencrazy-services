package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 
 * @author vikash
 *
 */
@Entity
@Table(name = "digital_menu_cache")
public class DigitalMenuCache extends AbsBaseEntity {
	
	private static final long serialVersionUID = 3275485733766272263L;
	public static String FIND_CACHE_STRING_BY_COMPANY_AND_PROJECT="select cache_string from digital_menu_cache where company_id=:companyId and project_id=:projectId";
	public static String DELETE_CACHE_STRING_BY_COMPANY_AND_PROJECT="delete from digital_menu_cache where company_id=:companyId and project_id=:projectId";
	@Column(name = "company_id")
	private Integer companyId;
	@Column(name = "project_id")
	private Integer projectId;
	@Column(name = "cache_string")
	private String cacheString;

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getCacheString() {
		return cacheString;
	}

	public void setCacheString(String cacheString) {
		this.cacheString = cacheString;
	}
}
