package com.dto;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the employee_profile database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class EmployeeProfileDTO extends AbsCommonDTO implements ProfilesDTO, Serializable {
	private static final long serialVersionUID = 1L;

	
	private String firstName;
	
	private String lastName;

	private String email = "";

	private String employeeId = "";

	private Date endDate = null;

	private Date startDate = null;

	private byte status = 0;
	
	private String invitationSentTo;
	
	private int virtualAccountId = 0;
	
	public int getVirtualAccountId() {
		return virtualAccountId;
	}

	public void setVirtualAccountId(int virtualAccountId) {
		this.virtualAccountId = virtualAccountId;
	}

	//bi-directional many-to-one association to VirtualAccount
	private VirtualAccountDTO virtualAccount;

	public EmployeeProfileDTO() {
	}

	public EmployeeProfileDTO(String email, String employeeId,
			Date endDate, Date startDate, byte status,
			VirtualAccountDTO virtualAccount) {
		super();
		this.email = email;
		this.employeeId = employeeId;
		this.endDate = endDate;
		this.startDate = startDate;
		this.status = status;
		this.virtualAccount = virtualAccount;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public String getInvitationSentTo() {
		return invitationSentTo;
	}

	public void setInvitationSentTo(String invitationSentTo) {
		this.invitationSentTo = invitationSentTo;
	}

	public VirtualAccountDTO getVirtualAccount() {
		return this.virtualAccount;
	}

	public void setVirtualAccount(VirtualAccountDTO virtualAccount) {
		this.virtualAccount = virtualAccount;
	}

	@Override
	public String toString() {
		return "EmployeeProfileDTO [firstName=" + firstName + ", lastName="
				+ lastName + ", email=" + email + ", employeeId=" + employeeId
				+ ", endDate=" + endDate + ", startDate=" + startDate
				+ ", status=" + status + ", invitationSentTo="
				+ invitationSentTo + ", virtualAccountId=" + virtualAccountId
				+ ", virtualAccount=" + virtualAccount + "]";
	}


}