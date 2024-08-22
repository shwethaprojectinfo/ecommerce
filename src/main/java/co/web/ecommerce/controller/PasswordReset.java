package co.web.ecommerce.controller;

import java.util.Random;

public class PasswordReset  {
	
	String mobileNumber = "+918431179780";
	String email = "82966shwe@gmail.com";
	
	private String generateOTP(){
		
		Random random = new Random();
		int otpValue = 100000 + random.nextInt(900000);
        return String.valueOf(otpValue);
		
		//return null;
	}
	
	
    
   
   // sendOTPToEmail(email, otp);
    


}
