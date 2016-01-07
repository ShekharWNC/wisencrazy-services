package com.dto;

/**
 * User:RaviTeja
 * Date: 2/28/13
 * Time: 1:45 PM
 */
public class TwilioSupportedCountryDTO extends AbsCommonDTO{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String isoCode2;
    private String name;
    
    private String isoCode3;
    
    private String telCode;
    
    private boolean areaCode;
    
    private boolean tollfree;
    
    private boolean multiSupport;
    
    private boolean eserveSupport;
    
    public TwilioSupportedCountryDTO(){
    	
    }

	public String getIsoCode2() {
		return isoCode2;
	}

	public void setIsoCode2(String isoCode2) {
		this.isoCode2 = isoCode2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	public String toString() {
		return "TwilioSupportedCountryDTO [isoCode2=" + isoCode2 + ", name="
				+ name + ", isoCode3=" + isoCode3 + ", telCode=" + telCode
				+ ", areaCode=" + areaCode + ", tollfree=" + tollfree
				+ ", multiSupport=" + multiSupport + ", eserveSupport="
				+ eserveSupport + "]";
	}
}
