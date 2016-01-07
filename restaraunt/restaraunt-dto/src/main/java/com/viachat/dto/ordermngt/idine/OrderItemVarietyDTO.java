package com.viachat.dto.ordermngt.idine;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * Created by vikash on 3/11/15.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderItemVarietyDTO implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 6382036996899982000L;
	// item_has_varitey sid
    private String sid;
    private double price;
    private String varietyName;
    private double quantity;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getVarietyName() {
        return varietyName;
    }

    public void setVarietyName(String varietyName) {
        this.varietyName = varietyName;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
