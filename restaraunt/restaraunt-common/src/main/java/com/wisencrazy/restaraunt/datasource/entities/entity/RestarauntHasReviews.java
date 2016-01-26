package com.wisencrazy.restaraunt.datasource.entities.entity;

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

/**
 * The persistent class for the customer database table.
 * 
 */
@Entity
@Table(name="restaraunt_has_reviews")
@NamedQueries({
	@NamedQuery(name=RestarauntHasReviews.FIND_LAST_REVIEW_RESTARAUNT,query="select rhr from RestarauntHasReviews rhr where hex(rhr.restaraunt.sid)=:restroSid order by rhr.timestamp desc"),
	@NamedQuery(name=RestarauntHasReviews.FIND_REVIEWS_RESTARAUNT,query="select rhr from RestarauntHasReviews rhr where hex(rhr.restaraunt.sid)=:restroSid and timestamp < :timestamp ORDER BY timestamp desc")
})
public class RestarauntHasReviews implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8404958547219976969L;

	public static final String PREFIX = "com.wisencrazy.restaraunt.datasource.entities.entity.RestarauntHasReviews.";
	public static final String FIND_RESTARAUNT_AVERAGE_RATING="select avg(rating) as AVERAGE_RATING,count(rating) as COUNT from restaraunt_has_reviews, restaraunt r where hex(r.sid)=:restroSid";
	public static final String FIND_LAST_REVIEW_RESTARAUNT=PREFIX+"findLastRevwRating";
	public static final String FIND_REVIEWS_RESTARAUNT=PREFIX+"findReviewForRestaraunt";
	
	@EmbeddedId
	private RestarauntHasReviewsPK reviewsPK;
	
	@Column(name="rating")
	private int rating;
	
	@Column(name="comment")
	private String comment;
	
	@Column(name="timestamp")
	private Timestamp timestamp;
	
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "restaraunt_id", referencedColumnName = "id", insertable = false, updatable = false)
	private
    Restaraunt restaraunt;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "customer_id", referencedColumnName = "id", insertable = false, updatable = false)
	private
    Customer customer;
    
	public RestarauntHasReviewsPK getReviewsPK() {
		return reviewsPK;
	}

	public void setReviewsPK(RestarauntHasReviewsPK reviewsPK) {
		this.reviewsPK = reviewsPK;
	}

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

	public Restaraunt getRestaraunt() {
		return restaraunt;
	}

	public void setRestaraunt(Restaraunt restaraunt) {
		this.restaraunt = restaraunt;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
