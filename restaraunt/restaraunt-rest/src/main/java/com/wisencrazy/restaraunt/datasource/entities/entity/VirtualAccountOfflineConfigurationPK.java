package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class VirtualAccountOfflineConfigurationPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4408037219610782430L;
	
	@Column(name="virtual_account_id")
	private Integer virtualAccountId;

	@Column(name="project_id")
	private Integer projectId;
	
	public void setVirtualAccountId(Integer virtualAccountId) {
		this.virtualAccountId = virtualAccountId;
	}
	
	public Integer getVirtualAccountId() {
		return virtualAccountId;
	}
	
	public Integer getProjectId() {
		return projectId;
	}
	
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	
	public VirtualAccountOfflineConfigurationPK() {
	}
	
	public VirtualAccountOfflineConfigurationPK(Integer projectId,Integer virtualAccountId) {
		this.virtualAccountId=virtualAccountId;
		this.projectId=projectId;
	}
	
}
