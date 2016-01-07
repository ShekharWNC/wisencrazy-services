package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="usage_trigger")
@NamedQueries({
@NamedQuery(name=UsageTrigger.FIND_BY_TRIGGER_SID,query="from UsageTrigger u where u.triggerSid=:twilioTriggerSid"),
@NamedQuery(name=UsageTrigger.FIND_BY_ACCOUNT_SID,query="select u from UsageTrigger u join u.twilioAccount ta where hex(ta.sid)=:twilioAccountSid")
})
public class UsageTrigger extends AbsBaseEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5725596268098473254L;

	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.UsageTrigger.";
	public static final String FIND_BY_TRIGGER_SID= PREFIX+"findByTriggerSid";
	public static final String FIND_BY_ACCOUNT_SID = PREFIX+"findByAccountSid";
	
	@Column(name="name")
	private String name;
	
	@Column(name="trigger_sid")
	private String triggerSid;
	
	@Column(name="usage_category")
	private String usageCategory;
	
	@Column(name="trigger_by")
	private String triggerBy;
	
	@Column(name="trigger_value")
	private String triggerValue;

	@ManyToOne(optional=false)
	@JoinColumn(name="twilio_account_id",referencedColumnName="id")
	private TwilioAccount twilioAccount;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="trigger_notification_id",referencedColumnName="id")
	private TriggerNotification triggerNotification;
	
	@Column(name="idempotency_token")
	private String idempotencyToken;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTriggerSid() {
		return triggerSid;
	}

	public void setTriggerSid(String triggerSid) {
		this.triggerSid = triggerSid;
	}

	public String getUsageCategory() {
		return usageCategory;
	}

	public void setUsageCategory(String usageCategory) {
		this.usageCategory = usageCategory;
	}

	public String getTriggerBy() {
		return triggerBy;
	}

	public void setTriggerBy(String triggerBy) {
		this.triggerBy = triggerBy;
	}

	public String getTriggerValue() {
		return triggerValue;
	}

	public void setTriggerValue(String triggerValue) {
		this.triggerValue = triggerValue;
	}

	public TwilioAccount getTwilioAccount() {
		return twilioAccount;
	}

	public void setTwilioAccount(TwilioAccount twilioAccount) {
		this.twilioAccount = twilioAccount;
	}

	public TriggerNotification getTriggerNotification() {
		return triggerNotification;
	}

	public void setTriggerNotification(TriggerNotification triggerNotification) {
		this.triggerNotification = triggerNotification;
	}

	public String getIdempotencyToken() {
		return idempotencyToken;
	}

	public void setIdempotencyToken(String idempotencyToken) {
		this.idempotencyToken = idempotencyToken;
	}
	 
}
