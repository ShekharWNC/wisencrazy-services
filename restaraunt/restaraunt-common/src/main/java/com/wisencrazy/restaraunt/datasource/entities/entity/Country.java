package com.wisencrazy.restaraunt.datasource.entities.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 * The persistent class for the country database table.
 *
 */
@Entity
@Table(name="country")
public class Country extends AbsBaseEntity {
    private static final long serialVersionUID = 1L;

    @Column(name="country_code")
    private String countryCode;

    @Size(min=1)
    @Column(name="country_name")
    private String countryName;

    @Column(name="country_short_name")
    private String countryShortName;

    public Country() {
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return this.countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryShortName() {
        return this.countryShortName;
    }

    public void setCountryShortName(String countryShortName) {
        this.countryShortName = countryShortName;
    }

    /*public List<Address> getAddresses() {
         return this.addresses;
     }

     public void setAddresses(List<Address> addresses) {
         this.addresses = addresses;
     }

     public Address addAddress(Address address) {
         getAddresses().add(address);
         address.setCountry(this);

         return address;
     }

     public Address removeAddress(Address address) {
         getAddresses().remove(address);
         address.setCountry(null);

         return address;
     }

     public List<Appuser> getAppusers() {
         return this.appusers;
     }

     public void setAppusers(List<Appuser> appusers) {
         this.appusers = appusers;
     }

     public Appuser addAppuser(Appuser appuser) {
         getAppusers().add(appuser);
         appuser.setCountry(this);

         return appuser;
     }

     public Appuser removeAppuser(Appuser appuser) {
         getAppusers().remove(appuser);
         appuser.setCountry(null);

         return appuser;
     }

     public List<Job> getJobs() {
         return this.jobs;
     }

     public void setJobs(List<Job> jobs) {
         this.jobs = jobs;
     }

     public Job addJob(Job job) {
         getJobs().add(job);
         job.setCountry(this);

         return job;
     }

     public Job removeJob(Job job) {
         getJobs().remove(job);
         job.setCountry(null);

         return job;
     }

     public List<State> getStates() {
         return this.states;
     }

     public void setStates(List<State> states) {
         this.states = states;
     }

     public State addState(State state) {
         getStates().add(state);
         state.setCountry(this);

         return state;
     }

     public State removeState(State state) {
         getStates().remove(state);
         state.setCountry(null);

         return state;
     }*/

}