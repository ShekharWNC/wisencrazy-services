package com.dto;

import java.util.List;

public class UserNotificationMessageDTO {
private String version;
private List<NotifyMessageDTO<MessageDTO>> message;
public String getVersion() {
	return version;
}
public void setVersion(String version) {
	this.version = version;
}
public List<NotifyMessageDTO<MessageDTO>> getMessage() {
	return message;
}
public void setMessage(List<NotifyMessageDTO<MessageDTO>> message) {
	this.message = message;
}


}
