package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import java.lang.Integer;
import javax.persistence.*;

import com.wisencrazy.restaraunt.datasource.entities.entity.IvrMenu;
import com.wisencrazy.restaraunt.datasource.entities.entity.RegisteredPhoneNo;

/**
 * Entity implementation class for Entity: RegisteredPhoneNumberHasDefaultIvrMenu
 *
 */
@Entity
@Table(name = "registered_phone_number_has_default_ivr_menu")
@NamedQueries({
    @NamedQuery(name = RegisteredPhoneNumberHasDefaultIvrMenu.FIND_BY_PHONE_NO, query = "SELECT r FROM RegisteredPhoneNumberHasDefaultIvrMenu r where r.phoneNumber.phoneNo=:phoneNo")})
public class RegisteredPhoneNumberHasDefaultIvrMenu implements Serializable {

    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.RegisteredPhoneNumberHasDefaultIvrMenu.";
    public static final String FIND_BY_PHONE_NO = PREFIX + "findByPhoneNo";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "phone_number_id", referencedColumnName = "id")
	private RegisteredPhoneNo phoneNumber;
	
	@ManyToOne
	@JoinColumn(name = "ivr_menu_id", referencedColumnName = "id")
	private IvrMenu ivrMenu;
	
	private static final long serialVersionUID = 1L;

	public RegisteredPhoneNumberHasDefaultIvrMenu() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public RegisteredPhoneNo getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(RegisteredPhoneNo phoneNumber) {
		this.phoneNumber = phoneNumber;
	}   
	public IvrMenu getIvrMenu() {
		return this.ivrMenu;
	}

	public void setIvrMenu(IvrMenu ivrMenu) {
		this.ivrMenu = ivrMenu;
	}
   
}
