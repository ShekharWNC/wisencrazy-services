package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The Class CaseHasAttachments.
 */
@Entity
@Table(name="case_has_attachment")
public class CaseHasAttachment extends AbsBaseEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The ecase id. */
	@ManyToOne(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="ecase_id", referencedColumnName = "id")
	private Ecase ecase;
	
	/** The attachment id. */
	@ManyToOne(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="attachment_id", referencedColumnName = "id")
	private Attachment attachment;
	
	/** The company id. */
	@ManyToOne(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="company_id", referencedColumnName = "id")
	private Company company;
	
	/** The appuser. */
	@ManyToOne(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="subscriber_id", referencedColumnName = "id")
	private Appuser appuser;
	
	/** The project id. */
	@ManyToOne(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="project_id", referencedColumnName = "id")
	private Project project;
	
	/** The conversation id. */
	@Column(name="conversation_id")
	private byte[] conversationId;
	
	/**
	 * The Constructor.
	 */
	public CaseHasAttachment (){
		
	}

	/**
	 * The Constructor.
	 *
	 * @param id the id
	 * @param ecase the ecase
	 * @param attachment the attachment
	 * @param company the company
	 * @param appuser the appuser
	 * @param project the project
	 * @param conversationId the conversation id
	 */
	public CaseHasAttachment(int id, Ecase ecase, Attachment attachment,
			Company company, Appuser appuser, Project project,byte[] conversationId) {
		this.id = id;
		this.ecase = ecase;
		this.attachment = attachment;
		this.company = company;
		this.appuser = appuser;
		this.conversationId = conversationId;
		this.project = project;
	}

	/**
	 * Gets the ecase.
	 *
	 * @return the ecase
	 */
	public Ecase getEcase() {
		return ecase;
	}

	/**
	 * Sets the ecase.
	 *
	 * @param ecase the new ecase
	 */
	public void setEcase(Ecase ecase) {
		this.ecase = ecase;
	}

	/**
	 * Gets the attachment.
	 *
	 * @return the attachment
	 */
	public Attachment getAttachment() {
		return attachment;
	}

	/**
	 * Sets the attachment.
	 *
	 * @param attachment the new attachment
	 */
	public void setAttachment(Attachment attachment) {
		this.attachment = attachment;
	}

	/**
	 * Gets the company.
	 *
	 * @return the company
	 */
	public Company getCompany() {
		return company;
	}

	/**
	 * Sets the company.
	 *
	 * @param company the new company
	 */
	public void setCompany(Company company) {
		this.company = company;
	}

	/**
	 * Gets the appuser.
	 *
	 * @return the appuser
	 */
	public Appuser getAppuser() {
		return appuser;
	}

	/**
	 * Sets the appuser.
	 *
	 * @param appuser the new appuser
	 */
	public void setAppuser(Appuser appuser) {
		this.appuser = appuser;
	}

	/**
	 * Gets the project.
	 *
	 * @return the project
	 */
	public Project getProject() {
		return project;
	}

	/**
	 * Sets the project.
	 *
	 * @param project the new project
	 */
	public void setProject(Project project) {
		this.project = project;
	}

	public byte[] getConversationId() {
		return conversationId;
	}

	public void setConversationId(byte[] conversationId) {
		this.conversationId = conversationId;
	}

}