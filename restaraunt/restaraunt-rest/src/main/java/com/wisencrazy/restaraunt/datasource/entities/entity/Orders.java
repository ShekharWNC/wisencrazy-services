package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the orders database table.
 * 
 */
@Entity
@Table(name="orders")
@NamedQueries({
	@NamedQuery(name=Orders.FIND_ORDERS_ON_CUSTOMER_ID,query="select o from Orders o join o.customer c where c.id=:customerId")
})
public class Orders  extends AbsBaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 9002168060312566479L;

	public static final String PREFIX  = "com.callcomm.eserve.persistence.entity.Orders.";
	
	public static final String FIND_ORDERS_ON_CUSTOMER_ID= PREFIX+"findByCustomerId";

	@ManyToOne
	@JoinColumn(name="company_id")
	private Company company;

	@Column(name="created_date")
	private Timestamp createdDate;

	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer;

	@Column(name="ordered_by")
	private String orderedBy;

	@ManyToOne
	@JoinColumn(name="project_id")
	private Project project;

	@Column(name="order_cost")
	private Double orderCost;

	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER,orphanRemoval=true)
	@JoinColumn(name="order_id",referencedColumnName="id",nullable=false)
	private List<OrderHasItemDetail> orderHasItemDetails;

	//bi-directional many-to-one association to OrderHasKot
	@OneToMany
	@JoinColumn(name="order_id",referencedColumnName="id")
	private List<OrderHasKot> orderHasKots;

	//bi-directional many-to-one association to BusinessCatogory
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="business_category_id",referencedColumnName="id")
	private BusinessCategory businessCatogory;

	//bi-directional many-to-one association to VirtualAccount
	@ManyToOne
	@JoinColumn(name="handled_by",referencedColumnName="id")
	private VirtualAccount virtualAccount;

	//bi-directional many-to-one association to OrderStatus
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="order_status_id",referencedColumnName="id")
	private OrderStatus orderStatus;

	@ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="orderstate_id",referencedColumnName="id",nullable=true)
    private OrderState orderstate;

	
	public Orders() {
	}


	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public String getOrderedBy() {
		return this.orderedBy;
	}

	public void setOrderedBy(String orderedBy) {
		this.orderedBy = orderedBy;
	}


	public List<OrderHasItemDetail> getOrderHasItemDetails() {
		return this.orderHasItemDetails;
	}

	public void setOrderHasItemDetails(List<OrderHasItemDetail> orderHasItemDetails) {
		this.orderHasItemDetails = orderHasItemDetails;
	}


	public List<OrderHasKot> getOrderHasKots() {
		return this.orderHasKots;
	}

	public void setOrderHasKots(List<OrderHasKot> orderHasKots) {
		this.orderHasKots = orderHasKots;
	}


	public BusinessCategory getBusinessCatogory() {
		return this.businessCatogory;
	}

	public void setBusinessCatogory(BusinessCategory businessCatogory) {
		this.businessCatogory = businessCatogory;
	}

	public VirtualAccount getVirtualAccount() {
		return this.virtualAccount;
	}

	public void setVirtualAccount(VirtualAccount virtualAccount) {
		this.virtualAccount = virtualAccount;
	}

	public OrderStatus getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}


	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}


	public Double getOrderCost() {
		return orderCost;
	}


	public void setOrderCost(Double orderCost) {
		this.orderCost = orderCost;
	}
	public OrderState getOrderstate() {
        return orderstate;
    }
 
 
    public void setOrderstate(OrderState orderstate) {
        this.orderstate = orderstate;
    }
	
}