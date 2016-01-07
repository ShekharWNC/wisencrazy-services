package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


// TODO: Auto-generated Javadoc
/**
 * The persistent class for the vw_case_has_attachment database table.
 * 
 */
@Entity
@Table(name="vw_case_has_attachment")
public class CaseHasAttachmentView extends AbsCompositeEntity{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The attachment id. */
	@Id
	@Column(name="attachment_id")
	private Integer attachmentId;

	/** The company id. */
	@Column(name="company_id")
	private Integer companyId;

	/** The content type. */
	@Column(name="content_type")
	private String contentType;

	/** The conversation id. */
	@Column(name="conversation_id")
	private byte[] conversationId;

	/** The created by. */
	@Column(name="created_by")
	private String createdBy;

	/** The created date. */
	@Column(name="created_date")
	private Timestamp createdDate;

	/** The ecase id. */
	@Column(name="ecase_id")
	private Integer ecaseId;

	/** The extension. */
	@Column(name="extension")
	private String extension;

	/** The file name. */
	@Column(name="file_name")
	private String fileName;

	/** The file path. */
	@Column(name="file_path")
	private String filePath;

	/** The file size. */
	@Column(name="file_size")
	private String fileSize;

	/** The project id. */
	@Column(name="project_id")
	private Integer projectId;
	

	/** The status. */
	@Column(name="status")
	private String status;
	
	/** The file type. */
	@Column(name="attachment_type")
	private String fileType;

	/** The subscriber id. */
	@Column(name="subscriber_id")
	private Integer subscriberId;

	/**
	 * Instantiates a new case has attachment view.
	 */
	public CaseHasAttachmentView() {
	}
	
	

	/**
	 * Instantiates a new case has attachment view.
	 *
	 * @param attachmentId the attachment id
	 * @param companyId the company id
	 * @param contentType the content type
	 * @param conversationId the conversation id
	 * @param createdBy the created by
	 * @param createdDate the created date
	 * @param ecaseId the ecase id
	 * @param extension the extension
	 * @param fileName the file name
	 * @param filePath the file path
	 * @param fileSize the file size
	 * @param projectId the project id
	 * @param status the status
	 * @param subscriberId the subscriber id
	 * @param fileType the file type
	 */
	public CaseHasAttachmentView(Integer attachmentId, Integer companyId,
			String contentType, byte[] conversationId, String createdBy,
			Timestamp createdDate, Integer ecaseId, String extension,
			String fileName, String filePath, String fileSize, Integer projectId,
			String status, Integer subscriberId,String fileType) {
		this.attachmentId = attachmentId;
		this.companyId = companyId;
		this.contentType = contentType;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.ecaseId = ecaseId;
		this.conversationId=conversationId;
		this.extension = extension;
		this.fileName = fileName;
		this.filePath = filePath;
		this.fileSize = fileSize;
		this.projectId = projectId;
		this.status = status;
		this.subscriberId = subscriberId;
		this.fileType = fileType;
	}



	/**
	 * Gets the attachment id.
	 *
	 * @return the attachment id
	 */
	public Integer getAttachmentId() {
		return this.attachmentId;
	}

	/**
	 * Sets the attachment id.
	 *
	 * @param attachmentId the new attachment id
	 */
	public void setAttachmentId(Integer attachmentId) {
		this.attachmentId = attachmentId;
	}

	/**
	 * Gets the company id.
	 *
	 * @return the company id
	 */
	public Integer getCompanyId() {
		return this.companyId;
	}

	/**
	 * Sets the company id.
	 *
	 * @param companyId the new company id
	 */
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	/**
	 * Gets the content type.
	 *
	 * @return the content type
	 */
	public String getContentType() {
		return this.contentType;
	}

	/**
	 * Sets the content type.
	 *
	 * @param contentType the new content type
	 */
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	

	public byte[] getConversationId() {
		return conversationId;
	}



	public void setConversationId(byte[] conversationId) {
		this.conversationId = conversationId;
	}



	/**
	 * Gets the created by.
	 *
	 * @return the created by
	 */
	public String getCreatedBy() {
		return this.createdBy;
	}

	/**
	 * Sets the created by.
	 *
	 * @param createdBy the new created by
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * Gets the created date.
	 *
	 * @return the created date
	 */
	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	/**
	 * Sets the created date.
	 *
	 * @param createdDate the new created date
	 */
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * Gets the ecase id.
	 *
	 * @return the ecase id
	 */
	public Integer getEcaseId() {
		return this.ecaseId;
	}

	/**
	 * Sets the ecase id.
	 *
	 * @param ecaseId the new ecase id
	 */
	public void setEcaseId(Integer ecaseId) {
		this.ecaseId = ecaseId;
	}

	/**
	 * Gets the extension.
	 *
	 * @return the extension
	 */
	public String getExtension() {
		return this.extension;
	}

	/**
	 * Sets the extension.
	 *
	 * @param extension the new extension
	 */
	public void setExtension(String extension) {
		this.extension = extension;
	}

	/**
	 * Gets the file name.
	 *
	 * @return the file name
	 */
	public String getFileName() {
		return this.fileName;
	}

	/**
	 * Sets the file name.
	 *
	 * @param fileName the new file name
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * Gets the file path.
	 *
	 * @return the file path
	 */
	public String getFilePath() {
		return this.filePath;
	}

	/**
	 * Sets the file path.
	 *
	 * @param filePath the new file path
	 */
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	/**
	 * Gets the file size.
	 *
	 * @return the file size
	 */
	public String getFileSize() {
		return this.fileSize;
	}

	/**
	 * Sets the file size.
	 *
	 * @param fileSize the new file size
	 */
	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}

	/**
	 * Gets the project id.
	 *
	 * @return the project id
	 */
	public Integer getProjectId() {
		return this.projectId;
	}

	/**
	 * Sets the project id.
	 *
	 * @param projectId the new project id
	 */
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public String getStatus() {
		return this.status;
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
	 * Gets the subscriber id.
	 *
	 * @return the subscriber id
	 */
	public Integer getSubscriberId() {
		return this.subscriberId;
	}

	/**
	 * Sets the subscriber id.
	 *
	 * @param subscriberId the new subscriber id
	 */
	public void setSubscriberId(Integer subscriberId) {
		this.subscriberId = subscriberId;
	}

	/**
	 * Gets the file type.
	 *
	 * @return the file type
	 */
	public String getFileType() {
		return fileType;
	}

	/**
	 * Sets the file type.
	 *
	 * @param fileType the new file type
	 */
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	
	
	public String populateConversationSid(){
		return bytesToHexStringBySid(conversationId);
	}

}