package com.dto;
import java.io.Serializable;
import java.util.List;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
// TODO: Auto-generated Javadoc

/**
 * The Class ContactGroupDTO.
 */
@JsonIgnoreProperties(ignoreUnknown=false)
public class ContactGroupDTO  implements Serializable {
	private static final long serialVersionUID = 1L;

/** The version. */
 private String version;
 

 /** The contacts list dto. */
 private List<ContactsListDTO> contactsListDTO;


public String getVersion() {
	return version;
}


public void setVersion(String version) {
	this.version = version;
}


public List<ContactsListDTO> getContactsListDTO() {
	return contactsListDTO;
}


public void setContactsListDTO(List<ContactsListDTO> contactsListDTO) {
	this.contactsListDTO = contactsListDTO;
}
 


}
