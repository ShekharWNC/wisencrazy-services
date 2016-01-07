package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "phone_number_association")
@NamedQueries({
		@NamedQuery(name = PhoneNumberAssociation.FIND_BY_PHONE_NUMBER, query = "select pna from PhoneNumberAssociation pna where pna.registeredPhoneNo.phoneNo = :phone and hex(pna.registeredPhoneNo.project.sid) = :sid"),
		@NamedQuery(name = PhoneNumberAssociation.FIND_BY_PHONE, query = "select pna from PhoneNumberAssociation pna where pna.registeredPhoneNo.phoneNo = :phone")
})
public class PhoneNumberAssociation extends AbsBaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8247542710191177496L;

	private static final String PREFIX = "com.callcomm.eserve.persistence.entity.PhoneNumberAssociation.";
	public static final String FIND_BY_PHONE_NUMBER = PREFIX + "findByPhoneNumber";
	public static final String FIND_BY_PHONE = PREFIX + "findByPhone";

	public enum ActionType {
		IVR, QUEUE, EXTERNALNUMBER
	}
	
	@Enumerated(EnumType.STRING)
	@Column(name = "action_type")
	private ActionType actionType;
	
	@ManyToOne
	@JoinColumn(name = "registered_phone_no_id", referencedColumnName = "id")
	private RegisteredPhoneNo registeredPhoneNo;
	
	@ManyToOne
	@JoinColumn(name = "ivr_menu_id", referencedColumnName = "id")
	private IvrMenu ivrMenu;
	
	@ManyToOne
	@JoinColumn(name = "routing_queue_id", referencedColumnName = "id")
	private RoutingQueue routingQueue;
	
	@ManyToOne
	@JoinColumn(name = "external_phone_number_id", referencedColumnName = "id")
	private ExternalPhoneNumber externalPhoneNumber;

	public PhoneNumberAssociation() {
		// TODO Auto-generated constructor stub
	}
	
	public ActionType getActionType() {
		return actionType;
	}

	public void setActionType(ActionType actionType) {
		this.actionType = actionType;
	}

	public RegisteredPhoneNo getRegisteredPhoneNo() {
		return registeredPhoneNo;
	}

	public void setRegisteredPhoneNo(RegisteredPhoneNo registeredPhoneNo) {
		this.registeredPhoneNo = registeredPhoneNo;
	}

	public IvrMenu getIvrMenu() {
		return ivrMenu;
	}

	public void setIvrMenu(IvrMenu ivrMenu) {
		this.ivrMenu = ivrMenu;
	}

	public RoutingQueue getRoutingQueue() {
		return routingQueue;
	}

	public void setRoutingQueue(RoutingQueue routingQueue) {
		this.routingQueue = routingQueue;
	}

	public ExternalPhoneNumber getExternalPhoneNumber() {
		return externalPhoneNumber;
	}

	public void setExternalPhoneNumber(ExternalPhoneNumber externalPhoneNumber) {
		this.externalPhoneNumber = externalPhoneNumber;
	}
}
