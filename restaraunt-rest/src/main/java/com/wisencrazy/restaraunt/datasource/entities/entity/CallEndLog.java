package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;

import com.wisencrazy.restaraunt.datasource.entities.entity.dynamodb.model.DynamoDBCallEndLog.CallEndLogStatus;

// TODO: Auto-generated Javadoc
/**
 * The Class CallEndLog. This will act as an Entity Class that will be returned by the data service API
 */
public class CallEndLog implements Serializable{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The originating gw number. */
	private String accountSid,virtualCallSid,callLegSid,projectSid,projectGroupSid,agentSid,callerNumber,callerCity,callerZipCode,callerCountry,callerName,callerCompany,calledNumber,calledName,calledCompany,originatingGWNumber;
	
	/** The ivr menu digits. */
	private String startTime,endTime,recordingURL,lastTransferNumber,conferenceSid,lastQueueName,lastQueueDuration,ivrMenuName,ivrMenuDigits;
	
	/** The hold duration. */
	private int ivrMenuDuration,duration,transferCount,holdDuration;
	
	/** The price. */
	private double price; 
	
	/**
	 * The Enum CallEndLogType.
	 */
	public enum CallEndLogType{
		
		/** The internal. */
		INTERNAL,
		
		/** The external. */
		EXTERNAL
	}
	
	/**
	 * The Enum CallEndLogDirection.
	 */
	public enum CallEndLogDirection{
		
		/** The incoming. */
		INCOMING,
		
		/** The outgoing. */
		OUTGOING
	}
	
	/**
	 * The Enum CallEndLogRecordingFlag.
	 */
	public enum CallEndLogRecordingFlag{
		
		/** The available. */
		AVAILABLE,
		
		/** The unavailable. */
		UNAVAILABLE
	}
	
	/**
	 * The Enum CallEndLogAnsweredBy.
	 */
	public enum CallEndLogAnsweredBy{
		
		/** The human. */
		HUMAN,
		
		/** The machine. */
		MACHINE
	}
	
	/**
	 * The Enum CallEndLogStatus.
	 */
	public enum CallEndLogStatus{
		
		/** The active. */
		ACTIVE,
		
		/** The archive. */
		ARCHIVE
	}
	
	/**
	 * The Enum CallEndResolutionStatus.
	 */
	public enum CallEndResolutionStatus{
		
		/** The resolved. */
		RESOLVED,
		
		/** The closed. */
		CLOSED,
		
		/** The open. */
		OPEN,

		/** The pending. **/
		PENDING
	}

	/** The status. */
	private CallEndLogStatus status;
	
	/** The type. */
	private CallEndLogType type;
	
	/** The direction. */
	private CallEndLogDirection direction;
	
	/** The recording flag. */
	private CallEndLogRecordingFlag recordingFlag;
	
	/** The answered by. */
	private CallEndLogAnsweredBy answeredBy;
	
	/** The resolution status. */
	private CallEndResolutionStatus resolutionStatus;
	
	/** The wrapup comments. */
	private String wrapupComments;
	/**
	 * Gets the account sid.
	 *
	 * @return the account sid
	 */
	public String getAccountSid() {
		return accountSid;
	}
	
	/**
	 * Sets the account sid.
	 *
	 * @param accountSid the new account sid
	 */
	public void setAccountSid(String accountSid) {
		this.accountSid = accountSid;
	}
	
	/**
	 * Gets the virtual call sid.
	 *
	 * @return the virtual call sid
	 */
	public String getVirtualCallSid() {
		return virtualCallSid;
	}
	
	/**
	 * Sets the virtual call sid.
	 *
	 * @param virtualCallSid the new virtual call sid
	 */
	public void setVirtualCallSid(String virtualCallSid) {
		this.virtualCallSid = virtualCallSid;
	}
	
	/**
	 * Gets the call leg sid.
	 *
	 * @return the call leg sid
	 */
	public String getCallLegSid() {
		return callLegSid;
	}
	
