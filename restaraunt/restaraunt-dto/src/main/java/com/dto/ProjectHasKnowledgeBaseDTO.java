package com.dto;

import java.util.List;

public class ProjectHasKnowledgeBaseDTO extends AbsCommonDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8096309677940122805L;
	public ProjectHasKnowledgeBaseDTO(){
		
	}
	private ProjectDTO projectDTO;
	private List<KnowledgeBaseDTO> knowledgeBaseDTO;
	public ProjectDTO getProjectDTO() {
		return projectDTO;
	}
	public void setProjectDTO(ProjectDTO projectDTO) {
		this.projectDTO = projectDTO;
	}
	public List<KnowledgeBaseDTO> getKnowledgeBaseDTO() {
		return knowledgeBaseDTO;
	}
	public void setKnowledgeBaseDTO(List<KnowledgeBaseDTO> knowledgeBaseDTO) {
		this.knowledgeBaseDTO = knowledgeBaseDTO;
	}
	
}
