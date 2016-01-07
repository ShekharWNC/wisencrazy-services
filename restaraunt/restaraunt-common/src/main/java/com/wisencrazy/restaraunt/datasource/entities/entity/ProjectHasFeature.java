package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.dto.constants.EnumConstants.FeatureStatus;
import com.dto.constants.EnumConstants.SettingFor;


/**
 * The persistent class for the project_has_features database table.
 * 
 */
@Entity
@Table(name="project_has_features")
@NamedQueries({
	@NamedQuery(name = ProjectHasFeature.FIND_PROJECT_FEATURE, query = "SELECT p FROM ProjectHasFeature p where p.id.featureId = :featureId"
			+ " and p.id.projectId = :projectId")
})
public class ProjectHasFeature implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2095415052587543315L;

	public final static String PREFIX = "com.callcomm.eserve.persistence.entity.ProjectHasFeature.";

	public static final String FIND_PROJECT_FEATURE = PREFIX + "findProjectFeature";

	@EmbeddedId
	private ProjectHasFeaturePK id;

	@ManyToOne
	@JoinColumn(name="agent_id", referencedColumnName = "id")
	private Appuser agent;

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
	@JoinColumn(name="feature_id", referencedColumnName = "id", updatable = false, insertable = false)
	private ViachatHasFeature viachatHasFeature;

	public ProjectHasFeature() {
	}

	public ProjectHasFeaturePK getId() {
		return this.id;
	}

	public void setId(ProjectHasFeaturePK id) {
		this.id = id;
	}

	public Appuser getAgent() {
		return agent;
	}

	public void setAgent(Appuser agent) {
		this.agent = agent;
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