package com.dto;

import java.io.Serializable;
import java.util.List;

public class ProjectScheduleDTO  extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String endDate;

	private String noOfShifts;

	private ProjectDTO project;
	
	private String scheduleName;

	private String startDate;
	
	private String scheduleRepeatsBy;

	private List<ScheduleRepeatsOnDTO> scheduleRepeatsOn;
	
	private List<ProjectScheduleHasShiftDTO> projectScheduleHasShifts;

	public ProjectScheduleDTO() {
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getNoOfShifts() {
		return this.noOfShifts;
	}

	public void setNoOfShifts(String noOfShifts) {
		this.noOfShifts = noOfShifts;
	}

	public ProjectDTO getProject() {
		return this.project;
	}

	public void setProject(ProjectDTO project) {
		this.project = project;
	}

	public String getScheduleName() {
		return this.scheduleName;
	}

	public void setScheduleName(String scheduleName) {
		this.scheduleName = scheduleName;
	}
	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public List<ProjectScheduleHasShiftDTO> getProjectScheduleHasShifts() {
		return this.projectScheduleHasShifts;
	}

	public void setProjectScheduleHasShifts(List<ProjectScheduleHasShiftDTO> projectScheduleHasShifts) {
		this.projectScheduleHasShifts = projectScheduleHasShifts;
	}

	public String getScheduleRepeatsBy() {
		return scheduleRepeatsBy;
	}

	public void setScheduleRepeatsBy(String scheduleRepeatedBy) {
		this.scheduleRepeatsBy = scheduleRepeatedBy;
	}

	public List<ScheduleRepeatsOnDTO> getScheduleRepeatsOn() {
		return scheduleRepeatsOn;
	}

	public void setScheduleRepeatsOn(List<ScheduleRepeatsOnDTO> scheduleRepeatsOn) {
		this.scheduleRepeatsOn = scheduleRepeatsOn;
	}
}