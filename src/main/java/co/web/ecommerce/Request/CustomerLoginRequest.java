package co.web.ecommerce.Request;

import javax.persistence.Column;
import javax.validation.constraints.Email;

public class CustomerLoginRequest {
	
	@Column(unique = true , nullable = false)
	@Email
	private String email;
	@Column
	private String password;
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
}
