package com.dto.payu;

import java.io.Serializable;
import java.util.List;

import com.dto.CompanyCommonDTO;
import com.dto.CustomerSignupDTO;
import com.dto.InvoiceDetailsDTO;
import com.dto.OrderDetailsDTO;
import com.dto.OrderDetailsHasProductsDTO;

/**
 * 
 * @author vikash pandey
 * 
 */
public class PayURequestDTO implements Serializable {

	private static final long serialVersionUID = -6568345760998822357L;
	private String hashKey;
	private String txnId;
	private String surl;// success url
	private String furl;// failure url
	private String totalPrice;
	private String mKey;// merchant key
	private String command;
	private String var1;
	private int totalNoOfProduct;// total no of product.
	private String udf1;
	private String udf2;
	private String udf3;
	private String udf4;
	private String udf5;
	private String udf6;
	private String udf7;
	private String udf8;
	private String udf9;
	private String udf10;
	private CustomerSignupDTO customer;
	private List<OrderDetailsHasProductsDTO> products;
	private CompanyCommonDTO company;
	private OrderDetailsDTO detailsDTO;
	private InvoiceDetailsDTO invoice;
	public PayURequestDTO() {
	}

	public PayURequestDTO(CustomerSignupDTO customer,
			List<OrderDetailsHasProductsDTO> products, CompanyCommonDTO company,
			String hashKey, String txnId, String surl, String furl,
			String totalPrice, String mKey, int totalNoOfProduct) {
		super();
		this.customer = customer;
		this.products = products;
		this.company = company;
		this.hashKey = hashKey;
		this.txnId = txnId;
		this.surl = surl;
		this.furl = furl;
		this.totalPrice = totalPrice;
		this.mKey = mKey;
		this.totalNoOfProduct = totalNoOfProduct;
	}
	public List<OrderDetailsHasProductsDTO> getProducts() {
		return products;
	}

	public void setProducts(List<OrderDetailsHasProductsDTO> products) {
		this.products = products;
	}

	public String getHashKey() {
		return hashKey;
	}

	public void setHashKey(String hashKey) {
		this.hashKey = hashKey;
	}

	public String getTxnId() {
		return txnId;
	}

	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}

	public String getSurl() {
		return surl;
	}

	public void setSurl(String surl) {
		this.surl = surl;
	}

	public String getFurl() {
		return furl;
	}

	public void setFurl(String furl) {
		this.furl = furl;
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getmKey() {
		return mKey;
	}

	public void setmKey(String mKey) {
		this.mKey = mKey;
	}

	public int getTotalNoOfProduct() {
		return totalNoOfProduct;
	}

	public void setTotalNoOfProduct(int totalNoOfProduct) {
		this.totalNoOfProduct = totalNoOfProduct;
	}

	public OrderDetailsDTO getDetailsDTO() {
		return detailsDTO;
	}

	public void setDetailsDTO(OrderDetailsDTO detailsDTO) {
		this.detailsDTO = detailsDTO;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public String getVar1() {
		return var1;
	}

	public void setVar1(String var1) {
		this.var1 = var1;
	}

	public InvoiceDetailsDTO getInvoice() {
		return invoice;
	}

	public void setInvoice(InvoiceDetailsDTO invoice) {
		this.invoice = invoice;
	}

	public CompanyCommonDTO getCompany() {
		return company;
	}

	public void setCompany(CompanyCommonDTO company) {
		this.company = company;
	}

	public CustomerSignupDTO getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerSignupDTO customer) {
		this.customer = customer;
	}

	public String getUdf1() {
		return udf1;
	}

	public void setUdf1(String udf1) {
		this.udf1 = udf1;
	}

	public String getUdf2() {
		return udf2;
	}

	public void setUdf2(String udf2) {
		this.udf2 = udf2;
	}

	public String getUdf3() {
		return udf3;
	}

	public void setUdf3(String udf3) {
		this.udf3 = udf3;
	}

	public String getUdf4() {
		return udf4;
	}

	public void setUdf4(String udf4) {
		this.udf4 = udf4;
	}

	public String getUdf5() {
		return udf5;
	}

	public void setUdf5(String udf5) {
		this.udf5 = udf5;
	}

	public String getUdf6() {
		return udf6;
	}

	public void setUdf6(String udf6) {
		this.udf6 = udf6;
	}

	public String getUdf7() {
		return udf7;
	}

	public void setUdf7(String udf7) {
		this.udf7 = udf7;
	}

	public String getUdf8() {
		return udf8;
	}

	public void setUdf8(String udf8) {
		this.udf8 = udf8;
	}

	public String getUdf9() {
		return udf9;
	}

	public void setUdf9(String udf9) {
		this.udf9 = udf9;
	}

	public String getUdf10() {
		return udf10;
	}

	public void setUdf10(String udf10) {
		this.udf10 = udf10;
	}
}
