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

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name = "brand")
public class Brand extends CreateUpdateDelete {
	@Column
	private String name;
	@Column
	private String logo;
	@Column
	private String description;
	private long designerid;
	public Brand() {
		
	}

	public Brand(long id, String name, String logo, String description, long designerid) {
		super();
		this.name = name;
		this.logo = logo;
		this.description = description;
		this.designerid = designerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getDesignerid() {
		return designerid;
	}
	public void setDesignerid(long designerid) {
		this.designerid = designerid;
	}
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)	   
    @JoinColumn(name = "designerid", foreignKey = @ForeignKey( name = "none"), nullable = false ,insertable = false ,updatable=false)
    private  Designer designer;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY,  mappedBy = "brand")	   
	 private List<Storebrand> storebrand;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY,  mappedBy = "brand")	   
	 private List<Product> product;
	public Designer getDesigner() {
		return designer;
	}

	public void setDesigner(Designer designer) {
		this.designer = designer;
	}

	public List<Storebrand> getStorebrand() {
		return storebrand;
	}

	public void setStorebrand(List<Storebrand> storebrand) {
		this.storebrand = storebrand;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}
	}
