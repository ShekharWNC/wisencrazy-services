package com.dto;

/**
 * 
 * @author vikash
 *
 */
public class ItemHasSizeInputDTO extends ItemHasSizeDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3556568921294453552L;
	private Float totalQty;// total quantity
	private Float rmngQty;// remaining quantity

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
