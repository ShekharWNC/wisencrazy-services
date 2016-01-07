package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: CompanyHasAttachmentLibrary
 *
 */
@Entity
@Table(name="company_has_attachment_library")
public class CompanyHasAttachmentLibrary extends AbsBaseEntity {
	
	private static final long serialVersionUID = 1L;

	public CompanyHasAttachmentLibrary() {
		
	}
	@ManyToOne(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="company_id", referencedColumnName = "id")
	private Company company;
	@ManyToOne(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="audioclip_library_id", referencedColumnName = "id")
	private AttachmentLibrary audioClipLibrary;

	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public AttachmentLibrary getAudioClipLibrary() {
		return audioClipLibrary;
	}
	public void setAudioClipLibrary(AttachmentLibrary audioClipLibrary) {
		this.audioClipLibrary = audioClipLibrary;
	}
	
}
