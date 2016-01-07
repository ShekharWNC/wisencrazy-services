package com.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author priyatham
 */
public class IvrNodeDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String sid;
	private Integer operation;
	private String parentSid;
	private List<String> childSids;
	private String keySelection;
	private IvrCommandDTO command;
	private Map<String, Object> data;
	private IvrAnnouncementDTO announcement;
	
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public Integer getOperation() {
		return operation;
	}
	public void setOperation(Integer operation) {
		this.operation = operation;
	}
	public String getParentSid() {
		return parentSid;
	}
	public void setParentSid(String parentSid) {
		this.parentSid = parentSid;
	}
	public List<String> getChildSids() {
		return childSids;
	}
	public void setChildSids(List<String> childSids) {
		this.childSids = childSids;
	}
	public String getKeySelection() {
		return keySelection;
	}
	public void setKeySelection(String keySelection) {
		this.keySelection = keySelection;
	}
	public IvrCommandDTO getCommand() {
		return command;
	}
	public void setCommand(IvrCommandDTO command) {
		this.command = command;
	}
	public Map<String, Object> getData() {
		return data;
	}
	public void setData(Map<String, Object> data) {
		this.data = data;
	}
	public IvrAnnouncementDTO getAnnouncement() {
		return announcement;
	}
	public void setAnnouncement(IvrAnnouncementDTO announcement) {
		this.announcement = announcement;
	}
}
