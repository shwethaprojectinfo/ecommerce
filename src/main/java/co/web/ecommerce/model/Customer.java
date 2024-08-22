package co.web.ecommerce.model;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name = "customer")
public class Customer extends CreateUpdateDelete{
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private String mobilenumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	
	 @OneToMany(fetch = FetchType.LAZY,  mappedBy = "customer")	   
	 private List<Customeraddress> customeraddress;
	 
	 @JsonIgnore
	 @OneToMany(fetch = FetchType.LAZY)	
	 @JoinColumn(name = "customerid", foreignKey = @ForeignKey( name = "none"),insertable = false ,updatable=false)
	 private List<Cart> cart;
	 
	 @JsonIgnore
	 @OneToMany(fetch = FetchType.LAZY)	
	 @JoinColumn(name = "customerid", foreignKey = @ForeignKey( name = "none"),insertable = false ,updatable=false)
	 private List<Ratingsandreviews> ratingsandreviews;
	 
         public List<Cart> getCart() {
		return cart;
	}
	public void setCart(List<Cart> cart) {
		this.cart = cart;
	}
	public List<Ratingsandreviews> getRatingsandreviews() {
		return ratingsandreviews;
	}
	public void setRatingsandreviews(List<Ratingsandreviews> ratingsandreviews) {
		this.ratingsandreviews = ratingsandreviews;
	}
		List<Customeraddress> getCustomeraddress() {
		return customeraddress;
	}
	public void setCustomeraddress(List<Customeraddress> customeraddress) {
		this.customeraddress = customeraddress;
	}
	 
	 
}
