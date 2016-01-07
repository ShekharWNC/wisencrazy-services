package com.dto;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
/**
 * 
 * @author vikash
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemHasSizeDTO extends AbsCommonDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3712971071515457877L;
	private String nm;// name
	private Float price;
	private Float disc;// discount
	private Boolean avail;// available
	private String desc;// description

	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Float getDisc() {
		return disc;
	}

	public void setDisc(Float disc) {
		this.disc = disc;
	}

	public Boolean getAvail() {
		return avail;
	}

	public void setAvail(Boolean avail) {
		this.avail = avail;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
