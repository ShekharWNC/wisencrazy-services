package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the project_has_tax_catogories database table.
 * 
 */
@Entity
@Table(name="project_has_tax_categories")
@NamedQueries({
    @NamedQuery(name = ProjectHasTaxCategories.FIND_TAX_CATEGORIES_BY_PROJECT_ID, query = "SELECT p.taxCatogory from ProjectHasTaxCategories p where p.projectId=:projectId") 
})
public class ProjectHasTaxCategories implements Serializable {
		
	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.ProjectHasTaxCategories.";
	public static final String FIND_TAX_CATEGORIES_BY_PROJECT_ID = PREFIX
	            + "findtaxcategoriesbyprojectid";
	    /**
	     * 
	     */
	private static final long serialVersionUID = -2527224194677279218L;
	 
	@Id
	@Column(name="tax_category_id")
	private Integer taxCategoryId;

	@Column(name="project_id")
	private Integer projectId;

	//bi-directional one-to-one association to TaxCatogory
	@OneToOne
	@JoinColumn(name="tax_category_id")
	private TaxCategories taxCatogory;

	public ProjectHasTaxCategories() {
	}


	public Integer getTaxCategoryId() {
		return taxCategoryId;
	}


	public void setTaxCategoryId(Integer taxCategoryId) {
		this.taxCategoryId = taxCategoryId;
	}


	public Integer getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public TaxCategories getTaxCatogory() {
		return this.taxCatogory;
	}

	public void setTaxCatogory(TaxCategories taxCatogory) {
		this.taxCatogory = taxCatogory;
	}

}