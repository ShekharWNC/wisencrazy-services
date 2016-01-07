package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
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
 * User: Hoa Ho
 * Date: 4/16/13
 * Time: 12:57 PM
 */
@Entity
@Table(name = "case_view")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = CaseView.FIND_ALL, query = "SELECT c FROM CaseView c"),
        @NamedQuery(name = CaseView.FIND_BY_ID, query = "SELECT c FROM CaseView c JOIN FETCH c.project WHERE c.id = :id"),
        @NamedQuery(name = CaseView.FIND_BY_SID, query = "SELECT c FROM CaseView c WHERE hex(c.sid) = :sid"),
        @NamedQuery(name = CaseView.FIND_BY_PROJECT_ID, query = "SELECT c FROM CaseView c WHERE c.project.id = :projectId"),
        @NamedQuery(name = CaseView.FIND_BY_PROJECT_SID, query = "SELECT c FROM CaseView c WHERE hex(c.project.sid) = :projectSid"),
        @NamedQuery(name = CaseView.FIND_BY_TITLE, query = "SELECT c FROM CaseView c WHERE c.title = :title"),
        @NamedQuery(name = CaseView.FIND_BY_CASE_LIMIT, query = "SELECT c FROM CaseView c WHERE c.casesLimit = :casesLimit"),
        @NamedQuery(name = CaseView.FIND_BY_AVAILABILITY_TYPE, query = "SELECT c FROM CaseView c WHERE c.availabilityType = :availabilityType"),
        @NamedQuery(name = CaseView.FIND_BY_ENABLED, query = "SELECT c FROM CaseView c WHERE c.enabled = :enabled"),
        @NamedQuery(name = CaseView.FIND_BY_ORDER_TYPE, query = "SELECT c FROM CaseView c WHERE c.orderType = :orderType"),
        @NamedQuery(name = CaseView.FIND_BY_AGENT_ID, query = "SELECT cv FROM CaseView cv WHERE cv.project.id = "
				+ ":projectId AND cv.enabled=true AND (SELECT r.projectRole.id FROM VirtualAccountHasProjectRole r WHERE r.virtualAccount.id=:virtualAccountId AND r.project.id=:projectId) IN (1,2)  AND (cv.availabilityType='All' "
				+ "OR (cv.availabilityType='ByGroup' AND cv.availability IN (SELECT DISTINCT pg.id FROM ProjectGroup pg "
				+ "JOIN pg.projectHasVirtualAccountList phva WHERE phva.projectHasVirtualAccountPK.virtualAccountId="
				+ ":virtualAccountId)) OR (cv.availabilityType='Me' AND cv.creator.id=:virtualAccountId)) "
				+ "ORDER BY cv.availabilityType, cv.id"),
		@NamedQuery(name = CaseView.FIND_ORDER_BY_PROJECT_SID, query = "SELECT c.caseViewOrder FROM CaseView c WHERE hex(c.project.sid) = :projectSid"),
		@NamedQuery(name = CaseView.FIND_BY_SID_PROJECT_CASEVIEW_TYPE, query = "FROM CaseView c " +
				"WHERE hex(c.project.sid) = :projectSid and hex(c.sid) = :sid and c.caseViewType = :caseViewType"),
		@NamedQuery(name = CaseView.FIND_ID_BY_SID_PROJECT_CASEVIEW_TYPE, query = "SELECT c.id FROM CaseView c " +
						"WHERE hex(c.project.sid) = :projectSid and hex(c.sid) = :sid and c.caseViewType = :caseViewType"),
		@NamedQuery(name = CaseView.FIND_PROJECT_ID_BY_CASE_VIEW_ID, query = "SELECT c.project.id FROM CaseView c where c.id=:caseViewId"),
		@NamedQuery(name = CaseView.UPDATE_CASE_DESCRIPTION, query = "update CaseView cv set cv.caseDescription = :Description" +
				" where hex(cv.sid) = :sid" +
				" and  cv.project.id in (select p.id from Project p where hex(sid) = :projectSid)")
})
public class CaseView extends AbsBaseEntity {
    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.CaseView.";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_ID = PREFIX + "findById";
    public static final String FIND_BY_SID = PREFIX + "findBySid";
    public static final String FIND_BY_PROJECT_ID = PREFIX + "findByProjectId";
    public static final String FIND_BY_TITLE = PREFIX + "findByTitle";
    public static final String FIND_BY_CASE_LIMIT = PREFIX + "findByCaseLimit";
    public static final String FIND_BY_AVAILABILITY_TYPE = PREFIX + "findByAvailabilityType";
    public static final String FIND_BY_ENABLED = PREFIX + "findByEnabled";
    public static final String FIND_BY_ORDER_TYPE = PREFIX + "findByOrderType";
    public static final String FIND_BY_AGENT_ID = PREFIX + "findByAgentId"; // Find By VirtualAccountID + VirtualAccount must have Agent role
    public static final String FIND_BY_PROJECT_SID = PREFIX + "findByProjectSid";
    public static final String FIND_ORDER_BY_PROJECT_SID = PREFIX + "findOrderByProjectSid"; 
    public static final String FIND_BY_SID_PROJECT_CASEVIEW_TYPE = PREFIX + "findBySidProjectAndAvailabilityType";
    public static final String FIND_ID_BY_SID_PROJECT_CASEVIEW_TYPE = PREFIX + "findIdBySidProjectAndAvailabilityType";
    public static final String FIND_PROJECT_ID_BY_CASE_VIEW_ID=PREFIX+"findProjectIdByCaseViewId";
    public static final String UPDATE_CASE_DESCRIPTION = PREFIX + "updateCaseViewDescription";
    public static final String AVAILABILITY_TYPE_ALL = "ALL";
    public static final String AVAILABILITY_TYPE_BY_GROUP = "ByGroup";
    public static final String AVAILABILITY_TYPE_BY_AGENT = "ByAgent";
    public static final String AVAILABILITY_TYPE_ME = "Me";
    public static final String AVAILABILITY_TYPE_AGENT = "Agent";
    public static final String AVAILABILITY_TYPE_SUPERVISOR = "Supervisor";

