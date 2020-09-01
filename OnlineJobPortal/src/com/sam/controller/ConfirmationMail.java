package com.sam.controller;
import java.util.Properties;    
import javax.mail.*;    
import javax.mail.internet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;  	

@WebServlet("/mail")
public class ConfirmationMail extends HttpServlet{
	String email, subject, msg, senderpass;
	  
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
	{
		 email = req.getParameter("temail");
		subject = req.getParameter("sub");
		msg = req.getParameter("msg");
		senderpass = req.getParameter("pass");
		
		sendMail();
	}
	private void sendMail()
	{
	          Properties props = new Properties();    
	          props.put("mail.smtp.host", "smtp.gmail.com");    
	          props.put("mail.smtp.socketFactory.port", "465");    
	          props.put("mail.smtp.socketFactory.class",    
	                    "javax.net.ssl.SSLSocketFactory");    
	          props.put("mail.smtp.auth", "true");    
	          props.put("mail.smtp.port", "465");    
	          //get Session   
	          Session session = Session.getDefaultInstance(props,    
	           new javax.mail.Authenticator() {    
	           protected PasswordAuthentication getPasswordAuthentication() {    
	           return new PasswordAuthentication("upadhyaysampoornanand@gmail.com",senderpass);  
	           }    
	          });    
	          //compose message    
	          try {   
	        	  
	           MimeMessage message = new MimeMessage(session);    
	           message.addRecipient(Message.RecipientType.TO,new InternetAddress("newviveku@gmail.com"));    
	           message.setSubject(subject);    
	           message.setText(msg);    
	           //send message  
	           Transport.send(message);    
	           System.out.println("message sent successfully");    
	          } 
	          catch (MessagingException e) {throw new RuntimeException(e);}    
	             
	    }	  
	 
}

