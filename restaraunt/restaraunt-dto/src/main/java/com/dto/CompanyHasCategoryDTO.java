package com.dto;

import java.util.List;

import com.adminsettings.biz.service.CompanyCategoryDTO;

public class CompanyHasCategoryDTO extends AbsCommonDTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7218326424322752174L;

	private CompanyCommonDTO company;
	
	private CompanyCategoryDTO companyCategory;
	
	private List<CompanyCategoryDTO> subCategory;

	public CompanyCommonDTO getCompany() {
		return company;
	}

	public void setCompany(CompanyCommonDTO company) {
		this.company = company;
	}

	public CompanyCategoryDTO getCompanyCategory() {
		return companyCategory;
	}

	public void setCompanyCategory(CompanyCategoryDTO companyCategory) {
		this.companyCategory = companyCategory;
	}

	public List<CompanyCategoryDTO> getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(List<CompanyCategoryDTO> subCategory) {
		this.subCategory = subCategory;
	}
}
