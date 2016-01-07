package com.dto;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class TemplateContentDTO extends AbsCommonDTO{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7599716338752150697L;
	private List<PlaceHolderDTO> placeHolder;
	private String templateContent;
	private String other;
	private AudioClipLibraryDTO audioClipLibrary;
	private ChannelDTO channel;
	
	public AudioClipLibraryDTO getAudioClipLibrary() {
		return audioClipLibrary;
	}
	public void setAudioClipLibrary(AudioClipLibraryDTO audioClipLibrary) {
		this.audioClipLibrary = audioClipLibrary;
	}
	public ChannelDTO getChannel() {
		return channel;
	}
	public void setChannel(ChannelDTO channel) {
		this.channel = channel;
	}
	public String getOther() {
		return other;
	}
	public void setOther(String other) {
		this.other = other;
	}
	public String getTemplateContent() {
		return templateContent;
	}
	public void setTemplateContent(String templateContent) {
		this.templateContent = templateContent;
	}
	public List<PlaceHolderDTO> getPlaceHolder() {
		return placeHolder;
	}
	public void setPlaceHolder(List<PlaceHolderDTO> placeHolder) {
		this.placeHolder = placeHolder;
	}
	
}
