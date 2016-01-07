package com.dto;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryDTO extends AbsCommonDTO {
	
	private static final long serialVersionUID = 1L;

	private String createdDate;

	private String description;

	private String status;

	private String title;

	private List<SubCategoryDTO> subCategories;
	
	private List<KnowledgebaseHasArticleDTO> knowledgebaseHasArticle;
	
	public CategoryDTO() {
		
	}

	public String getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<SubCategoryDTO> getSubCategories() {
		return this.subCategories;
	}

	public void setSubCategories(List<SubCategoryDTO> subCategories) {
		this.subCategories = subCategories;
	}

	public List<KnowledgebaseHasArticleDTO> getKnowledgebaseHasArticle() {
		return knowledgebaseHasArticle;
	}

	public void setKnowledgebaseHasArticle(
			List<KnowledgebaseHasArticleDTO> knowledgebaseHasArticle) {
		this.knowledgebaseHasArticle = knowledgebaseHasArticle;
	}
	
}