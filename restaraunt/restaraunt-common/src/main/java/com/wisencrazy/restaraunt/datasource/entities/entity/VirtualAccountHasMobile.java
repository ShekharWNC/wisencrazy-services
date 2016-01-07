package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: VirtualAccountHasMobile
 *
 */
@Entity
@Table(name="vw_virtual_accounts_has_mobile_number")
@NamedQueries({ @NamedQuery(name = VirtualAccountHasMobile.FIND_BY_PROJECT_ID, query = "from VirtualAccountHasMobile v where v.projectId=:projectId"),
	@NamedQuery(name = VirtualAccountHasMobile.FIND_VA_SID_BY_PROJECT_ID, query = "select v.vaccountSid from VirtualAccountHasMobile v where v.projectId=:projectId"),
	@NamedQuery(name = VirtualAccountHasMobile.FIND_VA_SID_BY_PROJECT_GROUP_ID, query = "select v.vaccountSid from VirtualAccountHasMobile v where v.projectGroupId=:projectGroupId"),
	@NamedQuery(name = VirtualAccountHasMobile.FIND_VA_SID_BY_VIRTUAL_ACCOUNT_SID_LIST, query = "select v.vaccountSid from VirtualAccountHasMobile v where v.vaccountSid IN (:vaccountSids)"),
	@NamedQuery(name = VirtualAccountHasMobile.FIND_BY_VIRTUAL_ACCOUNT_SID_LIST, query = "from VirtualAccountHasMobile v where v.vaccountSid IN (:vaccountSids)"),
	@NamedQuery(name = VirtualAccountHasMobile.FIND_BY_VIRTUAL_ACCOUNT_SID, query = "from VirtualAccountHasMobile v where v.vaccountSid=:vaccountSid")
})
public class VirtualAccountHasMobile implements Serializable{

	private static final String PREFIX = "com.callcomm.eserve.persistence.entity.VirtualAccountHasMobile.";

	public static final String FIND_BY_PROJECT_ID = PREFIX+"findByProjectId";
	
	public static final String FIND_BY_PROJECT_GROUP_ID = PREFIX+"findByProjectGroupId";
	
	public static final String FIND_BY_VIRTUAL_ACCOUNT_SID=PREFIX+"findByVirtualAccountSid";
	
	public static final String FIND_VA_SID_BY_PROJECT_ID = PREFIX+"findVaSidByProjectId";
	
	public static final String FIND_VA_SID_BY_PROJECT_GROUP_ID = PREFIX+"findVaSidByProjectGroupId";
	
	public static final String FIND_BY_VIRTUAL_ACCOUNT_SID_LIST=PREFIX+"findByVirtualAccountSidList";
	
	public static final String FIND_VA_SID_BY_VIRTUAL_ACCOUNT_SID_LIST=PREFIX+"findVaSidByVirtualAccountSidList";
	
	@Id
	@Column(name="virtual_account_sid")
	private String vaccountSid;
	
	@Column(name="appuser_id")
	private Integer appuserId;
	
	@Column(name="project_id")
	private Integer projectId;
	
	@Column(name="mobile_number")
	private String mobileNumber;

	@Column(name="project_group_id")
	private Integer projectGroupId;
	
	private static final long serialVersionUID = 1L;

	public VirtualAccountHasMobile() {
		super();
	}   

	public String getVaccountSid() {
		return this.vaccountSid;
	}

	public void setVaccountSid(String sid) {
		this.vaccountSid = sid;
	}   

	public Integer getAppuserId() {
		return this.appuserId;
	}

	public void setAppuserId(Integer appuserId) {
		this.appuserId = appuserId;
	}   
	
	public Integer getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}   
	
	public String getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Integer getProjectGroupId() {
		return projectGroupId;
	}

	public void setProjectGroupId(Integer projectGroupId) {
		this.projectGroupId = projectGroupId;
	}
   
}
