package co.web.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "storebrand")
public class Storebrand extends CreateUpdateDelete{
	private long storeid;
	private long brandid;
	public long getStoreid() {
		return storeid;
	}
	public void setStoreid(long storeid) {
		this.storeid = storeid;
	}
	public long getBrandid() {
		return brandid;
	}
	public void setBrandid(long brandid) {
		this.brandid = brandid;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)	   
    @JoinColumn(name = "brandid", foreignKey = @ForeignKey( name = "none"), nullable = false ,insertable = false ,updatable=false)
    private  Brand brand;
	
	@ManyToOne(fetch = FetchType.LAZY)	   
    @JoinColumn(name = "storeid", foreignKey = @ForeignKey( name = "none"), nullable = false ,insertable = false ,updatable=false)
    private  Store store;
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public Store getStore() {
		return store;
	}
	public void setStore(Store store) {
		this.store = store;
	}

}
