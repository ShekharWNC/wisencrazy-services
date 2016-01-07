package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
/**
 * 
 * @author Vikash Pandey
 *
 */
@Entity
public class CaseStatistics implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1464877688904462673L;
	@Id
	private String id;
	private String name;
	private Integer count;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
}
