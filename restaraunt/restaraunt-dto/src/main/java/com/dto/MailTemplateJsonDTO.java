/**
 * 
 */
package com.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class MailTemplateJsonDTO extends AbsCommonDTO implements Serializable  {

	private Map<String, String> directFields = new LinkedHashMap<String, String>();
	private List<Map<String,String>> tables = new ArrayList<Map<String,String>>();
	
	public Map<String, String> getDirectFields() {
		return directFields;
	}
	public void setDirectFields(Map<String, String> directFields) {
		this.directFields = directFields;
	}
	public List<Map<String, String>> getTables() {
		return tables;
	}
	public void setTables(List<Map<String, String>> tables) {
		this.tables = tables;
	}
}

