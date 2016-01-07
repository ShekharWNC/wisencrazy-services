package com.google.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties
public class GoogleProfileInfo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7434329400388231005L;

	private String kind;
	
	private String etag;
	
	private String gender;
	
	private List<EmailDTO> emails;
	
	private String objectType;
	
	private String id;
	
	private String displayName;
	
	private BasicInfoDTO name;
	
	private String url;
	
	private ImageDTO image;
	
	private Boolean isPlusUser;
	
	private String language;
	
	private String circledByCount;
	
	private Boolean verified;

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getEtag() {
		return etag;
	}

	public void setEtag(String etag) {
		this.etag = etag;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<EmailDTO> getEmails() {
		return emails;
	}

	public void setEmails(List<EmailDTO> emails) {
		this.emails = emails;
	}

	public String getObjectType() {
		return objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Boolean getIsPlusUser() {
		return isPlusUser;
	}

	public void setIsPlusUser(Boolean isPlusUser) {
		this.isPlusUser = isPlusUser;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCircledByCount() {
		return circledByCount;
	}

	public void setCircledByCount(String circledByCount) {
		this.circledByCount = circledByCount;
	}

	public Boolean getVerified() {
		return verified;
	}

	public void setVerified(Boolean verified) {
		this.verified = verified;
	}

	public BasicInfoDTO getName() {
		return name;
	}

	public void setName(BasicInfoDTO name) {
		this.name = name;
	}

	public ImageDTO getImage() {
		return image;
	}

	public void setImage(ImageDTO image) {
		this.image = image;
	}
	
}	
