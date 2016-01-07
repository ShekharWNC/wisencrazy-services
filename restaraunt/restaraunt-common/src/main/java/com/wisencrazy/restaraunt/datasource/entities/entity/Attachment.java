package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The persistent class for the attachment database table.
 *
 */
@Entity
@Table(name="attachment")
@NamedQueries({
	@NamedQuery(name=Attachment.FIND_BY_PROJECT_SID,query="select a from Attachment a join a.attachmentType at join a.project p where p.sid=unhex(:projectSid) and at.attachmentType='project-files' and a.status='UPLOAD-SUCCESS'")
})
public class Attachment extends AbsBaseEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	public static final String PREFIX  = "com.callcomm.eserve.persistence.entity.Attachment.";
	
	public static final String FIND_BY_PROJECT_SID = PREFIX+"findByProjectSid";
	/** The Constant UPLOAD_PROGRESS. */
	public static final String UPLOAD_PROGRESS="UPLOAD-PROGRESS";
	
	public static final String DOWNLOAD_SUCCESS="DOWNLOAD-SUCCESS";
	
	/** The Constant UPLOAD_SUCCESS. */
	public static final String UPLOAD_SUCCESS="UPLOAD-SUCCESS";
	
	/** The Constant UPLOAD_FAIL. */
	public static final String UPLOAD_FAIL="UPLOAD-FAIL";
	
	/** The Constant UPLOAD_CANCELED. */
	public static final String UPLOAD_CANCELLED="UPLOAD-CANCELLED";
	
	/** The file path. */
	@Column(name="file_path")
	private String filePath;
	
	/** The file name. */
	@Column(name="file_name")
	private String fileName;
	
	/** The extension. */
	@Column(name="extension")
	private String extension;
	
	/** The content type. */
	@Column(name="content_type")
	private String contentType;
	
	/** The status. */
	@Column(name="status")
	private String status;
	
	/** The file size. */
	@Column(name="file_size")
	private String fileSize;
	/** The created date. */
	@Column(name="created_date")
	private Timestamp createdDate;
	
	@Column(name="created_by")
	private String createdBy;
	//bi-directional many-to-one association to AttachmentType
	/** The attachment type. */
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="attachment_type_id", referencedColumnName = "id")
	private AttachmentType attachmentType;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="project_id", referencedColumnName = "id")
	private Project project;
	/**
	 * The Constructor.
	 */
	public Attachment(){
		
	}

	/**
	 * Gets the file path.
	 *
	 * @return the file path
	 */
	public String getFilePath() {
		return filePath;
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
	 * Gets the file name.
	 *
	 * @return the file name
	 */
	public String getFileName() {
		return fileName;
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
	 * Gets the extension.
	 *
	 * @return the extension
	 */
	public String getExtension() {
		return extension;
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
	 * Gets the content type.
	 *
	 * @return the content type
	 */
	public String getContentType() {
		return contentType;
	}

	/**
	 * Sets the content type.
	 *
	 * @param contentType the new content type
	 */
	public void setContentType(String contentType) {
		this.contentType = contentType;
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
	 * Gets the created date.
	 *
	 * @return the created date
	 */
	public Timestamp getCreatedDate() {
		return createdDate;
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
	 * Gets the attachment type.
	 *
	 * @return the attachment type
	 */
	public AttachmentType getAttachmentType() {
		return attachmentType;
	}

	/**
	 * Sets the attachment type.
	 *
	 * @param attachmentType the new attachment type
	 */
	public void setAttachmentType(AttachmentType attachmentType) {
		this.attachmentType = attachmentType;
	}

	/**
	 * Gets the file size.
	 *
	 * @return the file size
	 */
	public String getFileSize() {
		return fileSize;
	}

	/**
	 * Sets the file size.
	 *
	 * @param fileSize the file size
	 */
	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	
	
/*public List<ProposalConversationHasAttachment> getProposalConversationHasAttachments() {
        return this.proposalConversationHasAttachments;
    }

    public void setProposalConversationHasAttachments(List<ProposalConversationHasAttachment> proposalConversationHasAttachments) {
        this.proposalConversationHasAttachments = proposalConversationHasAttachments;
    }

    public ProposalConversationHasAttachment addProposalConversationHasAttachment(ProposalConversationHasAttachment proposalConversationHasAttachment) {
        getProposalConversationHasAttachments().add(proposalConversationHasAttachment);
        proposalConversationHasAttachment.setAttachment(this);

        return proposalConversationHasAttachment;
    }

    public ProposalConversationHasAttachment removeProposalConversationHasAttachment(ProposalConversationHasAttachment proposalConversationHasAttachment) {
        getProposalConversationHasAttachments().remove(proposalConversationHasAttachment);
        proposalConversationHasAttachment.setAttachment(null);

        return proposalConversationHasAttachment;
    }

    public List<ProposalHasAttachment> getProposalHasAttachments() {
        return this.proposalHasAttachments;
    }

    public void setProposalHasAttachments(List<ProposalHasAttachment> proposalHasAttachments) {
        this.proposalHasAttachments = proposalHasAttachments;
    }

    public ProposalHasAttachment addProposalHasAttachment(ProposalHasAttachment proposalHasAttachment) {
        getProposalHasAttachments().add(proposalHasAttachment);
        proposalHasAttachment.setAttachment(this);

        return proposalHasAttachment;
    }

    public ProposalHasAttachment removeProposalHasAttachment(ProposalHasAttachment proposalHasAttachment) {
        getProposalHasAttachments().remove(proposalHasAttachment);
        proposalHasAttachment.setAttachment(null);

        return proposalHasAttachment;
    }

    public List<UserHasAttachment> getUserHasAttachments() {
        return this.userHasAttachments;
    }

    public void setUserHasAttachments(List<UserHasAttachment> userHasAttachments) {
        this.userHasAttachments = userHasAttachments;
    }

    public UserHasAttachment addUserHasAttachment(UserHasAttachment userHasAttachment) {
        getUserHasAttachments().add(userHasAttachment);
        userHasAttachment.setAttachment(this);

        return userHasAttachment;
    }

    public UserHasAttachment removeUserHasAttachment(UserHasAttachment userHasAttachment) {
        getUserHasAttachments().remove(userHasAttachment);
        userHasAttachment.setAttachment(null);

        return userHasAttachment;
    }
*/
		
}