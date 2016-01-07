package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the ivr_announcement database table.
 * 
 */
@Entity
@Table(name="ivr_announcement")
public class IvrAnnouncement extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(name="ivr_audio_url")
	private String ivrAudioUrl;

	@Column(name="ivr_prompt")
	private String ivrPrompt;

	@Column(name="ivr_voice_gender")
	private String ivrVoiceGender;

	@Column(name="loop_itr")
	private String loopItr;

	@ManyToOne
	@JoinColumn(name="ivr_support_language_id")
	private IvrSupportLanguage ivrSupportLanguage;
	
	@Column(name = "audio_transcript")
	private String audioTranscript;
	
	@Column(name = "audio_tag_name")
	private String name;


	public IvrAnnouncement() {
	}

	public String getIvrAudioUrl() {
		return this.ivrAudioUrl;
	}

	public void setIvrAudioUrl(String ivrAudioUrl) {
		this.ivrAudioUrl = ivrAudioUrl;
	}

	public String getIvrPrompt() {
		return this.ivrPrompt;
	}

	public void setIvrPrompt(String ivrPrompt) {
		this.ivrPrompt = ivrPrompt;
	}

	public String getIvrVoiceGender() {
		return this.ivrVoiceGender;
	}

	public void setIvrVoiceGender(String ivrVoiceGender) {
		this.ivrVoiceGender = ivrVoiceGender;
	}

	public String getLoopItr() {
		return this.loopItr;
	}

	public void setLoopItr(String loopItr) {
		this.loopItr = loopItr;
	}

	public IvrSupportLanguage getIvrSupportLanguage() {
		return this.ivrSupportLanguage;
	}

	public void setIvrSupportLanguage(IvrSupportLanguage ivrSupportLanguage) {
		this.ivrSupportLanguage = ivrSupportLanguage;
	}

	public String getAudioTranscript() {
		return audioTranscript;
	}

	public void setAudioTranscript(String audioTranscript) {
		this.audioTranscript = audioTranscript;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}