package co.web.ecommerce.model;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "variants")
public class Variants extends CreateUpdateDelete {
	@Column
	private BigDecimal mrp;
	@Column
	private BigDecimal sellingprice;
	@Column
	private BigDecimal weight;
	@Column
	private Integer quantity;
	private long productid;
	private long sizeid;
	private long colorid;

	public BigDecimal getMrp() {
		return mrp;
	}

	public void setMrp(BigDecimal mrp) {
		this.mrp = mrp;
	}

	public BigDecimal getSellingprice() {
		return sellingprice;
	}

	public void setSellingprice(BigDecimal sellingprice) {
		this.sellingprice = sellingprice;
	}

	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public long getProductid() {
		return productid;
	}

	public void setProductid(long productid) {
		this.productid = productid;
	}

	public long getSizeid() {
		return sizeid;
	}

	public void setSizeid(long sizeid) {
		this.sizeid = sizeid;
	}

	public long getColorid() {
		return colorid;
	}

	public void setColorid(long colorid) {
		this.colorid = colorid;
	}

	public long getWeighttypeid() {
		return weighttypeid;
	}

	public void setWeighttypeid(long weighttypeid) {
		this.weighttypeid = weighttypeid;
	}

	private long weighttypeid;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "productid", foreignKey = @ForeignKey(name = "none"), nullable = false, insertable = false, updatable = false)
	private Product product;
}
