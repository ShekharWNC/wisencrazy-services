/**
 * 
 */
package com.dto;


/**
 * @author raviteja
 *
 */
public class KnowledgebaseHasArticleDTO extends AbsCommonDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5598716574349185525L;
	
	private String categoryTitle;
	
	private String categorySid;
	
	private String subCategoryTitle;
	
	private String subCategorySid;
	
	private ArticleDTO article;
	
	
	public KnowledgebaseHasArticleDTO(){
		
	}
	public ArticleDTO getArticle() {
		return article;
	}

	public void setArticle(ArticleDTO article) {
		this.article = article;
	}
	public String getCategoryTitle() {
		return categoryTitle;
	}
	public void setCategoryTitle(String categoryTitle) {
		this.categoryTitle = categoryTitle;
	}
	public String getCategorySid() {
		return categorySid;
	}
	public void setCategorySid(String categorySid) {
		this.categorySid = categorySid;
	}
	public String getSubCategoryTitle() {
		return subCategoryTitle;
	}
	public void setSubCategoryTitle(String subCategoryTitle) {
		this.subCategoryTitle = subCategoryTitle;
	}
	public String getSubCategorySid() {
		return subCategorySid;
	}
	public void setSubCategorySid(String subCategorySid) {
		this.subCategorySid = subCategorySid;
	}
}
