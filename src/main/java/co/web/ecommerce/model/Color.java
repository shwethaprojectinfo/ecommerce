package co.web.ecommerce.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "color")
public class Color extends CreateUpdateDelete{
	@Column
	private String colorname;
	@Column
	private String hexcode;
	public String getColorname() {
		return colorname;
	}
	public void setColorname(String colorname) {
		this.colorname = colorname;
	}
	public String getHexcode() {
		return hexcode;
	}
	public void setHexcode(String hexcode) {
		this.hexcode = hexcode;
	} 
	

}
