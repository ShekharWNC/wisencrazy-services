package com.dto;

import java.io.Serializable;
import java.util.List;


/**
 * The persistent class for the industry_type database table.
 * 
 */
public class IndustryTypeDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String industryType;

	//bi-directional many-to-one association to Company
	private List<CompanyDTO> companies;

	//bi-directional many-to-one association to IndustryHasSkills
	private List<IndustryHasSkillsDTO> industryHasSkills;

	public IndustryTypeDTO() {
	}

	public IndustryTypeDTO(String industryType, List<CompanyDTO> companies,
			List<IndustryHasSkillsDTO> industryHasSkills) {
		super();
		this.industryType = industryType;
		this.companies = companies;
		this.industryHasSkills = industryHasSkills;
	}
	public String getIndustryType() {
		return this.industryType;
	}

	public void setIndustryType(String industryType) {
		this.industryType = industryType;
	}

	public List<CompanyDTO> getCompanies() {
		return this.companies;
	}

	public void setCompanies(List<CompanyDTO> companies) {
		this.companies = companies;
	}

	public CompanyDTO addCompany(CompanyDTO company) {
		getCompanies().add(company);
		company.setIndustryType(this);

		return company;
	}

	public CompanyDTO removeCompany(CompanyDTO company) {
		getCompanies().remove(company);
		company.setIndustryType(null);

		return company;
	}

	public List<IndustryHasSkillsDTO> getIndustryHasSkills() {
		return industryHasSkills;
	}

	public void setIndustryHasSkills(List<IndustryHasSkillsDTO> industryHasSkills) {
		this.industryHasSkills = industryHasSkills;
	}

}