package com.dto.core.ordermanagement;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * The dto class for the order_has_item_detail database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class CoreOrderItemDTO extends CoreOrderDTO  {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8127308911829851120L;

	public CoreOrderItemDTO() {
		
	}
	private List<CoreItemDTO> itemList ;

	public List<CoreItemDTO> getItemList() {
		return itemList;
	}

	public void setItemList(List<CoreItemDTO> itemList) {
		this.itemList = itemList;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CoreOrderItemDTO [itemList=");
		builder.append(itemList);
		builder.append("]");
		return builder.toString();
	}
	
	
}