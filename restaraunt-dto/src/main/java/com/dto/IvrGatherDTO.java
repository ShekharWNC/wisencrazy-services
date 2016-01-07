package com.dto;

import java.util.List;
public class IvrGatherDTO extends AbsCommonDTO {
	private static final long serialVersionUID = 1L;

	private String dataType;
	
	private int digitLength;

	private String finishKey;

	private int timeout;
	
	private String parentActionSid;

	private List<IvrAnnouncementDTO> ivrAnnouncements;
	
	public IvrGatherDTO() {
	}

	public int getDigitLength() {
		return this.digitLength;
	}

	public void setDigitLength(int digitLength) {
		this.digitLength = digitLength;
	}

	public String getFinishKey() {
		return this.finishKey;
	}

	public void setFinishKey(String finishKey) {
		this.finishKey = finishKey;
	}

	public int getTimeout() {
		return this.timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getParentActionSid() {
		return parentActionSid;
	}

	public void setParentActionSid(String parentActionSid) {
		this.parentActionSid = parentActionSid;
	}

	public List<IvrAnnouncementDTO> getIvrAnnouncements() {
		return ivrAnnouncements;
	}

	public void setIvrAnnouncements(List<IvrAnnouncementDTO> ivrAnnouncements) {
		this.ivrAnnouncements = ivrAnnouncements;
	}

}