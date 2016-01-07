package com.dto;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties
public class IvrAnnouncementDTO extends AbsCommonDTO {
	private static final long serialVersionUID = 1L;
	
	private String name;

	private String ivrAudioUrl;

	private String ivrPrompt;

	private String ivrVoiceGender;

	private String loopItr;

	private IvrSupportLanguageDTO ivrSupportLanguage;
	
	private String audioTranscript;

	public IvrAnnouncementDTO() {
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	public String getIvrAudioUrl() {
		return ivrAudioUrl;
	}

	public void setIvrAudioUrl(String ivrAudioUrl) {
		this.ivrAudioUrl = ivrAudioUrl;
	}

	public String getIvrPrompt() {
		return ivrPrompt;
	}

	public void setIvrPrompt(String ivrPrompt) {
		this.ivrPrompt = ivrPrompt;
	}

	public String getIvrVoiceGender() {
		return ivrVoiceGender;
	}

	public void setIvrVoiceGender(String ivrVoiceGender) {
		this.ivrVoiceGender = ivrVoiceGender;
	}

	public String getLoopItr() {
		return loopItr;
	}

	public void setLoopItr(String loopItr) {
		this.loopItr = loopItr;
	}

	public IvrSupportLanguageDTO getIvrSupportLanguage() {
		return ivrSupportLanguage;
	}

	public void setIvrSupportLanguage(IvrSupportLanguageDTO ivrSupportLanguage) {
		this.ivrSupportLanguage = ivrSupportLanguage;
	}


	public String getAudioTranscript() {
		return audioTranscript;
	}


	public void setAudioTranscript(String audioTranscript) {
		this.audioTranscript = audioTranscript;
	}
	
}