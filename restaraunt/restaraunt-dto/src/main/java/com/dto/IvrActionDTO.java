package com.dto;

import java.util.List;

public class IvrActionDTO extends AbsCommonDTO {
	private static final long serialVersionUID = 1L;

	private String name;
	
	private String ivrActionType;

	private IvrServiceUnitDTO ivrServiceUnit;

	private List<IvrAnnouncementDTO> ivrAnnouncements;

	private List<IvrParamDTO> ivrParams;

	private List<IvrRecordDTO> ivrRecords;
	
	private IvrCommandDTO ivrCommand;

	public IvrActionDTO() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIvrActionType() {
		return ivrActionType;
	}

	public void setIvrActionType(String ivrActionType) {
		this.ivrActionType = ivrActionType;
	}

	public IvrServiceUnitDTO getIvrServiceUnit() {
		return this.ivrServiceUnit;
	}

	public void setIvrServiceUnit(IvrServiceUnitDTO ivrServiceUnit) {
		this.ivrServiceUnit = ivrServiceUnit;
	}

	public List<IvrAnnouncementDTO> getIvrAnnouncements() {
		return this.ivrAnnouncements;
	}

	public void setIvrAnnouncements(List<IvrAnnouncementDTO> ivrAnnouncements) {
		this.ivrAnnouncements = ivrAnnouncements;
	}

	public List<IvrParamDTO> getIvrParams() {
		return this.ivrParams;
	}

	public void setIvrParams(List<IvrParamDTO> ivrParams) {
		this.ivrParams = ivrParams;
	}

	public List<IvrRecordDTO> getIvrRecords() {
		return this.ivrRecords;
	}

	public void setIvrRecords(List<IvrRecordDTO> ivrRecords) {
		this.ivrRecords = ivrRecords;
	}

	public IvrCommandDTO getIvrCommand() {
		return ivrCommand;
	}

	public void setIvrCommand(IvrCommandDTO ivrCommand) {
		this.ivrCommand = ivrCommand;
	}
}