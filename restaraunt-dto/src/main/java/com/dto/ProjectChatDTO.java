package com.dto;

import java.io.Serializable;

public class ProjectChatDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer maxChats;
	private Boolean chatEnable;
	private String chatGreeting;
	
	public Integer getMaxChats() {
		return maxChats;
	}
	public void setMaxChats(Integer maxChats) {
		this.maxChats = maxChats;
	}
	public Boolean getChatEnable() {
		return chatEnable;
	}
	public void setChatEnable(Boolean chatEnable) {
		this.chatEnable = chatEnable;
	}
	public String getChatGreeting() {
		return chatGreeting;
	}
	public void setChatGreeting(String chatGreeting) {
		this.chatGreeting = chatGreeting;
	}
}
