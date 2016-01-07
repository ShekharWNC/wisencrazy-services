package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="vw_case_event_template_processor")
public class CaseEventPlaceHolderView extends AbsBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8001439795251909277L;
	@Column(name="case_id")
	private Integer caseId;
	
	@Column(name="description")
	private String description;
	
	@Column(name="case_type")
	private String caseType;
	
	@Column(name="project_name")
	private String projectName;
	
	@Column(name="project_sid")
	private Byte[] projectSid;
	
	@Column(name="case_status")
	private String caseStatus;
	
	@Column(name="case_priority")
	private String casePriority;
	
	@Column(name="username")
	private String userName;
	
	@Column(name="subject")
	private String subject;
	
	@Column(name = "last_updated_date")
    private Date lastUpdatedDate;
	
	@Column(name = "last_closed_date")
	private Date lastClosedDate;
	
	@Column(name="channel_name")
	private String channelName;
	
	@Column(name="project_group_name")
	private String projectGroupName;
	
	@Column(name="cclist")
	private String ccList;
	
	@Column(name = "duedate")
	private Date duedate;
	
	@Column(name="customer_name")
	private String customerName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="title")
	private String title;
	
	@Column(name="customer_member_since")
	private Date customerMemberSince;
	
	public Integer getCaseId() {
		return caseId;
	}
	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCaseType() {
		return caseType;
	}
	public void setCaseType(String caseType) {
		this.caseType = caseType;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public Byte[] getProjectSid() {
		return projectSid;
	}
	public void setProjectSid(Byte[] projectSid) {
		this.projectSid = projectSid;
	}
	public String getCaseStatus() {
		return caseStatus;
	}
	public void setCaseStatus(String caseStatus) {
		this.caseStatus = caseStatus;
	}
	public String getCasePriority() {
		return casePriority;
	}
	public void setCasePriority(String casePriority) {
		this.casePriority = casePriority;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
	public Date getLastClosedDate() {
		return lastClosedDate;
	}
	public void setLastClosedDate(Date lastClosedDate) {
		this.lastClosedDate = lastClosedDate;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public String getProjectGroupName() {
		return projectGroupName;
	}
	public void setProjectGroupName(String projectGroupName) {
		this.projectGroupName = projectGroupName;
	}
	public String getCcList() {
		return ccList;
	}
	public void setCcList(String ccList) {
		this.ccList = ccList;
	}
	public Date getDuedate() {
		return duedate;
	}
	public void setDuedate(Date duedate) {
		this.duedate = duedate;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getCustomerMemberSince() {
		return customerMemberSince;
	}
	public void setCustomerMemberSince(Date customerMemberSince) {
		this.customerMemberSince = customerMemberSince;
	}

}
