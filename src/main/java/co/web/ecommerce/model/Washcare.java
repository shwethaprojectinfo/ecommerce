package co.web.ecommerce.model;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "washcare")
public class Washcare extends CreateUpdateDelete{
	@Column
	private String type;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@OneToMany(fetch = FetchType.LAZY,  mappedBy = "washcare")	   
	 private List<Product> product;
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}

}
