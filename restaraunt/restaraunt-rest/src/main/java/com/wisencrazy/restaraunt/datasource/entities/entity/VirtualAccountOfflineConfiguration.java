package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.wisencrazy.restaraunt.datasource.entities.entity.VirtualAccountOfflineConfigurationPK;

@Entity
@Table(name="project_virtual_account_offline_settings")
@NamedQueries({
    @NamedQuery(name = VirtualAccountOfflineConfiguration.FIND_BY_V_ACCOUNT_ID, query = "SELECT v FROM VirtualAccountOfflineConfiguration v WHERE v.virtualAccountOfflineConfigurationPK.virtualAccountId = :id"),
    @NamedQuery(name = VirtualAccountOfflineConfiguration.FIND_BY_ID_s, query = "SELECT v FROM VirtualAccountOfflineConfiguration v WHERE v.virtualAccountOfflineConfigurationPK.virtualAccountId = :vaid and v.virtualAccountOfflineConfigurationPK.projectId = :pid")    
})
public class VirtualAccountOfflineConfiguration extends AbsCompositeEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1139906069282042839L;
	
    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.VirtualAccountOfflineConfiguration.";
    public static final String FIND_BY_V_ACCOUNT_ID = PREFIX + "findByVirtualAccountId";
    public static final String FIND_BY_ID_s = PREFIX + "findByVirtualAccountProjectId";

	@EmbeddedId
	private VirtualAccountOfflineConfigurationPK virtualAccountOfflineConfigurationPK;   

	@Column(name="offline_available")
    private boolean offlineAvailable;
	
	@Column(name="call_mobile_status")
    private boolean callOnMobile;
	
	@Column(name="chat_mobile_status")
    private boolean chatOnMobile;
	
	@Column(name="call_extension_status")
    private boolean callOnExt;
	
	@Column(name="chat_extension_status")
    private boolean chatOnExt;
	
	@JoinColumn(name = "project_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Project project;
	
    @JoinColumn(name = "virtual_account_id", referencedColumnName = "id", insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private VirtualAccount virtualAccount;

	public boolean isOfflineAvailable() {
		return offlineAvailable;
	}
	
	public void setOfflineAvailable(boolean offlineAvailable) {
		this.offlineAvailable = offlineAvailable;
	}
	
	public boolean isCallOnExt() {
		return callOnExt;
	}
	public void setCallOnExt(boolean callOnExt) {
		this.callOnExt = callOnExt;
	}
	public VirtualAccountOfflineConfigurationPK getVirtualAccountOfflineConfigurationPK() {
		return virtualAccountOfflineConfigurationPK;
	}
	public void setVirtualAccountOfflineConfigurationPK(
			VirtualAccountOfflineConfigurationPK virtualAccountOfflineConfigurationPK) {
		this.virtualAccountOfflineConfigurationPK = virtualAccountOfflineConfigurationPK;
	}
	public boolean isChatOnExt() {
		return chatOnExt;
	}
	public void setChatOnExt(boolean chatOnExt) {
		this.chatOnExt = chatOnExt;
	}
	public boolean isCallOnMobile() {
		return callOnMobile;
	}
	public boolean isChatOnMobile() {
		return chatOnMobile;
	}
	public void setChatOnMobile(boolean chatOnMobile) {
		this.chatOnMobile = chatOnMobile;
	}
	public void setCallOnMobile(boolean callOnMobile) {
		this.callOnMobile = callOnMobile;
	}
}
