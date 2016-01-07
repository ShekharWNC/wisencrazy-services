package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: VWRegisteredPhoneNoHasIvrMenu
 *
 */
@Entity
@Table(name="vw_registered_phone_has_ivr_menu")
public class VWRegisteredPhoneNoHasIvrMenu extends AbsBaseEntity{

	@Column(name="phone_no")
	private String phoneNo;
	@Column(name="project_id")
	private Integer projectId;
	@Column(name="status")
	private String status;
	@Column(name="ivr_menu_sid")
	private byte[] ivrMenuSid;
	@Column(name="ivr_menu_name")
	private String ivrMenuName;
	@Column(name="region")
	private String region;
	
	@Column(name = "enable_vm")
	private boolean enableVm;
	
	@Column(name = "enable_call_record")
	private boolean enableCallRecord;
	
	@Column(name = "enable_outgoing_calls")
	private boolean enableOutgoingCalls;
	
	private static final long serialVersionUID = 1L;

	public VWRegisteredPhoneNoHasIvrMenu() {
	}   
	public String getPhoneNo() {
		return this.phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}   
	public Integer getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}   
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}   
	public byte[] getIvrMenuSid() {
		return this.ivrMenuSid;
	}

	public void setIvrMenuSid(byte[] ivrMenuSid) {
		this.ivrMenuSid = ivrMenuSid;
	}   
	public String getIvrMenuName() {
		return this.ivrMenuName;
	}

	public void setIvrMenuName(String ivrMenuName) {
		this.ivrMenuName = ivrMenuName;
	}
	
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String populateRegisteredPhoneNoSid(){
    	return bytesToHexStringBySid(ivrMenuSid);
    }
	public boolean isEnableVm() {
		return enableVm;
	}
	public void setEnableVm(boolean enableVm) {
		this.enableVm = enableVm;
	}
	public boolean isEnableCallRecord() {
		return enableCallRecord;
	}
	public void setEnableCallRecord(boolean enableCallRecord) {
		this.enableCallRecord = enableCallRecord;
	}
	public boolean isEnableOutgoingCalls() {
		return enableOutgoingCalls;
	}
	public void setEnableOutgoingCalls(boolean enableOutgoingCalls) {
		this.enableOutgoingCalls = enableOutgoingCalls;
	}
}
