package com.dto.core.ordermanagement;
import com.dto.AbsCommonDTO;


/**
 * The dto class for the business_catogory database table.
 * 
 */
public class BusinessCategoryDTO extends AbsCommonDTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3949247290375696357L;

	private String description;

	private String name;


	public BusinessCategoryDTO() {
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BusinessCategoryDTO [description=");
		builder.append(description);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

	

}