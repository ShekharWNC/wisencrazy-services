package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * The persistent class for the company database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class CompanyDTO extends CompanyBasicDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1006985488460944006L;
	
	private String companyId;
	
	private String primaryContactName;
    private String primaryContactPhone;
    private String primaryContactMobile;
    private String primaryContactEmail;

	//bi-directional many-to-one association to ClientBusinessProfile
	private List<ClientBusinessProfileDTO> clientBuisnessProfiles;

	//bi-directional many-to-one association to IndustryType
	private IndustryTypeDTO industryType;

	//bi-directional many-to-one association to CompanyHasAddress
	private List<CompanyHasAddressDTO> companyHasAddresses;
	
	private List<CompanyContactDTO> companyContacts;
	
	private List<CompanyHasSocialNetworkDTO> companyHasSocialNetworks;

	//bi-directional many-to-one association to Project
	private List<ProjectDTO> projects;

	//bi-directional many-to-one association to ProviderBuisnessProfile
	private List<ProviderBusinessProfileDTO> providerBusinessProfiles;

	//bi-directional many-to-one association to UserHasExperience
	private List<UserHasExperienceDTO> userHasExperiences;

	//bi-directional many-to-one association to VirtualAccount
	private List<VirtualAccountDTO> virtualAccounts;
	
	//bi-directional many-to-one association to VirtualAccount
	private List<UserHasInvitationDTO> invitations;
	
	/*private List<TemplateDTO> template;*/
	
	 /** The company has packages. */
	private List<CompanyHasPackageDTO> companyHasPackages;
	
	private List<CompanyHasPlaceDetailsDTO> companyHasPlaceDetails;
	
	private String header;
	
	private String footer;

	public CompanyDTO() {
	}

	
	public String getCompanyId() {
		return companyId;
	}


	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}


	public String getPrimaryContactName() {
		return primaryContactName;
	}

	public void setPrimaryContactName(String primaryContactName) {
		this.primaryContactName = primaryContactName;
	}

	public String getPrimaryContactPhone() {
		return primaryContactPhone;
	}

	public void setPrimaryContactPhone(String primaryContactPhone) {
		this.primaryContactPhone = primaryContactPhone;
	}

	public String getPrimaryContactMobile() {
		return primaryContactMobile;
	}

	public void setPrimaryContactMobile(String primaryContactMobile) {
		this.primaryContactMobile = primaryContactMobile;
	}

	public String getPrimaryContactEmail() {
		return primaryContactEmail;
	}

	public void setPrimaryContactEmail(String primaryContactEmail) {
		this.primaryContactEmail = primaryContactEmail;
	}

	public List<ClientBusinessProfileDTO> getClientBusinessProfiles() {
		return this.clientBuisnessProfiles;
	}

	public void setClientBusinessProfiles(List<ClientBusinessProfileDTO> clientBuisnessProfiles) {
		this.clientBuisnessProfiles = clientBuisnessProfiles;
	}


	public IndustryTypeDTO getIndustryType() {
		return this.industryType;
	}

	public void setIndustryType(IndustryTypeDTO industryType) {
		this.industryType = industryType;
	}

	public List<CompanyHasAddressDTO> getCompanyHasAddresses() {
		return this.companyHasAddresses;
	}

	public void setCompanyHasAddresses(List<CompanyHasAddressDTO> companyHasAddresses) {
		this.companyHasAddresses = companyHasAddresses;
	}

	public List<CompanyContactDTO> getCompanyContacts() {
		return companyContacts;
	}

	public void setCompanyContacts(List<CompanyContactDTO> companyContacts) {
		this.companyContacts = companyContacts;
	}

	public List<CompanyHasSocialNetworkDTO> getCompanyHasSocialNetworks() {
		return companyHasSocialNetworks;
	}

	public void setCompanyHasSocialNetworks(
			List<CompanyHasSocialNetworkDTO> companyHasSocialNetworks) {
		this.companyHasSocialNetworks = companyHasSocialNetworks;
	}

	public List<ProjectDTO> getProjects() {
		return this.projects;
	}

	public void setProjects(List<ProjectDTO> projects) {
		this.projects = projects;
	}

	public List<ProviderBusinessProfileDTO> getProviderBusinessProfiles() {
		return this.providerBusinessProfiles;
	}

	public void setProviderBusinessProfiles(List<ProviderBusinessProfileDTO> providerBusinessProfiles) {
		this.providerBusinessProfiles = providerBusinessProfiles;
	}

	public List<UserHasExperienceDTO> getUserHasExperiences() {
		return this.userHasExperiences;
	}

	public void setUserHasExperiences(List<UserHasExperienceDTO> userHasExperiences) {
		this.userHasExperiences = userHasExperiences;
	}

	public UserHasExperienceDTO addUserHasExperience(UserHasExperienceDTO userHasExperience) {
		getUserHasExperiences().add(userHasExperience);
		userHasExperience.setCompany(this);

		return userHasExperience;
	}

	public UserHasExperienceDTO removeUserHasExperience(UserHasExperienceDTO userHasExperience) {
		getUserHasExperiences().remove(userHasExperience);
		userHasExperience.setCompany(null);

		return userHasExperience;
	}

	public List<VirtualAccountDTO> getVirtualAccounts() {
		return this.virtualAccounts;
	}

	public void setVirtualAccounts(List<VirtualAccountDTO> virtualAccounts) {
		this.virtualAccounts = virtualAccounts;
	}

	public VirtualAccountDTO addVirtualAccount(VirtualAccountDTO virtualAccount) {
		getVirtualAccounts().add(virtualAccount);
		virtualAccount.setCompany(this);

		return virtualAccount;
	}

	public VirtualAccountDTO removeVirtualAccount(VirtualAccountDTO virtualAccount) {
		getVirtualAccounts().remove(virtualAccount);
		virtualAccount.setCompany(null);

		return virtualAccount;
	}
    
	public List<CompanyHasPlaceDetailsDTO> getCompanyHasPlaceDetails() {
		return companyHasPlaceDetails;
	}


	public void setCompanyHasPlaceDetails(
			List<CompanyHasPlaceDetailsDTO> companyHasPlaceDetails) {
		this.companyHasPlaceDetails = companyHasPlaceDetails;
	}


	@Override
	public String toString() {
		return "CompanyDTO [clientBuisnessProfiles="
				+ clientBuisnessProfiles + ", industryType=" + industryType
				+ ", companyHasAddresses=" + companyHasAddresses
				+ ", projects=" + projects + ", providerBusinessProfiles="
				+ providerBusinessProfiles + ", userHasExperiences="
				+ userHasExperiences + ", virtualAccounts=" + virtualAccounts
				+ ", invitations=" + invitations + "]";
	}

	public List<UserHasInvitationDTO> getInvitations() {
		return invitations;
	}

	public void setInvitations(List<UserHasInvitationDTO> invitations) {
		this.invitations = invitations;
	}


	public List<CompanyHasPackageDTO> getCompanyHasPackages() {
		return companyHasPackages;
	}


	public void setCompanyHasPackages(List<CompanyHasPackageDTO> companyHasPackages) {
		this.companyHasPackages = companyHasPackages;
	}


	public String getHeader() {
		return header;
	}


	public void setHeader(String header) {
		this.header = header;
	}


	public String getFooter() {
		return footer;
	}


	public void setFooter(String footer) {
		this.footer = footer;
	}
}