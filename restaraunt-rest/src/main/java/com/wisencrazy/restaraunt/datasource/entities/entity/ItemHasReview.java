package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author vikash
 *
 */
@Entity
@Table(name = "item_has_review")
@NamedQueries({ @NamedQuery(name = ItemHasReview.FIND_REVIEW_BY_ITEM, query = "select i from ItemHasReview i where i.item.sid=unhex(:itemSid)") })
public class ItemHasReview extends AbsBaseEntity {

	private static final long serialVersionUID = 8551951035362686714L;
	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.ItemHasReview.";
	public static final String FIND_REVIEW_BY_ITEM = PREFIX+ "findReviewByItem";
	public static String DELETE_REVIEW_BY_ITEM="delete from item_has_review where item_id=:itemId";
	@Column(name = "review")
	private String review;
	@Column(name = "rating")
	private Float rating;
	@ManyToOne
	@JoinColumn(name = "customer_id", referencedColumnName = "id")
	private Customer customer;
	@ManyToOne
	@JoinColumn(name = "item_id", referencedColumnName = "id")
	private Item item;

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public Float getRating() {
		return rating;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
}
