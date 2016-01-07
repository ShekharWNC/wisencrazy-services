package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.*;

import com.wisencrazy.restaraunt.datasource.entities.converter.ByteArrayStringConverter;
import com.wisencrazy.restaraunt.datasource.entities.entity.AbsBaseEntity;
import com.wisencrazy.restaraunt.datasource.entities.entity.Project;

import java.util.List;


/**
 * The persistent class for the visual_connect database table.
 * 
 * @author Krish Lakshmanan
 */
@Entity
@Table(name="visual_connect")
@NamedQueries({
		@NamedQuery(name = VisualConnect.FIND_BY_SID, query = "SELECT vc FROM VisualConnect vc WHERE hex(vc.sid) = :visualConnectSid"),
		@NamedQuery(name = VisualConnect.FIND_STATUS_BY_SID, query = "SELECT vc.status FROM VisualConnect vc WHERE hex(vc.sid) = :visualConnectSid"),
		@NamedQuery(name = VisualConnect.FIND_DEFAULT_SID, query = "SELECT hex(vc.sid) FROM VisualConnect vc WHERE hex(vc.project.sid) = :projectSid and vc.defaultVC=true"),
		@NamedQuery(name = VisualConnect.FIND_BY_VCSID_AND_GROUPSID, query = "SELECT vc FROM VisualConnect vc join vc.visualConnectHasGroups vcg where hex(vc.sid) = :sid and hex(vcg.sid) = :groupSid"),
		@NamedQuery(name = VisualConnect.FIND_BY_CUSTGROUPSID, query = "SELECT hex(vc.sid) FROM VisualConnect vc join vc.visualConnectHasGroups vcg where hex(vcg.sid) = :sid")
})
public class VisualConnect extends AbsBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -215294343298309028L;

	public static final String Class = "VisualConnect";
	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.VisualConnect.";
	public static final String FIND_BY_SID = PREFIX + "findBySid";
	public static final String FIND_STATUS_BY_SID = PREFIX + "findStatusBySid";
	public static final String FIND_DEFAULT_SID = PREFIX + "findDefaultSid";

	public static final String FIND_BY_VCSID_AND_GROUPSID = PREFIX + "findVCAndCustGroupBySid";
	public static final String FIND_BY_CUSTGROUPSID = PREFIX + "findCustGroupBySid";

	public enum OperationMode {
		VisualConnect, ChatOnly, CallOnly, ActivityCapture, WebForm
	}

	public enum UserInterfaceMode {
		Popup, Fixed, NewWindow
	}

	@Column(name = "name")
	private String name;

	@Column(name = "status")
	private boolean status;

	@Column(name = "default_vc")
	private boolean defaultVC;

	@Column(name="operation_mode")
	@Enumerated(EnumType.STRING)
	private OperationMode operationMode;

	@Column(name = "user_interface_mode")
	@Enumerated(EnumType.STRING)
	private UserInterfaceMode userInterfaceMode;

	@Column(name = "pop_up_timer")
	private int popUpTimer;

	@Column(name = "location_info")
	private boolean locationInfo;

	@Column(name="personal_content")
	private boolean personalContent;	

	@Column(name = "theme")
	private String theme;

	@Column(name = "auth_key")
	private String authKey;

	@Column(name = "display_rules")
	@Convert(converter = ByteArrayStringConverter.class)
	private String displayRules;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "visualConnect")
	private List<VisualConnectHasGroup> visualConnectHasGroups;
	
	@JoinColumn(name = "project_id", referencedColumnName = "id")
	@ManyToOne
	private Project project;

	public VisualConnect() {
	}

	public String getName() {
		return name;
	}

	public boolean getStatus() {
		return status;
	}

	public OperationMode getOperationMode() {
		return operationMode;
	}

	public UserInterfaceMode getUserInterfaceMode() {
		return userInterfaceMode;
	}

	public int getPopUpTimer() {
		return popUpTimer;
	}

	public boolean getLocationInfo() {
		return locationInfo;
	}

	public boolean getPersonalContent() {
		return personalContent;
	}

	public String getTheme() {
		return theme;
	}

	public Project getProject() {
		return project;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void setOperationMode(OperationMode operationMode) {
		this.operationMode = operationMode;
	}

	public void setUserInterfaceMode(UserInterfaceMode userInterfaceMode) {
		this.userInterfaceMode = userInterfaceMode;
	}

	public void setPopUpTimer(int popUpTimer) {
		this.popUpTimer = popUpTimer;
	}

	public void setLocationInfo(boolean locationInfo) {
		this.locationInfo = locationInfo;
	}

	public void setPersonalContent(boolean personalContent) {
		this.personalContent = personalContent;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getAuthKey() {
		return authKey;
	}

	public void setAuthKey(String authKey) {
		this.authKey = authKey;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public String getDisplayRules() {
		return displayRules;
	}

	public void setDisplayRules(String displayRules) {
		this.displayRules = displayRules;
	}

	public boolean getDefaultVC() {
		return defaultVC;
	}

	public void setDefaultVC(boolean defaultVC) {
		this.defaultVC = defaultVC;
	}

	public List<VisualConnectHasGroup> getVisualConnectHasGroups() {
		return visualConnectHasGroups;
	}

	public void setVisualConnectHasGroups(
			List<VisualConnectHasGroup> visualConnectHasGroups) {
		this.visualConnectHasGroups = visualConnectHasGroups;
	}

}