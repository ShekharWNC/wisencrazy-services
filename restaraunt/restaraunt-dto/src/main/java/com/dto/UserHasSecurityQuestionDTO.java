package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the user_has_security_question database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class UserHasSecurityQuestionDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String securityAnswer;

	//bi-directional many-to-one association to SecurityQuestion
	private SecurityQuestionDTO securityQuestion;

	//bi-directional many-to-one association to User
	private AppuserDTO user;

	public UserHasSecurityQuestionDTO() {
	}

	public UserHasSecurityQuestionDTO(String securityAnswer,
			SecurityQuestionDTO securityQuestion, AppuserDTO user) {
		super();
		this.securityAnswer = securityAnswer;
		this.securityQuestion = securityQuestion;
		this.user = user;
	}
	public String getSecurityAnswer() {
		return this.securityAnswer;
	}

	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}

	public SecurityQuestionDTO getSecurityQuestion() {
		return this.securityQuestion;
	}

	public void setSecurityQuestion(SecurityQuestionDTO securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public AppuserDTO getUser() {
		return this.user;
	}

	public void setUser(AppuserDTO user) {
		this.user = user;
	}

}