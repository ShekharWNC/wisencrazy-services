package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * UserTO: Hoa Ho
 * Date: 2/19/13
 * Time: 9:42 PM
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Table(name = "company")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = Company.FIND_ALL, query = "SELECT c FROM Company c"),
        @NamedQuery(name = Company.FIND_BY_ID, query = "SELECT c FROM Company c WHERE c.id = :id"),
        @NamedQuery(name = Company.FIND_BY_SID, query = "SELECT c FROM Company c WHERE hex(c.sid) = :sid"),
        @NamedQuery(name = Company.FIND_BY_NAME, query = "SELECT c FROM Company c WHERE c.name = :name"),
        @NamedQuery(name = Company.FIND_BY_WEBSITE, query = "SELECT c FROM Company c WHERE c.website = :website"),
        @NamedQuery(name = Company.FIND_BY_DOMAIN_NAME, query = "SELECT c FROM Company c WHERE c.domainName = :domainName"),
        @NamedQuery(name = Company.UPDATE_COMPANY_STATUS, query = "UPDATE Company c set c.updatedBy.id = :appuserid" +
        		", c.updatedDate = :updatedDate, c.companyStatus = :status where hex(c.sid) = :sid"),
        @NamedQuery(name = Company.FIND_ID_BY_SID, query = "select c.id from Company c where hex(c.sid) = :sid"),
        @NamedQuery(name = Company.UPDATE_OPERATIONAL_MODE, query = "UPDATE Company c set c.operationalMode = :status where hex(c.sid) = :sid"),
        @NamedQuery(name = Company.FIND_OPERATIONAL_MODE_BY_ID, query = "SELECT c.operationalMode FROM Company c where c.id = :id"),
        @NamedQuery(name = Company.FIND_OPERATIONAL_MODE_BY_SID, query = "SELECT c.operationalMode FROM Company c where hex(c.sid) = :sid"),
        @NamedQuery(name = Company.FIND_DOMAIN_BY_COMPANYSID , query = "SELECT c.domainName FROM Company c where hex(c.sid) = :sid"),
        @NamedQuery(name = Company.UPDATE_COMPANY_SETUP_STATUS, query = "UPDATE Company c set c.setupStatus = :status where hex(c.sid) = :sid"),
        @NamedQuery(name = Company.FIND_NAME_BY_SID , query = "SELECT c.name FROM Company c where hex(c.sid) = :sid"),
        @NamedQuery(name = Company.FIND_ID_BY_DOMAIN_NAME, query = "SELECT c.id FROM Company c WHERE c.domainName = :domainName"),
        @NamedQuery(name = Company.FIND_CHILD_COMPANIES, query = "SELECT c.childCompanies FROM Company c where hex(c.sid) = :sid"),
        @NamedQuery(name = Company.FIND_PARENT_COMPANIES, query = "SELECT c.parentCompanies FROM Company c where hex(c.sid) = :sid")
 })
public class Company extends AbsBaseEntity {
    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.CompanyTO.";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_ID = PREFIX + "findById";
    public static final String FIND_BY_SID = PREFIX + "findBySid";
    public static final String FIND_BY_NAME = PREFIX + "findByName";
    public static final String FIND_BY_WEBSITE = PREFIX + "findByWebsite";
    public static final String FIND_BY_DOMAIN_NAME = PREFIX + "findByDomainName";
    public static final String UPDATE_COMPANY_STATUS = PREFIX + "updateCompanyStatus";
    public static final String FIND_ID_BY_SID = PREFIX + "findIdBySid";
    public static final String UPDATE_OPERATIONAL_MODE = PREFIX + "updateOperationalMode";

    private static final long serialVersionUID = 1L;
	public static final String FIND_OPERATIONAL_MODE_BY_ID = PREFIX + "findOperationalModeById";
	public static final String FIND_OPERATIONAL_MODE_BY_SID = PREFIX + "findOperationalModeBySid";
	public static final String FIND_DOMAIN_BY_COMPANYSID = PREFIX + "findDomainByCompanySid";
	public static final String UPDATE_COMPANY_SETUP_STATUS = PREFIX + "updateCompanySetupStatus";
	public static final String FIND_NAME_BY_SID = PREFIX + "findNameBySid";
	public static final String FIND_ID_BY_DOMAIN_NAME = PREFIX + "findIdByDomainName";
	public static final String FIND_CHILD_COMPANIES = PREFIX + "findChildCompaniesByParentSid";
	public static final String FIND_PARENT_COMPANIES = PREFIX + "findParentCompaniesbyChildSid";
	public static final String UPDATE_HEADER_FOOTER = "UPDATE company c set c.header = :header,c.footer = :footer where hex(c.sid) = :sid";
	
//	Native Queries.
	
