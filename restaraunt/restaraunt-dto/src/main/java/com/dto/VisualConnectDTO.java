package com.dto;

import java.util.List;

/**
 * The dto class for the VisualConnect entity.
 * 
 * @author Krish Lakshmanan
 * @version 2.0
 * 
 */
public class VisualConnectDTO extends AbsCommonDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3386831651617269860L;

	public enum OperationMode {
		VisualConnect, ChatOnly, CallOnly, ActivityCapture, WebForm
	}

	public enum UserInterfaceMode {
		Popup, Fixed, NewWindow
	}

	private String name;

	private boolean status;

	private boolean defaultVC;

	private OperationMode operationMode;

	private UserInterfaceMode userInterfaceMode;

	private int popUpTimer;

	private boolean locationInfo;

	private boolean personalContent;

	private String theme;

	private String projectSid;

	private String companySid;

	private WebsiteDTO website;

	private List<VisualConnectHasGroupDTO> visualConnectHasGroups;

	private String displayRules;

	private String companyName;


	public VisualConnectDTO() {
	}

	public String getName() {
		return name;
	}

	public boolean isStatus() {
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

	public boolean isLocationInfo() {
		return locationInfo;
	}

	public boolean isPersonalContent() {
		return personalContent;
	}

	public String getTheme() {
		return theme;
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

	public String getProjectSid() {
		return projectSid;
	}

	public void setProjectSid(String projectSid) {
		this.projectSid = projectSid;
	}

	public String getCompanySid() {
		return companySid;
	}

	public void setCompanySid(String companySid) {
		this.companySid = companySid;
	}

	public WebsiteDTO getWebsite() {
		return website;
	}

	public void setWebsite(WebsiteDTO website) {
		this.website = website;
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

	public List<VisualConnectHasGroupDTO> getVisualConnectHasGroups() {
		return visualConnectHasGroups;
	}

	public void setVisualConnectHasGroups(
			List<VisualConnectHasGroupDTO> visualConnectHasGroups) {
		this.visualConnectHasGroups = visualConnectHasGroups;
	}
	
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}