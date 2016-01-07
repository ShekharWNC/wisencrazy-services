package com.viachat.dto.ordermngt.core;

import java.io.Serializable;

public class CoreOrderInput implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1557304833686366862L;
	private String companySid;
	private String projectSid;
	private String customerSid;
	private String agentSid;
	private String orderSid;

	public CoreOrderInput() {
	}

	/**
	 * @return the companySid
	 */
	public String getCompanySid() {
		return companySid;
	}

	/**
	 * @param companySid the companySid to set
	 */
	public void setCompanySid(String companySid) {
		this.companySid = companySid;
	}

	public String getProjectSid() {
		return projectSid;
	}

	public void setProjectSid(String projectSid) {
		this.projectSid = projectSid;
	}

	public String getCustomerSid() {
		return customerSid;
	}

	public void setCustomerSid(String customerSid) {
		this.customerSid = customerSid;
	}

	public String getAgentSid() {
		return agentSid;
	}

	public void setAgentSid(String agentSid) {
		this.agentSid = agentSid;
	}

	public String getOrderSid() {
		return orderSid;
	}

	public void setOrderSid(String orderSid) {
		this.orderSid = orderSid;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CoreOrderInput [getCompanySid()=");
		builder.append(getCompanySid());
		builder.append(", getProjectSid()=");
		builder.append(getProjectSid());
		builder.append(", getCustomerSid()=");
		builder.append(getCustomerSid());
		builder.append(", getAgentSid()=");
		builder.append(getAgentSid());
		builder.append(", getOrderSid()=");
		builder.append(getOrderSid());
		builder.append("]");
		return builder.toString();
	}


}
