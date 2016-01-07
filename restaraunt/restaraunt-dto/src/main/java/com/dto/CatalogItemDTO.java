package com.dto;

import java.util.List;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * 
 * @author vikash
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CatalogItemDTO extends ItemCategoryDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4285496946685242627L;
	private List<ItemInputDTO> items;
	private List<CatalogItemDTO> sc;//sub category

	public List<ItemInputDTO> getItems() {
		return items;
	}

	public void setItems(List<ItemInputDTO> items) {
		this.items = items;
	}

	public List<CatalogItemDTO> getSc() {
		return sc;
	}

	public void setSc(List<CatalogItemDTO> sc) {
		this.sc = sc;
	}

}
