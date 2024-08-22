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
@Table(name = "ratingsandreviews")
public class Ratingsandreviews extends CreateUpdateDelete{
	@Column
	private String rating;
	@Column
	private String review;
	private long orderdetailsid;
	private long customerid;
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public long getOrderdetailsid() {
		return orderdetailsid;
	}
	public void setOrderdetailsid(long orderdetailsid) {
		this.orderdetailsid = orderdetailsid;
	}
	public long getCustomerid() {
		return customerid;
	}
	public void setCustomerid(long customerid) {
		this.customerid = customerid;
	}
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)	   
    @JoinColumn(name = "customerid", foreignKey = @ForeignKey( name = "none"), nullable = false ,insertable = false ,updatable=false)
    private  Customer customer;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)	   
    @JoinColumn(name = "orderdetailsid", foreignKey = @ForeignKey( name = "none"), nullable = false ,insertable = false ,updatable=false)
    private  Orderdetails orderdetails;
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Orderdetails getOrderdetails() {
		return orderdetails;
	}
	public void setOrderdetails(Orderdetails orderdetails) {
		this.orderdetails = orderdetails;
	}

}
