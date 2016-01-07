/**
 * 
 */
package com.dto;

import java.io.Serializable;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class CaseNotificationMail.
 *
 * @author raviteja
 */
public class CaseNotificationMail implements Serializable{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	
	/** The case sid. */
	private String caseSid;
	
	/** The customer. */
	private String userName;
	
	/** The status. */
	private String status;
	
	/** The to. */
	private List<String> to;
	
	/** The project sid. */
	private String projectSid;
	
	/** The subject. */
	private String subject;
	
	/** The case id. */
	private String caseId;
	
	/** The customer name. */
	private String customerName;
	
	/** The customer phone no. */
	private String customerPhoneNo;
	
	/** The campaign name. */
	private String campaignName;
	
	/**
	 * Instantiates a new case notification mail.
	 */
	public CaseNotificationMail(){
		
	}
	
	/**
	 * Instantiates a new case notification mail.
	 *
	 * @param caseSid the case sid
	 * @param userName the user name
	 * @param status the status
	 * @param to the to
	 * @param cc the cc
	 */
	public CaseNotificationMail(String caseSid, String userName, String status,
			List<String> to, String cc) {
		this.caseSid = caseSid;
		this.userName = userName;
		this.status = status;
		this.to = to;
	}
	
	/**
	 * Gets the case sid.
	 *
	 * @return the case sid
	 */
	public String getCaseSid() {
		return caseSid;
	}
	
	/**
	 * Sets the case sid.
	 *
	 * @param caseSid the new case sid
	 */
	public void setCaseSid(String caseSid) {
		this.caseSid = caseSid;
	}
	
	
	/**
	 * Gets the user name.
	 *
	 * @return the user name
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * Sets the user name.
	 *
	 * @param userName the new user name
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	
	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	/**
	 * Gets the to.
	 *
	 * @return the to
	 */
	public List<String> getTo() {
		return to;
	}
	
	/**
	 * Sets the to.
	 *
	 * @param to the new to
	 */
	public void setTo(List<String> to) {
		this.to = to;
	}
	

	/**
	 * Gets the project sid.
	 *
	 * @return the project sid
	 */
	public String getProjectSid() {
		return projectSid;
	}

	/**
	 * Sets the project sid.
	 *
	 * @param projectSid the new project sid
	 */
	public void setProjectSid(String projectSid) {
		this.projectSid = projectSid;
	}

	/**
	 * Gets the subject.
	 *
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * Sets the subject.
	 *
	 * @param subject the new subject
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * Gets the case id.
	 *
	 * @return the case id
	 */
	public String getCaseId() {
		return caseId;
	}

	/**
	 * Sets the case id.
	 *
	 * @param caseId the new case id
	 */
	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}

	/**
	 * Gets the customer name.
	 *
	 * @return the customer name
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * Sets the customer name.
	 *
	 * @param customerName the new customer name
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * Gets the customer phone no.
	 *
	 * @return the customer phone no
	 */
	public String getCustomerPhoneNo() {
		return customerPhoneNo;
	}

	/**
	 * Sets the customer phone no.
	 *
	 * @param customerPhoneNo the new customer phone no
	 */
	public void setCustomerPhoneNo(String customerPhoneNo) {
		this.customerPhoneNo = customerPhoneNo;
	}

	/**
	 * Gets the campaign name.
	 *
	 * @return the campaign name
	 */
	public String getCampaignName() {
		return campaignName;
	}

	/**
	 * Sets the campaign name.
	 *
	 * @param campaignName the new campaign name
	 */
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	
}
