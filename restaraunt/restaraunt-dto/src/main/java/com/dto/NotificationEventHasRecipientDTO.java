package com.dto;

import java.io.Serializable;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class NotificationEventHasRecipientDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5061090637776476321L;
	/*private RecipientDTO recipient;
	public RecipientDTO getRecipient() {
		return recipient;
	}
	public void setRecipient(RecipientDTO recipient) {
		this.recipient = recipient;
	}*/

}
