package com.dto;

import com.dto.VisualConnectDTO.OperationMode;
import com.dto.VisualConnectDTO.UserInterfaceMode;

/**
 * The dto view class for the VisualConnectSummary entity.
 * 
 * @author Krish Lakshmanan
 */
public class VisualConnectSummaryDTO extends AbsCommonDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3177977806655589078L;

	private String name;

	private boolean status;

	private OperationMode operationMode;

	private UserInterfaceMode userInterfaceMode;

	public VisualConnectSummaryDTO() {
	}

	public String getName() {
		return name;
	}

	public boolean getStatus() {
		return status;
	}

	public OperationMode getOperationMode() {
		return operationMode;
	}

	public UserInterfaceMode getUserInterfaceMode() {
		return userInterfaceMode;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void setOperationMode(OperationMode operationMode) {
		this.operationMode = operationMode;
	}

	public void setUserInterfaceMode(UserInterfaceMode userInterfaceMode) {
		this.userInterfaceMode = userInterfaceMode;
	}
}