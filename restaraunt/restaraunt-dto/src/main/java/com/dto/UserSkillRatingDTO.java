package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the user_skill_rating database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class UserSkillRatingDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to Rating
	private RatingDTO rating;

	//bi-directional many-to-one association to UserHasSkill
	private AppuserHasSkillDTO userHasSkill;

	public UserSkillRatingDTO() {
	}

	public UserSkillRatingDTO(RatingDTO rating, AppuserHasSkillDTO userHasSkill) {
		super();
		this.rating = rating;
		this.userHasSkill = userHasSkill;
	}

	public RatingDTO getRating() {
		return this.rating;
	}

	public void setRating(RatingDTO rating) {
		this.rating = rating;
	}

	public AppuserHasSkillDTO getUserHasSkill() {
		return this.userHasSkill;
	}

	public void setUserHasSkill(AppuserHasSkillDTO userHasSkill) {
		this.userHasSkill = userHasSkill;
	}

}