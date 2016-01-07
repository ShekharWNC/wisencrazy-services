package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class ChatJsonNotificationPropertyDTO extends AbsCommonDTO  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 35982078011618111L;
	/**
	 * 
	 */
	private String chatSessionId, type, messageTxt;
	private AuthorDTO author;

	
	public ChatJsonNotificationPropertyDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public ChatJsonNotificationPropertyDTO(String chatSessionId, String type,
			String messageTxt, AuthorDTO author) {
		super();
		this.chatSessionId = chatSessionId;
		this.type = type;
		this.messageTxt = messageTxt;
		this.author = author;
	}

	public String getChatSessionId() {
		return chatSessionId;
	}

	public void setChatSessionId(String chatSessionId) {
		this.chatSessionId = chatSessionId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMessageTxt() {
		return messageTxt;
	}

	public void setMessageTxt(String messageTxt) {
		this.messageTxt = messageTxt;
	}

	public AuthorDTO getAuthor() {
		return author;
	}

	public void setAuthor(AuthorDTO author) {
		this.author = author;
	}

}
