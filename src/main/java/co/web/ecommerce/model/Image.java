package co.web.ecommerce.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "image")
public class Image extends CreateUpdateDelete{
	@Column
	private String path;
	@Column
	private String heirarchy;
	private long variantsid;
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getHeirarchy() {
		return heirarchy;
	}
	public void setHeirarchy(String heirarchy) {
		this.heirarchy = heirarchy;
	}
	public long getVariantsid() {
		return variantsid;
	}
	public void setVariantsid(long variantsid) {
		this.variantsid = variantsid;
	}
	

}
