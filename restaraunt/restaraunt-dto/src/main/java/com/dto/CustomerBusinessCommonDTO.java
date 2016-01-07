package com.dto;

public class CustomerBusinessCommonDTO extends AbsCommonDTO {
	private static final long serialVersionUID = 1L;
	
	private String accountName;
	
	private String href;
	
	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}
	
	
}
