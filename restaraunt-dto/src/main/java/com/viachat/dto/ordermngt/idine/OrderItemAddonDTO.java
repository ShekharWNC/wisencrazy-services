package com.viachat.dto.ordermngt.idine;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * Created by vikash on 3/11/15.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderItemAddonDTO implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 3618509955366491686L;
	// Item_has_addon sid
    private String sid;
    private String addonName;
    private double price;
    private String addonSize;
    private double quantity;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getAddonName() {
        return addonName;
    }

    public void setAddonName(String addonName) {
        this.addonName = addonName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAddonSize() {
        return addonSize;
    }

    public void setAddonSize(String addonSize) {
        this.addonSize = addonSize;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
