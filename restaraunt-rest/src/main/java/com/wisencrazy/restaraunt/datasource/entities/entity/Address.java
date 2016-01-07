package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * The persistent class for the address database table.
 *
 */
@Entity
@Table(name="address")
public class Address extends AbsBaseEntity {
    private static final long serialVersionUID = 1L;

    @Column(name="address_line1")
    private String addressLine1;

    @Column(name="address_line2")
    private String addressLine2;

    @Column(name="address_line3")
    private String addressLine3;

    @Column(name="is_active")
    private Boolean isActive;

    private String pin;

    @ManyToOne
    @JoinColumn(name = "country_id", referencedColumnName = "id")
    private Country country;

    @ManyToOne
    @JoinColumn(name = "state_id", referencedColumnName = "id")
    private State state;
    
    @Transient
    private String addressDetails;
    
    public String getAddressDetails(){
    	StringBuilder stringBuilder = new StringBuilder();
    	stringBuilder = (addressLine1 != null && !addressLine1.equals(""))?stringBuilder.append(addressLine1): stringBuilder;
    	stringBuilder = (addressLine2 != null && !addressLine2.equals(""))?stringBuilder.append(",").append(addressLine2): stringBuilder;
    	stringBuilder = (addressLine3 != null && !addressLine3.equals(""))?stringBuilder.append(",").append(addressLine3): stringBuilder;
    	stringBuilder = (country != null && country.getCountryName() != null && !country.getCountryName().equals(""))?stringBuilder.append(",").append(country.getCountryName()): stringBuilder;
    	stringBuilder = (state!= null && state.getStateName() != null && !state.getStateName().equals(""))?stringBuilder.append(",").append(state.getStateName()): stringBuilder;
    	stringBuilder = (pin!= null && !pin.equals(""))?stringBuilder.append(", pin : ").append(pin): stringBuilder;
    	
    	return stringBuilder.toString();
    }

    //bi-directional many-to-one association to CompanyHasAddress
    /*@OneToMany(mappedBy="address")
     private List<CompanyHasAddress> companyHasAddresses;

     //bi-directional many-to-one association to UserHasAddress
     @OneToMany(mappedBy="address")
     private List<UserHasAddress> userHasAddresses;*/

    public Address() {
    }

    public String getAddressLine1() {
        return this.addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return this.addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressLine3() {
        return this.addressLine3;
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public Boolean getIsActive() {
        return this.isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public String getPin() {
        return this.pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public Country getCountry() {
        return this.country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }

	@Override
	public String toString() {
		return "Address [addressLine1=" + addressLine1 + ", addressLine2="
				+ addressLine2 + ", addressLine3=" + addressLine3
				+ ", isActive=" + isActive + ", pin=" + pin + ", country="
				+ country + ", state=" + state + "]";
	}

    /*public List<CompanyHasAddress> getCompanyHasAddresses() {
         return this.companyHasAddresses;
     }

     public void setCompanyHasAddresses(List<CompanyHasAddress> companyHasAddresses) {
         this.companyHasAddresses = companyHasAddresses;
     }

     public CompanyHasAddress addCompanyHasAddress(CompanyHasAddress companyHasAddress) {
         getCompanyHasAddresses().add(companyHasAddress);
         companyHasAddress.setAddress(this);

         return companyHasAddress;
     }

     public CompanyHasAddress removeCompanyHasAddress(CompanyHasAddress companyHasAddress) {
         getCompanyHasAddresses().remove(companyHasAddress);
         companyHasAddress.setAddress(null);

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
         userHasAddress.setAddress(this);

         return userHasAddress;
     }

     public UserHasAddress removeUserHasAddress(UserHasAddress userHasAddress) {
         getUserHasAddresses().remove(userHasAddress);
         userHasAddress.setAddress(null);

         return userHasAddress;
     }*/
    
    

}
