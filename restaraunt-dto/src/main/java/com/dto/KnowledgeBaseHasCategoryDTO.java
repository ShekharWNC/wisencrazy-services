package com.dto;

import java.util.List;

public class KnowledgeBaseHasCategoryDTO extends AbsCommonDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7550422195278108212L;
	public KnowledgeBaseHasCategoryDTO(){
		
	}
	private KnowledgeBaseDTO knowledgeBaseDTO;
	private List<CategoryDTO> categoryDTO;
	public KnowledgeBaseDTO getKnowledgeBaseDTO() {
		return knowledgeBaseDTO;
	}
	public void setKnowledgeBaseDTO(KnowledgeBaseDTO knowledgeBaseDTO) {
		this.knowledgeBaseDTO = knowledgeBaseDTO;
	}
	public List<CategoryDTO> getCategoryDTO() {
		return categoryDTO;
	}
	public void setCategoryDTO(List<CategoryDTO> categoryDTO) {
		this.categoryDTO = categoryDTO;
	}
}
