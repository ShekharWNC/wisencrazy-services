package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the company_role database table.
 *
 */
@Entity
@Table(name="company_role")
@NamedQuery(name = CompanyRole.FIND_BY_NAME_COMPANY, query = "from CompanyRole cr where cr.name = :name and hex(cr.company.sid) = :sid")
public class CompanyRole extends AbsBaseEntity {
    private static final long serialVersionUID = 1L;

    private String name;

    //bi-directional many-to-one association to Company
    @ManyToOne/*(cascade = CascadeType.ALL)*/
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    private Company company;

    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.CompanyRole.";
    public static final String FIND_BY_NAME_COMPANY = PREFIX + "findByRoleNameAndCompanySid";
    //bi-directional many-to-many association to VirtualAccount
   /* @ManyToMany
    @JoinTable(
            name="virtual_account_has_company_role"
            , joinColumns={
            @JoinColumn(name="company_role_id",referencedColumnName = "id")
    }
            , inverseJoinColumns={
            @JoinColumn(name="virtual_account_id",referencedColumnName = "id")
    }
    )
    private List<VirtualAccount> virtualAccounts;*/

    public CompanyRole() {
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

  /*  public List<VirtualAccount> getVirtualAccounts() {
        return this.virtualAccounts;
    }

    public void setVirtualAccounts(List<VirtualAccount> virtualAccounts) {
        this.virtualAccounts = virtualAccounts;
    }*/

}