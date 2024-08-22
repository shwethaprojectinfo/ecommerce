package co.web.ecommerce.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name ="product")
public class Product extends CreateUpdateDelete{
	@Column
	private String name;
	@Column
	private String description;
	@Column
	private String productnumber;
	@Column
	private long subtypeid; 
	private long materialid;
	private long categoryid;
	private long storeid;
	private long washcareid;
	private long designerid;
	private long brandid;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getProductnumber() {
		return productnumber;
	}
	public void setProductnumber(String productnumber) {
		this.productnumber = productnumber;
	}
	public long getSubtypeid() {
		return subtypeid;
	}
	public void setSubtypeid(long subtypeid) {
		this.subtypeid = subtypeid;
	}
	public long getMaterialid() {
		return materialid;
	}
	public void setMaterialid(long materialid) {
		this.materialid = materialid;
	}
	public long getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(long categoryid) {
		this.categoryid = categoryid;
	}
	public long getStoreid() {
		return storeid;
	}
	public void setStoreid(long storeid) {
		this.storeid = storeid;
	}
	public long getWashcareid() {
		return washcareid;
	}
	public void setWashcareid(long washcareid) {
		this.washcareid = washcareid;
	}
	public long getDesignerid() {
		return designerid;
	}
	public void setDesignerid(long designerid) {
		this.designerid = designerid;
	}
	public long getBrandid() {
		return brandid;
	}
	public void setBrandid(long brandid) {
		this.brandid = brandid;
	}

	@ManyToOne(fetch = FetchType.LAZY)	   
    @JoinColumn(name = "subtypeid", foreignKey = @ForeignKey( name = "none"), nullable = false ,insertable = false ,updatable=false)
    private  Subtype subtype;
	
	@ManyToOne(fetch = FetchType.LAZY)	   
    @JoinColumn(name = "materialid", foreignKey = @ForeignKey( name = "none"), nullable = false ,insertable = false ,updatable=false)
    private  Material material;
	
	@ManyToOne(fetch = FetchType.LAZY)	   
    @JoinColumn(name = "brandid", foreignKey = @ForeignKey( name = "none"), nullable = false ,insertable = false ,updatable=false)
    private  Brand brand;
	
	@ManyToOne(fetch = FetchType.LAZY)	   
    @JoinColumn(name = "washcareid", foreignKey = @ForeignKey( name = "none"), nullable = false ,insertable = false ,updatable=false)
    private  Washcare washcare;
	
	@ManyToOne(fetch = FetchType.LAZY)	   
    @JoinColumn(name = "categoryid", foreignKey = @ForeignKey( name = "none"), nullable = false ,insertable = false ,updatable=false)
    private  Category category;
	public Subtype getSubtype() {
		return subtype;
	}
	public void setSubtype(Subtype subtype) {
		this.subtype = subtype;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public Washcare getWashcare() {
		return washcare;
	}
	public void setWashcare(Washcare washcare) {
		this.washcare = washcare;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	

}
