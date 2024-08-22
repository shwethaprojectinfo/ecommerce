package co.web.ecommerce.model;
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
@Table(name = "subtype")
public class Subtype extends CreateUpdateDelete{
	@Column
	private String name;
	
	private Long producttypeid;
	
	public Long getProducttypeid() {
		return producttypeid;
	}
	public void setProducttypeid(Long producttypeid) {
		this.producttypeid = producttypeid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
   }
	@OneToMany(fetch = FetchType.LAZY,  mappedBy = "subtype")	   
	 private List<Product> product;
	
	@ManyToOne(fetch = FetchType.LAZY)	   
    @JoinColumn(name = "producttypeid", foreignKey = @ForeignKey( name = "none"), nullable = false ,insertable = false ,updatable=false)
    private  Producttype producttype;
	
	public Producttype getProducttype() {
		return producttype;
	}
	public void setProducttype(Producttype producttype) {
		this.producttype = producttype;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}

}
