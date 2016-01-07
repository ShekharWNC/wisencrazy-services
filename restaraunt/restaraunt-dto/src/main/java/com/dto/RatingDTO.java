package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the rating database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class RatingDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String rating;

	//bi-directional many-to-one association to UserSkillRating
	private List<UserSkillRatingDTO> userSkillRatings;

	public RatingDTO() {
	}
	public String getRating() {
		return this.rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public RatingDTO(String rating, List<UserSkillRatingDTO> userSkillRatings) {
		super();
		this.rating = rating;
		this.userSkillRatings = userSkillRatings;
	}

	public List<UserSkillRatingDTO> getUserSkillRatings() {
		return this.userSkillRatings;
	}

	public void setUserSkillRatings(List<UserSkillRatingDTO> userSkillRatings) {
		this.userSkillRatings = userSkillRatings;
	}

	public UserSkillRatingDTO addUserSkillRating(UserSkillRatingDTO userSkillRating) {
		getUserSkillRatings().add(userSkillRating);
		userSkillRating.setRating(this);

		return userSkillRating;
	}

	public UserSkillRatingDTO removeUserSkillRating(UserSkillRatingDTO userSkillRating) {
		getUserSkillRatings().remove(userSkillRating);
		userSkillRating.setRating(null);

		return userSkillRating;
	}

}