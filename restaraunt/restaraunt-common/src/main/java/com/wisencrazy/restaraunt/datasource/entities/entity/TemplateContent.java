package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="template_content")
public class TemplateContent extends AbsBaseEntity {
    /**
	 * 
	 */
	private static final long serialVersionUID = -1155334974320305850L;
	@Column(name="template_content") 
	private String templateContent;
	
	@ManyToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
	@JoinColumn(name = "channel_id")
	private Channel channel;
	
	@JoinTable(name = "template_content_has_place_holder", joinColumns = {
            @JoinColumn(name = "template_content_id", referencedColumnName = "id")}, inverseJoinColumns = {
            @JoinColumn(name = "place_holder_id", referencedColumnName = "id")})
    @ManyToMany
    private List<PlaceHolder> placeHolder;
	
	@Column(name="other")
	private String other;
	
	@JoinColumn(name = "audio_library_id", referencedColumnName = "id")
    @ManyToOne
    private AttachmentLibrary audioClipLibrary;
	
	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public AttachmentLibrary getAudioClipLibrary() {
		return audioClipLibrary;
	}

	public void setAudioClipLibrary(AttachmentLibrary audioClipLibrary) {
		this.audioClipLibrary = audioClipLibrary;
	}

	public String getTemplateContent() {
		return templateContent;
	}

	public void setTemplateContent(String templateContent) {
		this.templateContent = templateContent;
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	public List<PlaceHolder> getPlaceHolder() {
		return placeHolder;
	}

	public void setPlaceHolder(List<PlaceHolder> placeHolder) {
		this.placeHolder = placeHolder;
	}
	@Override
	public int hashCode() {
	    int hash = 0;
	    hash += (id != null ? id.hashCode() : 0);
	    return hash;
	}

	@Override
	public boolean equals(Object object) {
	    if (!(object instanceof TemplateContent)) {
	        return false;
	    }
	    TemplateContent other = (TemplateContent) object;
	    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
	        return false;
	    }
	    return true;
	}
	@Override
	public String toString() {
	    return "com.callcomm.eserve.persistence.entity.TemplateContent[ id=" + id + " ]";
	}
}

