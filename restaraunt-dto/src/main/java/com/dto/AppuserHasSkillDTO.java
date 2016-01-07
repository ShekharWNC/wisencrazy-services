package com.dto;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the user_has_skills database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class AppuserHasSkillDTO extends AppUserHasSkillCommonDTO  {
	private static final long serialVersionUID = 1L;

	private String additionalComments;

	private int relevantExp;
	
	private int skillId;
	
	private int userId;

	//bi-directional many-to-one association to User
    private AppuserDTO appuser;

	//bi-directional many-to-one association to UserSkillRating
	private List<UserSkillRatingDTO> userSkillRatings;

	public AppuserHasSkillDTO() {
	}

	public AppuserHasSkillDTO(String additionalComments, int relevantExp,AppuserDTO user, List<UserSkillRatingDTO> userSkillRatings) {
		super();
		this.additionalComments = additionalComments;
		this.relevantExp = relevantExp;
//		this.appuser = user;
		this.userSkillRatings = userSkillRatings;
	}
	public String getAdditionalComments() {
		return this.additionalComments;
	}

	public void setAdditionalComments(String additionalComments) {
		this.additionalComments = additionalComments;
	}

	public int getRelevantExp() {
		return this.relevantExp;
	}

	public void setRelevantExp(int relevantExp) {
		this.relevantExp = relevantExp;
	}

	public AppuserDTO getAppuser() {
		return appuser;
	}

	public void setAppuser(AppuserDTO appuser) {
		this.appuser = appuser;
	}

	public List<UserSkillRatingDTO> getUserSkillRatings() {
		return this.userSkillRatings;
	}

	public void setUserSkillRatings(List<UserSkillRatingDTO> userSkillRatings) {
		this.userSkillRatings = userSkillRatings;
	}

	public UserSkillRatingDTO addUserSkillRating(UserSkillRatingDTO userSkillRating) {
		getUserSkillRatings().add(userSkillRating);
		userSkillRating.setUserHasSkill(this);

		return userSkillRating;
	}

	public UserSkillRatingDTO removeUserSkillRating(UserSkillRatingDTO userSkillRating) {
		getUserSkillRatings().remove(userSkillRating);
		userSkillRating.setUserHasSkill(null);

		return userSkillRating;
	}

	public int getSkillId() {
		return skillId;
	}

	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
}