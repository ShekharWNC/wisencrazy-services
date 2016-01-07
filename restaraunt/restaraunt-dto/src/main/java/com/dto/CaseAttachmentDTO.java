package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the case_attachment database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class CaseAttachmentDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String attachemntName;

	private String attachmentPath;

	private int caseID;
	
	
	//bi-directional many-to-one association to Case
	private CaseDTO case1;

	public CaseAttachmentDTO() {
	}

	public CaseAttachmentDTO(String attachemntName, String attachmentPath,
			int caseID, CaseDTO case1) {
		super();
		this.attachemntName = attachemntName;
		this.attachmentPath = attachmentPath;
		this.caseID = caseID;
		this.case1 = case1;
	}

	public String getAttachemntName() {
		return this.attachemntName;
	}

	public void setAttachemntName(String attachemntName) {
		this.attachemntName = attachemntName;
	}

	public String getAttachmentPath() {
		return this.attachmentPath;
	}

	public void setAttachmentPath(String attachmentPath) {
		this.attachmentPath = attachmentPath;
	}

	public CaseDTO getCase() {
		return this.case1;
	}

	public void setCase(CaseDTO case1) {
		this.case1 = case1;
	}

	public int getCaseID() {
		return caseID;
	}

	public void setCaseID(int caseID) {
		this.caseID = caseID;
	}

	@Override
	public String toString() {
		return "CaseAttachmentDTO [attachemntName=" + attachemntName
				+ ", attachmentPath=" + attachmentPath + ", caseID=" + caseID
				+ ", case1=" + case1 + "]";
	}


}