package com.dto;

import java.io.Serializable;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class ProjectHasTemplateDTO implements Serializable {
     /**
	 * 
	 */
	private static final long serialVersionUID = -4267030855896904247L;
	 private ProjectCommonDTO project;

	 public ProjectCommonDTO getProject() {
		return project;
	}
	public void setProject(ProjectCommonDTO project) {
		this.project = project;
	}
     
}
