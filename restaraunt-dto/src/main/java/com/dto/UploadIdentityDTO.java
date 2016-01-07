package com.dto;

import java.io.Serializable;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class UploadIdentityDTO.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class UploadIdentityDTO extends AbsCommonDTO implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	
	/** The company id. */
	private String companyId;
	
	/** The case id. */
	private String caseId;
	
	/** The project id. */
	private String projectId;
	
	/** The category. */
	private String category;
	
	/** The subscriber id. */
	private String subscriberId;
	
	/**
	 * The Constructor.
	 */
	public UploadIdentityDTO(){
		
	}

	/**
	 * The Constructor.
	 *
	 * @param companyId the company id
	 * @param caseId the case id
	 * @param projectId the project id
	 * @param category the category
	 * @param subscriberId the subscriber id
	 */
	public UploadIdentityDTO(String companyId, String caseId, String projectId,
			String category, String subscriberId) {
		this.companyId = companyId;
		this.caseId = caseId;
		this.projectId = projectId;
		this.category = category;
		this.subscriberId = subscriberId;
	}

	/**
	 * Gets the company id.
	 *
	 * @return the company id
	 */
	public String getCompanyId() {
		return companyId;
	}

	/**
	 * Sets the company id.
	 *
	 * @param companyId the new company id
	 */
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
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
	 * Gets the project id.
	 *
	 * @return the project id
	 */
	public String getProjectId() {
		return projectId;
	}

	/**
	 * Sets the project id.
	 *
	 * @param projectId the new project id
	 */
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	/**
	 * Gets the category.
	 *
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * Sets the category.
	 *
	 * @param category the new category
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * Gets the subscriber id.
	 *
	 * @return the subscriber id
	 */
	public String getSubscriberId() {
		return subscriberId;
	}

	/**
	 * Sets the subscriber id.
	 *
	 * @param subscriberId the new subscriber id
	 */
	public void setSubscriberId(String subscriberId) {
		this.subscriberId = subscriberId;
	}

	
	

}
