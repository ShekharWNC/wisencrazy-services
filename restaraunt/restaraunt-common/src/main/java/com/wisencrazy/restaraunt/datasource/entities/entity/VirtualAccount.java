package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * UserTO: Hoa Ho
 * Date: 2/19/13
 * Time: 9:18 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "virtual_account")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = VirtualAccount.FIND_ALL, query = "SELECT v FROM VirtualAccount v"),
        @NamedQuery(name = VirtualAccount.FIND_BY_ID, query = "SELECT v FROM VirtualAccount v WHERE v.id = :id"),
        @NamedQuery(name = VirtualAccount.FIND_BY_SID, query = "SELECT v FROM VirtualAccount v WHERE hex(v.sid) = :sid and v.isActive=true"),
		@NamedQuery(name = VirtualAccount.FIND_BY_PROJECTID_USERNAME, query = "select va from VirtualAccount va join va.company.projectList pl where pl.id = :projectId and va.user.username = :username"),
		@NamedQuery(name = VirtualAccount.FIND_BY_PROJECTSID_USERNAME, query = "select va from VirtualAccount va join va.company.projectList pl where hex(pl.sid) = :projectSid and va.user.username = :username"),
		@NamedQuery(name = VirtualAccount.FIND_PROJECT_SKILLS_BY_PROJECTID_USERNAME, query = "select vap.projectRole.name from VirtualAccountHasProjectRole vap join vap.virtualAccount va join va.company.projectList pl where pl.id = :projectId and va.user.username = :username"),
		@NamedQuery(name = VirtualAccount.FIND_PROJECT_SKILLS_BY_PROJECTSID_USERNAME, query = "select vap.projectRole.name from VirtualAccountHasProjectRole vap join vap.virtualAccount va join va.company.projectList pl where hex(pl.sid) = :projectSid and va.user.username = :username"),
		@NamedQuery(name = VirtualAccount.FIND_USER_BY_SID, query = "select va.user from VirtualAccount va where hex(va.sid) = :sid"),
        @NamedQuery(name = VirtualAccount.FIND_BY_IS_ACTIVE, query = "SELECT v FROM VirtualAccount v WHERE v.isActive = :isActive"),
        @NamedQuery(name = VirtualAccount.FIND_ID_BY_SID, query = "SELECT v.id FROM VirtualAccount v WHERE hex(v.sid) = :sid"),
        @NamedQuery(name=VirtualAccount.DEFAULT_AUTO_AGENT_BY_COMPANY,query="select v from VirtualAccount v where hex(v.company.sid)=:companySid and v.isDefaultAutoAgent=true and v.userType='AUTO_AGENT_USER'"),
        @NamedQuery(name=VirtualAccount.ACTIVE_AUTO_AGENTS,query="select v from VirtualAccount v where v.isActive=true and v.userType='AUTO_AGENT_USER'"),
        @NamedQuery(name=VirtualAccount.ACTIVE_AUTO_AGENTS_LIST,query="select hex(v.sid) from VirtualAccount v where v.isActive=true and v.userType='AUTO_AGENT_USER'"),
        @NamedQuery(name=VirtualAccount.FIND_ROLES_BY_EMAIL, query = "select cr.name from VirtualAccount va join va.companyRole cr where va.user.username = :emailId")
})
public class VirtualAccount extends AbsBaseEntity {
    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.VirtualAccount.";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_ID = PREFIX + "findById";
    public static final String FIND_BY_SID = PREFIX + "findBySId";
    public static final String FIND_BY_IS_ACTIVE = PREFIX + "findByIsActive";
    public static final String FIND_BY_PROJECTID_USERNAME = PREFIX + "findByProjectAndUsername";
    public static final String FIND_BY_PROJECTSID_USERNAME = PREFIX + "findByProjectSidAndUserName";
    public static final String FIND_PROJECT_SKILLS_BY_PROJECTID_USERNAME = PREFIX + "findProjectSkillsByProjectIdAndUserName";
    public static final String FIND_PROJECT_SKILLS_BY_PROJECTSID_USERNAME = PREFIX + "findProjectSkillsByProjectSidAndUserName";
    public static final String FIND_USER_BY_SID = PREFIX + "findUserBySid";
    public static final String FIND_ID_BY_SID = PREFIX + "findIdBySid";
    public static final String DEFAULT_AUTO_AGENT_BY_COMPANY=PREFIX+"defaultAutoAgentByCompany";
    public static final String ACTIVE_AUTO_AGENTS=PREFIX+"activeAutoAgents";
    public static final String ACTIVE_AUTO_AGENTS_LIST=PREFIX+"activeAutoAgentsList";
    public static final String FIND_ROLES_BY_EMAIL = PREFIX + "findRolesByEmail";

