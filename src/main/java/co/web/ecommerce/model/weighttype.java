package co.web.ecommerce.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "weighttype")
public class weighttype extends CreateUpdateDelete{
	@Column
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
