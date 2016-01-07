package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the security_question database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class SecurityQuestionDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String securityQuestion;

	//bi-directional many-to-one association to UserHasSecurityQuestion
	private List<UserHasSecurityQuestionDTO> userHasSecurityQuestions;

	public SecurityQuestionDTO() {
	}

	public SecurityQuestionDTO(String securityQuestion,
			List<UserHasSecurityQuestionDTO> userHasSecurityQuestions) {
		super();
		this.securityQuestion = securityQuestion;
		this.userHasSecurityQuestions = userHasSecurityQuestions;
	}
	public String getSecurityQuestion() {
		return this.securityQuestion;
	}

	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public List<UserHasSecurityQuestionDTO> getUserHasSecurityQuestions() {
		return this.userHasSecurityQuestions;
	}

	public void setUserHasSecurityQuestions(List<UserHasSecurityQuestionDTO> userHasSecurityQuestions) {
		this.userHasSecurityQuestions = userHasSecurityQuestions;
	}

	public UserHasSecurityQuestionDTO addUserHasSecurityQuestion(UserHasSecurityQuestionDTO userHasSecurityQuestion) {
		getUserHasSecurityQuestions().add(userHasSecurityQuestion);
		userHasSecurityQuestion.setSecurityQuestion(this);

		return userHasSecurityQuestion;
	}

	public UserHasSecurityQuestionDTO removeUserHasSecurityQuestion(UserHasSecurityQuestionDTO userHasSecurityQuestion) {
		getUserHasSecurityQuestions().remove(userHasSecurityQuestion);
		userHasSecurityQuestion.setSecurityQuestion(null);

		return userHasSecurityQuestion;
	}

}