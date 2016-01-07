package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;

import javax.persistence.*;

import com.dto.constants.EnumConstants.FeatureStatus;
import com.dto.constants.EnumConstants.SettingFor;

import java.sql.Timestamp;


/**
 * The persistent class for the customer_has_features database table.
 * 
 */
@Entity
@Table(name="customer_has_features")
@NamedQueries({
	@NamedQuery(name = CustomerHasFeature.FIND_CUSTOMER_FEATURE, query = "SELECT c FROM CustomerHasFeature c where c.id.featureId = :featureId and c.id.customerId = :customerId"),
	@NamedQuery(name=CustomerHasFeature.UPDATE_PA_STATUS,query="UPDATE CustomerHasFeature AS a SET a.status = :status WHERE a.id.featureId "
			+ "IN (SELECT b.id FROM ViachatHasFeature AS b WHERE b.featureName='GETPA') AND a.id.customerId = :customerId")
})
public class CustomerHasFeature implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 7377567614425067562L;


	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.CustomerHasFeature.";
	
	public static final String FIND_CUSTOMER_FEATURE = PREFIX + "findCustomerFeature";
	
	public static final String UPDATE_PA_STATUS =  PREFIX + "updatePAStatus";

	@EmbeddedId
	private CustomerHasFeaturePK id;

	@Column(name="device_info")
	private String deviceInfo;

	@Column(name="entry_date")
	private Timestamp entryDate;

	@Column(name="is_request_from_device")
	@Enumerated(EnumType.STRING)
	private SettingFor isRequestFromDevice;

	@Column(name="is_system_subscribed")
	private Boolean isSystemSubscribed;

	private String remarks;

	@Enumerated(EnumType.STRING)
	private FeatureStatus status;

	//bi-directional many-to-one association to ViachatHasFeature
	@ManyToOne
	@JoinColumn(name="feature_id", referencedColumnName = "id", insertable = false, updatable = false)
	private ViachatHasFeature viachatHasFeature;

	public CustomerHasFeature() {
	}

	public CustomerHasFeaturePK getId() {
		return this.id;
	}

	public void setId(CustomerHasFeaturePK id) {
		this.id = id;
	}

	public String getDeviceInfo() {
		return this.deviceInfo;
	}

	public void setDeviceInfo(String deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

	public Timestamp getEntryDate() {
		return this.entryDate;
	}

	public void setEntryDate(Timestamp entryDate) {
		this.entryDate = entryDate;
	}

	public SettingFor getIsRequestFromDevice() {
		return this.isRequestFromDevice;
	}

	public void setIsRequestFromDevice(SettingFor isRequestFromDevice) {
		this.isRequestFromDevice = isRequestFromDevice;
	}

	public Boolean getIsSystemSubscribed() {
		return this.isSystemSubscribed;
	}

	public void setIsSystemSubscribed(Boolean isSystemSubscribed) {
		this.isSystemSubscribed = isSystemSubscribed;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public FeatureStatus getStatus() {
		return this.status;
	}

	public void setStatus(FeatureStatus status) {
		this.status = status;
	}

	public ViachatHasFeature getViachatHasFeature() {
		return this.viachatHasFeature;
	}

	public void setViachatHasFeature(ViachatHasFeature viachatHasFeature) {
		this.viachatHasFeature = viachatHasFeature;
	}

}