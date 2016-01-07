package com.dto;

import java.util.List;

public class VisualConnectHasGroupDTO extends AbsCommonDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3263477126797667870L;

	private String groupName;
	
	private String tableId;
	
	private List<CustomTrackingVariableDTO> customTrackingVariables;

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getTableId() {
		return tableId;
	}

	public void setTableId(String tableId) {
		this.tableId = tableId;
	}

	public List<CustomTrackingVariableDTO> getCustomTrackingVariables() {
		return customTrackingVariables;
	}

	public void setCustomTrackingVariables(
			List<CustomTrackingVariableDTO> customTrackingVariables) {
		this.customTrackingVariables = customTrackingVariables;
	}
}
