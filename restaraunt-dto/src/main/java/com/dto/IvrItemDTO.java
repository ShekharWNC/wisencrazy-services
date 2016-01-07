package com.dto;

import java.util.List;

public class IvrItemDTO extends AbsCommonDTO {
	private static final long serialVersionUID = 1L;

	private String ivrItemType;

	private String name;
	
	private String selection;

	private List<IvrItemHasIvrActionDTO> ivrItemHasIvrActions;
	
	private List<IvrDataDTO> ivrData;

	public IvrItemDTO() {
	}

	public String getIvrItemType() {
		return this.ivrItemType;
	}

	public void setIvrItemType(String ivrItemType) {
		this.ivrItemType = ivrItemType;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getSelection() {
		return selection;
	}

	public void setSelection(String selection) {
		this.selection = selection;
	}

	public List<IvrItemHasIvrActionDTO> getIvrItemHasIvrActions() {
		return this.ivrItemHasIvrActions;
	}

	public void setIvrItemHasIvrActions(List<IvrItemHasIvrActionDTO> ivrItemHasIvrActions) {
		this.ivrItemHasIvrActions = ivrItemHasIvrActions;
	}

	public List<IvrDataDTO> getIvrData() {
		return ivrData;
	}

	public void setIvrData(List<IvrDataDTO> ivrData) {
		this.ivrData = ivrData;
	}
}