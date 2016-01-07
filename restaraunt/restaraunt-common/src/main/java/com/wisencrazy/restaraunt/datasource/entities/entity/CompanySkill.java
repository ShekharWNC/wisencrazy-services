package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the company_skill database table.
 *
 */
@Entity
@Table(name="company_skill")
public class CompanySkill extends AbsBaseEntity {
    private static final long serialVersionUID = 1L;

    private String name;

    //bi-directional many-to-one association to Company
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    private Company company;

    //bi-directional many-to-one association to VirtualAccountHasCompanySkill
    /*@OneToMany(mappedBy="companySkill")
     private List<VirtualAccountHasCompanySkill> virtualAccountHasCompanySkills;*/

    public CompanySkill() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company getCompany() {
        return this.company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    /*public List<VirtualAccountHasCompanySkill> getVirtualAccountHasCompanySkills() {
         return this.virtualAccountHasCompanySkills;
     }

     public void setVirtualAccountHasCompanySkills(List<VirtualAccountHasCompanySkill> virtualAccountHasCompanySkills) {
         this.virtualAccountHasCompanySkills = virtualAccountHasCompanySkills;
     }

     public VirtualAccountHasCompanySkill addVirtualAccountHasCompanySkill(VirtualAccountHasCompanySkill virtualAccountHasCompanySkill) {
         getVirtualAccountHasCompanySkills().add(virtualAccountHasCompanySkill);
         virtualAccountHasCompanySkill.setCompanySkill(this);

         return virtualAccountHasCompanySkill;
     }

     public VirtualAccountHasCompanySkill removeVirtualAccountHasCompanySkill(VirtualAccountHasCompanySkill virtualAccountHasCompanySkill) {
         getVirtualAccountHasCompanySkills().remove(virtualAccountHasCompanySkill);
         virtualAccountHasCompanySkill.setCompanySkill(null);

         return virtualAccountHasCompanySkill;
     }*/

}