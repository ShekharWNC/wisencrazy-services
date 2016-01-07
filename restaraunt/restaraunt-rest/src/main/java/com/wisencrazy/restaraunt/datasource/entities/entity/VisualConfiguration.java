package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.wisencrazy.restaraunt.datasource.entities.converter.ByteArrayStringConverter;
import com.wisencrazy.restaraunt.datasource.entities.entity.AbsBaseEntity;
import com.wisencrazy.restaraunt.datasource.entities.entity.Project;

/**
 * The persistent class for the visual_configuration database table.
 * 
 * @author Krish Lakshmanan
 */
@Entity
@Table(name = "visual_configuration")
@NamedQueries({
@NamedQuery(name = VisualConfiguration.FIND_BY_SID, query = "SELECT vc FROM VisualConfiguration vc WHERE hex(vc.sid) = :visualConfigureSid"),
 @NamedQuery(name = VisualConfiguration.FIND_BY_TYPE, query = "SELECT vc FROM VisualConfiguration vc WHERE hex(vc.project.sid) = :projectSid and vc.configurationType = :configurationType"),
 @NamedQuery(name = VisualConfiguration.FIND_BY_CONFIGURATIONTYPE, query = "SELECT vc FROM VisualConfiguration vc WHERE vc.parentVisualConfigurationId = :parentVisualConfigurationId and vc.configurationType = :configurationType"),
 @NamedQuery(name = VisualConfiguration.FIND_BY_SCREENDATA, query = "SELECT vc.screenData FROM VisualConfiguration vc WHERE vc.parentVisualConfigurationId = :parentVisualConfigurationId and vc.configurationType = :configurationType")
})

public class VisualConfiguration extends AbsBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -215294343298309028L;

	public static final String Class = "VisualConfiguration";
	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.VisualConfiguration.";
	public static final String FIND_BY_SID = PREFIX + "findBySid";
	public static final String FIND_BY_TYPE = PREFIX + "findByType";
	public static final String FIND_BY_CONFIGURATIONTYPE = PREFIX + "findByConfigurationType";
	public static final String FIND_BY_SCREENDATA = PREFIX + "findByScreenData";

	public enum ConfigurationType {
		VISUALEDITOR, VISUALIVR, WEBFORM, SCREEN
	}

	@Column(name = "name")
	@NotNull
	private String name;

	@Column(name = "default_configuration")
	private boolean defaultConfiguration;

	@Column(name = "configuration_type")
	@Enumerated(EnumType.STRING)
	private ConfigurationType configurationType;

	@Column(name = "theme")
	private String theme;

	@Column(name = "web_form_type")
	private String webFormType;

	@Column(name = "configuration")
	@Convert(converter = ByteArrayStringConverter.class)
	private String configuration;

	@JoinColumn(name = "project_id", referencedColumnName = "id")
	@ManyToOne
	private Project project;

	@Column(name = "parent_visual_configuration_id")
	private Integer parentVisualConfigurationId;
	
	@Column(name = "screen_data")
	@Convert(converter = ByteArrayStringConverter.class)
	private String screenData;

	public VisualConfiguration() {

	}

	public String getName() {
		return name;
	}

	public boolean getDefaultConfiguration() {
		return defaultConfiguration;
	}

	public ConfigurationType getConfigurationType() {
		return configurationType;
	}

	public String getTheme() {
		return theme;
	}

	public String getWebFormType() {
		return webFormType;
	}

	public String getConfiguration() {
		return configuration;
	}

	public Project getProject() {
		return project;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDefaultConfiguration(boolean defaultConfiguration) {
		this.defaultConfiguration = defaultConfiguration;
	}

	public void setConfigurationType(ConfigurationType configurationType) {
		this.configurationType = configurationType;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public void setWebFormType(String webFormType) {
		this.webFormType = webFormType;
	}

	public void setConfiguration(String configuration) {
		this.configuration = configuration;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Integer getParentVisualConfigurationId() {
		return parentVisualConfigurationId;
	}

	public void setParentVisualConfigurationId(Integer parentVisualConfigurationId) {
		this.parentVisualConfigurationId = parentVisualConfigurationId;
	}
	
	public String getScreenData() {
		return screenData;
	}

	public void setScreenData(String screenData) {
		this.screenData = screenData;
	}

}