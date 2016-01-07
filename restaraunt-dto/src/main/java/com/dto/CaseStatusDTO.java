package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the case_status database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class CaseStatusDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String status;

	//bi-directional many-to-one association to Case
	private List<CaseDTO> cases;

	public CaseStatusDTO() {
	}

	public CaseStatusDTO(String status, List<CaseDTO> cases) {
		super();
		this.status = status;
		this.cases = cases;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<CaseDTO> getCases() {
		return this.cases;
	}

	public void setCases(List<CaseDTO> cases) {
		this.cases = cases;
	}

	public CaseDTO addCas(CaseDTO cas) {
		getCases().add(cas);
		cas.setCaseStatus(this);

		return cas;
	}

	public CaseDTO removeCas(CaseDTO cas) {
		getCases().remove(cas);
		cas.setCaseStatus(null);

		return cas;
	}

	@Override
	public String toString() {
		return "CaseStatusDTO [status=" + status + ", cases=" + cases + "]";
	}

}