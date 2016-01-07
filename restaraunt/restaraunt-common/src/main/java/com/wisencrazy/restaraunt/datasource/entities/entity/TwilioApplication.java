package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * User: Hoa Ho
 * Date: 2/28/13
 * Time: 1:31 PM
 */
@Entity
@Table(name = "twilio_application")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = TwilioApplication.FIND_ALL, query = "SELECT t FROM TwilioApplication t"),
        @NamedQuery(name = TwilioApplication.FIND_BY_TWILIO_APP_SID, query = "SELECT t FROM TwilioApplication t WHERE t.twilioApplicationSid = :twilioApplicationSid"),
        @NamedQuery(name = TwilioApplication.FIND_BY_COMPANY_SID,query="SELECT t from TwilioApplication t where hex(t.company.sid)= :companySid")
})
        
public class TwilioApplication extends AbsBaseEntity {
    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.TwilioApplicationTO.";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_TWILIO_APP_SID = PREFIX + "findByTwilioApplicationSid";
    public static final String FIND_BY_COMPANY_SID = PREFIX+"findByCompanySid";
    private static final long serialVersionUID = 1L;
    
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "twilio_application_sid")
    private String twilioApplicationSid;

    @NotNull
    @Column(name="application_name")
    private String applicationName;
    
    @JoinColumn(name="company_id",referencedColumnName="id")
    @OneToOne
    private Company company;
    
    public TwilioApplication() {
    }


	public String getTwilioApplicationSid() {
        return twilioApplicationSid;
    }

    public void setTwilioApplicationSid(String twilioApplicationSid) {
        this.twilioApplicationSid = twilioApplicationSid;
    }

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
    
}
