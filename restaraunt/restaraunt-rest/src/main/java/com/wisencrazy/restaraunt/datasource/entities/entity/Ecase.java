package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.ejb.Lock;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.LockMode;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

/**
 * User: Hoa Ho
 * Date: 3/5/13
 * Time: 3:23 PM
 */
@Entity
@Table(name = "ecase")
//@Cacheable
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = Ecase.FIND_ALL, query = "SELECT e FROM Ecase e where e.caseId > '9999'"),
        @NamedQuery(name = Ecase.FIND_BY_ID, query = "SELECT e FROM Ecase e WHERE e.id = :id"),
        @NamedQuery(name = Ecase.FIND_BY_SID, query = "SELECT e FROM Ecase e WHERE hex(e.sid) = :sid"),
        @NamedQuery(name = Ecase.FIND_BY_SHORT_CODE, query = "SELECT e FROM Ecase e WHERE e.shortCode = :shortCode and e.caseId > '9999'"),
        @NamedQuery(name = Ecase.FIND_BY_CREATION_DATE, query = "SELECT e FROM Ecase e WHERE e.creationDate = :creationDate and e.caseId > '9999'"),
        @NamedQuery(name = Ecase.FIND_BY_PROJECT_ID, query = "SELECT e FROM Ecase e WHERE e.project.id = :projectId and e.caseId > '9999'"),
        @NamedQuery(name=Ecase.FIND_BY_CASE_ID,query="SELECT e FROM Ecase e WHERE e.caseId=:caseId"),
        @NamedQuery(name=Ecase.FIND_BY_ASSIGNED_2_VIRTUAL_ACCOUNT_SID,query="SELECT e FROM Ecase e WHERE hex(e.assigned2VirtualAccount.sid)=:vaccountsId"),
        @NamedQuery(name=Ecase.FIND_BY_CUSTOMER_SID,query="SELECT e FROM Ecase e WHERE hex(e.customer.sid)=:customerSid"),
        @NamedQuery(name = Ecase.FIND_BY_PROJECT_SID, query = "SELECT e FROM Ecase e WHERE hex(e.project.sid) = :projectSid and e.caseId > '9999'"),
		@NamedQuery(name = Ecase.FIND_CCLIST_BY_CASE_ID, query = "SELECT e.ccList FROM Ecase e WHERE e.caseId=:caseId"),
        @NamedQuery(name = Ecase.FIND_BY_CASE_ID_PROJECT, query = "SELECT e FROM Ecase e WHERE hex(e.project.sid) = :projectSid and e.caseId = :caseId"),
        @NamedQuery(name=Ecase.FIND_PROJECT_ID_BY_CASE_ID, query= "SELECT e.project.id from Ecase e where e.id=:caseId")
//        @NamedQuery(name=Ecase.FIND_BY_REQUESTOR_AGENT_SID,query="SELECT e from Ecase e where hex(e.createdByVirtualAccountId)=:vaccountsId and e.requestorType=com.callcomm.eserve.persistence.entity.EcaseRequestorType.AGENT"),
//        @NamedQuery(name=Ecase.FIND_BY_REQUESTOR_CUSTOMER_SID,query="SELECT e from Ecase e WHERE hex(e.customer.sid)=:customerSid and e.requestorType=com.callcomm.eserve.persistence.entity.Ecase.EcaseRequestorType.CUSTOMER")
        })
public class Ecase extends AbsBaseEntity implements Serializable {
    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.Ecase.";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_ID = PREFIX + "findById";
    public static final String FIND_BY_SID = PREFIX + "findBySId";
    public static final String FIND_BY_SHORT_CODE = PREFIX + "findByShortCode";
    public static final String FIND_BY_CREATION_DATE = PREFIX + "findByCreationDate";
    public static final String FIND_BY_PROJECT_ID = PREFIX + "findByProjId";
    public static final String FIND_BY_PROJECT_SID = PREFIX + "findByProjSid";
    public static final String FIND_BY_CASE_ID = PREFIX + "findByCaseId";
    public static final String FIND_BY_ASSIGNED_2_VIRTUAL_ACCOUNT_SID=PREFIX+"findByVaccountSid";
    public static final String FIND_BY_CUSTOMER_SID=PREFIX+"findByCustomerSid";
    public static final String FIND_CCLIST_BY_CASE_ID=PREFIX+"findCcListByCaseId";
    public static final String FIND_BY_CASE_ID_PROJECT=PREFIX+"findbyCaseIdForProject";
    public static final String FIND_PROJECT_ID_BY_CASE_ID=PREFIX+"findProjectIdByCaseId";
/*    public static final String FIND_BY_REQUESTOR_AGENT_SID=PREFIX+"findByRequestorAgentSid";
    public static final String FIND_BY_REQUESTOR_CUSTOMER_SID=PREFIX+"findByRequestorCustomerSid";*/
    
