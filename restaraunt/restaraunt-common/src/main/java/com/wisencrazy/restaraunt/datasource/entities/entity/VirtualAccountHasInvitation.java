package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the virtual_account_has_invitation database table.
 * 
 */
@Entity
@Table(name="virtual_account_has_invitation")
public class VirtualAccountHasInvitation extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to UserHasInvitation
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name="user_invitation_id")
	private UserHasInvitation userHasInvitation;

	//bi-directional many-to-one association to VirtualAccount
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name="virtual_account_id")
	private VirtualAccount virtualAccount;

	public VirtualAccountHasInvitation() {
	}

	public UserHasInvitation getUserHasInvitation() {
		return this.userHasInvitation;
	}

	public void setUserHasInvitation(UserHasInvitation userHasInvitation) {
		this.userHasInvitation = userHasInvitation;
	}

	public VirtualAccount getVirtualAccount() {
		return this.virtualAccount;
	}

	public void setVirtualAccount(VirtualAccount virtualAccount) {
		this.virtualAccount = virtualAccount;
	}

}