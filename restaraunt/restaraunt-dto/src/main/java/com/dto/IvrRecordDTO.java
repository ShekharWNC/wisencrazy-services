package com.dto;


public class IvrRecordDTO extends AbsCommonDTO {
	private static final long serialVersionUID = 1L;

	private String finishKey;

	private int length;

	public IvrRecordDTO() {
	}

	public String getFinishKey() {
		return this.finishKey;
	}

	public void setFinishKey(String finishKey) {
		this.finishKey = finishKey;
	}

	public int getLength() {
		return this.length;
	}

	public void setLength(int length) {
		this.length = length;
	}
}