package com.wisencrazy.restaraunt.datasource.entities.to;

import java.io.Serializable;

public class OutboundEmailInfo implements Serializable {
	   /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		/** The email subject. */
	    private String emailSubject;
	    
	    /** The email from address. */
	    private String emailFromAddress;
	    
	    /** The email to address. */
	    private String emailToAddress;//Comma Separated list
	    
	    /** The email cc list. */
	    private String emailCCList;//Comma separated list
	    
	    /** The email bcc list. */
	    private String emailBccList;//Comma separated List
	    
	    /** The email body content. */
	    private String emailBodyContent;
	    
	    /** The email id. */
	    private String emailId;

	    public OutboundEmailInfo() {
		}
	    
		public String getEmailSubject() {
			return emailSubject;
		}

		public void setEmailSubject(String emailSubject) {
			this.emailSubject = emailSubject;
		}

		public String getEmailFromAddress() {
			return emailFromAddress;
		}

		public void setEmailFromAddress(String emailFromAddress) {
			this.emailFromAddress = emailFromAddress;
		}

		public String getEmailToAddress() {
			return emailToAddress;
		}

		public void setEmailToAddress(String emailToAddress) {
			this.emailToAddress = emailToAddress;
		}

		public String getEmailCCList() {
			return emailCCList;
		}

		public void setEmailCCList(String emailCCList) {
			this.emailCCList = emailCCList;
		}

		public String getEmailBccList() {
			return emailBccList;
		}

		public void setEmailBccList(String emailBccList) {
			this.emailBccList = emailBccList;
		}

		public String getEmailBodyContent() {
			return emailBodyContent;
		}

		public void setEmailBodyContent(String emailBodyContent) {
			this.emailBodyContent = emailBodyContent;
		}

		public String getEmailId() {
			return emailId;
		}

		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
	    
}
