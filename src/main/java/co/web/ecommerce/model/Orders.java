package co.web.ecommerce.model;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "orders")

public class Orders extends CreateUpdateDelete{
	@Column
	private BigDecimal totalprice;
	@Column
	private String ordernumber;
	private long customeraddressid;
	private long paymentdetailsid;
	public BigDecimal getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(BigDecimal totalprice) {
		this.totalprice = totalprice;
	}
	public String getOrdernumber() {
		return ordernumber;
	}
	public void setOrdernumber(String ordernumber) {
		this.ordernumber = ordernumber;
	}
	public long getCustomeraddressid() {
		return customeraddressid;
	}
	public void setCustomeraddressid(long customeraddressid) {
		this.customeraddressid = customeraddressid;
	}
	public long getPaymentDetailsid() {
		return paymentdetailsid;
	}
	public void setPaymentDetailsid(long modeofpaymentid) {
		this.paymentdetailsid = modeofpaymentid;
	}
	@ManyToOne(fetch = FetchType.LAZY)	   
    @JoinColumn(name = "paymentdetailsid", foreignKey = @ForeignKey( name = "none"), nullable = false ,insertable = false ,updatable=false)
    private  PaymentDetails paymentdetails;
	
	 public long getPaymentdetailsid() {
		return paymentdetailsid;
	}
	public void setPaymentdetailsid(long paymentdetailsid) {
		this.paymentdetailsid = paymentdetailsid;
	}
	
	@OneToMany(fetch = FetchType.LAZY,  mappedBy = "orders")	   
	 private List<Orderdetails> orderdetails;
	 
	 
	 @ManyToOne(fetch = FetchType.LAZY)	   
	    @JoinColumn(name = "customeraddressid", foreignKey = @ForeignKey( name = "none"), nullable = false ,insertable = false ,updatable=false)
	    private  Customeraddress customeraddress;
	 
	public Customeraddress getCustomeraddress() {
		return customeraddress;
	}
	public void setCustomeraddress(Customeraddress customeraddress) {
		this.customeraddress = customeraddress;
	}
	public List<Orderdetails> getOrderdetails() {
		return orderdetails;
	}
	public void setOrderdetails(List<Orderdetails> orderdetails) {
		this.orderdetails = orderdetails;
	}
	

}
