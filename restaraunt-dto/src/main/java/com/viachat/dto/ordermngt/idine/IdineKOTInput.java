package com.viachat.dto.ordermngt.idine;

import java.io.Serializable;

public class IdineKOTInput implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -735980623106661708L;
	private IdineOrderInput idineOrderInput;
	private String KOTString;
	private String KOTStatus;
	
	public IdineKOTInput() {
	}

	public String getKOTString() {
		return KOTString;
	}

	public void setKOTString(String kOTString) {
		KOTString = kOTString;
	}

	public String getKOTStatus() {
		return KOTStatus;
	}

	public void setKOTStatus(String kOTStatus) {
		KOTStatus = kOTStatus;
	}
	/**
	 * @return the idineOrderInput
	 */
	public IdineOrderInput getIdineOrderInput() {
		return idineOrderInput;
	}

	/**
	 * @param idineOrderInput the idineOrderInput to set
	 */
	public void setIdineOrderInput(IdineOrderInput idineOrderInput) {
		this.idineOrderInput = idineOrderInput;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("IdineKOTInput [getKOTString()=");
		builder.append(getKOTString());
		builder.append(", getKOTStatus()=");
		builder.append(getKOTStatus());
		builder.append(", getIdineOrderInput()=");
		builder.append(getIdineOrderInput());
		builder.append("]");
		return builder.toString();
	}
	
	
}
