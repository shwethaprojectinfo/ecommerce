package co.web.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.mail.javamail.JavaMailSender;

@SpringBootApplication
public class  EcommerceApplication{

	@Autowired
    private JavaMailSender mailSender;
	
	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
		//System.out.println("hi"); 
		
	}

}
