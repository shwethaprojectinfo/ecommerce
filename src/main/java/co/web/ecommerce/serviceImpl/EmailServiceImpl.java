package co.web.ecommerce.serviceImpl;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import co.web.ecommerce.service.EmailService;

//public class EmailServiceImpl implements EmailService{
//	
//	@Autowired
//	private JavaMailSender javaMailSender;
//	
//	
//	MimeMessage msg = javaMailSender.createMimeMessage();
//
//    MimeMessageHelper helper = new MimeMessageHelper(msg, true);
//
//    helper.setTo(to);
//
//    helper.setSubject(subject);
//
//    helper.setText(message, true);
//
//    javaMailSender.send(msg);
//

//}
