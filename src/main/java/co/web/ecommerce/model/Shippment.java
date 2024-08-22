package co.web.ecommerce.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "shippment")
public class Shippment extends CreateUpdateDelete{
	@Column
	private String logisticspartner;
	private long orderdetailsid;
	private long statusid;
	public String getLogisticspartner() {
		return logisticspartner;
	}
	public void setLogisticspartner(String logisticspartner) {
		this.logisticspartner = logisticspartner;
	}
	public long getOrderdetailsid() {
		return orderdetailsid;
	}
	public void setOrderdetailsid(long orderdetailsid) {
		this.orderdetailsid = orderdetailsid;
	}
	public long getStatusid() {
		return statusid;
	}
	public void setStatusid(long statusid) {
		this.statusid = statusid;
	}
	

}
