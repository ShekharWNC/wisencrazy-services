package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the user_has_security_question database table.
 * 
 */
@Entity
@Table(name="user_has_security_question")
public class UserHasSecurityQuestion extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(name="security_answer")
	private String securityAnswer;

	//bi-directional many-to-one association to Appuser
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="user_id")
	private Appuser appuser;

	//bi-directional many-to-one association to SecurityQuestion
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="security_question_id")
	private SecurityQuestion securityQuestion;

	public UserHasSecurityQuestion() {
	}

	public String getSecurityAnswer() {
		return this.securityAnswer;
	}

	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}

	public Appuser getAppuser() {
		return this.appuser;
	}

	public void setAppuser(Appuser appuser) {
		this.appuser = appuser;
	}

	public SecurityQuestion getSecurityQuestion() {
		return this.securityQuestion;
	}

	public void setSecurityQuestion(SecurityQuestion securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

}