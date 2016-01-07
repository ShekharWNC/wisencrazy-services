/**
 * 
 */
package com.dto;

import java.util.ArrayList;
import java.util.List;

import com.dto.VisualConnectDTO.OperationMode;
import com.dto.VisualConnectDTO.UserInterfaceMode;

/**
 * The dto class for the VisualConnectSettings entity.
 * 
 * @author Krish Lakshmanan
 * 
 */
public class VisualConnectSettingsDTO extends AbsCommonDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2087267440732063681L;

	private int maxChats;

	private boolean enabled;

	private List<OperationMode> supportedOperationModes = new ArrayList<VisualConnectDTO.OperationMode>();

	private List<UserInterfaceMode> supportedUserInterfaceModes = new ArrayList<VisualConnectDTO.UserInterfaceMode>();

	public int getMaxChats() {
		return maxChats;
	}

	public boolean getEnabled() {
		return enabled;
	}

	public List<OperationMode> getSupportedOperationModes() {
		return supportedOperationModes;
	}

	public List<UserInterfaceMode> getSupportedUserInterfaceModes() {
		return supportedUserInterfaceModes;
	}

	public void setMaxChats(int maxChats) {
		this.maxChats = maxChats;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public void setSupportedOperationModes(
			List<OperationMode> supportedOperationModes) {
		this.supportedOperationModes = supportedOperationModes;
	}

	public void setSupportedUserInterfaceModes(
			List<UserInterfaceMode> supportedUserInterfaceModes) {
		this.supportedUserInterfaceModes = supportedUserInterfaceModes;
	}

}
