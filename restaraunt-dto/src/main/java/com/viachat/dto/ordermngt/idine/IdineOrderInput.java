package com.viachat.dto.ordermngt.idine;

import java.io.Serializable;

import com.viachat.dto.ordermngt.core.CoreOrderInput;

public class IdineOrderInput implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7620840787699940301L;
	
	private CoreOrderInput coreOrderInput;
	private String tableSid;
	private String tableName;
	private String tableStatus;
	public IdineOrderInput() {
	}

	/**
	 * @return the coreOrderInput
	 */
	public CoreOrderInput getCoreOrderInput() {
		return coreOrderInput;
	}


	/**
	 * @param coreOrderInput the coreOrderInput to set
	 */
	public void setCoreOrderInput(CoreOrderInput coreOrderInput) {
		this.coreOrderInput = coreOrderInput;
	}


	/**
	 * @return the tableSid
	 */
	public String getTableSid() {
		return tableSid;
	}


	/**
	 * @param tableSid the tableSid to set
	 */
	public void setTableSid(String tableSid) {
		this.tableSid = tableSid;
	}

	
	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	
	public String getTableStatus() {
		return tableStatus;
	}

	public void setTableStatus(String tableStatus) {
		this.tableStatus = tableStatus;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("IdineOrderInput [coreOrderInput=");
		builder.append(coreOrderInput);
		builder.append(", tableSid=");
		builder.append(tableSid);
		builder.append(", tableName=");
		builder.append(tableName);
		builder.append(", invoiceBasicDetails=");
		builder.append("]");
		return builder.toString();
	}

	
	

	}
