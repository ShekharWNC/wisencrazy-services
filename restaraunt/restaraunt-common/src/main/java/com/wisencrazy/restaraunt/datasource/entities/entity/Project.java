package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * UserTO: Hoa Ho
 * Date: 2/19/13
 * Time: 9:40 PM
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Table(name = "project")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = Project.FIND_ALL, query = "SELECT p FROM Project p"),
        @NamedQuery(name = Project.FIND_BY_ID, query = "SELECT p FROM Project p WHERE p.id = :id"),
        @NamedQuery(name = Project.FIND_BY_SID, query = "SELECT p FROM Project p WHERE hex(p.sid) = :sid"),
        @NamedQuery(name = Project.FIND_ID_BY_SID, query = "SELECT p.id FROM Project p WHERE p.sid = unhex(:sid)"),
		@NamedQuery(name = Project.FIND_BY_NAME, query = "SELECT p FROM Project p WHERE p.name = :name"),
		@NamedQuery(name = Project.FIND_BY_PHONE_NO, query = "SELECT r.project FROM RegisteredPhoneNo r WHERE r.phoneNo = :phoneNo") ,
        @NamedQuery(name=Project.FIND_BY_EMAIL_ID,query="select distinct(p) from Company c join c.projectList p join p.projectGroups pg join pg.projectGroupHasEmails pge where (p.email=:emailId or pge.email=:emailId) and hex(c.sid)=:companySid"),
		@NamedQuery(name = Project.FIND_BY_EMAIL_ID_PROJECTGROUP_EMAIL_SID, query = "select distinct(p) from Company c join c.projectList p join p.projectGroups pg join pg.projectGroupHasEmails pge where (p.email=:emailId or pge.email=:emailId) and hex(c.sid)=:companySid and hex(pge.sid)!=:projectGroupEmailSid"),
		@NamedQuery(name = Project.UPDATE_MAX_CHATS, query = "UPDATE Project p set p.maxChats = :maxChats where hex(p.sid) = :projectSid"),
		@NamedQuery(name = Project.FIND_MAX_CHATS, query = "SELECT p.maxChats from Project p where hex(p.sid) = :projectSid"),
		@NamedQuery(name = Project.UPDATE_EMAIL_BY_SID, query = "UPDATE Project p set p.email = :emailId where hex(p.sid) = :sid"),
		@NamedQuery(name=Project.FIND_COMPANY_SID_BY_PROJECT_SID, query="select hex(p.company.sid) from Project p where hex(p.sid)=:projectSid"),
		@NamedQuery(name=Project.FIND_COMPANY_ID_BY_PROJECT_SID, query="select p.company.id from Project p where hex(p.sid)=:projectSid"),
		@NamedQuery(name=Project.FIND_COMPANY_ID_BY_PROJECT_ID, query="select p.company.id from Project p where p.id=:projectId")
})
public class Project extends AbsBaseEntity {
    /**
	 * 
	 */
	private static final long serialVersionUID = 3178309617777192350L;
	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.Project.";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_ID = PREFIX + "findById";
    public static final String FIND_BY_SID = PREFIX + "findBySId";
    public static final String FIND_BY_NAME = PREFIX + "findByName";
	public static final String FIND_BY_PHONE_NO = PREFIX + "findByPhoneNo";
	public static final String FIND_BY_EMAIL_ID = PREFIX + "findByEmailId";
	public static final String FIND_BY_EMAIL_ID_PROJECTGROUP_EMAIL_SID = PREFIX + "findByEmailIdAndProjectGroupEmailSid";
	public static final String UPDATE_MAX_CHATS = PREFIX + "updateMaxChats";
	public static final String FIND_MAX_CHATS = PREFIX + "findMaxChats";
	public static final String UPDATE_EMAIL_BY_SID = PREFIX + "updateEmailBySid";
	public static final String FIND_COMPANY_SID_BY_PROJECT_SID = PREFIX + "findCompanySidByProjectSid";
	public static final String FIND_COMPANY_ID_BY_PROJECT_SID = PREFIX + "findCompanyIdByProjectSid";
	public static final String FIND_COMPANY_ID_BY_PROJECT_ID = PREFIX + "findCompanyIdByProjectId";
	public static final String FIND_ID_BY_SID = PREFIX + "findIdBySid";
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "name")
    private String name;

//    @Temporal(TemporalType.DATE)
    @Column(name="end_date")
    private Timestamp endDate;
    
    @Column(name = "is_default")
    private Boolean isDefault;

