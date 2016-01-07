package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name = "company_has_category")
@NamedQueries({
	@NamedQuery(name = CompanyHasCategory.FIND_BY_COMPANY_SID, query = "from CompanyHasCategory cc where hex(cc.company.sid) = :companySid"),
	@NamedQuery(name = CompanyHasCategory.FIND_BY_SID, query = "from CompanyHasCategory cc where hex(cc.company.sid) = :companySid and hex(cc.sid) = :sid"),
	@NamedQuery(name = CompanyHasCategory.FIND_SUB_CATEGORIES_BY_SID, query = "select sc from CompanyHasCategory cc join cc.subCategory sc where hex(cc.sid) = :sid"),
	@NamedQuery(name = CompanyHasCategory.FIND_BY_COMPANY_CATEGORY_NAMES, query = "select c from CompanyHasCategory chc join chc.company c join chc.companyCategory cc where cc.name in (:categories)")
})
public class CompanyHasCategory extends AbsBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1039669265423275350L;
	
	private static final String PREFIX = "com.callcomm.eserve.persistence.entity.CompanyHasCategory.";
	
	public static final String FIND_BY_COMPANY_SID = PREFIX + "findByCompanySid";
	
	public static final String FIND_BY_SID = PREFIX + "findBySid";
	
	public static final String FIND_SUB_CATEGORIES_BY_SID  = PREFIX + "findSubCategoriesBySid";
	
	public static final String FIND_BY_COMPANY_CATEGORY_NAMES = PREFIX + "findByCompanyCategoryNames";
	
//	Native Queries
	
	public static final String DELETE_SUB_CATEGORY = "delete from company_category_has_sub_categories " +
			"where company_category_id = (select id from company_has_category where hex(sid) = :sid) " +
			"and company_sub_category_id = (select id from company_category where hex(sid) = :categorySid)";
	

	@ManyToOne
	@JoinColumn(name = "company_id")
	private Company company;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private CompanyCategory companyCategory;
	

	@ManyToMany
	@JoinTable(
		name="company_category_has_sub_categories"
		, joinColumns={
			@JoinColumn(name="company_category_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="company_sub_category_id")
			}
		)
	private List<CompanyCategory> subCategory;

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public CompanyCategory getCompanyCategory() {
		return companyCategory;
	}

	public void setCompanyCategory(CompanyCategory companyCategory) {
		this.companyCategory = companyCategory;
	}

	public List<CompanyCategory> getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(List<CompanyCategory> subCategory) {
		this.subCategory = subCategory;
	}
}
