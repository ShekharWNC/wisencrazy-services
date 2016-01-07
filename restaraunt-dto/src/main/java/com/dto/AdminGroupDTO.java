package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class AdminGroupDTO implements Serializable{
 /**
	 * 
	 */
	private static final long serialVersionUID = 8762638639957664768L;
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
 
}
