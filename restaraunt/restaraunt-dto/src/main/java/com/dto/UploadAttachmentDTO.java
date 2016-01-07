package com.dto;

import java.io.Serializable;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class UploadAttachmentDTO.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class UploadAttachmentDTO extends AbsCommonDTO implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The file details dto. */
	private FileDetailsDTO fileDetails;
	
	/** The upload identity dto. */
	private UploadIdentityDTO uploadIdentity;
	
	/**
	 * The Constructor.
	 */
	public UploadAttachmentDTO(){
		
	}

	/**
	 * The Constructor.
	 *
	 * @param fileDetailsDTO the file details dto
	 * @param uploadIdentityDTO the upload identity dto
	 */
	public UploadAttachmentDTO(FileDetailsDTO fileDetails,
			UploadIdentityDTO uploadIdentity) {
		this.fileDetails = fileDetails;
		this.uploadIdentity = uploadIdentity;
	}

	public FileDetailsDTO getFileDetails() {
		return fileDetails;
	}

	public void setFileDetails(FileDetailsDTO fileDetails) {
		this.fileDetails = fileDetails;
	}

	public UploadIdentityDTO getUploadIdentity() {
		return uploadIdentity;
	}

	public void setUploadIdentity(UploadIdentityDTO uploadIdentity) {
		this.uploadIdentity = uploadIdentity;
	}

	
	

}
