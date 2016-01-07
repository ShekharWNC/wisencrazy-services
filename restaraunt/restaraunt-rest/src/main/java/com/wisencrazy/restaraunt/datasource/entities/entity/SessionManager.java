package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the session_manager database table.
 * 
 */
@Entity
@Table(name="session_manager")
public class SessionManager implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="email_id")
	private String emailId;

	private byte[] session;
	
	@Column(name="session_id")
	private String sessionId;

	private String status;

	public SessionManager() {
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public byte[] getSession() {
		return this.session;
	}

	public void setSession(byte[] session) {
		this.session = session;
	}

	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}