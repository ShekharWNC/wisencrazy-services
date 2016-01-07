package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the client_buisness_profile database table.
 *
 */
@Entity
@Table(name="client_buisness_profile")
public class ClientBusinessProfile extends AbsBaseEntity {
    private static final long serialVersionUID = 1L;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="company_id", referencedColumnName = "id")
    private Company company;

    @Column(name="contact_email_information")
    private String contactEmailInformation;

    @Column(name="contact_phone_no")
    private String contactPhoneNo;

    private String keyword;

    private String overview;

    @Column(name="service_description")
    private String serviceDescription;

    private String tagline;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="user_id", referencedColumnName = "id")
    private Appuser appuser;

    public ClientBusinessProfile() {
    }

    public String getContactEmailInformation() {
        return this.contactEmailInformation;
    }

    public void setContactEmailInformation(String contactEmailInformation) {
        this.contactEmailInformation = contactEmailInformation;
    }

    public String getContactPhoneNo() {
        return this.contactPhoneNo;
    }

    public void setContactPhoneNo(String contactPhoneNo) {
        this.contactPhoneNo = contactPhoneNo;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getOverview() {
        return this.overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getServiceDescription() {
        return this.serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public String getTagline() {
        return this.tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Appuser getAppuser() {
        return appuser;
    }

    public void setAppuser(Appuser appuser) {
        this.appuser = appuser;
    }
}