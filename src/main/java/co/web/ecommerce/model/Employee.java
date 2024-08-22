package co.web.ecommerce.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "employee")
public class Employee extends CreateUpdateDelete{
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String mobilenumber;
	@Column
	private String salary;
	@Column
	private String address;
	private String storeid;
	private String designationid;
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
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStoreid() {
		return storeid;
	}
	public void setStoreid(String storeid) {
		this.storeid = storeid;
	}
	public String getDesignationid() {
		return designationid;
	}
	public void setDesignationid(String designationid) {
		this.designationid = designationid;
	}
	@ManyToOne(fetch = FetchType.LAZY)	   
    @JoinColumn(name = "storeid", foreignKey = @ForeignKey( name = "none"), nullable = false ,insertable = false ,updatable=false)
    private  Store store;
	
	
	@ManyToOne(fetch = FetchType.LAZY)	   
    @JoinColumn(name = "designationid", foreignKey = @ForeignKey( name = "none"), nullable = false ,insertable = false ,updatable=false)
    private  Designation designation;
	
	public Store getStore() {
		return store;
	}
	public void setStore(Store store) {
		this.store = store;
	}
	public Designation getDesignation() {
		return designation;
	}
	public void setDesignation(Designation designation) {
		this.designation = designation;
	}

}
