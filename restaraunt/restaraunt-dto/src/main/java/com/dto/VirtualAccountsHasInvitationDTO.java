package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the virtual_accounts_has_invitation database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class VirtualAccountsHasInvitationDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to UserHasInvitation
	private UserHasInvitationDTO userHasInvitation;

	//bi-directional many-to-one association to VirtualAccount
	private VirtualAccountDTO virtualAccount;

	public VirtualAccountsHasInvitationDTO() {
	}

	public VirtualAccountsHasInvitationDTO(
			UserHasInvitationDTO userHasInvitation, VirtualAccountDTO virtualAccount) {
		super();
		this.userHasInvitation = userHasInvitation;
		this.virtualAccount = virtualAccount;
	}
	public UserHasInvitationDTO getUserHasInvitation() {
		return this.userHasInvitation;
	}

	public void setUserHasInvitation(UserHasInvitationDTO userHasInvitation) {
		this.userHasInvitation = userHasInvitation;
	}

	public VirtualAccountDTO getVirtualAccount() {
		return this.virtualAccount;
	}

	public void setVirtualAccount(VirtualAccountDTO virtualAccount) {
		this.virtualAccount = virtualAccount;
	}

}