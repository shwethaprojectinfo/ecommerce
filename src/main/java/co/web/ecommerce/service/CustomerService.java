package co.web.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import co.web.ecommerce.Request.CustomerSignUpRequest;
import co.web.ecommerce.model.Customer;

@Service
public interface CustomerService {
	
	public Customer save (CustomerSignUpRequest customerSignUpRequestDto);

	
//	@Autowired 
//	private JavaMailSender mailSender;
//	
//	  public void sendEmail(); 
}
