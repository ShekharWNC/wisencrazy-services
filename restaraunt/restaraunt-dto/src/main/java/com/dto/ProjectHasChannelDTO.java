package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the project_has_channel database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ProjectHasChannelDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to Channel
	private ChannelDTO channel;

	//bi-directional many-to-one association to Project
	private ProjectDTO project;

	public ProjectHasChannelDTO() {
	}

	public ProjectHasChannelDTO(ChannelDTO channel, ProjectDTO project) {
		super();
		this.channel = channel;
		this.project = project;
	}
	public ChannelDTO getChannel() {
		return this.channel;
	}

	public void setChannel(ChannelDTO channel) {
		this.channel = channel;
	}

	public ProjectDTO getProject() {
		return this.project;
	}

	public void setProject(ProjectDTO project) {
		this.project = project;
	}

}