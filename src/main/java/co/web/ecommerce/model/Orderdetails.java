package co.web.ecommerce.model;
import java.math.BigDecimal;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "orderdetails")
public class Orderdetails extends CreateUpdateDelete{
	@Column
	private Integer quantity;
	@Column
	private BigDecimal price;
	@Column
	private Date expecteddeliverydate;
	@Column
	private BigDecimal totalprice;
	@Column
	private long ordersid;
	private long variantsid;
	private long storeid;
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Date getExpecteddeliverydate() {
		return expecteddeliverydate;
	}
	public void setExpecteddeliverydate(Date expecteddeliverydate) {
		this.expecteddeliverydate = expecteddeliverydate;
	}
	public BigDecimal getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(BigDecimal totalprice) {
		this.totalprice = totalprice;
	}
	public long getOrdersid() {
		return ordersid;
	}
	public void setOrdersid(long ordersid) {
		this.ordersid = ordersid;
	}
	public long getVariantsid() {
		return variantsid;
	}
	public void setVariantsid(long variantsid) {
		this.variantsid = variantsid;
	}
	public long getStoreid() {
		return storeid;
	}
	public void setStoreid(long storeid) {
		this.storeid = storeid;
	}
	@ManyToOne(fetch = FetchType.LAZY)	   
    @JoinColumn(name = "orderid", foreignKey = @ForeignKey( name = "none"), nullable = false ,insertable = false ,updatable=false)
    private  Orders orders;
	
	@ManyToOne(fetch = FetchType.LAZY)	   
    @JoinColumn(name = "variantsid", foreignKey = @ForeignKey( name = "none"), nullable = false ,insertable = false ,updatable=false)
    private  Variants variants;
	
	public Orders getOrders() {
		return orders;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	public Variants getVariants() {
		return variants;
	}
	public void setVariants(Variants variants) {
		this.variants = variants;
	}
	public Store getStore() {
		return store;
	}
	public void setStore(Store store) {
		this.store = store;
	}
	@ManyToOne(fetch = FetchType.LAZY)	   
    @JoinColumn(name = "storeid", foreignKey = @ForeignKey( name = "none"), nullable = false ,insertable = false ,updatable=false)
    private  Store store;
	

}
