package co.web.ecommerce.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Flow.Subscriber;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import co.web.ecommerce.Request.CustomerLoginRequest;
import co.web.ecommerce.Request.CustomerSignUpRequest;
import co.web.ecommerce.Request.ResetPasswordRequest;
import co.web.ecommerce.model.Customer;
import co.web.ecommerce.model.Designer;
import co.web.ecommerce.repository.CustomerRepository;
import co.web.ecommerce.service.CustomerService;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import java.util.Properties;

@RestController
@CrossOrigin
@Validated
public class CustomerController {
	
	@Autowired
	private JavaMailSender javaMailSender;

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private CustomerService customerService;
	 
	
	public void sendEmail() {
	        // use mailSender here...
	    } 

	@PostMapping("/customerSignup")
	public ResponseEntity<Object> addCustomer(@Valid @RequestBody CustomerSignUpRequest customerSignUpRequest) {
		// Check if the email already exists
		if (customerRepository.existsByEmail(customerSignUpRequest.getEmail())) {
			// Return error response with duplicate email message
//			return new ResponseEntity<>("Email already exist", HttpStatus.BAD_REQUEST);
			return ResponseEntity.badRequest().body("{\"error\": \"Email already exists\"}");
			
		}

		// Return success response with saved customer
		customerService.save(customerSignUpRequest);
//		return new ResponseEntity<>("Customer details registered successfully", HttpStatus.OK);
		return ResponseEntity.ok().body("{\"message\": \"Customer details registered successfully\"}");

	}

	@PostMapping("/customerlogin")
	public ResponseEntity<Object> login(@RequestBody Customer customer) {

		if (!validateLoginRequest(customer)) {
			return ResponseEntity.badRequest().body("{\"error\": \"Invalid login request\"}");
		}

//		 Check if the customer email exists
		Customer existingCustomer = customerRepository.findByEmail(customer.getEmail());
		if (existingCustomer == null) {
			return ResponseEntity.badRequest().body("{\"error\": \"Invalid email\"}");
		}

		// Compare the provided password with the stored hashed password
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		if (!encoder.matches(customer.getPassword(), existingCustomer.getPassword())) {
			return ResponseEntity.badRequest().body("{\"error\": \"Incorrect password\"}");
		}

//		return ResponseEntity.ok().body( "Login successful");

		return ResponseEntity.ok().body("{\"message\": \"Login successfully\"}");

	}

	private boolean validateLoginRequest(Customer customer) {
		// TODO Auto-generated method stub
		return true;
	}

	public CustomerService getCustomerService() {
		return customerService;
	}

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	
	
//	@Autowired
//	@PostMapping("/getAllCustomerData")
//	public ResponseEntity<Map<String, Object>> getCustomer(@RequestBody Designer zDesigner) {
//
//		Map<String, Object> map = new HashMap<>();
//
//		List<Customer> customers = customerRepository.findByDesignerid(zDesigner.getId());
//
//		if (Objects.nonNull(customers)) {
//			map.put("customer", customers);
//			map.put("message", "Customer Fetched successfully");
//			return ResponseEntity.ok().body(map);
//		}
//
//		map.put("error", "Customer does not exist");
//
//		return ((BodyBuilder) ResponseEntity.notFound()).body(map);
//	}
//
//	
//	
	 @PostMapping("/emailSubscription")
	    public String subscribe(@RequestBody CustomerLoginRequest subscriber) {
//	        // Save subscriber details in the database if needed
//	        //subscriber.getName();
//	        subscriber.getEmail();
//	        // Send email to the subscriber
//	        sendConfirmationEmail(subscriber);
//	        
//	        // Send email to the website owner
//	        sendNotificationEmail(subscriber);
//	        
//	        // Return appropriate response
//	        return "success";
//	    }
//	    
//	    private void sendConfirmationEmail(CustomerLoginRequest subscriber) {
//	        SimpleMailMessage message = new SimpleMailMessage();
//	        message.setTo(subscriber.getEmail());
//	        message.setSubject("Welcome to Our Website!");
//	        message.setText("Thank you for subscribing to our website. We will keep you updated with the latest news and offers.");
//	        
//	        javaMailSender.send(message);
//	    }
//	    
//	    private void sendNotificationEmail(CustomerLoginRequest subscriber) {
//	        SimpleMailMessage message = new SimpleMailMessage();
//	        message.setTo("website-owner@example.com"); // Replace with owner's email address
//	        message.setSubject("New Subscriber Notification");
//	        message.setText("A new user has subscribed to your website.\nEmail: " + subscriber.getEmail());
//	        
//	        javaMailSender.send(message);
//	    }

		 
		 JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
//			mailSender.setHost("smtp.gmail.com");
//			mailSender.setPort(587);
//			mailSender.setUsername("SmartClothing");
//			mailSender.setPassword("ikmygbrenxrnwwyb");
			 
			Properties properties = new Properties();
			properties.setProperty("mail.smtp.auth", "true");
			properties.setProperty("mail.smtp.starttls.enable", "true");
			 
			mailSender.setJavaMailProperties(properties);
			
	//The code snippet below demonstrates how to send a plain text email:
			String from = "smartclothingfashionwebsite@gmail.com";
			String to = subscriber.getEmail().toString();
			 
			SimpleMailMessage message = new SimpleMailMessage();
			 
			message.setFrom(from);
			message.setTo(to);
			message.setSubject("Success Email for Subscription");
			message.setText("this is for shwetha trcr.");
			 
			mailSender.send(message);
	    
	    
	    
	  return null;  
	 }
	    
	
	    
	    
	    //
//		@PostMapping("/generateOTP")
	//
//		public ResponseEntity<Map<String, Object>> generateOTP(@RequestBody ResetPasswordRequest zRequest) {
	//
////		String phoneNumber = "+918431179780";
////		String email = "82966shwe@gmail.com";
//			Map<String, Object> map = new HashMap<>();
	//
//			Customer email = customerRepository.findByEmail(zRequest.getEmail());
	//
//			if (Objects.isNull(email)) {
//				map.put("Email", "email doesn,t exist");
//			}
//			
//			
//			Random random = new Random();
//			Integer otpValue = 100000 + random.nextInt(900000);
//			//return String.valueOf(otpValue);
//			
	//
//		}
	
	
	
	
}
