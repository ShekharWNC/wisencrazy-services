package com.dto;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * 
 * @author vikash
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemHasAddonInputDTO extends ItemHasAddonDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9102628417275292624L;
	private Float totalQty;// totalQuantiry
	private Float rmngQty;// Remaining quantity

	public Float getTotalQty() {
		return totalQty;
	}

	public void setTotalQty(Float totalQty) {
		this.totalQty = totalQty;
	}

	public Float getRmngQty() {
		return rmngQty;
	}

	public void setRmngQty(Float rmngQty) {
		this.rmngQty = rmngQty;
	}

}
