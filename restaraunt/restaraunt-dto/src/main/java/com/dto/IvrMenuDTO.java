package com.dto;

import java.util.List;

public class IvrMenuDTO extends AbsCommonDTO {
	private static final long serialVersionUID = 1L;

	private int defaultIvrItemId;

	private int maxRetry;

	private String name;
	
	private String ivrVoiceGender;

	private IvrGatherDTO ivrGather;

	private List<IvrAnnouncementDTO> ivrAnnouncements;

	private List<IvrItemDTO> ivrItems;

	private List<RegisteredPhoneNoDTO> registeredPhoneNos;
	
	private List<IvrRuleTimingsDTO> ivrRuleTimings;

	public IvrMenuDTO() {
	}

	public int getDefaultIvrItemId() {
		return this.defaultIvrItemId;
	}

	public void setDefaultIvrItemId(int defaultIvrItemId) {
		this.defaultIvrItemId = defaultIvrItemId;
	}

	public int getMaxRetry() {
		return this.maxRetry;
	}

	public void setMaxRetry(int maxRetry) {
		this.maxRetry = maxRetry;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIvrVoiceGender() {
		return ivrVoiceGender;
	}

	public void setIvrVoiceGender(String ivrVoiceGender) {
		this.ivrVoiceGender = ivrVoiceGender;
	}

	public IvrGatherDTO getIvrGather() {
		return this.ivrGather;
	}

	public void setIvrGather(IvrGatherDTO ivrGather) {
		this.ivrGather = ivrGather;
	}

	public List<IvrAnnouncementDTO> getIvrAnnouncements() {
		return this.ivrAnnouncements;
	}

	public void setIvrAnnouncements(List<IvrAnnouncementDTO> ivrAnnouncements) {
		this.ivrAnnouncements = ivrAnnouncements;
	}

	public List<IvrItemDTO> getIvrItems() {
		return this.ivrItems;
	}

	public void setIvrItems(List<IvrItemDTO> ivrItems) {
		this.ivrItems = ivrItems;
	}

	public List<RegisteredPhoneNoDTO> getRegisteredPhoneNos() {
		return registeredPhoneNos;
	}

	public void setRegisteredPhoneNos(List<RegisteredPhoneNoDTO> registeredPhoneNos) {
		this.registeredPhoneNos = registeredPhoneNos;
	}

	public List<IvrRuleTimingsDTO> getIvrRuleTimings() {
		return ivrRuleTimings;
	}

	public void setIvrRuleTimings(List<IvrRuleTimingsDTO> ivrRuleTimings) {
		this.ivrRuleTimings = ivrRuleTimings;
	}
}