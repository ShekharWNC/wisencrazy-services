package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * The persistent class for the security_question database table.
 * 
 */
@Entity
@Table(name="security_question")
public class SecurityQuestion extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(name="security_question")
	private String securityQuestion;

	//bi-directional many-to-one association to UserHasSecurityQuestion
	/*@OneToMany(mappedBy="securityQuestion")
	private List<UserHasSecurityQuestion> userHasSecurityQuestions;*/

	public SecurityQuestion() {
	}

	public String getSecurityQuestion() {
		return this.securityQuestion;
	}

	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}
}