    private static final long serialVersionUID = 1L;
    
    public enum UserType{
    	AUTO_AGENT_USER,GENERAL_USER
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="account_active_since")
    private Date accountActiveSince;

    @Column(name = "is_primary_admin")
    private boolean isPrimaryAdmin;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_active")
    private boolean isActive;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "virtualAccount")
    private List<ProjectHasVirtualAccount> projectHasVirtualAccountList;
    
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    @ManyToOne/*(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, optional = false)*/
    private Company company;
    
    @JoinColumn(name = "appuser_id", referencedColumnName = "id")
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Appuser user;
    
    
    @JoinTable(name = "user_group_has_virtual_account", joinColumns = {
            @JoinColumn(name = "virtual_account_id", referencedColumnName = "id")}, inverseJoinColumns = {
            @JoinColumn(name = "user_group_id", referencedColumnName = "id")})
    @ManyToMany
    private List<UserGroup> userGroupList;
    
    @JoinTable(
            name="virtual_account_has_company_role"
            , joinColumns={
            @JoinColumn(name="virtual_account_id",referencedColumnName="id")
    }
            , inverseJoinColumns={
            @JoinColumn(name="company_role_id",referencedColumnName="id")
    }
    )
    @ManyToMany
    private List<CompanyRole> companyRole;
    @ManyToOne
    @JoinColumn(name = "profile_type_id")
    private ProfileType profileType;
    
    @Column(name="is_default_auto_agent")
    private boolean isDefaultAutoAgent;
    
    @Column(name="user_type")
    @Enumerated(EnumType.STRING)
    private UserType userType;
    
    @OneToMany(cascade = {CascadeType.MERGE,CascadeType.PERSIST}, mappedBy = "virtualAccount")
    private List<VirtualAccountHasSkill> virtualAccountHasSkills;
 

    public List<VirtualAccountHasSkill> getVirtualAccountHasSkills() {
		return virtualAccountHasSkills;
	}

	public void setVirtualAccountHasSkills(
			List<VirtualAccountHasSkill> virtualAccountHasSkills) {
		this.virtualAccountHasSkills = virtualAccountHasSkills;
	}

	public List<CompanyRole> getCompanyRole() {
		return companyRole;
	}

	public void setCompanyRole(List<CompanyRole> companyRole) {
		this.companyRole = companyRole;
	}

	public VirtualAccount() {
    }

    public Date getAccountActiveSince() {
        return accountActiveSince;
    }

    public void setAccountActiveSince(Date accountActiveSince) {
        this.accountActiveSince = accountActiveSince;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    @XmlTransient
    public List<ProjectHasVirtualAccount> getProjectHasVirtualAccountList() {
        return projectHasVirtualAccountList;
    }

    public void setProjectHasVirtualAccountList(List<ProjectHasVirtualAccount> projectHasVirtualAccountList) {
        this.projectHasVirtualAccountList = projectHasVirtualAccountList;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Appuser getUser() {
        return user;
    }

    public void setUser(Appuser user) {
        this.user = user;
    }

    @XmlTransient
    public List<UserGroup> getUserGroupList() {
        return userGroupList;
    }

    public void setUserGroupList(List<UserGroup> userGroupList) {
        this.userGroupList = userGroupList;
    }

	public ProfileType getProfileType() {
		return profileType;
	}

	public void setProfileType(ProfileType profileType) {
		this.profileType = profileType;
	}

	public boolean isPrimaryAdmin() {
		return isPrimaryAdmin;
	}

	public void setPrimaryAdmin(boolean isPrimaryAdmin) {
		this.isPrimaryAdmin = isPrimaryAdmin;
	}

	public boolean isDefaultAutoAgent() {
		return isDefaultAutoAgent;
	}

	public void setDefaultAutoAgent(boolean isDefaultAutoAgent) {
		this.isDefaultAutoAgent = isDefaultAutoAgent;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
}
