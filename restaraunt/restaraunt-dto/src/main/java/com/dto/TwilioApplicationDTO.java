package com.dto;

/**
 * User: Hoa Ho
 * Date: 2/28/13
 * Time: 1:43 PM
 */
/**
 * @author ravi
 *
 */
public class TwilioApplicationDTO extends AbsCommonDTO {
    /**
	 * 
	 */
	private static final long serialVersionUID = -1818491388507897001L;
	private String companySid;
    private String twilioApplicationSid;
    private String applicationName;


    public String getTwilioApplicationSid() {
        return twilioApplicationSid;
    }

    public void setTwilioApplicationSid(String twilioApplicationSid) {
        this.twilioApplicationSid = twilioApplicationSid;
    }

	public String getCompanySid() {
		return companySid;
	}

	public void setCompanySid(String companySid) {
		this.companySid = companySid;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

}
