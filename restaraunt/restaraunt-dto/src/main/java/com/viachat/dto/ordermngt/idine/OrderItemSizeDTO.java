package com.viachat.dto.ordermngt.idine;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * Created by vikash on 3/11/15.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderItemSizeDTO implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 8597838408206083687L;
	// Item size sid
    private String sid;
    private String sizeName;
    private double quantity;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSizeName() {
        return sizeName;
    }

    public void setSizeName(String sizeName) {
        this.sizeName = sizeName;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
