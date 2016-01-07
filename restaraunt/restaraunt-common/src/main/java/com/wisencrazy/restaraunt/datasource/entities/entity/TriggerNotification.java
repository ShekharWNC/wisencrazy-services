package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: TriggerNotification
 *
 */
@Entity
@Table(name="trigger_notification")
public class TriggerNotification extends AbsBaseEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8754243533773645677L;

	public enum TriggerNotificationName{
		email,
		suspended
	}
   @Column(name="name")
   private TriggerNotificationName name;
   
	public TriggerNotificationName getName() {
		return name;
	}
	public void setName(TriggerNotificationName name) {
		this.name = name;
	}
	   
}
