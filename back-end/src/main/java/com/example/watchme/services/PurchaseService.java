package com.example.watchme.services;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
@Service
public class PurchaseService {
	    @Autowired
	    private JavaMailSender sender;
	 public String sendMail(String mail,String movieName,String userName) {
		 MimeMessage message = sender.createMimeMessage();
	        MimeMessageHelper helper = new MimeMessageHelper(message);

	        try {
	            helper.setTo(mail);
	          
	            helper.setText("Dear Mr/Mrs "+userName+" your purchase complete ");
	            helper.setSubject("This is your command of the movie "+movieName);
	        } catch (MessagingException e) {
	            e.printStackTrace();
	            return "Error while sending mail ..";
	        }
	        sender.send(message);
	       
	        return "Mail Sent Success!";
	    }
	 }


