package co.web.ecommerce.service;

import org.springframework.stereotype.Service;

@Service
public interface EmailService {
	public void sendOtpMessage(String to, String subject, String message);

	public void sendEmailToUserAndOwner(String userEmail, String ownerEmail, String subject, String body);

}
