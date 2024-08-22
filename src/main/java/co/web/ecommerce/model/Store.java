package co.web.ecommerce.model;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "store")
public class Store extends CreateUpdateDelete{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private long id;
	@Column
	 private String name;
	@Column
	 private String description;
	@Column
	 private String addressLine1;
	@Column
	 private String addressline2;
	@Column
	 private String landMark;
	@Column
	 private String state;
	@Column
	 private String country;
	@Column
	 private String pincode;
	 public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressline2() {
		return addressline2;
	}
	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
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
	@OneToMany(fetch = FetchType.LAZY,  mappedBy = "store")	   
	 private List<Storebrand> storebrand;
	@OneToMany(fetch = FetchType.LAZY,  mappedBy = "store")	   
	 private List<Inventory> inventory;
	@OneToMany(fetch = FetchType.LAZY,  mappedBy = "store")	   
	 private List<Orderdetails> orderdetails;
	@OneToMany(fetch = FetchType.LAZY,  mappedBy = "store")	   
	 private List<Employee> employee;
	
	public List<Storebrand> getStorebrand() {
		return storebrand;
	}
	public void setStorebrand(List<Storebrand> storebrand) {
		this.storebrand = storebrand;
	}
	public List<Inventory> getInventory() {
		return inventory;
	}
	public void setInventory(List<Inventory> inventory) {
		this.inventory = inventory;
	}
	public List<Orderdetails> getOrderdetails() {
		return orderdetails;
	}
	public void setOrderdetails(List<Orderdetails> orderdetails) {
		this.orderdetails = orderdetails;
	}
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	

}
