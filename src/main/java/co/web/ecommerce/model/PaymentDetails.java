package co.web.ecommerce.model;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "paymentdetails")
public class PaymentDetails extends CreateUpdateDelete{
	@Column
	private String mode;
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	
	@OneToMany(fetch = FetchType.LAZY,  mappedBy = "paymentdetails")	   
	 private List<Orders> orders;

}
