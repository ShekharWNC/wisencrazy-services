package com.dto.core.ordermanagement;

import java.sql.Timestamp;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.dto.AbsCommonDTO;
import com.dto.AddressDTO;
import com.dto.CustomerCommonProfileDTO;


/**
 * The dto class for the invoice database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class InvoiceDTO extends AbsCommonDTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8793006612875437354L;

	private Timestamp createdDate;

	private Double invAmount;

	private String invoiceStatus;
	
	private String generatedInvoiceId;
	
	private String paymentLink;
	
	private String projectSid;
	
	private String companySid;

	private List<CoreOrderDTO> order;
	
	private CustomerCommonProfileDTO commonProfileDTO;
	
	private AddressDTO shippingAddress;
	
	
	public InvoiceDTO() {
	}

	public Double getInvAmount() {
		return this.invAmount;
	}

	public void setInvAmount(Double invAmount) {
		this.invAmount = invAmount;
	}

	public String getInvoiceStatus() {
		return this.invoiceStatus;
	}

	public void setInvoiceStatus(String invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}


	public List<CoreOrderDTO> getOrder() {
		return order;
	}

	public void setOrder(List<CoreOrderDTO> order) {
		this.order = order;
	}

	
	public String getGeneratedInvoiceId() {
		return generatedInvoiceId;
	}

	public void setGeneratedInvoiceId(String generatedInvoiceId) {
		this.generatedInvoiceId = generatedInvoiceId;
	}

	public String getPaymentLink() {
		return paymentLink;
	}

	public void setPaymentLink(String paymentLink) {
		this.paymentLink = paymentLink;
	}
	
	public CustomerCommonProfileDTO getCommonProfileDTO() {
		return commonProfileDTO;
	}

	public void setCommonProfileDTO(CustomerCommonProfileDTO commonProfileDTO) {
		this.commonProfileDTO = commonProfileDTO;
	}

	public AddressDTO getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(AddressDTO shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	
	public String getProjectSid() {
		return projectSid;
	}

	public void setProjectSid(String projectSid) {
		this.projectSid = projectSid;
	}

	public String getCompanySid() {
		return companySid;
	}

	public void setCompanySid(String companySid) {
		this.companySid = companySid;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InvoiceDTO [createdDate=");
		builder.append(createdDate);
		builder.append(", invAmount=");
		builder.append(invAmount);
		builder.append(", invoiceStatus=");
		builder.append(invoiceStatus);
		builder.append(", generatedInvoiceId=");
		builder.append(generatedInvoiceId);
		builder.append(", paymentLink=");
		builder.append(paymentLink);
		builder.append(", projectSid=");
		builder.append(projectSid);
		builder.append(", companySid=");
		builder.append(companySid);
		builder.append(", order=");
		builder.append(order);
		builder.append(", commonProfileDTO=");
		builder.append(commonProfileDTO);
		builder.append(", shippingAddress=");
		builder.append(shippingAddress);
		builder.append("]");
		return builder.toString();
	}

	
}