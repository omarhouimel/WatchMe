package com.example.watchme.restservces;

import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.watchme.services.PurchaseService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PurchaseRestService {
	
	@Autowired
	PurchaseService purchaseService;
	
	  
	  @RequestMapping("/sendMail/{mail}/{movieName}/{userName}")
	    public String sendMail(@PathVariable String mail,@PathVariable String movieName,@PathVariable String userName) {
		  	return purchaseService.sendMail(mail, movieName, userName);
	    }
	
	
	
}
