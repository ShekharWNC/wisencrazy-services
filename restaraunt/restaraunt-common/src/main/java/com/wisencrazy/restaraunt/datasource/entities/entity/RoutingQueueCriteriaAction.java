package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * The persistent class for the rq_criteria_action database table.
 * 
 */
@Entity
@Table(name="rq_criteria_action")
public class RoutingQueueCriteriaAction extends AbsBaseEntity {
	
	private static final long serialVersionUID = -8639452616221034602L;

	@Column(name="common_value")
	private String commonValue;

	@ManyToOne
	@JoinColumn(name="project_group_id")
	private ProjectGroup projectGroup;
	
	@ManyToOne
	@JoinColumn(name="routing_queue_id",nullable=false)
	private RoutingQueue routingQueue;
	
	@ManyToOne
	@JoinColumn(name="re_route_queue_id")
	private RoutingQueue reRoutingQueue;

	//bi-directional many-to-one association to RqCriteria
	@ManyToOne
	@JoinColumn(name="rq_criteria_id")
	private RoutingQueueCriteria routingQueueCriteria;

	//bi-directional many-to-one association to RqAction
	@ManyToOne
	@JoinColumn(name="rq_action_id")
	private RoutingQueueAction routingQueueAction;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="rq_criteria_action_has_skill_id")
	private RoutingQueueCriteriaActionHasSkill routingQueueCriteriaActionHasSkill;
	
	@ManyToOne
	@JoinColumn(name="audioclip_library_id")
	private AttachmentLibrary audioClipLibrary;
	
	public RoutingQueueCriteriaAction() {
	}

	public RoutingQueue getRoutingQueue() {
		return routingQueue;
	}

	public void setRoutingQueue(RoutingQueue routingQueue) {
		this.routingQueue = routingQueue;
	}

	public String getCommonValue() {
		return this.commonValue;
	}

	public void setCommonValue(String commonValue) {
		this.commonValue = commonValue;
	}

	public RoutingQueueCriteria getRoutingQueueCriteria() {
		return routingQueueCriteria;
	}

	public void setRoutingQueueCriteria(RoutingQueueCriteria routingQueueCriteria) {
		this.routingQueueCriteria = routingQueueCriteria;
	}

	public RoutingQueueAction getRoutingQueueAction() {
		return routingQueueAction;
	}

	public void setRoutingQueueAction(RoutingQueueAction routingQueueAction) {
		this.routingQueueAction = routingQueueAction;
	}

	public ProjectGroup getProjectGroup() {
		return projectGroup;
	}

	public void setProjectGroup(ProjectGroup projectGroup) {
		this.projectGroup = projectGroup;
	}

	public RoutingQueue getReRoutingQueue() {
		return reRoutingQueue;
	}

	public void setReRoutingQueue(RoutingQueue reRoutingQueue) {
		this.reRoutingQueue = reRoutingQueue;
	}

	public RoutingQueueCriteriaActionHasSkill getRoutingQueueCriteriaActionHasSkill() {
		return routingQueueCriteriaActionHasSkill;
	}

	public void setRoutingQueueCriteriaActionHasSkill(
			RoutingQueueCriteriaActionHasSkill routingQueueCriteriaActionHasSkill) {
		this.routingQueueCriteriaActionHasSkill = routingQueueCriteriaActionHasSkill;
	}

	public AttachmentLibrary getAudioClipLibrary() {
		return audioClipLibrary;
	}

	public void setAudioClipLibrary(AttachmentLibrary audioClipLibrary) {
		this.audioClipLibrary = audioClipLibrary;
	}
}