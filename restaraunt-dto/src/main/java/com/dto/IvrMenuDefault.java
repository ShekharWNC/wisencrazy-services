package com.dto;

import java.io.Serializable;
import java.util.List;

/**
 * @author priyatham
 */
public class IvrMenuDefault extends AbsCommonDTO{
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String ivrVoiceGender;
	private List<RegisteredPhoneNoDTO> registeredPhoneNos;
	private List<IvrRuleTimingsDTO> ivrRuleTimings;
	
	public String getName() {
		return name;
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
	
	public List<RegisteredPhoneNoDTO> getRegisteredPhoneNos() {
		return registeredPhoneNos;
	}
	public void setRegisteredPhoneNos(
			List<RegisteredPhoneNoDTO> registeredPhoneNos) {
		this.registeredPhoneNos = registeredPhoneNos;
	}
	public List<IvrRuleTimingsDTO> getIvrRuleTimings() {
		return ivrRuleTimings;
	}
	public void setIvrRuleTimings(List<IvrRuleTimingsDTO> ivrRuleTimings) {
		this.ivrRuleTimings = ivrRuleTimings;
	}
}