    private static final long serialVersionUID = 1L;
    @Size(max = 45)
    @Column(name = "short_code", length = 45)
    private String shortCode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "creation_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    @Column(name = "subject")
    private String subject;
    @JoinColumn(name = "assigned_2_virtual_account_id", referencedColumnName = "id")
    @ManyToOne(fetch=FetchType.LAZY)
    private VirtualAccount assigned2VirtualAccount;
    @JoinColumn(name = "case_priority_id", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false,fetch=FetchType.LAZY)
    private CasePriority casePriority;
    @JoinColumn(name = "case_status_id", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false,fetch=FetchType.LAZY)
    private CaseStatus caseStatus;
    @JoinColumn(name = "assigned_2_project_group_id", referencedColumnName = "id")
    @ManyToOne(fetch=FetchType.LAZY)
    private ProjectGroup assigned2ProjectGroup;
    @JoinColumn(name = "project_id", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false,fetch=FetchType.LAZY)
    private Project project;
    
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    @ManyToOne/*(optional = false,fetch=FetchType.EAGER)*/
    private Customer customer;

    @JoinColumn(name = "case_type_id", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false,fetch=FetchType.LAZY)
    private CaseType caseType;
    @JoinColumn(name = "support_channel_id", referencedColumnName = "id")
    @ManyToOne(optional = false,fetch=FetchType.LAZY)
    private SupportChannel supportChannel;
    @Column(name = "last_updated_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedDate;
    @Column(name = "last_opened_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastOpenedDate;
    @Column(name = "last_pending_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastPendingDate;
    @Column(name = "last_escalated_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastEscalatedDate;
    @Column(name = "last_solved_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastSolvedDate;
    @Column(name = "last_closed_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastClosedDate;
    @Size(max = 255)
    @Column(name = "description")
    private String description;
  
    @OneToMany(cascade=CascadeType.ALL,mappedBy = "ecase")
    private List<CaseTag> caseTagList;
        
    
    @Column(name="requestor_type",nullable=false)
    @Enumerated(EnumType.STRING)
    private EcaseRequestorType requestorType;

    
    @JoinColumn(name = "created_by_virtual_account_id", referencedColumnName = "id")
    @ManyToOne(fetch=FetchType.LAZY)
    private VirtualAccount createdByVirtualAccount;

   
    @Column(name = "duedate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date duedate;
    @Column(name="cclist")
    private String ccList;
    @Column(name="case_id")
    private Integer caseId;
    
    public Ecase() {
    }
	public Integer getCaseId() {
		return caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

	public String getCcList() {
		return ccList;
	}
	public void setCcList(String ccList) {
		this.ccList = ccList;
	}
	public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public VirtualAccount getAssigned2VirtualAccount() {
        return assigned2VirtualAccount;
    }

    public void setAssigned2VirtualAccount(VirtualAccount assigned2VirtualAccount) {
        this.assigned2VirtualAccount = assigned2VirtualAccount;
    }

    public CasePriority getCasePriority() {
        return casePriority;
    }

    public void setCasePriority(CasePriority casePriority) {
        this.casePriority = casePriority;
    }

    public CaseStatus getCaseStatus() {
        return caseStatus;
    }

    public void setCaseStatus(CaseStatus caseStatus) {
        this.caseStatus = caseStatus;
    }

    public ProjectGroup getAssigned2ProjectGroup() {
        return assigned2ProjectGroup;
    }

    public void setAssigned2ProjectGroup(ProjectGroup assigned2ProjectGroup) {
        this.assigned2ProjectGroup = assigned2ProjectGroup;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public CaseType getCaseType() {
        return caseType;
    }

    public void setCaseType(CaseType caseType) {
        this.caseType = caseType;
    }

    public SupportChannel getSupportChannel() {
        return supportChannel;
    }

    public void setSupportChannel(SupportChannel supportChannel) {
        this.supportChannel = supportChannel;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public Date getLastOpenedDate() {
        return lastOpenedDate;
    }

    public void setLastOpenedDate(Date lastOpenedDate) {
        this.lastOpenedDate = lastOpenedDate;
    }

    public Date getLastPendingDate() {
        return lastPendingDate;
    }

    public void setLastPendingDate(Date lastPendingDate) {
        this.lastPendingDate = lastPendingDate;
    }

    public Date getLastSolvedDate() {
        return lastSolvedDate;
    }

    public void setLastSolvedDate(Date lastSolvedDate) {
        this.lastSolvedDate = lastSolvedDate;
    }

    public Date getLastClosedDate() {
        return lastClosedDate;
    }

    public void setLastClosedDate(Date lastClosedDate) {
        this.lastClosedDate = lastClosedDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<CaseTag> getCaseTagList() {
        return caseTagList;
    }

    public void setCaseTagList(List<CaseTag> caseTagList) {
        this.caseTagList = caseTagList;
    }

    public Date getDuedate() {
        return duedate;
    }

    public void setDuedate(Date duedate) {
        this.duedate = duedate;
    }
	public Date getLastEscalatedDate() {
		return lastEscalatedDate;
	}
	public void setLastEscalatedDate(Date lastEscalatedDate) {
		this.lastEscalatedDate = lastEscalatedDate;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public EcaseRequestorType getRequestorType() {
		return requestorType;
	}
	public void setRequestorType(EcaseRequestorType requestorType) {
		this.requestorType = requestorType;
	}
	public VirtualAccount getCreatedByVirtualAccount() {
		return createdByVirtualAccount;
	}
	public void setCreatedByVirtualAccount(VirtualAccount createdByVirtualAccountId) {
		this.createdByVirtualAccount = createdByVirtualAccountId;
	}
}
