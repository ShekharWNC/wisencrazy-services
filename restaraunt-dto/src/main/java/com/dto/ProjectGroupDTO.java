package com.dto;
import java.util.List;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class ProjectGroupDTO extends AbsCommonDTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private ProjectDTO project;
	private String description;
	private boolean isDefault;
	private List<ProjectGroupHasEmailDTO> projectGroupHasEmail;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isDefault() {
		return isDefault;
	}
	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ProjectDTO getProject() {
		return project;
	}
	public void setProject(ProjectDTO project) {
		this.project = project;
	}
	public List<ProjectGroupHasEmailDTO> getProjectGroupHasEmail() {
		return projectGroupHasEmail;
	}
	public void setProjectGroupHasEmail(
			List<ProjectGroupHasEmailDTO> projectGroupHasEmail) {
		this.projectGroupHasEmail = projectGroupHasEmail;
	}
	
}
