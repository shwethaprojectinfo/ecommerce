package co.web.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name = "cart")
public class Cart extends CreateUpdateDelete{
	@Column
	private Integer quantity;
	private long customerid;
	private long variantsid;
	

	public void cart() {
		
	}
	public Cart(long id, Integer quantity, long customerid, long variantsid) {
		super();
		this.quantity = quantity;
		this.customerid = customerid;
		this.variantsid = variantsid;
	
	}
	public Integer getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public long getCustomerid() {
		return customerid;
	}
	public void setCustomerid(long customerid) {
		this.customerid = customerid;
	}
	public long getVariantsid() {
		return variantsid;
	}
	public void setVariantsid(long variantsid) {
		this.variantsid = variantsid;
	}
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)	   
    @JoinColumn(name = "customerid", foreignKey = @ForeignKey( name = "none"), nullable = false ,insertable = false ,updatable=false)
    private  Customer customer;


	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	

}
