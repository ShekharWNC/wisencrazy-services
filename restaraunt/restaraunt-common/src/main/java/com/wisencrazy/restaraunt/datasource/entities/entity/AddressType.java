package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the address_type database table.
 *
 */
@Entity
@Table(name="address_type")
public class AddressType extends AbsBaseEntity {
    private static final long serialVersionUID = 1L;

    @Column(name="address_type")
    private String addressType;

    //bi-directional many-to-one association to CompanyHasAddress
    /*@OneToMany(mappedBy="addressType")
     private List<CompanyHasAddress> companyHasAddresses;

     //bi-directional many-to-one association to UserHasAddress
     @OneToMany(mappedBy="addressType")
     private List<UserHasAddress> userHasAddresses;*/

    public AddressType() {
    }

    public String getAddressType() {
        return this.addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    /*public List<CompanyHasAddress> getCompanyHasAddresses() {
         return this.companyHasAddresses;
     }

     public void setCompanyHasAddresses(List<CompanyHasAddress> companyHasAddresses) {
         this.companyHasAddresses = companyHasAddresses;
     }

     public CompanyHasAddress addCompanyHasAddress(CompanyHasAddress companyHasAddress) {
         getCompanyHasAddresses().add(companyHasAddress);
         companyHasAddress.setAddressType(this);

         return companyHasAddress;
     }

     public CompanyHasAddress removeCompanyHasAddress(CompanyHasAddress companyHasAddress) {
         getCompanyHasAddresses().remove(companyHasAddress);
         companyHasAddress.setAddressType(null);

         return companyHasAddress;
     }

     public List<UserHasAddress> getUserHasAddresses() {
         return this.userHasAddresses;
     }

     public void setUserHasAddresses(List<UserHasAddress> userHasAddresses) {
         this.userHasAddresses = userHasAddresses;
     }

     public UserHasAddress addUserHasAddress(UserHasAddress userHasAddress) {
         getUserHasAddresses().add(userHasAddress);
         userHasAddress.setAddressType(this);

         return userHasAddress;
     }

     public UserHasAddress removeUserHasAddress(UserHasAddress userHasAddress) {
         getUserHasAddresses().remove(userHasAddress);
         userHasAddress.setAddressType(null);

         return userHasAddress;
     }*/

}