	/**
	 * Sets the call leg sid.
	 *
	 * @param callLegSid the new call leg sid
	 */
	public void setCallLegSid(String callLegSid) {
		this.callLegSid = callLegSid;
	}
	
	/**
	 * Gets the project sid.
	 *
	 * @return the project sid
	 */
	public String getProjectSid() {
		return projectSid;
	}
	
	/**
	 * Sets the project sid.
	 *
	 * @param projectSid the new project sid
	 */
	public void setProjectSid(String projectSid) {
		this.projectSid = projectSid;
	}
	
	/**
	 * Gets the project group sid.
	 *
	 * @return the project group sid
	 */
	public String getProjectGroupSid() {
		return projectGroupSid;
	}
	
	/**
	 * Sets the project group sid.
	 *
	 * @param projectGroupSid the new project group sid
	 */
	public void setProjectGroupSid(String projectGroupSid) {
		this.projectGroupSid = projectGroupSid;
	}
	
	/**
	 * Gets the agent sid.
	 *
	 * @return the agent sid
	 */
	public String getAgentSid() {
		return agentSid;
	}
	
	/**
	 * Sets the agent sid.
	 *
	 * @param agentSid the new agent sid
	 */
	public void setAgentSid(String agentSid) {
		this.agentSid = agentSid;
	}
	
	/**
	 * Gets the caller number.
	 *
	 * @return the caller number
	 */
	public String getCallerNumber() {
		return callerNumber;
	}
	
	/**
	 * Sets the caller number.
	 *
	 * @param callerNumber the new caller number
	 */
	public void setCallerNumber(String callerNumber) {
		this.callerNumber = callerNumber;
	}
	
	/**
	 * Gets the caller city.
	 *
	 * @return the caller city
	 */
	public String getCallerCity() {
		return callerCity;
	}
	
	/**
	 * Sets the caller city.
	 *
	 * @param callerCity the new caller city
	 */
	public void setCallerCity(String callerCity) {
		this.callerCity = callerCity;
	}
	
	/**
	 * Gets the caller zip code.
	 *
	 * @return the caller zip code
	 */
	public String getCallerZipCode() {
		return callerZipCode;
	}
	
	/**
	 * Sets the caller zip code.
	 *
	 * @param callerZipCode the new caller zip code
	 */
	public void setCallerZipCode(String callerZipCode) {
		this.callerZipCode = callerZipCode;
	}
	
	/**
	 * Gets the caller country.
	 *
	 * @return the caller country
	 */
	public String getCallerCountry() {
		return callerCountry;
	}
	
	/**
	 * Sets the caller country.
	 *
	 * @param callerCountry the new caller country
	 */
	public void setCallerCountry(String callerCountry) {
		this.callerCountry = callerCountry;
	}
	
	/**
	 * Gets the caller name.
	 *
	 * @return the caller name
	 */
	public String getCallerName() {
		return callerName;
	}
	
	/**
	 * Sets the caller name.
	 *
	 * @param callerName the new caller name
	 */
	public void setCallerName(String callerName) {
		this.callerName = callerName;
	}
	
	/**
	 * Gets the caller company.
	 *
	 * @return the caller company
	 */
	public String getCallerCompany() {
		return callerCompany;
	}
	
	/**
	 * Sets the caller company.
	 *
	 * @param callerCompany the new caller company
	 */
	public void setCallerCompany(String callerCompany) {
		this.callerCompany = callerCompany;
	}
	
	/**
	 * Gets the called number.
	 *
	 * @return the called number
	 */
	public String getCalledNumber() {
		return calledNumber;
	}
	
	/**
	 * Sets the called number.
	 *
	 * @param calledNumber the new called number
	 */
	public void setCalledNumber(String calledNumber) {
		this.calledNumber = calledNumber;
	}
	
	/**
	 * Gets the called name.
	 *
	 * @return the called name
	 */
	public String getCalledName() {
		return calledName;
	}
	