    public static final String ORDER_TYPE_ASC = "ASC";
    public static final String ORDER_TYPE_DESC = "DESC";

    private static final long serialVersionUID = 1L;
	

    public enum AVAILABILITY_TYPE {
        ALL,
        BY_GROUP,
        BY_AGENT,
        ME,
        UNKNOWN,
        AGENT,
        SUPERVISOR
    }

    public enum ORDER_TYPE {
        ASC,
        DESC
    }

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "title")
    private String title;
    
    @Column(name = "case_description")
    private String caseDescription;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "cases_limit")
    private short casesLimit;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "availability_type")
    private String availabilityType;
    @Size(max = 45)
    @Column(name = "availability")
    private String availability;
    @Basic(optional = false)
    @NotNull
    @Column(name = "enabled")
    private boolean enabled;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "order_type")
    private String orderType;
    
    @Column(name = "case_view_order")
    private Integer caseViewOrder;
    
    @Column(name = "case_view_type")
    private String caseViewType;
    
    @Column(name = "is_default")
    private Boolean isDefault;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "caseView", fetch = FetchType.LAZY, orphanRemoval = true)
    private List<CaseViewCondition> caseViewConditionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "caseView", orphanRemoval = true, fetch = FetchType.LAZY)
    private List<CaseViewTblColumn> caseViewTblColumnList;
    @JoinColumn(name = "creator", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private VirtualAccount creator;
    @JoinColumn(name = "order_by", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private CaseField orderBy;
    @JoinColumn(name = "group_by", referencedColumnName = "id")
    @ManyToOne
    private CaseField groupBy;
    @JoinColumn(name = "project_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Project project;

    public CaseView() {
    }

    public CaseView(Integer id) {
        this.id = id;
    }

    public CaseView(Integer id, String title, short casesLimit, String availabilityType, boolean enabled, String orderType) {
        this.id = id;
        this.title = title;
        this.casesLimit = casesLimit;
        this.availabilityType = availabilityType;
        this.enabled = enabled;
        this.orderType = orderType;
    }

    public CaseView(Integer id, String title, short casesLimit, String availabilityType, String availability, boolean enabled, String orderType) {
        this.id = id;
        this.title = title;
        this.casesLimit = casesLimit;
        this.availabilityType = availabilityType;
        this.availability = availability;
        this.enabled = enabled;
        this.orderType = orderType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCaseDescription() {
		return caseDescription;
	}

	public void setCaseDescription(String caseDescription) {
		this.caseDescription = caseDescription;
	}

	public short getCasesLimit() {
        return casesLimit;
    }

    public void setCasesLimit(short casesLimit) {
        this.casesLimit = casesLimit;
    }

    public String getAvailabilityType() {
        return availabilityType;
    }

    public void setAvailabilityType(String availabilityType) {
        this.availabilityType = availabilityType;
    }

    public AVAILABILITY_TYPE getAvailabilityTypeEnum() {
        if(availabilityType.equalsIgnoreCase(AVAILABILITY_TYPE_ALL)) return  AVAILABILITY_TYPE.ALL;
        if(availabilityType.equalsIgnoreCase(AVAILABILITY_TYPE_BY_GROUP)) return  AVAILABILITY_TYPE.BY_GROUP;
        if(availabilityType.equalsIgnoreCase(AVAILABILITY_TYPE_BY_AGENT)) return  AVAILABILITY_TYPE.BY_AGENT;
        if(availabilityType.equalsIgnoreCase(AVAILABILITY_TYPE_ME)) return  AVAILABILITY_TYPE.ME;

        return AVAILABILITY_TYPE.UNKNOWN;
    }

    public void setAvailabilityTypeEnum(AVAILABILITY_TYPE availabilityType) {
        switch (availabilityType)
        {
            case ALL:
                this.availabilityType = AVAILABILITY_TYPE_ALL;
                break;
            case BY_GROUP:
                this.availabilityType = AVAILABILITY_TYPE_BY_GROUP;
                break;
            case BY_AGENT:
                this.availabilityType = AVAILABILITY_TYPE_BY_AGENT;
                break;
            case ME:
                this.availabilityType = AVAILABILITY_TYPE_ME;
                break;
            default:
                this.availabilityType = "UNKNOWN";
        }
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public Boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public ORDER_TYPE getOrderTypeEnum() {
        if(orderType.equals(ORDER_TYPE_ASC)) return ORDER_TYPE.ASC;

        return ORDER_TYPE.DESC;
    }

    public void setOrderTypeEnum(ORDER_TYPE orderType) {
        switch (orderType) {
            case ASC:
                this.orderType = ORDER_TYPE_ASC;
                break;
            case DESC:
                this.orderType = ORDER_TYPE_DESC;
                break;
            default:
                this.orderType = ORDER_TYPE_DESC;
        }
    }

    @XmlTransient
    public List<CaseViewCondition> getCaseViewConditionList() {
        return caseViewConditionList;
    }

    public void setCaseViewConditionList(List<CaseViewCondition> caseViewConditionList) {
        this.caseViewConditionList = caseViewConditionList;
    }

    @XmlTransient
    public List<CaseViewTblColumn> getCaseViewTblColumnList() {
        return caseViewTblColumnList;
    }

    public void setCaseViewTblColumnList(List<CaseViewTblColumn> caseViewTblColumnList) {
        this.caseViewTblColumnList = caseViewTblColumnList;
    }

    public VirtualAccount getCreator() {
        return creator;
    }

    public void setCreator(VirtualAccount creator) {
        this.creator = creator;
    }

    public CaseField getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(CaseField orderBy) {
        this.orderBy = orderBy;
    }

    public CaseField getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(CaseField groupBy) {
        this.groupBy = groupBy;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CaseView)) {
            return false;
        }
        CaseView other = (CaseView) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.callcomm.eserve.persistence.entity.CaseView[ id=" + id + " ]";
    }

	public Integer getCaseViewOrder() {
		return caseViewOrder;
	}

	public void setCaseViewOrder(Integer caseViewOrder) {
		this.caseViewOrder = caseViewOrder;
	}

	public String getCaseViewType() {
		return caseViewType;
	}

	public void setCaseViewType(String caseViewType) {
		this.caseViewType = caseViewType;
	}

}

