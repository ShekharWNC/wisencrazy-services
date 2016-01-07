package com.dto;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the consultant_profile database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ConsultantProfileDTO extends AbsCommonDTO implements ProfilesDTO, Serializable {
	private static final long serialVersionUID = 1L;

	private String firstName;
	
	private String lastName;

	private String consultantId = "";

	private Date endDate = null;

	private String officialContactNo = "";

	private String officialEmailId = "";

	private Date startDate = null;
	
	private String invitationSentTo;
	
	//bi-directional many-to-one association to VirtualAccount
	private VirtualAccountDTO virtualAccount = null;

	public ConsultantProfileDTO(String consultantId, Date endDate,
			String officialContactNo, String officialEmailId, Date startDate,
			VirtualAccountDTO virtualAccount) {
		super();
		this.consultantId = consultantId;
		this.endDate = endDate;
		this.officialContactNo = officialContactNo;
		this.officialEmailId = officialEmailId;
		this.startDate = startDate;
		this.virtualAccount = virtualAccount;
	}

	public ConsultantProfileDTO() {
	}
	public String getConsultantId() {
		return this.consultantId;
	}

	public void setConsultantId(String consultantId) {
		this.consultantId = consultantId;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getOfficialContactNo() {
		return this.officialContactNo;
	}

	public void setOfficialContactNo(String officialContactNo) {
		this.officialContactNo = officialContactNo;
	}

	public String getOfficialEmailId() {
		return this.officialEmailId;
	}

	public void setOfficialEmailId(String officialEmailId) {
		this.officialEmailId = officialEmailId;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public VirtualAccountDTO getVirtualAccount() {
		return this.virtualAccount;
	}

	public void setVirtualAccount(VirtualAccountDTO virtualAccount) {
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

	public String getInvitationSentTo() {
		return invitationSentTo;
	}

	public void setInvitationSentTo(String invitationSentTo) {
		this.invitationSentTo = invitationSentTo;
	}

	@Override
	public String toString() {
		return "ConsultantProfileDTO [firstName=" + firstName + ", lastName="
				+ lastName + ", consultantId=" + consultantId + ", endDate="
				+ endDate + ", officialContactNo=" + officialContactNo
				+ ", officialEmailId=" + officialEmailId + ", startDate="
				+ startDate + ", invitationSentTo=" + invitationSentTo
				+ ", virtualAccount=" + virtualAccount + "]";
	}
	
	
}