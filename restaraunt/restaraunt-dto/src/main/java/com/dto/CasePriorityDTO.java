package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the case_priority database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class CasePriorityDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String priority;

	//bi-directional many-to-one association to Case
	private List<CaseDTO> cases;

	public CasePriorityDTO() {
	}

	public CasePriorityDTO(String priority, List<CaseDTO> cases) {
		super();
		this.priority = priority;
		this.cases = cases;
	}

	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public List<CaseDTO> getCases() {
		return this.cases;
	}

	public void setCases(List<CaseDTO> cases) {
		this.cases = cases;
	}

	public CaseDTO addCas(CaseDTO cas) {
		getCases().add(cas);
		cas.setCasePriority(this);

		return cas;
	}

	public CaseDTO removeCas(CaseDTO cas) {
		getCases().remove(cas);
		cas.setCasePriority(null);

		return cas;
	}

	@Override
	public String toString() {
		return "CasePriorityDTO [priority=" + priority + ", cases=" + cases
				+ "]";
	}

}