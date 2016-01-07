package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the case database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class CaseDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private int moduleHasTasksId;

	private String subject;

	private CasePriorityDTO casePriority;

	private CaseStatusDTO caseStatus;

	private AppuserDTO user;

	private List<CaseAttachmentDTO> caseAttachments;

	public CaseDTO() {
	}

	public CaseDTO(int moduleHasTasksId, String subject,
			CasePriorityDTO casePriority, CaseStatusDTO caseStatus, AppuserDTO user,
			List<CaseAttachmentDTO> caseAttachments) {
		super();
		this.moduleHasTasksId = moduleHasTasksId;
		this.subject = subject;
		this.casePriority = casePriority;
		this.caseStatus = caseStatus;
		this.user = user;
		this.caseAttachments = caseAttachments;
	}

	public int getModuleHasTasksId() {
		return this.moduleHasTasksId;
	}

	public void setModuleHasTasksId(int moduleHasTasksId) {
		this.moduleHasTasksId = moduleHasTasksId;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public CasePriorityDTO getCasePriority() {
		return this.casePriority;
	}

	public void setCasePriority(CasePriorityDTO casePriority) {
		this.casePriority = casePriority;
	}

	public CaseStatusDTO getCaseStatus() {
		return this.caseStatus;
	}

	public void setCaseStatus(CaseStatusDTO caseStatus) {
		this.caseStatus = caseStatus;
	}

	public AppuserDTO getUser() {
		return this.user;
	}

	public void setUser(AppuserDTO user) {
		this.user = user;
	}

	public List<CaseAttachmentDTO> getCaseAttachments() {
		return this.caseAttachments;
	}

	public void setCaseAttachments(List<CaseAttachmentDTO> caseAttachments) {
		this.caseAttachments = caseAttachments;
	}

	public CaseAttachmentDTO addCaseAttachment(CaseAttachmentDTO caseAttachment) {
		getCaseAttachments().add(caseAttachment);
		caseAttachment.setCase(this);

		return caseAttachment;
	}

	public CaseAttachmentDTO removeCaseAttachment(CaseAttachmentDTO caseAttachment) {
		getCaseAttachments().remove(caseAttachment);
		caseAttachment.setCase(null);

		return caseAttachment;
	}

	@Override
	public String toString() {
		return "CaseDTO [moduleHasTasksId=" + moduleHasTasksId + ", subject="
				+ subject + ", casePriority=" + casePriority + ", caseStatus="
				+ caseStatus + ", user=" + user + ", caseAttachments="
				+ caseAttachments + "]";
	}

}