package com.dto;

public class UsageTriggerDTO  extends AbsCommonDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2640953225618985099L;

	
	private String usageCategory;
	private String triggerValue;
	private String callbackUrl;
	private String friendlyName;
	private String recurring;
	private String triggerBy;
	private String callbackMethod;
	private String triggerSid;
	private TriggerNotificationDTO triggerNotification;
	private TwilioAccountDTO twilioAccount;
	private String idempotencyToken;
	
	public String getUsageCategory() {
		return usageCategory;
	}
	public void setUsageCategory(String usageCategory) {
		this.usageCategory = usageCategory;
	}
	public String getTriggerValue() {
		return triggerValue;
	}
	public void setTriggerValue(String triggerValue) {
		this.triggerValue = triggerValue;
	}
	public String getCallbackUrl() {
		return callbackUrl;
	}
	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}
	public String getFriendlyName() {
		return friendlyName;
	}
	public void setFriendlyName(String friendlyName) {
		this.friendlyName = friendlyName;
	}
	public String getRecurring() {
		return recurring;
	}
	public void setRecurring(String recurring) {
		this.recurring = recurring;
	}
	public String getTriggerBy() {
		return triggerBy;
	}
	public void setTriggerBy(String triggerBy) {
		this.triggerBy = triggerBy;
	}
	public String getCallbackMethod() {
		return callbackMethod;
	}
	public void setCallbackMethod(String callbackMethod) {
		this.callbackMethod = callbackMethod;
	}
	public String getTriggerSid() {
		return triggerSid;
	}
	public void setTriggerSid(String triggerSid) {
		this.triggerSid = triggerSid;
	}
	public TriggerNotificationDTO getTriggerNotification() {
		return triggerNotification;
	}
	public void setTriggerNotification(TriggerNotificationDTO triggerNotification) {
		this.triggerNotification = triggerNotification;
	}
	public TwilioAccountDTO getTwilioAccount() {
		return twilioAccount;
	}
	public void setTwilioAccount(TwilioAccountDTO twilioAccount) {
		this.twilioAccount = twilioAccount;
	}
	public String getIdempotencyToken() {
		return idempotencyToken;
	}
	public void setIdempotencyToken(String idempotencyToken) {
		this.idempotencyToken = idempotencyToken;
	}
	
}
