package com.dto;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class RoutingRulesGroupDTO extends AbsCommonDTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5039323502453561136L;

	private String name;

	private List<RoutingRuleDTO> routingRules;
    
	private ProjectDTO project;

    public RoutingRulesGroupDTO() {
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<RoutingRuleDTO> getRoutingRules() {
		return routingRules;
	}

	public ProjectDTO getProject() {
		return project;
	}

	public void setRoutingRules(List<RoutingRuleDTO> routingRules) {
		this.routingRules = routingRules;
	}

	public void setProject(ProjectDTO project) {
		this.project = project;
	}

}