//    @Temporal(TemporalType.DATE)
    @Column(name="start_date")
    private Timestamp startDate;

    @JoinColumn(name = "company_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Company company;

    @OneToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE}, mappedBy = "project")
    private List<ProjectHasVirtualAccount> projectHasVirtualAccountList;
    
    
    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "project_id", referencedColumnName = "id")
    private List<ProjectGroup> projectGroups;
    
    @Column(name="email_id")
    private String email;

    @Column(name="max_chats")
    private Integer maxChats;
    
    @Column(name = "chat_enable")
    private Boolean chatEnable;

    @Column(name="chat_greeting")
    private String chatGreeting;

    @Column(name="description")
    private String description;
    
    @Column(name = "is_active")
    private Boolean isActive;
    
    @Column(name = "location_name")
    private String locationName;
    
    @Column(name = "latitude")
    private String latitude;
    
    @Column(name = "longitude")
    private String longitude;
    
    
    @ManyToOne
    @JoinColumn(name = "created_by")
    private Appuser createdBy;
    
    @ManyToOne
    @JoinColumn(name = "updated_by")
    private Appuser updatedBy;
    
    @Column(name = "created_date")
    private Timestamp createdDate;
    
    @Column(name = "updated_date")
    private Timestamp updatedDate;
    
    
    /*
     * Bi directional relationship removed to resolve issue while deleting business hour.
     */
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "project_id", referencedColumnName = "id")
    private List<BusinessHour> businessHourList;
  
    @ManyToOne
	@JoinColumn(name = "timezone_id")
	private Timezone timezone;
    /*@OneToMany(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "project_id", referencedColumnName = "id")
    private List<CaseView> caseViewLists;*/
    
    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name = "project_has_knowledgebase", joinColumns = {
            @JoinColumn(name = "project_id", referencedColumnName = "id", nullable = false)}, inverseJoinColumns = {
            @JoinColumn(name = "knowledgebase_id", referencedColumnName = "id",nullable = false)})
    private List<KnowledgeBase> knowledgeBases;
    
    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name = "project_has_tax_categories", joinColumns = {
            @JoinColumn(name = "project_id", referencedColumnName = "id", nullable = false)}, 
            inverseJoinColumns = {@JoinColumn(name = "tax_category_id", referencedColumnName = "id", nullable = false)})
    private List<TaxCategories> taxCatogory;
   
    public Project() {
    }


    public Timezone getTimezone() {
		return timezone;
	}


	public void setTimezone(Timezone timezone) {
		this.timezone = timezone;
	}


	public List<BusinessHour> getBusinessHourList() {
		return businessHourList;
	}


	public void setBusinessHourList(List<BusinessHour> businessHourList) {
		this.businessHourList = businessHourList;
	}


	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
	public Boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}


	public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @XmlTransient
    public List<ProjectHasVirtualAccount> getProjectHasVirtualAccountList() {
        return projectHasVirtualAccountList;
    }

    public void setProjectHasVirtualAccountList(List<ProjectHasVirtualAccount> projectHasVirtualAccountList) {
        this.projectHasVirtualAccountList = projectHasVirtualAccountList;
    }

	public List<ProjectGroup> getProjectGroups() {
		return projectGroups;
	}

	public void setProjectGroups(List<ProjectGroup> projectGroups) {
		this.projectGroups = projectGroups;
	}

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

    public Integer getMaxChats() {
        return maxChats;
    }

    public void setMaxChats(Integer maxChats) {
        this.maxChats = maxChats;
    }
    
    public Boolean getChatEnable() {
		return chatEnable;
	}


	public void setChatEnable(Boolean chatEnable) {
		this.chatEnable = chatEnable;
	}


	public String getChatGreeting() {
        return chatGreeting;
    }

    public void setChatGreeting(String chatGreeting) {
        this.chatGreeting = chatGreeting;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

	public String getLocationName() {
		return locationName;
	}


	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}


	public String getLatitude() {
		return latitude;
	}


	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}


	public String getLongitude() {
		return longitude;
	}


	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}


	public Boolean getIsActive() {
		return isActive;
	}


	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
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


	public List<TaxCategories> getTaxCatogory() {
		return taxCatogory;
	}


	public void setTaxCatogory(List<TaxCategories> taxCatogory) {
		this.taxCatogory = taxCatogory;
	}



/*	public List<CaseView> getCaseViewLists() {
		return caseViewLists;
	}


	public void setCaseViewLists(List<CaseView> caseViewLists) {
		this.caseViewLists = caseViewLists;
	}*/
}
