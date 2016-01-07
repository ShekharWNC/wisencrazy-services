package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the customer_has_app_settings database table.
 * 
 */
@Entity
@Table(name="customer_has_app_settings")
@NamedQueries({
	@NamedQuery(name=CustomerHasAppSetting.FIND_BY_SETTINGS_SID, query="SELECT c FROM CustomerHasAppSetting c where hex(c.sid) = :sid"),
	@NamedQuery(name = CustomerHasAppSetting.FIND_APP_SETTINGS_BY_SID, query = " from CustomerHasAppSetting c where c.customerAppSettingId.version = :version"
			+ " and c.customerAppSettingId.device = :device and c.customerAppSettingId.userId = :id")
	
})
public class CustomerHasAppSetting extends AbsCompositeEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private static final String PREFIX = "com.callcomm.eserve.persistence.entity.CustomerHasAppSetting.";
	
	public static final String FIND_BY_SETTINGS_SID = PREFIX + "findBySettingSid";

	public static final String FIND_APP_SETTINGS_BY_SID = PREFIX + "findCustomerSettingsBySid";

	@EmbeddedId
	private CustomerHasAppSettingPK customerAppSettingId;

	private Boolean enabled;

	private int id;

	public CustomerHasAppSetting() {
	}

	public CustomerHasAppSettingPK getCustomerAppSettingId() {
		return customerAppSettingId;
	}

	public void setCustomerAppSettingId(CustomerHasAppSettingPK customerAppSettingId) {
		this.customerAppSettingId = customerAppSettingId;
	}


	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
}