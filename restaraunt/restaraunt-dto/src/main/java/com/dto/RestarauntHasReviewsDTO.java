package com.dto;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

public class RestarauntHasReviewsDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6169701313254790571L;

	private int rating;
	
	private String comment;
	
	private Timestamp timestamp;
	
	private CustomerReviewDTO customer;
	
	private String restarauntSid;
	private int ratingCount;
	
	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public CustomerReviewDTO getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerReviewDTO customer) {
		this.customer = customer;
	}

	public String getRestarauntSid() {
		return restarauntSid;
	}

	public void setRestarauntSid(String restarauntSid) {
		this.restarauntSid = restarauntSid;
	}

	public int getRatingCount() {
		return ratingCount;
	}

	public void setRatingCount(int ratingCount) {
		this.ratingCount = ratingCount;
	}

	
}
