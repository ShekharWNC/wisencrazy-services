package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 * User: Hoa Ho
 * Date: 7/9/13
 * Time: 3:02 PM
 */

/**
 * The persistent class for the state database table.
 *
 */
@Entity
@Table(name="state")
public class State extends AbsBaseEntity {
    private static final long serialVersionUID = 1L;

    @Size(min=1)
    @Column(name="state_name")
    private String stateName;

    //bi-directional many-to-one association to Address
    /*@OneToMany(mappedBy="state")
     private List<Address> addresses;

     //bi-directional many-to-one association to Job
     @OneToMany(mappedBy="state")
     private List<Job> jobs;*/

    //bi-directional many-to-one association to Country
    @ManyToOne
    @JoinColumn(name = "country_id", referencedColumnName = "id")
    private Country country;

    public State() {
    }

    public String getStateName() {
        return this.stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public Country getCountry() {
        return this.country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

}