package co.web.ecommerce.serviceImpl;

import java.beans.JavaBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import co.web.ecommerce.Request.CustomerSignUpRequest;
import co.web.ecommerce.model.Customer;
import co.web.ecommerce.model.Customeraddress;
import co.web.ecommerce.repository.CustomerRepository;
import co.web.ecommerce.repository.CustomeraddressRepository;
import co.web.ecommerce.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository customerRepo;
	
	@Autowired
	CustomeraddressRepository customerAddressRepo;
	
	
	
	
	@Override
	public Customer save (CustomerSignUpRequest customerSignUpRequest) {
		
		Customer customer = new Customer();
		
		customer.setName(customerSignUpRequest .getName());
		customer.setEmail(customerSignUpRequest.getEmail());
		customer.setPassword(customerSignUpRequest.getPassword());
		customer.setMobilenumber(customerSignUpRequest.getMobilenumber());
		
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	    String encode = passwordEncoder.encode(customerSignUpRequest.getPassword());
	    customer.setPassword(encode);
		customerRepo.saveAndFlush(customer);
		
		Customeraddress customerAddress = new Customeraddress();
		customerAddress.setAddressline1(customerSignUpRequest.getAddressline1());
		customerAddress.setAddressline2(customerSignUpRequest.getAddressline2());
		customerAddress.setCity(customerSignUpRequest.getCity());
		customerAddress.setCountry(customerSignUpRequest.getCountry());
		customerAddress.setPincode(customerSignUpRequest.getPincode());
		customerAddress.setCustomerid(customer.getId());
		customerAddressRepo.saveAndFlush(customerAddress);
		
		
//		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//	    String encode = passwordEncoder.encode(customerSignUpRequest.getPassword());
//	    customer.setPassword(encode);
		
		//return customerRepo.saveAndFlush(customer);
	    return customer;
}
}
