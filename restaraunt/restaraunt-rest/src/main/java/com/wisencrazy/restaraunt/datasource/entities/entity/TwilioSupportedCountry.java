package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * User: Hoa Ho
 * Date: 2/28/13
 * Time: 1:36 PM
 */
@Entity
@Table(name = "twilio_supported_country")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = TwilioSupportedCountry.FIND_ALL, query = "SELECT t FROM TwilioSupportedCountry t"),
        @NamedQuery(name = TwilioSupportedCountry.FIND_BY_COUNTRY_CODE2, query = "SELECT t FROM TwilioSupportedCountry t WHERE t.countryCode2 = :countryCode2"),
        @NamedQuery(name = TwilioSupportedCountry.FIND_BY_COUNTRY, query = "SELECT t FROM TwilioSupportedCountry t WHERE t.country = :country")})
public class TwilioSupportedCountry {
    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.TwilioSupportedCountryTO.";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_COUNTRY_CODE2 = PREFIX + "findByCountryCode2";
    public static final String FIND_BY_COUNTRY = PREFIX + "findByCountry";

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "country_code_2")
    private String countryCode2;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "country")
    private String country;
    
    @Column(name = "iso_code3")
    private String isoCode3;
    
    @Column(name = "tel_code")
    private String telCode;
    
    @Column(name = "area_code")
    private boolean areaCode;
    
    @Column(name = "tollfree")
    private boolean tollfree;
    
    @Column(name = "is_multi_support")
    private boolean multiSupport;
    
    @Column(name = "is_eserve_supported")
    private boolean eserveSupport;

    public TwilioSupportedCountry() {
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getCountryCode2() {
		return countryCode2;
	}

	public void setCountryCode2(String countryCode2) {
		this.countryCode2 = countryCode2;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setName(String name) {
		this.country = name;
	}

	public String getIsoCode3() {
		return isoCode3;
	}

	public void setIsoCode3(String isoCode3) {
		this.isoCode3 = isoCode3;
	}

	public String getTelCode() {
		return telCode;
	}

	public void setTelCode(String telCode) {
		this.telCode = telCode;
	}

	public boolean getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(boolean areaCode) {
		this.areaCode = areaCode;
	}

	public boolean getTollfree() {
		return tollfree;
	}

	public void setTollfree(boolean tollfree) {
		this.tollfree = tollfree;
	}

	public boolean isMultiSupport() {
		return multiSupport;
	}

	public void setMultiSupport(boolean multiSupport) {
		this.multiSupport = multiSupport;
	}

	public boolean isEserveSupport() {
		return eserveSupport;
	}

	public void setEserveSupport(boolean eserveSupport) {
		this.eserveSupport = eserveSupport;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (areaCode ? 1231 : 1237);
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result
				+ ((countryCode2 == null) ? 0 : countryCode2.hashCode());
		result = prime * result + (eserveSupport ? 1231 : 1237);
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((isoCode3 == null) ? 0 : isoCode3.hashCode());
		result = prime * result + (multiSupport ? 1231 : 1237);
		result = prime * result + ((telCode == null) ? 0 : telCode.hashCode());
		result = prime * result + (tollfree ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TwilioSupportedCountry other = (TwilioSupportedCountry) obj;
		if (areaCode != other.areaCode)
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (countryCode2 == null) {
			if (other.countryCode2 != null)
				return false;
		} else if (!countryCode2.equals(other.countryCode2))
			return false;
		if (eserveSupport != other.eserveSupport)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isoCode3 == null) {
			if (other.isoCode3 != null)
				return false;
		} else if (!isoCode3.equals(other.isoCode3))
			return false;
		if (multiSupport != other.multiSupport)
			return false;
		if (telCode == null) {
			if (other.telCode != null)
				return false;
		} else if (!telCode.equals(other.telCode))
			return false;
		if (tollfree != other.tollfree)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TwilioSupportedCountry [id=" + id + ", countryCode2="
				+ countryCode2 + ", country=" + country + ", isoCode3="
				+ isoCode3 + ", telCode=" + telCode + ", areaCode=" + areaCode
				+ ", tollfree=" + tollfree + ", multiSupport=" + multiSupport
				+ ", eserveSupport=" + eserveSupport + "]";
	}
}

