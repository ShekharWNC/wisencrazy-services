package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * User: Hoa Ho
 * Date: 3/11/13
 * Time: 4:16 PM
 */
@Entity
@Table(name = "registered_phone_no")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = RegisteredPhoneNo.FIND_ALL, query = "SELECT r FROM RegisteredPhoneNo r"),
        @NamedQuery(name = RegisteredPhoneNo.FIND_BY_SID, query = "SELECT r FROM RegisteredPhoneNo r where hex(r.sid) = :sid"),
        @NamedQuery(name = RegisteredPhoneNo.FIND_BY_ID, query = "SELECT r FROM RegisteredPhoneNo r WHERE r.id = :id"),
        @NamedQuery(name = RegisteredPhoneNo.FIND_BY_COMPANY_SID, query = "SELECT r FROM RegisteredPhoneNo r WHERE hex(r.companyId.sid) = :companySid"),
        @NamedQuery(name = RegisteredPhoneNo.FIND_BY_PROJECT, query= "SELECT r from RegisteredPhoneNo r where hex(r.project.sid)=:sid"),
        @NamedQuery(name = RegisteredPhoneNo.FIND_BY_PHONE_NO, query = "SELECT r FROM RegisteredPhoneNo r WHERE r.phoneNo = :phoneNo"),
        @NamedQuery(name = RegisteredPhoneNo.FIND_BY_ENABLE_OUTGOING, query = "SELECT p FROM RegisteredPhoneNo p WHERE p.enableOutgoingCalls = :enableOutgoingCalls"),
        @NamedQuery(name = RegisteredPhoneNo.FIND_BY_PROJECT_ID, query = "SELECT p FROM RegisteredPhoneNo p WHERE p.project.id = :projectId"),
        @NamedQuery(name = RegisteredPhoneNo.FIND_BY_PROJECT_ID_OUTGOING, query = "SELECT p FROM RegisteredPhoneNo p WHERE p.project.id = :projectId AND p.enableOutgoingCalls = :enableOutgoingCalls"),
        @NamedQuery(name = RegisteredPhoneNo.UPDATE_VM_STATUS, query = "update RegisteredPhoneNo p set p.enableVm = :status WHERE hex(p.sid) = :sid"),
        @NamedQuery(name = RegisteredPhoneNo.UPDATE_CALL_RECORD_STATUS, query = "update RegisteredPhoneNo p set p.enableCallRecord = :status WHERE hex(p.sid) = :sid"),
        @NamedQuery(name=RegisteredPhoneNo.FIND_COMPANY_SID_BY_PHONE_NO,query="SELECT hex(r.companyId.sid) from RegisteredPhoneNo r where r.phoneNo = :phoneNo"),
        @NamedQuery(name = RegisteredPhoneNo.UPDATE_OUTGOING_CALL_STATUS, query = "update RegisteredPhoneNo p set p.enableOutgoingCalls = :status WHERE hex(p.sid) = :sid")
})
public class RegisteredPhoneNo extends AbsBaseEntity {
    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.RegisteredPhoneNo.";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_ID = PREFIX + "findById";
    public static final String FIND_BY_COMPANY_SID = PREFIX + "findByCompanySid";
    public static final String FIND_BY_PROJECT=PREFIX + "findByProjectSid2";
    public static final String FIND_BY_PHONE_NO = PREFIX + "findByPhoneNo";
    public static final String FIND_BY_PHONE_NO_ID = PREFIX + "findByPhoneNoId";
    public static final String FIND_BY_PROJECT_ID = PREFIX + "findByProjectId";
    public static final String FIND_BY_PROJECT_ID_OUTGOING = PREFIX + "findByProjectIdOutgoing";
    public static final String FIND_BY_ENABLE_OUTGOING = PREFIX + "findByEnableOutgoingCalls";
    public static final String UPDATE_VM_STATUS = PREFIX + "updateVmStatusBySid";
    public static final String UPDATE_CALL_RECORD_STATUS = PREFIX + "updateCallRecordStatusBySid";
    public static final String FIND_BY_SID = PREFIX + "findBySid";
    public static final String FIND_COMPANY_SID_BY_PHONE_NO="findCompanyIdByPhoneNo";
    public static final String UPDATE_OUTGOING_CALL_STATUS = PREFIX + "updateOutgoingCallStatusBySid";

    public enum Status{
    	active,
    	in_active,
    	released
    }
    private static final long serialVersionUID = 1L;
	
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "phone_no")
    private String phoneNo;
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Company companyId;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "project_id", referencedColumnName = "id", nullable = false)
    private Project project;
    
    
    @Column(name="voice_enabled")
    private boolean voiceEnabled;
    
    @Column(name="sms_enabled")
    private boolean smsEnabled;
    
    @Column(name="mms_enabled")
    private boolean mmsEnabled;
    
    @Column(name="region")
    private String region;
    
    @Column(name="friendly_name")
    private String friendlyName;
    
    @Column(name="postal_code")
    private String postalCode;
    
    @Column(name="area_code")
    private Integer areaCode;
    
    @Column(name="status")
    private String status;
    
    @Column(name = "enable_call_record")
    private boolean enableCallRecord;
    
    @Column(name = "enable_vm")
    private boolean enableVm;
        
	@ManyToMany
	@JoinTable(
			name = "registered_phone_no_has_ivr_menu",
			joinColumns = {
					@JoinColumn(name = "registered_phone_no_id")
			}, 
			inverseJoinColumns = {
					@JoinColumn(name = "ivr_menu_id")
			})
	private List<IvrMenu> menuItems;

	@Column(name = "enable_outgoing_calls")
    private boolean enableOutgoingCalls;

    public RegisteredPhoneNo() {
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Company getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Company companyId) {
        this.companyId = companyId;
    }
    
    public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}


	public List<IvrMenu> getMenuItems() {
		return menuItems;
	}

	public void setMenuItems(List<IvrMenu> menuItems) {
		this.menuItems = menuItems;
	}

	public boolean isVoiceEnabled() {
		return voiceEnabled;
	}

	public void setVoiceEnabled(boolean voiceEnabled) {
		this.voiceEnabled = voiceEnabled;
	}

	public boolean isSmsEnabled() {
		return smsEnabled;
	}

	public void setSmsEnabled(boolean smsEnabled) {
		this.smsEnabled = smsEnabled;
	}

	public boolean isMmsEnabled() {
		return mmsEnabled;
	}

	public void setMmsEnabled(boolean mmsEnabled) {
		this.mmsEnabled = mmsEnabled;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getFriendlyName() {
		return friendlyName;
	}

	public void setFriendlyName(String friendlyName) {
		this.friendlyName = friendlyName;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Integer getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(Integer areaCode) {
		this.areaCode = areaCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isEnableOutgoingCalls() {
		return enableOutgoingCalls;
	}

	public void setEnableOutgoingCalls(boolean enableOutgoingCalls) {
		this.enableOutgoingCalls = enableOutgoingCalls;
	}

	public boolean isEnableCallRecord() {
		return enableCallRecord;
	}

	public void setEnableCallRecord(boolean enableCallRecord) {
		this.enableCallRecord = enableCallRecord;
	}

	public boolean isEnableVm() {
		return enableVm;
	}

	public void setEnableVm(boolean enableVm) {
		this.enableVm = enableVm;
	}
	
}

