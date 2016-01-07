package com.dto;

import java.util.List;

public class CompanyHasKnowledgeBaseDTO extends AbsCommonDTO{

	private static final long serialVersionUID = -4007585821116535444L;

	/**
	 * 
	 */
	
	public CompanyHasKnowledgeBaseDTO(){
		
	}

	private CompanyDTO companyDTO;
	private List<KnowledgeBaseDTO> knowledgeBaseDTO;

	public CompanyDTO getCompanyDTO() {
		return companyDTO;
	}
	public void setCompanyDTO(CompanyDTO companyDTO) {
		this.companyDTO = companyDTO;
	}
	public List<KnowledgeBaseDTO> getKnowledgeBaseDTO() {
		return knowledgeBaseDTO;
	}
	public void setKnowledgeBaseDTO(List<KnowledgeBaseDTO> knowledgeBaseDTO) {
		this.knowledgeBaseDTO = knowledgeBaseDTO;
	}
	
}
