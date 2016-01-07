package com.viachat.dto.ordermngt.idine;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.dto.core.ordermanagement.CoreOrderItemDTO;

/**
 * The dto class for the order_has_item_detail database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class IdineOrderItemDTO extends CoreOrderItemDTO   {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3936364772866114978L;
	/**
	 * 
	 */
	private String tableSid = null;
	
	public String getTableSid() {
		return tableSid;
	}
	public void setTableSid(String tableSid) {
		this.tableSid = tableSid;
	}
	
}