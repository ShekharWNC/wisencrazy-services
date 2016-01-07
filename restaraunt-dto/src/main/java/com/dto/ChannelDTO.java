package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the channel database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ChannelDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String channelName;

	//bi-directional many-to-one association to ProjectHasChannel
	private List<ProjectHasChannelDTO> projectHasChannels;

	public ChannelDTO() {
	}

	public ChannelDTO(String channelName,
			List<ProjectHasChannelDTO> projectHasChannels) {
		super();
		this.channelName = channelName;
		this.projectHasChannels = projectHasChannels;
	}
	public String getChannelName() {
		return this.channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public List<ProjectHasChannelDTO> getProjectHasChannels() {
		return this.projectHasChannels;
	}

	public void setProjectHasChannels(List<ProjectHasChannelDTO> projectHasChannels) {
		this.projectHasChannels = projectHasChannels;
	}

	public ProjectHasChannelDTO addProjectHasChannel(ProjectHasChannelDTO projectHasChannel) {
		getProjectHasChannels().add(projectHasChannel);
		projectHasChannel.setChannel(this);

		return projectHasChannel;
	}

	public ProjectHasChannelDTO removeProjectHasChannel(ProjectHasChannelDTO projectHasChannel) {
		getProjectHasChannels().remove(projectHasChannel);
		projectHasChannel.setChannel(null);

		return projectHasChannel;
	}

	@Override
	public String toString() {
		return "ChannelDTO [channelName=" + channelName
				+ ", projectHasChannels=" + projectHasChannels + "]";
	}

}