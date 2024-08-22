package co.web.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "status")
public class Status extends CreateUpdateDelete{
	@Column
	private String name;
	private long ordersid;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getOrdersid() {
		return ordersid;
	}
	public void setOrdersid(long ordersid) {
		this.ordersid = ordersid;
	}
	
	

}
