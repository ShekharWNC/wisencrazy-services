package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
/**
 * 
 * @author Vikash Pandey
 *
 */
@Entity
@Table(name="vw_search_case")
public class CaseSearchView extends AbsBaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7476117673594399821L;
	@Column(name="case_id")
	private String caseId;
	@Column(name="cclist")
	private String ccList;
	@Column(name="created_by")
	private String createdBy;
	@Column(name="requestor_type")
	private String caseRequesterType;
	@Column(name="creation_date")
	private String creationDate;
	@Column(name="subject")
	private String subject;
	@Column(name="status")
	private String status;
	@Column(name="channel")
	private String channel;
	@Column(name="priority")
	private String priority;
	@Column(name="case_type")
	private String caseType;
	@Column(name="project_sid")
    private byte[]  projectSid;
	@Column(name="assigned_group")
	private String assignedGroupName;
	@Column(name="assigned_agent")
	private byte[] assigendAgent;
	public String getCaseId() {
		return caseId;
	}
	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}
	public String getCcList() {
		return ccList;
	}
	public void setCcList(String ccList) {
		this.ccList = ccList;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getCaseRequesterType() {
		return caseRequesterType;
	}
	public void setCaseRequesterType(String caseRequesterType) {
		this.caseRequesterType = caseRequesterType;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getCaseType() {
		return caseType;
	}
	public void setCaseType(String caseType) {
		this.caseType = caseType;
	}
	public byte[] getProjectSid() {
		return projectSid;
	}
	public void setProjectSid(byte[] projectSid) {
		this.projectSid = projectSid;
	}
	
	public String getAssignedGroupName() {
		return assignedGroupName;
	}
	public void setAssignedGroupName(String assignedGroupName) {
		this.assignedGroupName = assignedGroupName;
	}
	public byte[] getAssigendAgent() {
		return assigendAgent;
	}
	public void setAssigendAgent(byte[] assigendAgent) {
		this.assigendAgent = assigendAgent;
	}	
	
}
