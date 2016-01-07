package com.viachat.dto.ordermngt.idine;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;

/**
 * Created by vikash on 3/11/15.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderItemAttributeDTO implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -3467827499959069187L;
	private List<OrderItemAddonDTO> addons;
    private OrderItemSizeDTO size;
    private OrderItemVarietyDTO variety;

    public List<OrderItemAddonDTO> getAddons() {
        return addons;
    }

    public void setAddons(List<OrderItemAddonDTO> addons) {
        this.addons = addons;
    }

    public OrderItemSizeDTO getSize() {
        return size;
    }

    public void setSize(OrderItemSizeDTO size) {
        this.size = size;
    }

    public OrderItemVarietyDTO getVariety() {
        return variety;
    }

    public void setVariety(OrderItemVarietyDTO variety) {
        this.variety = variety;
    }
}