	/**
	 * Sets the called name.
	 *
	 * @param calledName the new called name
	 */
	public void setCalledName(String calledName) {
		this.calledName = calledName;
	}
	
	/**
	 * Gets the called company.
	 *
	 * @return the called company
	 */
	public String getCalledCompany() {
		return calledCompany;
	}
	
	/**
	 * Sets the called company.
	 *
	 * @param calledCompany the new called company
	 */
	public void setCalledCompany(String calledCompany) {
		this.calledCompany = calledCompany;
	}
	
	/**
	 * Gets the originating gw number.
	 *
	 * @return the originating gw number
	 */
	public String getOriginatingGWNumber() {
		return originatingGWNumber;
	}
	
	/**
	 * Sets the originating gw number.
	 *
	 * @param originatingGWNumber the new originating gw number
	 */
	public void setOriginatingGWNumber(String originatingGWNumber) {
		this.originatingGWNumber = originatingGWNumber;
	}
	
	/**
	 * Gets the start time.
	 *
	 * @return the start time
	 */
	public String getStartTime() {
		return startTime;
	}
	
	/**
	 * Sets the start time.
	 *
	 * @param startTime the new start time
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	
	/**
	 * Gets the end time.
	 *
	 * @return the end time
	 */
	public String getEndTime() {
		return endTime;
	}
	
	/**
	 * Sets the end time.
	 *
	 * @param endTime the new end time
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	/**
	 * Gets the recording url.
	 *
	 * @return the recording url
	 */
	public String getRecordingURL() {
		return recordingURL;
	}
	
	/**
	 * Sets the recording url.
	 *
	 * @param recordingURL the new recording url
	 */
	public void setRecordingURL(String recordingURL) {
		this.recordingURL = recordingURL;
	}
	
	/**
	 * Gets the last transfer number.
	 *
	 * @return the last transfer number
	 */
	public String getLastTransferNumber() {
		return lastTransferNumber;
	}
	
	/**
	 * Sets the last transfer number.
	 *
	 * @param lastTransferNumber the new last transfer number
	 */
	public void setLastTransferNumber(String lastTransferNumber) {
		this.lastTransferNumber = lastTransferNumber;
	}
	
	/**
	 * Gets the conference sid.
	 *
	 * @return the conference sid
	 */
	public String getConferenceSid() {
		return conferenceSid;
	}
	
	/**
	 * Sets the conference sid.
	 *
	 * @param conferenceSid the new conference sid
	 */
	public void setConferenceSid(String conferenceSid) {
		this.conferenceSid = conferenceSid;
	}
	
	/**
	 * Gets the last queue name.
	 *
	 * @return the last queue name
	 */
	public String getLastQueueName() {
		return lastQueueName;
	}
	
	/**
	 * Sets the last queue name.
	 *
	 * @param lastQueueName the new last queue name
	 */
	public void setLastQueueName(String lastQueueName) {
		this.lastQueueName = lastQueueName;
	}
	
	/**
	 * Gets the last queue duration.
	 *
	 * @return the last queue duration
	 */
	public String getLastQueueDuration() {
		return lastQueueDuration;
	}
	
	/**
	 * Sets the last queue duration.
	 *
	 * @param lastQueueDuration the new last queue duration
	 */
	public void setLastQueueDuration(String lastQueueDuration) {
		this.lastQueueDuration = lastQueueDuration;
	}
	
	/**
	 * Gets the ivr menu name.
	 *
	 * @return the ivr menu name
	 */
	public String getIvrMenuName() {
		return ivrMenuName;
	}
	
	/**
	 * Sets the ivr menu name.
	 *
	 * @param ivrMenuName the new ivr menu name
	 */
	public void setIvrMenuName(String ivrMenuName) {
		this.ivrMenuName = ivrMenuName;
	}
	
	/**
	 * Gets the ivr menu digits.
	 *
	 * @return the ivr menu digits
	 */
	public String getIvrMenuDigits() {
		return ivrMenuDigits;
	}
	
