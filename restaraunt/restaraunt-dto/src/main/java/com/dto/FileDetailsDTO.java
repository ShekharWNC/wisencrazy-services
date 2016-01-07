package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class FileDetailsDTO.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class FileDetailsDTO extends AbsCommonDTO implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The file name. */
	private String fileName;
	
	/** The file size. */
	private String fileSize;
	
	/** The file type. */
	private String fileType;
	
	/** The extension. */
	private String extension;
	
	/** The content type. */
	private String contentType;
	
	/** The status. */
	private String status;
	
	/** The created date. */
	private String createdDate;
	
	/** The file path. */
	private String filePath;
	
	/** The success action status. */
	private int successActionStatus;
	
	/** The conversation id. */
	private String conversationId;
	/**
	 * The Constructor.
	 */
	public FileDetailsDTO(){
		
	}
	
	/**
	 * The Constructor.
	 *
	 * @param fileName the file name
	 * @param fileSize the file size
	 * @param fileType the file type
	 * @param extension the extension
	 * @param contentType the content type
	 * @param status the status
	 * @param createdDate the created date
	 * @param successActionStatus the success action status
	 * @param filePath the file path
	 * @param conversationId the conversation id
	 */
	public FileDetailsDTO(String fileName, String fileSize, String fileType,
			String extension, String contentType,String status,String createdDate,int successActionStatus,String filePath,String conversationId) {
		this.fileName = fileName;
		this.fileSize = fileSize;
		this.fileType = fileType;
		this.extension = extension;
		this.contentType = contentType;
		this.status = status;
		this.createdDate = createdDate;
		this.successActionStatus = successActionStatus;
		this.filePath=filePath;
		this.conversationId = conversationId;
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
	 * @param status the status
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	/**
	 * Gets the created date.
	 *
	 * @return the created date
	 */
	public String getCreatedDate() {
		return createdDate;
	}
	
	/**
	 * Sets the created date.
	 *
	 * @param createdDate the created date
	 */
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
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
	 * @param fileName the file name
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
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
	 * @param fileType the file type
	 */
	public void setFileType(String fileType) {
		this.fileType = fileType;
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
	 * @param extension the extension
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
	 * @param contentType the content type
	 */
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	/**
	 * Gets the success action status.
	 *
	 * @return the success action status
	 */
	public int getSuccessActionStatus() {
		return successActionStatus;
	}

	/**
	 * Sets the success action status.
	 *
	 * @param successActionStatus the new success action status
	 */
	public void setSuccessActionStatus(int successActionStatus) {
		this.successActionStatus = successActionStatus;
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
	 * Gets the conversation id.
	 *
	 * @return the conversation id
	 */
	public String getConversationId() {
		return conversationId;
	}

	/**
	 * Sets the conversation id.
	 *
	 * @param conversationId the new conversation id
	 */
	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}
	

}
