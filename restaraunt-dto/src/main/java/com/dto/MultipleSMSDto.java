package com.dto;

import java.util.List;
/**
 * 
 * @author pooja
 *
 */
public class MultipleSMSDto extends SingleSMSDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2965292448213560389L;
	private List<String> numbers;
	
	public List<String> getNumbers() {
		return numbers;
	}
	public void setNumbers(List<String> numbers) {
		this.numbers = numbers;
	}
	
}
