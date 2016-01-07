package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * 
 * @author vikash pandey
 *
 */
@Entity
@Table(name="customer_has_saved_cards")
@NamedQueries({ @NamedQuery(name = CustomerHasSavedCard.FIND_CARD_TOKEN_BY_CUSTOMER, query = "from CustomerHasSavedCard c where hex(c.customer.sid)=:customerSid and c.merchant.gateway=:merchantName and c.cardToken=:cardToken"),
	@NamedQuery(name = CustomerHasSavedCard.FIND_CARDS_TOKEN_BY_CUSTOMER_AND_MERCHANT, query = "select c.cardToken from CustomerHasSavedCard c where hex(c.customer.sid)=:customerSid and c.merchant.gateway=:merchantName")
})
public class CustomerHasSavedCard extends AbsBaseEntity{
	private static final long serialVersionUID = -807837746199568134L;
	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.CustomerHasSavedCard.";
	public static final String FIND_CARD_TOKEN_BY_CUSTOMER = PREFIX
			+ "findCardTokenByCustomer";
	public static final String FIND_CARDS_TOKEN_BY_CUSTOMER_AND_MERCHANT = PREFIX
			+ "findCardTokensByCustomerAndMerchant";
    @Column(name="card_token")
	private String cardToken;
    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name="merchant_id",referencedColumnName="id")
    private Merchant merchant;
	public String getCardToken() {
		return cardToken;
	}
	public void setCardToken(String cardToken) {
		this.cardToken = cardToken;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Merchant getMerchant() {
		return merchant;
	}
	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}
    
}
