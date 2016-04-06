package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dto.AbstractCommonDTO;

@MappedSuperclass
public abstract class AbsBaseEntity extends AbsCompositeEntity {
	
	private static final Logger logger = LoggerFactory.getLogger(AbsBaseEntity.class);
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3674555085287246933L;
	public  static final int ONE=1;
	public  static final int TWO=2;
	public  static final int THREE=3;
	public  static final int FOUR=4;
	public  static final int FIVE=5;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}

	
	/*@Override
	public int hashCode() {
		return id.hashCode();
	}*/

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof AbsBaseEntity)) {
			return false;
		}
		AbsBaseEntity other = (AbsBaseEntity) obj;
		return getId().equals(other.getId());
	}
}