	public static final String SEARCH_BY_COMPANY_KEYWORD = "select * from company where match(keywords) against (:keywords);";
	
    @Column(name="alternate_email_id")
    private String alternateEmailId;

    @NotNull
    @Size(min = 1,max = 45)
    @Column(name = "name")
    private String name;
    
    @Column(name = "logo_url")
    private String companyLogoUrl;

    @Column(name="company_verified")
    private String companyVerified;

    @Column(name = "description")
    private String description;

    @Column(name="email_id")
    private String emailId;
    
    @Column(name = "company_status")
    private String companyStatus;
    
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by")
    private Appuser createdBy;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "updated_by")
    private Appuser updatedBy;
    
    @Column(name = "is_active")
    private Boolean isActive;
    
    @Column(name = "created_date")
    private Timestamp createdDate;
    
    @Column(name = "updated_date")
    private Timestamp updatedDate;
    
    @Column(name = "website")
    private String website;
    
    @Column(name = "domain_name")
    private String domainName;
    
    @Column(name = "operational_mode")
    private Boolean operationalMode;
    
    @Column(name = "primary_contact_name")
    private String primaryContactName;
    
    @Column(name = "primary_contact_phone")
    private String primaryContactPhone;
    
    @Column(name = "primary_contact_mobile")
    private String primaryContactMobile;
    
    @Column(name = "primary_contact_email")
    private String primaryContactEmail;
    
    @Column(name = "setup_status")
    private boolean setupStatus;
    
    @Column(name = "keywords")
    private String keywords;
    
    @Column(name="rating")
    private Float rating;
    
    @Column(name="currency_symbol")
    private String currencySymbol;

    private String header;
	
   	private String footer;
   	
    //bi-directional many-to-one association to IndustryType
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}/*, fetch = FetchType.LAZY*/)
    @JoinColumn(name="industry_type_id")
    private IndustryType industryType;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "company_id")
    private List<CompanyHasAddress> companyHasAddresses;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "company_id", nullable = false)
    private List<CompanyContact> companyContacts;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "company_id", nullable = false)
    private List<CompanyHasSocialNetwork> companyHasSocialNetworks;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "company")
    private List<Project> projectList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "company")
    private List<VirtualAccount> virtualAccountList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "companyId")
    private List<BusinessHour> businessHourList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "companyId")
    private List<UserGroup> userGroupList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "company", fetch = FetchType.LAZY)
    private TwilioAccount twilioAccount;
    
    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name = "company_has_knowledgebase", joinColumns = {
            @JoinColumn(name = "company_id", referencedColumnName = "id", nullable = false)}, inverseJoinColumns = {
            @JoinColumn(name = "knowledgebase_id", referencedColumnName = "id",nullable = false)})
    private List<KnowledgeBase> knowledgeBases;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "company_id", referencedColumnName = "id", nullable = false)
    private List<CompanyHasPackage> companyHasPackages;

    @OneToMany
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    private List<CompanyHasPlaceDetails> companyHasPlaceDetails;
    
    @ManyToMany
    @JoinTable(name = "company_has_parent_association", joinColumns = {
            @JoinColumn(name = "company_id", referencedColumnName = "id", nullable = false)}, inverseJoinColumns = {
            @JoinColumn(name = "parent_company_id", referencedColumnName = "id", nullable = false)})
    private List<Company> parentCompanies;
    
    @ManyToMany
    @JoinTable(name = "company_has_parent_association", joinColumns = {
            @JoinColumn(name = "parent_company_id", referencedColumnName = "id", nullable = false)}, 
            inverseJoinColumns = {@JoinColumn(name = "company_id", referencedColumnName = "id", nullable = false)})
    private List<Company> childCompanies;
   /* @JoinTable(name = "company_has_template", joinColumns = {
            @JoinColumn(name = "company_id", referencedColumnName = "id")}, inverseJoinColumns = {
            @JoinColumn(name = "template_id", referencedColumnName = "id")})
    @ManyToMany
    private List<Template> template;*/
    public Company() {
    }

	public String getAlternateEmailId() {
        return alternateEmailId;
    }

    public void setAlternateEmailId(String alternateEmailId) {
        this.alternateEmailId = alternateEmailId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyLogoUrl() {
		return companyLogoUrl;
	}

	public void setCompanyLogoUrl(String companyLogoUrl) {
		this.companyLogoUrl = companyLogoUrl;
	}

	public String getCompanyVerified() {
        return companyVerified;
    }

    public void setCompanyVerified(String companyVerified) {
        this.companyVerified = companyVerified;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getCompanyStatus() {
		return companyStatus;
	}

	public void setCompanyStatus(String companyStatus) {
		this.companyStatus = companyStatus;
	}

	public Appuser getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Appuser createdBy) {
		this.createdBy = createdBy;
	}

	public Appuser getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Appuser updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getDomainName() {
		return domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public Boolean getOperationalMode() {
		return operationalMode;
	}

	public void setOperationalMode(Boolean operationalMode) {
		this.operationalMode = operationalMode;
	}

	public String getPrimaryContactName() {
		return primaryContactName;
	}

	public void setPrimaryContactName(String primaryContactName) {
		this.primaryContactName = primaryContactName;
	}

	public String getPrimaryContactPhone() {
		return primaryContactPhone;
	}

	public void setPrimaryContactPhone(String primaryContactPhone) {
		this.primaryContactPhone = primaryContactPhone;
	}

	public String getPrimaryContactMobile() {
		return primaryContactMobile;
	}

	public void setPrimaryContactMobile(String primaryContactMobile) {
		this.primaryContactMobile = primaryContactMobile;
	}

	public String getPrimaryContactEmail() {
		return primaryContactEmail;
	}

	public void setPrimaryContactEmail(String primaryContactEmail) {
		this.primaryContactEmail = primaryContactEmail;
	}

	public boolean getSetupStatus() {
		return setupStatus;
	}

	public void setSetupStatus(boolean setupStatus) {
		this.setupStatus = setupStatus;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public IndustryType getIndustryType() {
        return industryType;
    }

    public void setIndustryType(IndustryType industryType) {
        this.industryType = industryType;
    }

    public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getFooter() {
		return footer;
	}

	public void setFooter(String footer) {
				this.footer = footer;
	}
	
	public List<CompanyHasAddress> getCompanyHasAddresses() {
		return companyHasAddresses;
	}

	public void setCompanyHasAddresses(List<CompanyHasAddress> companyHasAddresses) {
		this.companyHasAddresses = companyHasAddresses;
	}

	public List<CompanyContact> getCompanyContacts() {
		return companyContacts;
	}

	public void setCompanyContacts(List<CompanyContact> companyContacts) {
		this.companyContacts = companyContacts;
	}

	public List<CompanyHasSocialNetwork> getCompanyHasSocialNetworks() {
		return companyHasSocialNetworks;
	}

	public void setCompanyHasSocialNetworks(
			List<CompanyHasSocialNetwork> companyHasSocialNetworks) {
		this.companyHasSocialNetworks = companyHasSocialNetworks;
	}

	@XmlTransient
    public List<Project> getProjectList() {
        return projectList;
    }

    public void setProjectList(List<Project> projectList) {
        this.projectList = projectList;
    }

    @XmlTransient
    public List<VirtualAccount> getVirtualAccountList() {
        return virtualAccountList;
    }

    public void setVirtualAccountList(List<VirtualAccount> virtualAccountList) {
        this.virtualAccountList = virtualAccountList;
    }

    @XmlTransient
    public List<BusinessHour> getBusinessHourList() {
        return businessHourList;
    }

    public void setBusinessHourList(List<BusinessHour> businessHourList) {
        this.businessHourList = businessHourList;
    }

    @XmlTransient
    public List<UserGroup> getUserGroupList() {
        return userGroupList;
    }

    public void setUserGroupList(List<UserGroup> userGroupList) {
        this.userGroupList = userGroupList;
    }

    public TwilioAccount getTwilioAccount() {
        return twilioAccount;
    }

    public void setTwilioAccount(TwilioAccount twilioAccount) {
        this.twilioAccount = twilioAccount;
    }

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Timestamp getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}

	public List<KnowledgeBase> getKnowledgeBases() {
		return knowledgeBases;
	}

	public void setKnowledgeBases(List<KnowledgeBase> knowledgeBases) {
		this.knowledgeBases = knowledgeBases;
	}

	public List<CompanyHasPackage> getCompanyHasPackages() {
		return companyHasPackages;
	}

	public void setCompanyHasPackages(List<CompanyHasPackage> companyHasPackages) {
		this.companyHasPackages = companyHasPackages;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public List<CompanyHasPlaceDetails> getCompanyHasPlaceDetails() {
		return companyHasPlaceDetails;
	}

	public void setCompanyHasPlaceDetails(
			List<CompanyHasPlaceDetails> companyHasPlaceDetails) {
		this.companyHasPlaceDetails = companyHasPlaceDetails;
	}

	public Float getRating() {
		return rating;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}
	
	public List<Company> getParentCompanies() {
		return parentCompanies;
	}

	public void setParentCompanies(List<Company> parentCompanies) {
		this.parentCompanies = parentCompanies;
	}

	public List<Company> getChildCompanies() {
		return childCompanies;
	}

	public void setChildCompanies(List<Company> childCompanies) {
		this.childCompanies = childCompanies;
	}
    
	public String getCurrencySymbol() {
		return currencySymbol;
	}

	public void setCurrencySymbol(String currencySymbol) {
		this.currencySymbol = currencySymbol;
	}
}
