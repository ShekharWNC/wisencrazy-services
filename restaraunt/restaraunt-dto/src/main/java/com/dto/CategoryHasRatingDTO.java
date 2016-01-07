package com.dto;

import java.io.Serializable;

public class CategoryHasRatingDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private String rating;

	private byte[] sid;

	private CategoryDTO category;

	public CategoryHasRatingDTO() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRating() {
		return this.rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public byte[] getSid() {
		return this.sid;
	}

	public void setSid(byte[] sid) {
		this.sid = sid;
	}

	public CategoryDTO getCategory() {
		return this.category;
	}

	public void setCategory(CategoryDTO category) {
		this.category = category;
	}

}