package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 * The persistent class for the company_has_address database table.
 *
 */
@Entity
@Table(name="company_has_address")
public class CompanyHasAddress extends AbsBaseEntity {
    private static final long serialVersionUID = 1L;

    //bi-directional many-to-one association to Address
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    //bi-directional many-to-one association to AddressType
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="address_type_id", referencedColumnName = "id")
    private AddressType addressType;

    /*@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    private Company company;*/

    public CompanyHasAddress() {
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public AddressType getAddressType() {
        return this.addressType;
    }

    public void setAddressType(AddressType addressType) {
        this.addressType = addressType;
    }

    /*public Company getCompany() {
        return this.company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }*/

}