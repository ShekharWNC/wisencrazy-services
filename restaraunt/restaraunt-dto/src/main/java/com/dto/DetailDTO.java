package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class DetailDTO extends AbsCommonDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String timer;
	private List<ActionOptionDTO> actionOptions;

	public DetailDTO() {
	}

	public String getTimer() {
		return timer;
	}

	public void setTimer(String timer) {
		this.timer = timer;
	}

	public List<ActionOptionDTO> getActionOptions() {
		return actionOptions;
	}

	public void setActionOptions(List<ActionOptionDTO> actionOptions) {
		this.actionOptions = actionOptions;
	}
}