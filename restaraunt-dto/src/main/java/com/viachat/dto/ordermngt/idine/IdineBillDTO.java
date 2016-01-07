package com.viachat.dto.ordermngt.idine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.dto.payment.InvoiceDetailsCommonDTO;
import com.viachat.dto.ordermngt.core.OrderCostDTO;
import com.viachat.dto.ordermngt.core.OrderHasItemDetailDTO;

/**
 * The dto class for the order_has_item_detail database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class IdineBillDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4229151736878372911L;

	IdineOrderInput idineOrderInput = null;
	List<OrderHasItemDetailDTO> orderHasItemDetailDTOs = new ArrayList<OrderHasItemDetailDTO>();
	List<OrderCostDTO> orderCostDTOs = null;
	String paymentLink =null;
	private InvoiceDetailsCommonDTO invoiceBasicDetails;

	public IdineOrderInput getIdineOrderInput() {
		return idineOrderInput;
	}

	public void setIdineOrderInput(IdineOrderInput idineOrderInput) {
		this.idineOrderInput = idineOrderInput;
	}

	public List<OrderHasItemDetailDTO> getOrderHasItemDetailDTOs() {
		return orderHasItemDetailDTOs;
	}

	public void setOrderHasItemDetailDTOs(
			List<OrderHasItemDetailDTO> orderHasItemDetailDTOs) {
		this.orderHasItemDetailDTOs = orderHasItemDetailDTOs;
	}

	public List<OrderCostDTO> getOrderCostDTOs() {
		return orderCostDTOs;
	}

	public void setOrderCostDTOs(List<OrderCostDTO> orderCostDTOs) {
		this.orderCostDTOs = orderCostDTOs;
	}

	public String getPaymentLink() {
		return paymentLink;
	}

	public void setPaymentLink(String paymentLink) {
		this.paymentLink = paymentLink;
	}

	public InvoiceDetailsCommonDTO getInvoiceBasicDetails() {
		return invoiceBasicDetails;
	}

	public void setInvoiceBasicDetails(InvoiceDetailsCommonDTO invoiceBasicDetails) {
		this.invoiceBasicDetails = invoiceBasicDetails;
	}

}