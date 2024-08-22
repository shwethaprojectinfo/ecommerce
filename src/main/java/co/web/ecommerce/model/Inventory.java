package co.web.ecommerce.model;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "inventory")
public class Inventory extends CreateUpdateDelete{
	private long storeid;
	private long variantsid;
	public long getStoreid() {
		return storeid;
	}
	public void setStoreid(long storeid) {
		this.storeid = storeid;
	}
	public long getVariantsid() {
		return variantsid;
	}
	public void setVariantsid(long variantsid) {
		this.variantsid = variantsid;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)	   
    @JoinColumn(name = "storeid", foreignKey = @ForeignKey( name = "none"), nullable = false ,insertable = false ,updatable=false)
    private  Store store;
	
	@ManyToOne(fetch = FetchType.LAZY)	   
    @JoinColumn(name = "variantsid", foreignKey = @ForeignKey( name = "none"), nullable = false ,insertable = false ,updatable=false)
    private Variants variants;
	public Store getStore() {
		return store;
	}
	public void setStore(Store store) {
		this.store = store;
	}
	public Variants getVariants() {
		return variants;
	}
	public void setVariants(Variants variants) {
		this.variants = variants;
	}

}