	/**
	 * Sets the ivr menu digits.
	 *
	 * @param ivrMenuDigits the new ivr menu digits
	 */
	public void setIvrMenuDigits(String ivrMenuDigits) {
		this.ivrMenuDigits = ivrMenuDigits;
	}
	
	/**
	 * Gets the ivr menu duration.
	 *
	 * @return the ivr menu duration
	 */
	public int getIvrMenuDuration() {
		return ivrMenuDuration;
	}
	
	/**
	 * Sets the ivr menu duration.
	 *
	 * @param ivrMenuDuration the new ivr menu duration
	 */
	public void setIvrMenuDuration(int ivrMenuDuration) {
		this.ivrMenuDuration = ivrMenuDuration;
	}
	
	/**
	 * Gets the duration.
	 *
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}
	
	/**
	 * Sets the duration.
	 *
	 * @param duration the new duration
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	/**
	 * Gets the transfer count.
	 *
	 * @return the transfer count
	 */
	public int getTransferCount() {
		return transferCount;
	}
	
	/**
	 * Sets the transfer count.
	 *
	 * @param transferCount the new transfer count
	 */
	public void setTransferCount(int transferCount) {
		this.transferCount = transferCount;
	}
	
	/**
	 * Gets the hold duration.
	 *
	 * @return the hold duration
	 */
	public int getHoldDuration() {
		return holdDuration;
	}
	
	/**
	 * Sets the hold duration.
	 *
	 * @param holdDuration the new hold duration
	 */
	public void setHoldDuration(int holdDuration) {
		this.holdDuration = holdDuration;
	}
	
	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * Sets the price.
	 *
	 * @param price the new price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public CallEndLogType getType() {
		return type;
	}
	
	/**
	 * Sets the type.
	 *
	 * @param type the new type
	 */
	public void setType(CallEndLogType type) {
		this.type = type;
	}
	
	/**
	 * Gets the direction.
	 *
	 * @return the direction
	 */
	public CallEndLogDirection getDirection() {
		return direction;
	}
	
	/**
	 * Sets the direction.
	 *
	 * @param direction the new direction
	 */
	public void setDirection(CallEndLogDirection direction) {
		this.direction = direction;
	}
	
	/**
	 * Gets the recording flag.
	 *
	 * @return the recording flag
	 */
	public CallEndLogRecordingFlag getRecordingFlag() {
		return recordingFlag;
	}
	
	/**
	 * Sets the recording flag.
	 *
	 * @param recordingFlag the new recording flag
	 */
	public void setRecordingFlag(CallEndLogRecordingFlag recordingFlag) {
		this.recordingFlag = recordingFlag;
	}
	
	/**
	 * Gets the answered by.
	 *
	 * @return the answered by
	 */
	public CallEndLogAnsweredBy getAnsweredBy() {
		return answeredBy;
	}
	
	/**
	 * Sets the answered by.
	 *
	 * @param answeredBy the new answered by
	 */
	public void setAnsweredBy(CallEndLogAnsweredBy answeredBy) {
		this.answeredBy = answeredBy;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public CallEndLogStatus getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public void setStatus(CallEndLogStatus status) {
		this.status = status;
	}

	/**
	 * Gets the resolution status.
	 *
	 * @return the resolution status
	 */
	public CallEndResolutionStatus getResolutionStatus() {
		return resolutionStatus;
	}

	/**
	 * Sets the resolution status.
	 *
	 * @param resolutionStatus the new resolution status
	 */
	public void setResolutionStatus(CallEndResolutionStatus resolutionStatus) {
		this.resolutionStatus = resolutionStatus;
	}

	/**
	 * Gets the wrapup comments.
	 *
	 * @return the wrapup comments
	 */
	public String getWrapupComments() {
		return wrapupComments;
	}

	/**
	 * Sets the wrapup comments.
	 *
	 * @param wrapupComments the new wrapup comments
	 */
	public void setWrapupComments(String wrapupComments) {
		this.wrapupComments = wrapupComments;
	}
		
}
