package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.wisencrazy.restaraunt.datasource.entities.entity.AbsBaseEntity;

import java.util.List;


/**
 * The persistent class for the rq_action database table.
 * 
 */
@Entity
@Table(name="rq_action")
public class RoutingQueueAction extends AbsBaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8600699150878753201L;
	
	public static final int GROUP_IS=1;
	public static final int SKILL_IS=2;		
	public static final int STATISTICS=3;		
	public static final int FIRST_AVAILABLE=4;		
	public static final int SKILL_RATING=5;		
	public static final int PROMPT=6;		
	public static final int PROMPT_WAIT=7;		
	public static final int PROMPT_END_SESSION=8;		
	public static final int RE_ROUTE=9;		
	public static final int LEAVE_MESSAGE=10;		
	public static final int SKILL_RATING_IS=11;		

	@Column(name="action_name")
	private String actionName;

	@Column(name="action_description")
	private String actionDescription;


	public RoutingQueueAction() {
	}

	public String getActionName() {
		return this.actionName;
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	public String getActionDescription() {
		return actionDescription;
	}

	public void setActionDescription(String actionDescription) {
		this.actionDescription = actionDescription;
	}



}