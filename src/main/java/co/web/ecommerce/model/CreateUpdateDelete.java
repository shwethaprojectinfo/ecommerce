package co.web.ecommerce.model;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@MappedSuperclass
//@ValueGenerationType(generatedBy = CreationTimestampGeneration.class)
public class CreateUpdateDelete {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdat;
    
	@Column
	private Integer isdeleted = 0 ;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedat;
	
	
	
	
	public long getId() {
		return id;
	}
	
	public Date getCreatedat() {
		return createdat;
	}
	public void setCreatedat(Date createdat) {
		this.createdat = createdat;
	}
	public Integer getIsdeleted() {
		return isdeleted;
	}
	public void setIsdeleted(Integer isdeleted) {
		this.isdeleted = isdeleted;
	}
	public Date getUpdatedat() {
		return updatedat;}
	//@PreUpdate
	public void setUpdatedat(Date updatedat) {
		this.updatedat = updatedat;
	}

}
