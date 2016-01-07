package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.wisencrazy.restaraunt.datasource.entities.entity.AbsBaseEntity;

/**
 * The persistaence class for skill_comparison_operator table
 *
 */
@Entity
@Table(name="routing_queue_supported_channel")
public class RoutingQueueSupportedChannel extends AbsBaseEntity {

	private static final long serialVersionUID = -8284035599399645479L;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="channel_id")
	private Channel channel;
	
	public RoutingQueueSupportedChannel() {
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}
   
}
