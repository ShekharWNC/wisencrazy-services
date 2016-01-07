/*
 * 
 */
package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.wisencrazy.restaraunt.datasource.entities.entity.AbsBaseEntity;

import java.util.List;


/**
 * The persistent class for the rq_criteria database table.
 * 
 */
@Entity
@Table(name="rq_criteria")
public class RoutingQueueCriteria extends AbsBaseEntity {
	private static final long serialVersionUID = 7646636511742388705L;

	@Column(name="criteria_type")
	private String criteriaType;
	
	@Column(name="criteria_description")
	private String criteriaDescription;

    @JoinTable(name = "rq_criteria_has_action", joinColumns = {
            @JoinColumn(name = "rq_criteria_id", referencedColumnName = "id")}, inverseJoinColumns = {
            @JoinColumn(name = "rq_action_id", referencedColumnName = "id")})
    @ManyToMany
	private List<RoutingQueueAction> routingQueueActions;
    
    public static final int AGENT_SELECTION=1;
    public static final int AGENT_PRECEDENCE=2;
    public static final int IF_BUSY=3;
    public static final int IF_UNAVAILABLE=4;
    public static final int ON_TIMEOUT=5;
    
    
	public RoutingQueueCriteria() {
	}


	public String getCriteriaType() {
		return criteriaType;
	}


	public void setCriteriaType(String criteriaType) {
		this.criteriaType = criteriaType;
	}


	public String getCriteriaDescription() {
		return this.criteriaDescription;
	}

	public void setCriteriaDescription(String criteriaDescription) {
		this.criteriaDescription = criteriaDescription;
	}

	public List<RoutingQueueAction> getRoutingQueueActions() {
		return routingQueueActions;
	}

	public void setRoutingQueueActions(List<RoutingQueueAction> routingQueueActions) {
		this.routingQueueActions = routingQueueActions;
	}


}