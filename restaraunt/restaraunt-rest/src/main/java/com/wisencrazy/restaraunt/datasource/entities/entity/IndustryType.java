package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;


/**
 * The persistent class for the industry_type database table.
 *
 */
@Entity
@Table(name="industry_type")
public class IndustryType extends AbsBaseEntity {
    private static final long serialVersionUID = 1L;

    @Size(min=1)
    @Column(name="industry_type")
    private String industryType;

   
    public IndustryType() {
    }

    public String getIndustryType() {
        return this.industryType;
    }

    public void setIndustryType(String industryType) {
        this.industryType = industryType;
    }

    /*public List<Company> getCompanies() {
         return this.companies;
     }

     public void setCompanies(List<Company> companies) {
         this.companies = companies;
     }

     public Company addCompany(Company company) {
         getCompanies().add(company);
         company.setIndustryType(this);

         return company;
     }

     public Company removeCompany(Company company) {
         getCompanies().remove(company);
         company.setIndustryType(null);

         return company;
     }*/

}