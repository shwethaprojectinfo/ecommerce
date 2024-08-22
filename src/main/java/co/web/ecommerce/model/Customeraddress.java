package co.web.ecommerce.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@EntityScan
@Table(name = "customeraddress")
public class Customeraddress extends CreateUpdateDelete{
	@Column
	private String addressline1;
	@Column
	private String addressline2;
	@Column
	private String city;
	@Column
	private String country;
	@Column
	private String pincode;
	@Column
	private String isdefault;
	
	private long customerid;
	public String getAddressline1() {
		return addressline1;
	}
	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}
	public String getAddressline2() {
		return addressline2;
	}
	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getIsdefault() {
		return isdefault;
	}
	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault;
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
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	 public List<Orders> getOrders() {
		return orders;
	}
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY,  mappedBy = "customeraddress")	   
	 private List<Orders> orders;
	 
	
	 
}
