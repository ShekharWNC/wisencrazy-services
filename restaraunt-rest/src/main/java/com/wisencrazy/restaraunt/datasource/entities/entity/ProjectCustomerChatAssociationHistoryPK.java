package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
public class ProjectCustomerChatAssociationHistoryPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4698804490693366085L;

	@Basic(optional = false)
    @NotNull
    @Column(name = "project_id")
	private int projectId;
	
	@Basic(optional = false)
    @NotNull
    @Column(name = "customer_id")
	private int customerId;

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public ProjectCustomerChatAssociationHistoryPK() {
		// TODO Auto-generated constructor stub
	}

	public ProjectCustomerChatAssociationHistoryPK(int projectId, int customerId) {
		super();
		this.projectId = projectId;
		this.customerId = customerId;
	}
	
	
}
