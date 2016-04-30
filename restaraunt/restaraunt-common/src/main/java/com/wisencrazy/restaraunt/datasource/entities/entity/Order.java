package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.dto.constants.EnumConstants.SignupType;
/**
 * The persistent class for the customer database table.
 * 
 */
@Entity
@Table(name="eorder")
@NamedQueries({
	@NamedQuery(name = Order.FIND_BY_SID, query = "select o from Order o where hex(o.sid) = :sid"),
	@NamedQuery(name = Order.FIND_BY_DATE, query = "select o from Order o where o.orderedOn = :timestamp"),
	@NamedQuery(name = Order.FIND_BY_CUSTOMER_SID, query = "select o from Order o where hex(o.customer.sid) = :sid"),
	@NamedQuery(name = Order.FIND_BY_RESTARAUNT_SID, query = "select o from Order o where hex(o.restaraunt.sid) = :sid and orderOn <= :fromDate and orderOn >=:toDate"),
	@NamedQuery(name = Order.UPDATE_DEL_STATUS_BY_SID, query = "Update Order set deliveryStatus=:status  where hex(sid) = :sid "),
})
public class Order extends AbsBaseEntity {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 7100884691513994339L;
	
	public static final String PREFIX = "com.wisencrazy.restaraunt.datasource.entities.entity.Order.";
	public static final String FIND_BY_SID = PREFIX + "findBySid";
	public static final String FIND_BY_DATE=PREFIX + "findByDate";
	public static final String FIND_BY_CUSTOMER_SID=PREFIX + "findByCustomerSid";
	public static final String FIND_BY_RESTARAUNT_SID=PREFIX + "findByRestroSid";
	public static final String UPDATE_DEL_STATUS_BY_SID=PREFIX + "updateDelStatus";
	
	public enum DeliveryType{
		TO,
		DE
	}
	
	public enum DeliveryStatus{
		PLACED,
		OFD,
		DEL
	}
	
	@Column(name="restaraunt_id")
	private Integer restroId;
	
	@Column(name="customer_id")
	private Integer customerId;
	
	@Column(name="ordered_on")
	private Timestamp orderedOn;
	
	@Column(name="delivered_on")
	private Timestamp deliveredOn;
	
	@Column(name="total_amount")
	private Float totalAmount;
	
	@Column(name="taxes")
	private Float taxes;
	
	@Column(name="delivery_charges")
	private Integer deliveryCharges;
	
	@Column(name="discounts")
	private Float discounts;
	
	@Column(name="billed_amount")
	private Float billedAmount;
	
	@Column(name="customer_address_id")
	private Integer customerAddressId;
	
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "restaraunt_id", referencedColumnName = "id", insertable = false, updatable = false)
	private Restaraunt restaraunt;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "customer_id", referencedColumnName = "id", insertable = false, updatable = false)
	private Customer customer;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "customer_address_id", referencedColumnName = "id", insertable = false, updatable = false)
	private CustomerAddress customerAddress;
    
	@OneToMany(mappedBy = "order", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<OrderHasItems> orderHasItems;

	@Column(name="order_delivery_type")
	@Enumerated(EnumType.STRING)
	private DeliveryType deliveryType;
	
	@Column(name="order_delivery_status")
	@Enumerated(EnumType.STRING)
	private DeliveryStatus deliveryStatus;

	
//	@OneToOne(optional=true)
//	@JoinColumn(name="order_id",unique=true,nullable=true,updatable=false)
//	private Payment payment;
	
    public Integer getRestroId() {
		return restroId;
	}

	public void setRestroId(Integer restroId) {
		this.restroId = restroId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Timestamp getOrderedOn() {
		return orderedOn;
	}

	public void setOrderedOn(Timestamp orderedOn) {
		this.orderedOn = orderedOn;
	}

	public Timestamp getDeliveredOn() {
		return deliveredOn;
	}

	public void setDeliveredOn(Timestamp deliveredOn) {
		this.deliveredOn = deliveredOn;
	}

	public Float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Float totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Float getTaxes() {
		return taxes;
	}

	public void setTaxes(Float taxes) {
		this.taxes = taxes;
	}

	public Integer getDeliveryCharges() {
		return deliveryCharges;
	}

	public void setDeliveryCharges(Integer deliveryCharges) {
		this.deliveryCharges = deliveryCharges;
	}

	public Float getDiscounts() {
		return discounts;
	}

	public void setDiscounts(Float discounts) {
		this.discounts = discounts;
	}

	public Float getBilledAmount() {
		return billedAmount;
	}

	public void setBilledAmount(Float billedAmount) {
		this.billedAmount = billedAmount;
	}

	public Restaraunt getRestaraunt() {
		return restaraunt;
	}

	public void setRestaraunt(Restaraunt restaraunt) {
		this.restaraunt = restaraunt;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public CustomerAddress getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(CustomerAddress customerAddress) {
		this.customerAddress = customerAddress;
	}

	public List<OrderHasItems> getOrderHasItems() {
		return orderHasItems;
	}

	public void setOrderHasItems(List<OrderHasItems> orderHasItems) {
		this.orderHasItems = orderHasItems;
	}

	public DeliveryType getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(DeliveryType deliveryType) {
		this.deliveryType = deliveryType;
	}

	public Integer getCustomerAddressId() {
		return customerAddressId;
	}

	public void setCustomerAddressId(Integer customerAddressId) {
		this.customerAddressId = customerAddressId;
	}

	public DeliveryStatus getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}


//	public Payment getPayment() {
//		return payment;
//	}
//
//	public void setPayment(Payment payment) {
//		this.payment = payment;
//	}

}
