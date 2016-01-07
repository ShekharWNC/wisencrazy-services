package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * UserTO: Vikash Kumar Pandey
 */
@Entity
@Table(name="channel")
@NamedQueries({ @NamedQuery(name = Channel.FIND_ROUTING_RULE_CHANNELS, query = "SELECT c FROM Channel c WHERE c.channelName not in ('IN','Case')") })
public class Channel extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.Channel.";
	public static final String FIND_ROUTING_RULE_CHANNELS = PREFIX + "findRoutingRuleChannels";

	@Column(name="channel_name")
	private String channelName;

	//bi-directional many-to-one association to ProjectHasChannel
	@OneToMany(mappedBy="channel")
	private List<ProjectHasChannel> projectHasChannels;
	
	/*@JoinTable(name = "template_support_channels", joinColumns = {
            @JoinColumn(name = "channel_id", referencedColumnName = "id")}, inverseJoinColumns = {
            @JoinColumn(name = "template_id", referencedColumnName = "id")})
    @ManyToMany
    private List<Template> template;*/


	public Channel() {
	}

	/*public List<Template> getTemplate() {
		return template;
	}

	public void setTemplate(List<Template> template) {
		this.template = template;
	}*/

	public String getChannelName() {
		return this.channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public List<ProjectHasChannel> getProjectHasChannels() {
		return this.projectHasChannels;
	}

	public void setProjectHasChannels(List<ProjectHasChannel> projectHasChannels) {
		this.projectHasChannels = projectHasChannels;
	}

	public ProjectHasChannel addProjectHasChannel(ProjectHasChannel projectHasChannel) {
		getProjectHasChannels().add(projectHasChannel);
		projectHasChannel.setChannel(this);

		return projectHasChannel;
	}

	public ProjectHasChannel removeProjectHasChannel(ProjectHasChannel projectHasChannel) {
		getProjectHasChannels().remove(projectHasChannel);
		projectHasChannel.setChannel(null);

		return projectHasChannel;
	}

}