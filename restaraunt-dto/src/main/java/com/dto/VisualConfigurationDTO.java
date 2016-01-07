package com.dto;


/**
 * The dto class for the VisualConfiguration entity.
 * 
 * @author Krish Lakshmanan
 * @version 2.0
 * 
 */
public class VisualConfigurationDTO extends AbsCommonDTO{
			
	/**
	 * 
`	 */
	private static final long serialVersionUID = 516386252696577723L;
	private String name,projectSid,theme,configuration,webFormType,screenData;
	private boolean defaultConfiguration;
	private ConfigurationType configurationType;
	public enum ConfigurationType{
		VISUALEDITOR,
		VISUALIVR,
		WEBFORM,
		SCREEN
	}
			
	public String getConfiguration() {
		return configuration;
	}
	public void setConfiguration(String configuration) {
		this.configuration = configuration;
	}
	
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getProjectSid() {
		return projectSid;
	}
	public void setProjectSid(String projectSid) {
		this.projectSid = projectSid;
	}
	
	public ConfigurationType getConfigurationType() {
		return configurationType;
	}
	public void setConfigurationType(ConfigurationType configurationType) {
		this.configurationType = configurationType;
	}
	
	public String getWebFormType() {
		return webFormType;
	}
	public void setWebFormType(String webFormType) {
		this.webFormType = webFormType;
	}

	public boolean isDefaultConfiguration() {
		return defaultConfiguration;
	}

	public void setDefaultConfiguration(boolean defaultConfiguration) {
		this.defaultConfiguration = defaultConfiguration;
	}
	public String getScreenData() {
		return screenData;
	}
	public void setScreenData(String screenData) {
		this.screenData = screenData;
	}
				
}
